version = findProperty("project_version")!!

plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation(project(":lib"))

    // https://mvnrepository.com/artifact/com.drewnoakes/metadata-extractor
    implementation("com.drewnoakes:metadata-extractor:2.18.0")
}
