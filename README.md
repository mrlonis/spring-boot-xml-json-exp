# spring-boot-xml-json-exp

## Table of Contents

- [spring-boot-xml-json-exp](#spring-boot-xml-json-exp)
  - [Table of Contents](#table-of-contents)
  - [Setup](#setup)
    - [Java](#java)
      - [Mac/Linux](#maclinux)
      - [Windows](#windows)
        - [Advanced PowerShell Profile Setup](#advanced-powershell-profile-setup)
          - [Install All Java LTS Versions](#install-all-java-lts-versions)
          - [Helpful PowerShell Module](#helpful-powershell-module)
          - [PowerShell Profile](#powershell-profile)
    - [Maven](#maven)
      - [Installation](#installation)
        - [Mac-OS Maven Installation](#mac-os-maven-installation)
        - [Windows Maven Installation](#windows-maven-installation)
      - [Initial Project Setup](#initial-project-setup)
        - [Windows Setup Caveats](#windows-setup-caveats)
          - [Alternative](#alternative)
  - [Goals](#goals)
  - [Basic POJO](#basic-pojo)
  - [Sample Output](#sample-output)
    - [XML](#xml)
    - [JSON](#json)
  - [Findings](#findings)
    - [Pure Jaxb \& Pure Jakarta Deserialization Issues](#pure-jaxb--pure-jakarta-deserialization-issues)
      - [Adding @Jacksonized](#adding-jacksonized)
      - [Adding Jaxb/Jakarta Annotations to Getters/Setters](#adding-jaxbjakarta-annotations-to-getterssetters)
      - [Supplementing with Jackson Annotations](#supplementing-with-jackson-annotations)
    - [Pure Jackson](#pure-jackson)

## Setup

### Java

This project requires Java 17.

#### Mac/Linux

[SDKMAN! Install](https://sdkman.io/install)

```shell
sdk install java 17-tem
```

#### Windows

[Chocolatey Installation](https://chocolatey.org/install)

```powershell
choco install temurin17 -y
$env:JAVA_HOME = 'C:\Program Files\Eclipse Adoptium\jdk-17.0.11.9-hotspot' # Replace with your correct version
```

To permanently set the `JAVA_HOME` environment variable, you can run the following command in an Administrator PowerShell session:

```powershell
[Environment]::SetEnvironmentVariable('JAVA_HOME', 'C:\Program Files\Eclipse Adoptium\jdk-17.0.11.9-hotspot', 'Machine') # Replace with your correct version
```

##### Advanced PowerShell Profile Setup

###### Install All Java LTS Versions

Let's start by installing all of the major Java LTS versions:

```powershell
choco install temurin8 -y
choco install temurin11 -y
choco install temurin17 -y
choco install temurin21 -y
```

###### Helpful PowerShell Module

```powershell
Install-Module PSReadLine -RequiredVersion 2.1.0
Update-Module PSReadLine
Update-Module
```

###### PowerShell Profile

To make it easier to switch between different Java versions, you can add the following to your PowerShell profile (`$PROFILE`):

```powershell
$JAVA_8_PATH = 'C:\Program Files\Eclipse Adoptium\jdk-8.0.412.8-hotspot' # Replace with your correct version
$JAVA_11_PATH = 'C:\Program Files\Eclipse Adoptium\jdk-11.0.23.9-hotspot' # Replace with your correct version
$JAVA_17_PATH = 'C:\Program Files\Eclipse Adoptium\jdk-17.0.11.9-hotspot' # Replace with your correct version
$JAVA_21_PATH = 'C:\Program Files\Eclipse Adoptium\jdk-21.0.3.9-hotspot' # Replace with your correct version

Set-Alias -Name java8 -Value ($env:JAVA_HOME = $JAVA_8_PATH)
Set-Alias -Name java11 -Value ($env:JAVA_HOME = $JAVA_11_PATH)
Set-Alias -Name java17 -Value ($env:JAVA_HOME = $JAVA_17_PATH)
Set-Alias -Name java21 -Value ($env:JAVA_HOME = $JAVA_21_PATH)

Set-Alias -Name default_java8 -Value ([Environment]::SetEnvironmentVariable('JAVA_HOME', $JAVA_8_PATH, 'Machine'))
Set-Alias -Name default_java11 -Value ([Environment]::SetEnvironmentVariable('JAVA_HOME', $JAVA_11_PATH, 'Machine'))
Set-Alias -Name default_java17 -Value ([Environment]::SetEnvironmentVariable('JAVA_HOME', $JAVA_17_PATH, 'Machine'))
Set-Alias -Name default_java21 -Value ([Environment]::SetEnvironmentVariable('JAVA_HOME', $JAVA_21_PATH, 'Machine'))

Set-Alias -Name java -Value (Join-Path $env:JAVA_HOME 'bin\java.exe') # Load java from JAVA_HOME instead of the system path

Import-Module PSReadLine
Set-PSReadLineOption -PredictionSource History
```

### Maven

#### Installation

##### Mac-OS Maven Installation

```shell
brew install maven -y
```

##### Windows Maven Installation

```powershell
choco install maven -y
```

#### Initial Project Setup

If this is your first time in the project, you will need to run the following command to setup the project:

```shell
./mvnw clean verify
```

##### Windows Setup Caveats

If you are on Windows, your project cannot be inside of a filepath with spaces. This is because the `maven-wrapper` script
does not properly handle spaces in the file path. You will need to move the project to a directory without spaces in the
file path.

Example:

`C:\Users\John Doe\Documents\spring-boot-xml-json-exp` will not work. Instead, something like C:\GitHub\spring-boot-xml-json-exp`
will work.

###### Alternative

If you are unable to move the project to a directory without spaces, you can instead install Maven globally with
`choco install maven` and run the following command:

```shell
mvn clean verify
```

## Goals

The goal is to have the application return the same XML/JSON output for various different POJOs using different XML
annotation libraries.

## Basic POJO

```java
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

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
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

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

    @JsonProperty("title") // jackson-annotations
    private String name;

    @XmlTransient // Jaxb/Jakarta Annotation
    private String author;

    @JsonProperty // jackson-annotations
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class) // Jaxb/Jakarta Annotation
    private ZonedDateTime date;

    @JacksonXmlElementWrapper(localName = "tags") // jackson-dataformat-xml
    @JsonProperty("tag") // jackson-annotations
    private List<String> tag;
}
```

This is however, an excessive amount of annotations to have a simple POJO be able to serialize and deserialize XML and JSON. It is also not very maintainable as it requires a lot of background understand of Jackson / Jaxb / Jakarta XML Binding in order to properly implement the annotations.

What if there was a better way to do this?

### Pure Jackson

Instead, we can resolve all of these concerns by migrating to `jackson-dataformat-xml` and `jackson-annotations`. Not only do these libraries go back to the early Spring Framework days, but they also provide a more readable and maintainable way to serialize and deserialize XML and JSON.

```java
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.time.ZonedDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

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
