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
        kotlinCompilerExtensionVersion = "1.2.0"
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

    implementation(Android.coreKtx)
    implementation(Android.appcompat)

    implementation(JetpackCompose.composeRuntime)
    kapt(JetpackCompose.composeCompiler)

    implementation(JetpackCompose.composeUiLayout)
    implementation(JetpackCompose.composeUiAndroidText)
    implementation(JetpackCompose.composeUiText)
    implementation(JetpackCompose.composeUiMaterial)
}