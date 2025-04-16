/*
import org.gradle.api.tasks.bundling.Jar
import org.jetbrains.dokka.gradle.DokkaTaskPartial
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.*

plugins.apply("maven-publish")
plugins.apply("signing")
plugins.apply("org.jetbrains.dokka")

val androidSourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    if (plugins.hasPlugin("com.android.library")) {
        from(project.extensions.getByName("android")
            .let { it as com.android.build.gradle.LibraryExtension }
            .sourceSets.getByName("main").java.srcDirs)
        // Kotlin srcDirs (если вручную указаны):
        from("src/main/kotlin")
    } else {
        from(sourceSets["main"].java.srcDirs)
        from("src/main/kotlin")
    }
}

tasks.withType<DokkaTaskPartial>().configureEach {
    pluginsMapConfiguration.set(
        mapOf("org.jetbrains.dokka.base.DokkaBase" to """{ "separateInheritedMembers": true }""")
    )
}

val javadocJar by tasks.registering(Jar::class) {
    dependsOn(tasks.named("dokkaJavadoc"))
    archiveClassifier.set("javadoc")
    from(buildDir.resolve("dokka/javadoc"))
}

artifacts {
    add("archives", androidSourcesJar)
}

group = extra["PUBLISH_GROUP_ID"] as String
version = extra["PUBLISH_VERSION"] as String

afterEvaluate {
    publishing {
        publications {
            create("release", MavenPublication::class.java) {
                tasks.named("generateMetadataFileForReleasePublication") {
                    dependsOn(androidSourcesJar)
                }

                groupId = extra["PUBLISH_GROUP_ID"] as String
                artifactId = extra["PUBLISH_ARTIFACT_ID"] as String
                version = extra["PUBLISH_VERSION"] as String

                if (plugins.hasPlugin("com.android.library")) {
                    from(components.findByName("release"))
                } else {
                    from(components.findByName("java"))
                }

                artifact(javadocJar.get())

                pom {
                    name.set(extra["PUBLISH_ARTIFACT_ID"] as String)
                    description.set("Persian design system UiKit")
                    url.set("https://github.com/madmaximuus/persian")

                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }

                    developers {
                        developer {
                            id.set("madmaximuus")
                            name.set("Maxim Nechaev")
                            email.set("maxim00nechaev@gmail.com")
                        }
                    }

                    scm {
                        connection.set("scm:git:github.com/madmaximuus/persian.git")
                        developerConnection.set("scm:git:ssh://github.com/madmaximuus/persian.git")
                        url.set("https://github.com/MADMAXIMUUS/Persian/tree/master/persian")
                    }
                }
            }
        }
    }

    signing {
        useInMemoryPgpKeys(
            rootProject.extra["signing.keyId"] as String,
            rootProject.extra["signing.key"] as String,
            rootProject.extra["signing.password"] as String
        )
        sign(publishing.publications)
    }
}
*/
