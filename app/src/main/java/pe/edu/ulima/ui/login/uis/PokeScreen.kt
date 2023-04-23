package pe.edu.ulima.ui.login.uis

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
public fun PokeScreenPreview(){
    PokeScreen()
}

@Composable
public fun PokeScreen(){

    var numSeguidores = 52
    var numSeguidos = 55
    var numPub = 52

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 10.dp),
        contentAlignment = Alignment.Center
    ){

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        painter = painterResource(id = R.drawable.ic_ulima),
                        contentDescription = "Foto Perfil",
                        modifier = Modifier
                            .size(120.dp)
                            .padding(bottom = 10.dp),
                        colorFilter = ColorFilter.tint(
                            color = if(isSystemInDarkTheme()) Orange200 else Gray200
                        )
                    )
                    Text(
                        text = "Carlos Torres",
                        textAlign = TextAlign.Center,
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = Integer.toString(numPub),
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Publicaciones",
                        textAlign = TextAlign.Center,
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = Integer.toString(numSeguidos),
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Seguidos",
                        textAlign = TextAlign.Center,
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = Integer.toString(numSeguidores),
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "Seguidores",
                        textAlign = TextAlign.Center,
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Button(
                    onClick = {
                        println("Presiono editar perfil")
                    }
                ){
                    Text("Editar Perfil")
                }
                Button(
                    onClick = {
                        println("Presiono compartir perfil")
                    }
                ){
                    Text("Compartir Perfil")
                }
                Button(
                    onClick = {
                        println("Presiono agregar algo")
                    }
                ){
                    Image(
                        painter = painterResource(id = R.drawable.ic_ulima),
                        contentDescription = "Foto Perfil",
                        modifier = Modifier
                            .size(15.dp),
                        colorFilter = ColorFilter.tint(
                            color = if(isSystemInDarkTheme()) Orange200 else Gray200
                        )
                    )

                }
            }

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ){
                Text(
                    text = "Historias destacadas",
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "Guarda tus historias favoritas en el perfil",
                    textAlign = TextAlign.Center,
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    OutlinedButton(
                        modifier= Modifier.size(50.dp),  //avoid the oval shape
                        shape = CircleShape,
                        border= BorderStroke(3.dp, Color.Black),
                        contentPadding = PaddingValues(0.dp),
                        onClick = {
                            println("Crea nueva historia")
                        }
                    ){
                        Icon(Icons.Default.Add, contentDescription = "content description")
                    }

                    Text(
                        text = "Nueva",
                        textAlign = TextAlign.Center,
                    )
                }

            }

            Row(

                verticalAlignment = Alignment.CenterVertically
            ) {

                Column(

                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                }

            }
        }


    }
}