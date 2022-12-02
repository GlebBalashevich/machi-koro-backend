plugins {
    id("java")
    id("org.springframework.boot") version "2.7.5"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

group = "com.boardg"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val mapstructVersion = "1.5.2.Final"

dependencies {
    annotationProcessor("org.projectlombok:lombok")
    annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")
    compileOnly("org.projectlombok:lombok")

    implementation("org.springframework.boot:spring-boot-starter-websocket")
    implementation("org.springframework.integration:spring-integration-stomp:6.0.0")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation ("org.webjars:webjars-locator-core")
    implementation ("org.webjars:sockjs-client:1.0.2")
    implementation ("org.webjars:stomp-websocket:2.3.3")
    implementation ("org.webjars:bootstrap:3.3.7")
    implementation ("org.webjars:jquery:3.1.1-1")
    implementation("org.mapstruct:mapstruct:$mapstructVersion")


    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
