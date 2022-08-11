package ru.kuraev.vk.themes

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import ru.kuraev.vk.colors.LightColorTheme

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorTheme.get(),
        content = content
    )
}