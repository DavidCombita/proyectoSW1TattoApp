package com.proyectosw1.saloonprive.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.proyectosw1.saloonprive.R
import com.proyectosw1.saloonprive.ui.theme.SaloonPriveTheme
import com.proyectosw1.saloonprive.ui.theme.buttonColorBrown

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SaloonPriveTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Greeting()
                        ContainedButtos()

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Image(painter = painterResource(id = R.drawable.image_background_app_logo),
        contentDescription ="Logo",
        modifier = Modifier
            .fillMaxWidth()
            .height(340.dp).padding(top = 20.dp))
}

@Preview(showBackground = true)
@Composable
fun ContainedButtos() {
    Row(horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) {
        Button(
            onClick = { },
            modifier = Modifier.weight(1f).height(42.dp)
                .padding(start = 10.dp, end = 5.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = buttonColorBrown,
                contentColor = Color(0xFFFFFFFF)
            )
        ) { Text("Crear reservación") }
        Button(
            onClick = { },
            modifier = Modifier.weight(1f).height(42.dp)
                .padding(start = 5.dp, end = 10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = buttonColorBrown,
                contentColor = Color(0xFFFFFFFF)
            )
        ) { Text("Ver Inventario") }
    }
}

