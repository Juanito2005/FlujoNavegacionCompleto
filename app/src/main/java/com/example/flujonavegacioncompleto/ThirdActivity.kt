package com.example.flujonavegacioncompleto

import android.R
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext

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
    val activity = (LocalContext.current as? Activity)

    // Quiero probar si se puede agregar fondo a una columna y si puede haber dos columnas
    /*Column(
        modifier = Modifier.background(color = Color(green), shape = 'rectangle')
    ) { }*/

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        // estoy probando, no lo cambies
        horizontalAlignment = AbsoluteAlignment.Left
    ) {
        Text("Tercera y última actividad")
        Button(onClick = {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }) {
            Text("Volver a la primera actividad")
        }
    }
}