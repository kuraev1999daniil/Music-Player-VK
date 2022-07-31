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

object Android {

    private const val coreKtxVersion = "1.8.0"
    private const val appcompatVersion = "1.4.2"

    const val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
}

object JetpackCompose {

    private const val composeVersion = "0.1.0-dev01"

    const val composeRuntime = "androidx.compose:compose-runtime:$composeVersion"
    const val composeCompiler = "androidx.compose:compose-compiler:$composeVersion"

    const val composeUiLayout = "androidx.ui:ui-layout:$composeVersion"
    const val composeUiAndroidText = "androidx.ui:ui-android-text:$composeVersion"
    const val composeUiText = "androidx.ui:ui-text:$composeVersion"
    const val composeUiMaterial = "androidx.ui:ui-material:$composeVersion"
}