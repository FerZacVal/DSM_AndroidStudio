package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            CardContent(
                title = stringResource(R.string.text_box),
                description = stringResource(R.string.text_desc),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            CardContent(
                title = stringResource(R.string.image_box),
                description = stringResource(R.string.image_desc),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            CardContent(
                title = stringResource(R.string.row_box),
                description = stringResource(R.string.row_desc),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            CardContent(
                title = stringResource(R.string.column_box),
                description = stringResource(R.string.column_desc),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun CardContent(title: String, description: String, color: Color, modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize().background(color).padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
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