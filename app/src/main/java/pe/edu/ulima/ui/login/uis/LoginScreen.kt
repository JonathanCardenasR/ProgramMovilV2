package pe.edu.ulima.ui.login.uis

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.ulima.R
import pe.edu.ulima.ui.theme.Gray200
import pe.edu.ulima.ui.theme.Orange200

@Preview
@Composable
public fun LoginScreenPreview(){
    LoginScreen()
}

@Composable
public fun LoginScreen(){
    var userText by remember { mutableStateOf(TextFieldValue("")) }
    var passwordText by remember { mutableStateOf(TextFieldValue("")) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
                Image(
                    painter = painterResource(id = R.drawable.ic_ulima),
                    contentDescription = "Logo Ulima",
                    modifier = Modifier
                        .size(120.dp)
                        .padding(bottom = 10.dp),
                    colorFilter = ColorFilter.tint(
                        color = if(isSystemInDarkTheme()) Orange200 else Gray200
                    )
                )
                Text(
                    text = "Bienvenido",
                    textAlign = TextAlign.Center,
                )
            TextField(
                value = userText,
                onValueChange = {
                    userText = it
                },
                label = {
                    Text(text = "Usuario")
                },
                placeholder = {
                    Text(text= "")
                },
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent
                )
            )
            TextField(
                value = passwordText,
                onValueChange = {
                    passwordText = it
                },
                label = {
                    Text(text = "Contraseña")
                },
                placeholder = {
                    Text(text= "")
                },
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent
                )
            )
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    println("+++++++++++++++++++++++++++++++++++++++")
                    println("${userText.text}")
                    println("${passwordText.text}")
                    println("+++++++++++++++++++++++++++++++++++++++")
                }
            ){
                Text("INGRESAR")
            }
        }
    }
}