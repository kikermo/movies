object Configuration {
    const val applicationId = "org.kikermo.testapp"
    const val compileSdk = 33
    const val minSdk = 24
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val jvmTarget = "1.8"
}

object Versions {
    const val androidPlugin = "8.0.1"
    const val kotlinAndroidPlugin = "1.7.20"
    const val kotlinXSerialisationPluggin = "1.8.21"
    const val hilt = "2.44"
    const val composeCompiler = "1.4.7"

    internal const val kotlin = "1.7.0"
    internal const val coreKtx = "1.8.0"
    internal const val appCompat = "1.4.1"
    internal const val material = "1.5.0"
    internal const val junit = "4.13.2"
    internal const val androidGradlePlugin = "7.2.1"
    internal const val retrofit = "2.9.0"
    internal const val retrofitSerialisationConverter = "1.0.0"
    internal const val kotlinXSerialisation = "1.5.1"
    internal const val okhttpLoggingInterceptor = "4.11.0"
    internal const val composeBom = "2023.04.01"
    internal const val composeActivity = "1.5.1"
    internal const val lifecycleCompose = "2.6.1"
    internal const val coroutines = "1.6.4"
    internal const val mockk = "1.13.5"
    internal const val navigationCompose = "2.5.3"
    internal const val hiltNavigationCompose = "1.0.0"
    internal const val coil = "2.4.0"
    internal const val appmattusFixtures = "1.2.0"
    internal const val androidXJunit = "1.1.3"
}

object Libs {
    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"
        const val testCommon = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
        const val testJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivity}"
        const val lifecycleComposeRuntime =
            "androidx.lifecycle:lifecycle-runtime-compose:${Versions.lifecycleCompose}"
        const val lifecycleComposeViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycleCompose}"
        const val navigationCompose =
            "androidx.navigation:navigation-compose:${Versions.navigationCompose}"
        const val hiltNavigationCompose =
            "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"
        const val junitTest = "androidx.test.ext:junit:${Versions.androidXJunit}"
    }

    object Android {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object KotlinX {
        const val serialisation =
            "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinXSerialisation}"
    }

    object Hilt {
        const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCore = "com.google.dagger:hilt-core:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val serialisationAdapter =
            "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.retrofitSerialisationConverter}"
    }

    object OkHttp {
        const val loggingInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLoggingInterceptor}"
    }

    object Compose {
        const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
        const val foundation = "androidx.compose.foundation:foundation"
        const val ui = "androidx.compose.ui:ui"
        const val graphics = "androidx.compose.ui:ui-graphics"
        const val tooling = "androidx.compose.ui:ui-tooling"
        const val toolingPreview = "androidx.compose.ui:ui-tooling-preview"
        const val material3 = "androidx.compose.material3:material3"
        const val testJunit = "androidx.compose.ui:ui-test-junit4"
        const val testManifest = "androidx.compose.ui:ui-test-manifest"
    }

    object Coroutines {
        const val android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    }

    object Mockk {
        const val mockk = "io.mockk:mockk:${Versions.mockk}"
        const val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
    }


    const val junit = "junit:junit:${Versions.junit}"
    const val coil = "io.coil-kt:coil-compose:${Versions.coil}"
    const val appmattusFixtures = "com.appmattus.fixture:fixture:${Versions.appmattusFixtures}"
}

object Plugins {
    const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val androidApplication = "com.android.application"
    const val androidLibray = "com.android.library"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val hilt = "com.google.dagger.hilt.android"
    const val serialisation = "plugin.serialization"
}
