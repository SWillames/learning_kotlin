plugins {
    kotlin("jvm") version "1.9.20"
}

group = "br.com.sw_software"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.amshove.kluent:kluent:1.68")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}