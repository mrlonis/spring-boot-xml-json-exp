# spring-boot-xml-json-exp

<!-- TOC -->
* [spring-boot-xml-json-exp](#spring-boot-xml-json-exp)
  * [Goals](#goals)
  * [Basic POJO](#basic-pojo)
  * [Sample Output](#sample-output)
    * [XML](#xml)
    * [JSON](#json)
  * [Findings](#findings)
    * [Pure Jaxb & Pure Jakarta Deserialization Issues](#pure-jaxb--pure-jakarta-deserialization-issues)
      * [Adding @Jacksonized](#adding-jacksonized)
      * [Adding Jaxb/Jakarta Annotations to Getters/Setters](#adding-jaxbjakarta-annotations-to-getterssetters)
      * [Supplementing with Jackson Annotations](#supplementing-with-jackson-annotations)
    * [Pure Jackson](#pure-jackson)

<!-- TOC -->

## Goals

The goal is to have the application return the same XML/JSON output for various different POJOs using different XML
annotation libraries.

## Basic POJO

```java
@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id", "name", "date", "tags"})
@Data
@Jacksonized
@Builder
public class XmlModel {
    @XmlAttribute
    private long id;

    @XmlElement(name = "title")
    private String name;

    @XmlTransient
    private String author;

    @XmlElement
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    private ZonedDateTime date;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private List<String> tag;
}
```

## Sample Output

### XML

```xml

<book type="${className}" id="1">
  <title>name</title>
  <date>2024-07-05T14:06:07.617Z</date>
  <tags>
    <tag>tag1</tag>
    <tag>tag2</tag>
    <tag>tag3</tag>
  </tags>
</book>
```

### JSON

```json
{
  "type": "${className}",
  "id": 1,
  "title": "name",
  "date": "2024-07-05T14:06:07.617Z",
  "tag": [
    "tag1",
    "tag2",
    "tag3"
  ]
}
```

## Findings

### Pure Jaxb & Pure Jakarta Deserialization Issues

While both libraries are consistent with each other and the XML output they produce, they are both ultimately unable to deserialize their respective XML and JSON outputs without added assistance from Jackson annotations such as `@JsonProperty` and `@JacksonXmlElementWrapper`.

#### Adding @Jacksonized

The `@Jacksonized` annotation is a lombok annotation that is an add-on annotation for `@Builder` and `@SuperBuilder`. It automatically configures the generated builder class to be used by `Jackson`'s deserialization.

However, this annotation is not enough to fix the deserialization issues.

#### Adding Jaxb/Jakarta Annotations to Getters/Setters

Jackson uses the POJO's getters and setters for serialization and deserialization. By adding the Jaxb/Jakarta annotations to the getters and setters, we should theoretically be able to deserialize the XML and JSON outputs.

```java
@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id", "name", "date", "tags"})
@Data
@Jacksonized
@Builder
public class XmlModel {
    @XmlAttribute
    private long id;

    @XmlElement(name = "title")
    @Getter(onMethod_ = {@XmlElement(name = "title")})
    @Setter(onMethod_ = {@XmlElement(name = "title")})
    private String name;

    @XmlTransient
    private String author;

    @XmlElement
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    private ZonedDateTime date;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    @Getter(onMethod_ = {@XmlElementWrapper(name = "tags"), @XmlElement(name = "tag")})
    @Setter(onMethod_ = {@XmlElementWrapper(name = "tags"), @XmlElement(name = "tag")})
    private List<String> tag;
}
```

However, even this is not enough to have proper deserialization.

#### Supplementing with Jackson Annotations

We can supplement out existing Jaxb/Jakarta annotations with Jackson annotations to have proper deserialization.

```java
@JacksonXmlRootElement(localName = "book") // jackson-dataformat-xml
@XmlAccessorType(XmlAccessType.NONE) // Jaxb/Jakarta Annotation
@XmlType(propOrder = {"id", "name", "date", "tags"}) // Jaxb/Jakarta Annotation
@Data
@Jacksonized
@Builder
public class XmlModel {
    @JacksonXmlProperty(isAttribute = true) // jackson-dataformat-xml
    @Getter(onMethod_ = {@JsonGetter}) // Only needed if XmlAccessType.NONE
    private long id;

    @JacksonXmlProperty(localName = "title") // jackson-dataformat-xml
    @JsonProperty("title") // jackson-annotations
    private String name;

    @XmlTransient // Jaxb/Jakarta Annotation
    private String author;

    @JacksonXmlProperty // jackson-dataformat-xml
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class) // Jaxb/Jakarta Annotation
    @Getter(onMethod_ = {@JsonGetter}) // Only needed if XmlAccessType.NONE
    private ZonedDateTime date;

    @JacksonXmlElementWrapper(localName = "tags") // jackson-dataformat-xml
    @JacksonXmlProperty(localName = "tag") // jackson-dataformat-xml
    @Getter(onMethod_ = {@JsonGetter("tag")}) // Only needed if XmlAccessType.NONE
    private List<String> tag;
}
```

This is however, an excessive amount of annotations to have a simple POJO be able to serialize and deserialize XML and JSON. It is also not very maintainable as it requires a lot of background understand of Jackson / Jaxb / Jakarta XML Binding in order to properly implement the annotations.

What if there was a better way to do this?

### Pure Jackson

Instead, we can resolve all of these concerns by migrating to `jackson-dataformat-xml` and `jackson-annotations`. Not only do these libraries go back to the early Spring Framework days, but they also provide a more readable and maintainable way to serialize and deserialize XML and JSON.

```java
// No need for XmlAccessorType. Jackson annotations integrate with lombok as you would expect
@JacksonXmlRootElement(localName = "book")
@JsonPropertyOrder({"id", "name", "date", "tags"})
@Data
@Jacksonized
@SuperBuilder
public class XmlModel {
    // @JacksonXmlProperty is a super-set of @JsonProperty to allow for XML specific things,
    // in this case, specifying that id is an attribute of the root <book> element.
    //
    // This is also more readable because we can immediately tell, if we are working in XML,
    // the id property is an attribute. Instead if we are working in JSON, we can essentially ignore
    // this annotation since id will appear as expected with the "id" property.
    @JacksonXmlProperty(isAttribute = true)
    private long id;

    // Despite being @JsonProperty, this applies to both XML and JSON. Since we aren't doing to do anything special
    // With this property in XML, we can just use @JsonProperty to specify the name of the property when serialized/deserialized.
    @JsonProperty("title")
    private String name;

    // No need for a special @XmlIgnore tag since @JsonIgnore works for both XML and JSON
    @JsonIgnore
    private String author;

    // @JsonProperty is implied via the @JsonSerialization and @JsonDeserialization annotations
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    private ZonedDateTime date;

    // Here we use @JacksonXmlElementWrapper to specify that the tags should be wrapped in a <tags> element
    // but we can use the @JsonProperty annotation to specify that the element should be named "tag"
    // when JSON is being serialized. The @JsonProperty here in combination with @JacksonXmlElementWrapper
    // produces the expected nested XML of <tags><tag>...</tag>...<tag>...</tag></tags>.
    //
    // This is more readable when you think about it. The @JacksonXmlElementWrapper is only for XML, so if you are
    // looking in the XML for this POJO, you know to look for the <tags> element. Instead, if you are working in
    // JSON, you know you are looking for the "tag" element.
    @JacksonXmlElementWrapper(localName = "tags")
    @JsonProperty("tag")
    private List<String> tag;
}
```
