This is an example project for [this](https://stackoverflow.com/questions/77914223/how-to-configure-eclipses-language-server-to-include-additional-source-director) question in Stackoverflow.

Steps:

- create a Spring application consisting of
  - graphql and
  - web

- add the `build-helper-maven-plugin` to the `pom.xml`
- add minimal graphql, at least 1 entity
- add `graphql-codegen-maven-plugin` to `pom.xml`
- create a controller which has reference to the generated graphql entity
- compile the project in:
  - IntelliJ --> compiles
  - command line --> compiles
  - Eclipse (fresh download, stock config) --> compiles
- open the controller in LunarVim with its stock setup
  - it will mark red the class reference to the graphql entity in the controller class (see screenshot)

The other screenshot shows the `LspLog`.

