package pe.edu.ulima.ui.login.uis

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
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

    //variables de modificacion

    val nombreUsuario = "Carlos Torres"
    val numSeguidores = 52
    val numSeguidos = 55
    val numPub = 52

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 15.dp),
    ){

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        painter = rememberImagePainter(data = "https://i0.wp.com/lamiradafotografia.es/wp-content/uploads/2014/07/foto-perfil-psicologo-180x180.jpg?resize=180%2C180"),
                        contentDescription = "Foto Perfil",
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.CenterEnd,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = nombreUsuario,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = Integer.toString(numPub),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
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
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
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
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )
                    Text(
                        text = "Seguidores",
                        textAlign = TextAlign.Center,
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Orange200),
                    onClick = {
                        println("Presiono editar perfil")
                    }
                ){
                    Text("Editar Perfil",
                    color =  if(isSystemInDarkTheme()) Color.White else Color.Black)
                }
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Orange200),
                    onClick = {
                        println("Presiono compartir perfil")
                    }
                ){
                    Text("Compartir Perfil",
                        color =  if(isSystemInDarkTheme()) Color.White else Color.Black)
                }
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Orange200),
                    onClick = {
                        println("Presiono agregar algo")
                    }
                ){
                    Icon(Icons.Default.Person,
                        contentDescription = "content description",
                        tint =  if(isSystemInDarkTheme()) Color.White else Color.Black)
                    Icon(Icons.Default.Add,
                        contentDescription = "content description",
                        tint =  if(isSystemInDarkTheme()) Color.White else Color.Black)
                }
            }

            Column(
                modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
                horizontalAlignment = Alignment.Start
            ){
                Text(
                    text = "Historias destacadas",
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = "Guarda tus historias favoritas en el perfil",
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(bottom = 10.dp)
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    OutlinedButton(
                        modifier= Modifier.size(50.dp),  //avoid the oval shape
                        shape = CircleShape,
                        border= BorderStroke(3.dp, if(isSystemInDarkTheme()) Color.White else Color.Black),
                        contentPadding = PaddingValues(0.dp),
                        onClick = {
                            println("Crea nueva historia")
                        }
                    ){
                        Icon(
                            Icons.Default.Add,
                            modifier= Modifier.size(45.dp),
                            contentDescription = "content description",
                            tint =  if(isSystemInDarkTheme()) Color.White else Color.Black)
                    }

                    Text(
                        text = "Nueva",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                        fontSize = 12.sp
                    )
                }

            }

            //Esta es la parte para el array

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