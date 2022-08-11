object DefaultConfig {

    const val minSdk = 24
    const val targetSdk = 32
    const val compileSdk = 32

    const val applicationId = "ru.kuraev.vk.music_player"
}

object BuildVersion {

    private const val major = 1
    private const val minor = 0
    private const val patch = 0

    const val versionName = "$major.$minor.$patch"
    const val versionCode = 1
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:1.4.1"
    const val coreKtx = "androidx.core:core-ktx:1.7.0"

    object Activity {
        const val activityCompose = "androidx.activity:activity-compose:1.4.0"
    }

    object Compose {
        private const val version = "1.2.0"

        const val kotlinCompilerExtensionVersion = "1.2.0"

        const val foundation = "androidx.compose.foundation:foundation:$version"
        const val layout = "androidx.compose.foundation:foundation-layout:$version"
        const val material = "androidx.compose.material:material:$version"
        const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
        const val runtime = "androidx.compose.runtime:runtime:$version"
        const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
        const val tooling = "androidx.compose.ui:ui-tooling:$version"
        const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$version"
        const val test = "androidx.compose.ui:ui-test:$version"
        const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
        const val uiText = "androidx.compose.ui:ui-text-google-fonts:$version"
        const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"
        const val uiUtil = "androidx.compose.ui:ui-util:${version}"
        const val viewBinding = "androidx.compose.ui:ui-viewbinding:$version"
        const val animation = "androidx.compose.animation:animation:$version"

        object Material3 {
            private const val version = "1.0.0-alpha10"

            const val material3 = "androidx.compose.material3:material3:$version"
        }
    }

    object Navigation {
        private const val version = "2.5.1"

        const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        const val compose = "androidx.navigation:navigation-compose:$version"
        const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
    }

    object Lifecycle {
        private const val version = "2.4.1"

        const val extensions = "androidx.lifecycle:lifecycle-extensions:$version"
        const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
        const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$version"
    }
}

object Kotlin {

    private const val version = "1.7.0"

    const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"

    object Coroutines {
        private const val version = "1.6.4"

        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }
}