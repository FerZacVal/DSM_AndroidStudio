package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import java.io.StringWriter

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
    Column(
        //modifier = Modifier.fillMaxWidth().fillMaxHeight()
    ) {
        InfoPersonal()
        InfoContacto()
    }
}

@Composable
fun InfoPersonal(){
    Row(){
        val image = painterResource(R.drawable.blasphemous)
        Box(){
            Image(
                painter = image,
                contentDescription = null,
            )
        }
        Column {
            Text(
                text = stringResource(R.string.nombre),
                modifier = Modifier.padding(16.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(R.string.titulo),
                modifier = Modifier.padding(12.dp)
            )
        }
    }
}

@Composable
fun InfoContacto(){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ){
        Text(
            text = stringResource(R.string.numero),
            modifier = Modifier.padding(12.dp)
        )
        Text(
            text = stringResource(R.string.correo),
            modifier = Modifier.padding(12.dp)
        )
        Text(
            text = stringResource(R.string.redes),
            modifier = Modifier.padding(12.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Act5Exer3Preview() {
    HappyBirthdayTheme {
        GreetingContent()
    }
}