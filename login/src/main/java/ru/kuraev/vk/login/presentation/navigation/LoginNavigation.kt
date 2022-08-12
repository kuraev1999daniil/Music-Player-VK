package ru.kuraev.vk.login.presentation.navigation

sealed class LoginNavigation(val graphId: String)

object LoginScreenId : LoginNavigation("loginScreen")