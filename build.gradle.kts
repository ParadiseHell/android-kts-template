buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }

    dependencies {
        classpath(Dependencies.build_gradle)
        classpath(Dependencies.kotlin_gradle_plugin)
    }
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}