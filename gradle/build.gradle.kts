plugins {
    java
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation(platform("io.cucumber:cucumber-bom:7.10.1"))

    testImplementation("io.cucumber:cucumber-bom:7.5.0")
    testImplementation("io.cucumber:cucumber-java:7.5.0")
    testImplementation("io.cucumber:cucumber-junit:7.5.0")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.5.0")
    testImplementation("org.junit.platform:junit-platform-suite:1.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
    testImplementation("org.junit.platform:junit-platform-suite-api:1.9.0")
}

repositories {
    mavenLocal()
    mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
    // Work around. Gradle does not include enough information to disambiguate
    // between different examples and scenarios.
    systemProperty("cucumber.junit-platform.naming-strategy", "long")
}
