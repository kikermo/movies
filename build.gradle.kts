plugins {
    id(Plugins.androidApplication) version Versions.androidPlugin apply false
    id(Plugins.androidLibray) version Versions.androidPlugin apply false
    id(Plugins.kotlinAndroid) version Versions.kotlinAndroidPlugin apply false
    id(Plugins.hilt) version Versions.hilt apply false
    kotlin(Plugins.serialisation) version Versions.kotlinXSerialisationPluggin
}
