plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    kotlin("kapt")
    kotlin("plugin.serialization")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    api(project(":core-api"))

    implementation(Libs.Kotlin.stdlib)
    implementation(Libs.KotlinX.serialisation)
    implementation(Libs.Retrofit.retrofit)
    implementation(Libs.Retrofit.serialisationAdapter)
    implementation(Libs.OkHttp.loggingInterceptor)
    implementation(Libs.Coroutines.core)

    implementation(Libs.Hilt.hiltCore)
    kapt(Libs.Hilt.hiltCompiler)

    testImplementation(Libs.junit)
    testImplementation(Libs.Mockk.mockk)
    testImplementation(Libs.Kotlin.testCommon)
    testImplementation(Libs.Kotlin.testJunit)
    testImplementation(Libs.Coroutines.test)
    testImplementation(Libs.appmattusFixtures)
}
