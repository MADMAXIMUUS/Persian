plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

extra.set("PUBLISH_GROUP_ID", "io.github.madmaximuus.persian")
extra.set("PUBLISH_VERSION", "8.0.1")
extra.set("PUBLISH_ARTIFACT_ID", "persian")

//apply(from = "${rootProject.projectDir}/scripts/publish-module.gradle.kts")

android {
    namespace = "io.github.madmaximuus.persian"
    compileSdk = 35

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

afterEvaluate {
    tasks.withType<Jar>().configureEach {
        from(rootProject.file("LICENSE")) {
            into("META-INF")
        }
        from(rootProject.file("NOTICE")) {
            into("META-INF")
        }
    }
}

dependencies {
    implementation(libs.core.ktx)
    implementation(libs.bundles.compose)
    implementation(libs.adaptive)
    implementation(libs.compose.animation)
    implementation(libs.datastore.preferences)
    implementation(libs.serialization)

    api(project(":persianSymbols"))

    debugImplementation(libs.ui.tooling)
    implementation(libs.glide)
}
