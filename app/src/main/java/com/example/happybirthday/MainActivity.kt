package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    GreetingContent(
                        top = stringResource(R.string.caja_superior),
                        mid = stringResource(R.string.caja_medio),
                        bot = stringResource(R.string.caja_fondo),
                        card = painterResource(R.drawable.bg_compose_background)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingContent(top: String, mid: String, bot: String, card: Painter, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Image(painter = card, contentDescription = null)
        Text(
            text = top,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = mid,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = bot,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Act5Exer1Preview() {
    HappyBirthdayTheme {
        GreetingContent(
            top = stringResource(R.string.caja_superior),
            mid = stringResource(R.string.caja_medio),
            bot = stringResource(R.string.caja_fondo),
            card = painterResource(R.drawable.bg_compose_background)
        )
    }
}