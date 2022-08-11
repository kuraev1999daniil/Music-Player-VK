package ru.kuraev.vk.colors

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color


object LightColorTheme {

    fun get() = lightColorScheme(
        primary = Primary,
        onPrimary = OnPrimary
    )

    private val Primary = Color(0xFFFFFFFF)
    private val OnPrimary = Color(0xFF000000)
}