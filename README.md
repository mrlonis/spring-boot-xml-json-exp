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

## Git pre-commit script

### Testing Scenarios

- [X] Scenario 1: File is modified. After spotless it is still modified, but now formatted and ready for commit.
- [X] Scenario 2: File is modified, but after spotless it is no longer modified and the commit is now empty.
- [X] Scenario 3: 2 Files are modified, but after spotless 1 is no longer modified but the commit is not empty. Only the
  modified file is committed.
- [X] Scenario 4: 2 Files are modified, but after spotless both are no longer modified and the commit is empty.
- [X] Scenario 5: 2 Files are modified, but after spotless both are still modified and the commit is not empty. Both
  files are committed.
- [ ] Scenario 6: File is modified, and added to git for commit. The file is then re-modified. A commit takes place
  without adding the new changes to the commit. This causes us to have staged and unstaged changes. The pre-commit
  script handle this merge and result in a file that is formatted and ready for commit.
