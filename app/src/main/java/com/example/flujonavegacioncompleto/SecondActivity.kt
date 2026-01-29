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
import androidx.compose.ui.platform.LocalContext

// Esta clase hereda de una super clase de Graddle, no? algo asi como la clase REST de Spring?
class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // esta linea se supone que es para que se le permita a esta actividad usar toda la pantalla?
        enableEdgeToEdge()
        setContent {
            SegundaActividad()
        }
    }
}

@Composable
fun SegundaActividad() {

    // Tiene que tener un contexto si o si, no? se puede tener el contexto de la primera activity? que pasa si hago eso G?
    val context = LocalContext.current
    val activity = (LocalContext.current as? Activity)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is the second Activity")

        Button(onClick = {
            val intent = Intent(context, ThirdActivity::class.java)
            // Este es el metodo en si, la linea de arriba es solo para indicar a donde debe ir
            context.startActivity(intent)
            // En teoria en esta seccion se puede cambiar el color del botón entre otras cosas, no?
            // tal vez con: 'colorResource()'?
        }) {
            Text("Ir a la tercera activity")
        }
    }
}