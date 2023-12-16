<a href="https://search.maven.org/search?q=io.github.madmaximuus.persian:persian">
     <img alt="Version of library" src="https://img.shields.io/maven-central/v/io.github.madmaximuus.persian/persian.svg?label=Maven%20Central">
   </a>

# Integrating the Persian library into the application:

## Step 1

Add mavencentral() repository to build.gradle at project level

```groovy
repositories {
    mavenCentral()
}
```

## Step 2

Add library dependency in build.gradle at application level

```groovy
dependencies {

    //...
    
    implementation 'io.github.madmaximuus.persian:persian:<latest_version>'
    
    //...
}
```

## Step 3

Wrap application content in PersianTheme

```kotlin
setContent {
    PersianTheme {
        Surface {
            //Application content 
        }
    }
}
```