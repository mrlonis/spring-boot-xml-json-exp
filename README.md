# spring-boot-xml-json-exp

<!-- TOC -->
* [spring-boot-xml-json-exp](#spring-boot-xml-json-exp)
  * [Goals](#goals)
  * [Sample Output](#sample-output)
    * [XML](#xml)
    * [JSON](#json)
  * [Branches](#branches)
  * [Git pre-commit/post-commit scripts](#git-pre-commitpost-commit-scripts)
    * [Testing Scenarios](#testing-scenarios)
  * [Spotless](#spotless)

<!-- TOC -->

## Goals

The goal is to have the application return the same XML/JSON output for various different POJOs using different XML
annotation libraries.

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

## Branches

- `main`
  - The default Spring Boot 2.7.x branch
  - Data Formats: `[JAXB, Jakarta, Jackson]`
- `feature/spring-boot-2/jaxb`
  - Data Formats: `[JAXB]`
- `feature/spring-boot-2/jakarta`
  - Data Formats: `[Jakarta]`
- `feature/spring-boot-2/jackson`
  - Data Formats: `[Jackson]`
- `feature/spring-boot-3`
  - The Spring Boot 3.x.x branch
  - Data Formats: `[JAXB, Jakarta, Jackson]`
- `feature/spring-boot-3/jaxb`
  - Data Formats: `[JAXB]`
- `feature/spring-boot-3/jakarta`
  - Data Formats: `[Jakarta]`
- `feature/spring-boot-3/jackson`
  - Data Formats: `[Jackson]`

## Git pre-commit/post-commit scripts

This project uses a pre-commit script to format the code before committing. The script is located in the
`.hooks/pre-commit` file. The script is written in bash and uses spotless to format the code. The script is executed
before the commit takes place. If the script fails, the commit is aborted.

This project also uses a post-commit script to format the code after committing. The script is located in the
`.hooks/post-commit` file. The script is written in bash and uses spotless to format the code. The script is executed
after the commit takes place. The goal of this script is to ensure that the code is always formatted correctly. This
ensures that if a
commit is made, unstaged files will be formatted. Additionally, this helps cover scenarios where the un-staged file is
identical to the staged file **pre**-formatting, resulting in the bad formatting persisting
after the `pre-commit` script is executed, the change is just unstaged and not committed. This `post-commit` script will
format the file in this case so that the file is removed from the staging area.

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

## Spotless
