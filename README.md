<a href="https://search.maven.org/search?q=io.github.madmaximuus.persian:persian">
     <img alt="Version of library" src="https://img.shields.io/maven-central/v/io.github.madmaximuus.persian/persian.svg?label=Maven%20Central">
   </a>
<br>
<br>
<a href="https://play.google.com/store/apps/details?id=ru.rabbit.persian.appShowcase&utm_source=global_co&utm_medium=prtnr&utm_content=Mar2515&utm_campaign=PartBadge">
    <img alt="Get it on Google Play" src="https://play.google.com/intl/en_us/badges/images/generic/en-play-badge.png" height=50px />
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