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
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.flujonavegacioncompleto.ui.theme.FlujoNavegacionCompletoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlujoNavegacionCompleto()
        }
    }
}
// Como se visualiza la pantalla?

// Me imagino que el @composable son como los @post/@put/@delete, etc. O sea metodos de Graddle
@Composable
fun FlujoNavegacionCompleto() {
    val context = LocalContext.current
    // Explica mas a fondo pa que es esta linea:
    // La actividad puede tener como parametro el contexto de otra actividad o de una dato? que se yo, ubicacion, un id, un token, etc
    val activity = (LocalContext.current as? Activity)

    // Se puede tener mas de una sola columna?
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        //Diferencia entre Arragement y alignment
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome Rodri to first Camilo's App")

        // Button para pasar a la siguiente pantalla
        Button(onClick = {
                // Aquí se le indica que SeconActivity es una clase de java, pero porque Java si termina en .kt?
                val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
        }) {
            Text("Ir a la segunda activity")
        }

        // Button para cerrar la app
        Button(onClick = {
            // EL signo "?" es en caso de que no exista activity?
            activity?.finish()
        }) {
            Text("Salir de la App")
        }

    }

}

// para que sirve esto? es como una marca de agua?
/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FlujoNavegacionCompletoTheme {
        Greeting("Android")
    }
}*/
