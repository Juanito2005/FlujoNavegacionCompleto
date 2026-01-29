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
import androidx.compose.ui.tooling.preview.Preview

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TerceraActividad()
        }
    }
}

@Composable
fun TerceraActividad() {
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Tercera y última actividad")

        // Botón mágico para volver al inicio borrando todo el historial
        Button(onClick = {
            val intent = Intent(context, MainActivity::class.java)
            // Limpian la pila para que al volver al inicio, no puedas volver atrás a la 3.
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
            (context as? Activity)?.finish()
        }) {
            Text("Reiniciar Flujo (Volver al Inicio)")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewThirdActivity() {
    TerceraActividad()
}