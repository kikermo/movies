plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = Configuration.applicationId
    compileSdk = Configuration.compileSdk

    kapt {
        javacOptions {
            option("--target", "17")
        }
    }

    defaultConfig {
        applicationId = Configuration.applicationId
        minSdk = Configuration.minSdk
        targetSdk = Configuration.targetSdk
        versionCode = Configuration.versionCode
        versionName = Configuration.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }
    kotlinOptions {
        jvmTarget = Configuration.jvmTarget
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    packaging {
        resources.excludes.add("META-INF/*")
    }
}

kotlin {
    jvmToolchain(8)
}

dependencies {
    implementation(Libs.Kotlin.stdlib)

    api(project(":core-api"))
    implementation(project(":core-impl"))

    implementation(Libs.AndroidX.appCompat)
    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.composeActivity)
    implementation(Libs.AndroidX.lifecycleComposeRuntime)
    implementation(Libs.AndroidX.lifecycleComposeViewModel)
    implementation(Libs.AndroidX.navigationCompose)
    implementation(Libs.AndroidX.hiltNavigationCompose)

    implementation(Libs.Coroutines.android)

    implementation(Libs.Hilt.hiltAndroid)
    kapt(Libs.Hilt.hiltCompiler)

    implementation(Libs.Android.material)
    implementation(Libs.coil)

    implementation(platform(Libs.Compose.composeBom))
    implementation(Libs.Compose.foundation)
    implementation(Libs.Compose.material3)
    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.tooling)
    implementation(Libs.Compose.toolingPreview)
    debugImplementation(Libs.Compose.testManifest)

    testImplementation(Libs.junit)
    testImplementation(Libs.Mockk.mockk)
    testImplementation(Libs.Kotlin.testCommon)
    testImplementation(Libs.Kotlin.testJunit)
    testImplementation(Libs.Coroutines.test)
    testImplementation(Libs.appmattusFixtures)
}
