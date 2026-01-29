package com.example.flujonavegacioncompleto

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlujoNavegacionCompleto()
        }
    }
}

@Composable
fun FlujoNavegacionCompleto() {
    val context = LocalContext.current
    val activity = (LocalContext.current as? Activity)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome Rodri to first Camilo's App", color = Color.Red)

        // Botón para ir a la Segunda Actividad
        Button(onClick = {
            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
        }) {
            Text("Ir a la Segunda Activity")
        }

        // Botón para cerrar la App
        Button(onClick = {
            activity?.finish()
        }) {
            Text("Salir de la App")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMainActivity() {
    FlujoNavegacionCompleto()
}