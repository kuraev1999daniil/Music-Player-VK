package ru.kuraev.vk.music_player.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.kuraev.vk.login.presentation.LoginScreen
import ru.kuraev.vk.login.presentation.navigation.LoginScreenId

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = LoginScreenId.graphId) {
                composable(LoginScreenId.graphId) {
                    LoginScreen()
                }
            }
        }
    }
}