plugins {
    id("org.jetbrains.intellij") version "0.6.5"
    kotlin("jvm") version "1.4.30"
}

group = "com.github.hwjames"
version = "0.0.1"

tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
}

listOf("compileKotlin", "compileTestKotlin").forEach {
    tasks.getByName<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>(it) {
        kotlinOptions.jvmTarget = "1.8"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

intellij {
    version = "201.8743.12"
    alternativeIdePath = "/Applications/Android Studio.app"
}

tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}