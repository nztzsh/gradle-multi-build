/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("demo.java-library-conventions")
}

repositories {
        // TODO: support enableMavenLocal
        mavenCentral()
    }
dependencies {
    api("jakarta.xml.bind:jakarta.xml.bind-api:4.0.1")
    api("org.springframework.data:spring-data-commons:3.2.0")
    api("org.springframework:spring-core:6.1.0")
}
