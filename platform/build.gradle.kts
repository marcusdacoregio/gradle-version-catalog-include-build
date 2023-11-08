plugins {
    id("java-platform")
}

javaPlatform {
    allowDependencies()
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    constraints {
        api("com.nimbusds:nimbus-jose-jwt:9.24.4")
    }
}
