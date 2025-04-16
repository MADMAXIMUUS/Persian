// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath(libs.kotlin.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.jetbrains.kotlin.jvm) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.nexus)
    alias(libs.plugins.dokka)
}

apply { from("${rootDir}/scripts/publish-root.gradle.kts") }

tasks.create<Delete>("clean") {
    delete = setOf(
        rootProject.layout.buildDirectory
    )
}

true