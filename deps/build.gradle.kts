plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}


gradlePlugin {
    plugins.register("legox.deps") {
        id = "legox.deps"
        implementationClass = "legox.deps.VersionPlugin"
    }
}