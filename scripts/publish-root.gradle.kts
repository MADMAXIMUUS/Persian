/*
import java.util.Properties

val secretPropsFile = rootProject.file("varible.properties")

val props = Properties()

if (secretPropsFile.exists()) {
    secretPropsFile.inputStream().use { props.load(it) }
} else {
    props["ossrhUsername"] = System.getenv("OSSRH_USERNAME")
    props["ossrhPassword"] = System.getenv("OSSRH_PASSWORD")
    props["sonatypeStagingProfileId"] = System.getenv("SONATYPE_STAGING_PROFILE_ID")
    props["signing.keyId"] = System.getenv("SIGNING_KEY_ID")
    props["signing.password"] = System.getenv("SIGNING_PASSWORD")
    props["signing.key"] = System.getenv("SIGNING_KEY")
    props["snapshot"] = System.getenv("SNAPSHOT")
}

// Кладем значения в extra
props.forEach { key, value ->
    extra.set(key.toString(), value)
}

nexusPublishing {
    repositories {
        sonatype {
            stagingProfileId.set(extra["sonatypeStagingProfileId"] as String)
            username.set(extra["ossrhUsername"] as String)
            password.set(extra["ossrhPassword"] as String)
            version.set(extra["rootVersionName"] as? String ?: "1.0.0")
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
        }
    }
}*/
