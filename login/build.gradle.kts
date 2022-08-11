plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")
}
apply {
    plugin("kotlin-android")
}

android {
    compileSdk = DefaultConfig.compileSdk

    defaultConfig {
        minSdk = DefaultConfig.minSdk
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(Kotlin.reflect)
    implementation(Kotlin.Coroutines.core)
    implementation(Kotlin.Coroutines.android)

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appcompat)
    implementation(AndroidX.Activity.activityCompose)
    implementation(AndroidX.Lifecycle.livedata)
    implementation(AndroidX.Lifecycle.viewModelCompose)
    implementation(AndroidX.Navigation.fragment)
    implementation(AndroidX.Navigation.uiKtx)
    implementation(AndroidX.Navigation.compose)
    implementation(AndroidX.Compose.Material3.material3)

    implementation(AndroidX.Compose.layout)
    implementation(AndroidX.Compose.Material3.material3)
    implementation(AndroidX.Compose.materialIconsExtended)
    implementation(AndroidX.Compose.toolingPreview)
    implementation(AndroidX.Compose.uiUtil)
    implementation(AndroidX.Compose.runtime)
    implementation(AndroidX.Compose.runtimeLivedata)
    implementation(AndroidX.Compose.viewBinding)
    implementation(AndroidX.Compose.uiText)
    debugImplementation(AndroidX.Compose.tooling)
}