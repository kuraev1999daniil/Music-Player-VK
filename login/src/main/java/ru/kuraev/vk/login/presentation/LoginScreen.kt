package ru.kuraev.vk.login.presentation

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vk.api.sdk.auth.VKScope
import ru.kuraev.vk.colors.Colors
import ru.kuraev.vk.login.R

@Preview
@Composable
fun LoginScreen() {
    MaterialTheme {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(Colors.White)
                .imePadding()
                .verticalScroll(rememberScrollState())
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            ) {
                LogoView()
                TitleView()
                LoginView()
                Spacer(modifier = Modifier.height(4.dp))
                PasswordView()
                DoneView()
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

@Composable
private fun LogoView() {
    Image(painter = painterResource(id = R.drawable.ic_vk_logo), contentDescription = null)
}

@Composable
private fun TitleView() {
    Text(
        text = stringResource(id = R.string.title),
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(vertical = 16.dp)
    )
}

@Composable
private fun LoginView() {
    val login = remember { mutableStateOf("") }
    OutlinedTextField(
        value = login.value,
        onValueChange = { onValueChange -> login.value = onValueChange },
        shape = RoundedCornerShape(8.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
        placeholder = {
            Text(text = stringResource(R.string.placeholder_login), color = Colors.Gray)
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Email, contentDescription = null)
        },
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            cursorColor = Colors.VK,
            focusedBorderColor = Colors.VK,
            unfocusedBorderColor = Colors.VK,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .focusRequester(FocusRequester.Default)
    )
}

@Composable
private fun PasswordView() {
    val password = remember { mutableStateOf("") }
    val passwordVisibility = remember { mutableStateOf(false) }
    OutlinedTextField(
        value = password.value,
        onValueChange = { onValueChange -> password.value = onValueChange },
        shape = RoundedCornerShape(8.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done,
        ),
        placeholder = {
            Text(text = stringResource(R.string.placeholder_password), color = Colors.Gray)
        },
        keyboardActions = KeyboardActions {

        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Password, contentDescription = null)
        },
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            cursorColor = Colors.VK,
            focusedBorderColor = Colors.VK,
            unfocusedBorderColor = Colors.VK,
        ),
        trailingIcon = {
            IconButton(onClick = {
                passwordVisibility.value = !passwordVisibility.value
            }, content = {
                if (passwordVisibility.value) {
                    Icon(imageVector = Icons.Default.Visibility, contentDescription = null)
                } else {
                    Icon(imageVector = Icons.Default.VisibilityOff, contentDescription = null)
                }
            })
        },
        visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation(),
        modifier = Modifier
            .fillMaxWidth()
    )
}

@Composable
private fun DoneView() {
    Button(
        onClick = {

        },
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(containerColor = Colors.VK),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = stringResource(id = R.string.enter)
        )
    }
}