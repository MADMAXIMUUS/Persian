<a href="https://search.maven.org/search?q=io.github.madmaximuus.persian:persian">
     <img alt="Version of library" src="https://img.shields.io/maven-central/v/io.github.madmaximuus.persian/persian.svg?label=Maven%20Central">
   </a>

=======
<a href="https://search.maven.org/search?q=io.github.madmaximuus.persian:persian">
     <img alt="Version of library" src="https://img.shields.io/maven-central/v/io.github.madmaximuus.persian/persian.svg?label=Maven%20Central">
   </a>

Интеграция библиотеки Persian в приложение:

## Шаг 1

Добавить репозиторий mavencentral() в build.gradle на уровне проекта

```groovy
repositories {
		mavenCentral()
}
```

## Шаг 2

Добавить зависимость на библиотеку в build.gradle на уровне приложения

```groovy
dependencies{
		...

		implementation 'io.github.madmaximuus.persian:persian:1.0.0'

		...
}
```

## Шаг 3

Обернуть контент приложения в PersianTheme

```kotlin
setContent{
	PersianTheme{
		Surface{
			//Контент приложения
		}
	}
}
```