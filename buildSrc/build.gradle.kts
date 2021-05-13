plugins {
    `kotlin-dsl`
}

repositories {
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
//    implementation("org.jetbrains.dokka:dokka-gradle-plugin:0.11.0-dev-59")
}
