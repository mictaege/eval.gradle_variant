# eval.gradle_variant


>This repository contains an evaluation of build variants for plain - no Android - projects using gradle.

## Abstract

Android Studio and the Gradle Android Plugin are supporting build variants for different production flavours of an Android application. Such a differentiation enables the deployment of the application for different devices.

```
app/
|--libs/
|--src/
   |--vanilla/
   |  |--java/
   |     |--com/example/
   |        |--Flavor.java
   |--strawberry/
   |  |--java/
   |     |--com/example/
   |        |--Flavor.java
   |--main/
      |--java/
      |  |--...
      |--res/
      |  |--...
      |--AndroidManifest.xml
```

```Gradle
productFlavors {
  vanilla {
    ...
  }
  strawberry {
    ...
  }
}
```
---

The goal of this project is to evaluate if such build variants and production flavours could be realized also for plain projects without the support of Android Studio und the Gradle Android Plugin in order to support software productions lines for customizable products. 
