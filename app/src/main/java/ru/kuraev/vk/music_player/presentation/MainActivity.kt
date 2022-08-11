package ru.kuraev.vk.music_player.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            AppLayout()
        }
    }

    @Preview
    @Composable
    fun AppLayout() {
        MaterialTheme {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .systemBarsPadding()
                    .fillMaxSize()
            ) {
                Column {
                    TextField(
                        value = "Почта или номер телефона",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth()
                    )
                    TextField(
                        value = "Пароль",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth()
                    )
                    Button(onClick = {  }, modifier = Modifier.fillMaxWidth()) {
                        Text(text = "Продолжить")
                    }
                }
            }
        }
    }
}