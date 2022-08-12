plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")
}

android {
    compileSdk = DefaultConfig.compileSdk

    defaultConfig {
        applicationId = DefaultConfig.applicationId
        minSdk = DefaultConfig.minSdk
        targetSdk = DefaultConfig.targetSdk
        versionCode = BuildVersion.versionCode
        versionName = BuildVersion.versionName
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = AndroidX.Compose.kotlinCompilerExtensionVersion
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {

    implementation(project(":login"))
    implementation(project(":themes"))

    implementation(Kotlin.reflect)
    implementation(Kotlin.Coroutines.core)
    implementation(Kotlin.Coroutines.android)

    implementation(AndroidX.Activity.activityCompose)
    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appcompat)
    implementation(AndroidX.Lifecycle.livedata)
    implementation(AndroidX.Lifecycle.viewModelCompose)
    implementation(AndroidX.Navigation.compose)

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