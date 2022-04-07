plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply {
    from(rootProject.file("android.gradle"))
    plugin("com.didi.dokit")
}

buildscript {
    dependencies {
        classpath("io.github.didi.dokit:dokitx-plugin:${Versions.dokit}")
    }
}

dependencies {
    debugImplementation(Tools.dokit)
    releaseImplementation(Tools.dokit_no_op)
}
