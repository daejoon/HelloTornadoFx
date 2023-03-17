import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.10"
    id("org.openjfx.javafxplugin") version "0.0.13"
    id("application")
}

group = "com.ddoong2"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

javafx {
    modules = listOf("javafx.controls", "javafx.graphics")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("no.tornado:tornadofx:1.7.20")
    implementation("org.openjfx:javafx:17.0.6")
    implementation("org.openjfx:javafx-base:17.0.6")
    implementation("org.openjfx:javafx-controls:17.0.6")
    testImplementation(kotlin("test"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}