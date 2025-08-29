package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.layout.ContentScale

import com.example.happybirthday.ui.theme.HappyBirthdayTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    GreetingContent()
                }
            }
        }
    }
}

@Composable
fun GreetingContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    )
        //Imagen de Fondo
        Image(
            painter = painterResource(R.drawable._96422cef1677ceb6065831bf67f9421),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        //Texto Superior
        Text(
            text = stringResource(R.string.universidad),
            modifier = Modifier
                .padding(top = 120.dp, start = 16.dp, end = 16.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center
        )
        //Resto de contenido
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            InfoPersonal(
                modifier = Modifier.align(Alignment.Center)
            )
            InfoContacto(
                modifier = Modifier.align(Alignment.BottomCenter)
            )
        }
}
@Composable
fun InfoPersonal(modifier: Modifier = Modifier){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        //Mitad 1 para imagen - Mitad 2 textos
        Box(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        ) {
            val image = painterResource(R.drawable.blasphemous)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
            )
        }
        // Textos de presentacion
        Column(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        ) {
            Text(
                text = stringResource(R.string.nombre),
                modifier = Modifier.padding(8.dp),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = stringResource(R.string.titulo),
                modifier = Modifier.padding(8.dp),
                color = Color.White
            )
        }
    }
}


@Composable
fun InfoContacto(modifier: Modifier = Modifier){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Teléfono",
                tint = Color.White
            )
            Text(
                text = stringResource(R.string.numero),
                modifier = Modifier.padding(start = 8.dp),
                color = Color.White
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Correo",
                tint = Color.White
            )
            Text(
                text = stringResource(R.string.correo),
                modifier = Modifier.padding(start = 8.dp),
                color = Color.White
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "Redes Sociales",
                tint = Color.White
            )
            Text(
                text = stringResource(R.string.redes),
                modifier = Modifier.padding(start = 8.dp),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun Act6Preview() {
    HappyBirthdayTheme {
        GreetingContent()
    }
}