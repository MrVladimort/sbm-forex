group = "mrvladimort.pet"
version = "0.0.1-SNAPSHOT"
description = "sbm-forex"
java.sourceCompatibility = JavaVersion.VERSION_11

plugins {
    id("java")
    id("org.springframework.boot") version("2.5.4")
    id("io.spring.dependency-management") version("1.0.11.RELEASE")
    id("io.swagger.core.v3.swagger-gradle-plugin") version "2.1.10"
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.5.4"))
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(mapOf("group" to "org.junit.vintage", "module" to "junit-vintage-engine"))
    }

    implementation("org.liquibase:liquibase-core:4.4.3")
    implementation("org.liquibase:liquibase-maven-plugin:4.4.3")

    implementation("org.projectlombok:lombok:1.18.20")
    annotationProcessor("org.projectlombok:lombok:1.18.20")

    implementation("org.mapstruct:mapstruct:1.4.2.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.4.2.Final")

    implementation("am.ik.yavi:yavi:0.8.3")

    implementation("javax.xml.bind:jaxb-api:2.4.0-b180830.0359")
    runtimeOnly("com.h2database:h2:1.4.200")

}

tasks.test {
    useJUnitPlatform()
}
