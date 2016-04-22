# Work-in-progress

###  Desired directory structure

```
Makefile                   <- Top-level Makefile to encapsulate tools specifics
settings.gradle            <- definition of sub-projects

build.gradle               <- main Gradle build file, dependencies & plugins
gradlew                    <- script that will run Gradle on Unix systems
gradlew.bat                <- script that will run Gradle on Windows
gradle                     <- local gradle wrapper

common/
    build.gradle           <- Gradle build file for common project
    src/                   <- Source for shared code

android/
    build.gradle           <- Gradle build file for Android lib
    AndroidManifest.xml    <- Android specific config
    src/                   <- Source for Android lib
    sample/                <- sample app
jre/
    build.gradle           <- Gradle build file for the html project*
    src/                   <- Source for JRE Java library
    sample/                <- sample app
```
