# Persian — Design System for Android (Compose)

**Persian** is a design system for Android built with Jetpack Compose. It helps unify UI, speed up development, and promote reuse of common components.

> **Currently Android-only.**
> Compose Multiplatform (Desktop, iOS, Web) support is planned for future releases.


## What Persian offers

- Unified theme and typography
- Consistent set of UI components (Button, TextField, etc.)
- Built-in light/dark theme support
- Built-in phone/tablet size support
- Flexible customization via tokens


## Quick Start

Current latest version is [![Maven Central](https://maven-badges.sml.io/maven-central/io.github.madmaximuus.persian/persian/badge.svg)](https://central.sonatype.com/artifact/io.github.madmaximuus.persian/persian)

### 1. Import library
To start using Persian in your Compose app, add the dependency according to your dependencies declaration method:
#### Version catalog
```toml
[versions]
persian="<version>"

[libraries]
persian={ group="io.github.madmaximuus.persian", name="persian", version.ref="persian" }
```
```kotlin
dependencies {
    implementation(libs.persian)
}
```
#### Kotlin DSL
```kotlin
dependencies {
    implementation("io.github.madmaximuus.persian:persian:<version>")
}
```
#### Groovy
```Groovy
dependencies {
    implementation "io.github.madmaximuus.persian:persian:<version>"
}
```

### 2. Wrap your app content in PersianTheme
```kotlin
// Some code

setContent{
    PersianTheme{
        Surface{
            // Your app content
        }
    }
}

//Some code
```

### 3. Get access to foundation styles
```kotlin
PersianTheme.colorScheme // to get access to color schemes
PersianTheme.typography // to get access to typography styles
PersianTheme.shapes // to get access to shapes
PersianTheme.spacing // to get access to spacing sizes
PersianTheme.elevation // to get access to elevation values

```

## Documentation sections

- [Foundation](foundation.md)
- [Components](components/index.md)
    - [Action sheet](components/actionSheet/index.md)
    - [Alert](components/alert/index.md)
    - [Avatar & Image](components/AvatarAndImage/index.md)
    - [Banner](components/banner/index.md)
    - [Button](components/button/index.md)
    - [Charts](components/charts/index.md)
    - [Checkbox](components/checkbox/index.md)
    - [Chips](components/chips/index.md)
    - [Code input](components/codeInput/index.md)
    - [Code picker](components/codePicker/index.md)
    - [Counter](components/counter/index.md)
    - [Date picker](components/datePicker/index.md)
    - [Divider](components/divider/index.md)
    - [FAB](components/fab/index.md)
    - [Form item](components/formItem/index.md)
    - [Icon button](components/iconButton/index.md)
    - [Input](components/input/index.md)
    - [List item](components/listItem/index.md)
    - [Modal page](components/modalPage/index.md)
    - [Navigation bar](components/navigationBar/index.md)
    - [Page indicator](components/pageIndicator/index.md)
    - [Progress indicator](components/progressIndicator/index.md)
    - [Radio button](components/radioButton/index.md)
    - [Section](components/section/index.md)
    - [Segmented controls](components/segmentedControls/index.md)
    - [Select](components/select/index.md)
    - [Sliders](components/sliders/index.md)
    - [Snackbar](components/snackbar/index.md)
    - [Switch](components/switch/index.md)
    - [Tabs](components/tabs/index.md)
    - [Text area](components/textArea/index.md)
    - [Top app bar](components/topAppBar/index.md)

## Contributing

Want to contribute or suggest improvements? Feel free to open [issues](https://github.com/MADMAXIMUUS/Persian/issues) or submit pull requests.

## License

All Persian content, guidelines, imagery, and resources are available under the [Apache 2.0](../LICENSE) license.