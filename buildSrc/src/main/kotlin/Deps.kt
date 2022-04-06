object Versions {
    const val retrofit = "2.9.0"
    const val appcompat = "1.4.0"
    const val core_ktx = "1.7.0"
    const val constraintLayout = "2.1.3"
    const val paging = "3.0.0"
    const val timber = "4.7.1"
    const val kotlin = "1.5.31"
    const val work = "2.2.0"
    const val room = "2.2.6"
    const val card_view = "1.0.0"
    const val recyclerview = "1.0.0"
    const val fragment = "1.4.1"
    const val design = "1.5.0"

    const val junit = "4.13.2"
    const val junit_ext = "1.1.1"
    const val espresso_core = "3.2.0"
}

object BuildConfig {
    const val compileSdk = 31
    const val buildTools = "30.0.3"
    const val minSdk = 21
    const val targetSdk = 29
}


object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val paging_runtime = "androidx.paging:paging-runtime:${Versions.paging}"

    const val work_runtime = "androidx.work:work-runtime:${Versions.work}"
    const val work_testing = "androidx.work:work-testing:${Versions.work}"
    const val card_view = "androidx.cardview:cardview:${Versions.card_view}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val design = "com.google.android.material:material:${Versions.design}"

    const val room_runtime = "androidx.room:room-runtime:${Versions.room}"
    const val room_compiler = "androidx.room:room-compiler:${Versions.room}"
    const val room_ktx = "androidx.room:room-ktx:${Versions.room}"
    const val room_testing = "androidx.room:room-testing:${Versions.room}"

    const val fragment_runtime = "androidx.fragment:fragment:${Versions.fragment}"
    const val fragment_runtime_ktx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val fragment_testing = "androidx.fragment:fragment-testing:${Versions.fragment}"
}

object Retrofit {
    const val runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
}


object Tools {
    const val junit = "junit:junit:${Versions.junit}"
    const val junit_ext = "androidx.test.ext:junit:${Versions.junit_ext}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}

object Kotlin {
    const val stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}
