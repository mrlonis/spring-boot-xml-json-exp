# spring-boot-xml-json-exp

## Goals

The goal is to have the application return the same XML/JSON output for various different POJOs using different XML
annotation libraries.

## Sample Output

### XML

```xml

<book id="1">
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
