buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:4.2.2")
    }
}

group = "ue.aggesop"
version = "0.0.1"

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
