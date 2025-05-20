package com.yso.ordinario_22627.examen.api.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import kotlinx.coroutines.launch
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import kotlinx.coroutines.launch
import java.lang.Exception

@Preview(showBackground = true)
@Composable
fun NavegacionIniciaL() {

    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "inicial") {
        composable("inicial") {
            PantallaInicial(navController)
        }

        composable(
            route = "gameover",
            arguments = listOf(
                navArgument("opcion") {
                    type = NavType.IntType
                    defaultValue = 0
                })

        ) { params ->

            val opcion = params.arguments?.getInt("opcion") ?: 0
            PantallaGameOver(opcion)
        }

        composable(
            route = "lista",
            arguments = listOf(
                navArgument("opcion") {
                    type = NavType.IntType
                    defaultValue = 0
                })

        ) { params ->

            val opcion = params.arguments?.getInt("opcion") ?: 0
            PantallaLista(opcion)
        }
    }
}


@Composable
fun PantallaInicial(navController: NavController){

    var opcion by remember { mutableIntStateOf(0) }
    var aviso1 by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        // a)
        Text(text = "¿Opción a probar (1 ó 2)?")

        Spacer(modifier = Modifier.padding(16.dp))

        TextField(value = opcion.toString(), onValueChange = {opcion = it.toIntOrNull() ?: 0},
            label = { Text(text = "Opción") })

        Spacer(modifier = Modifier.padding(16.dp))

        // b)
        Button(onClick = {
            // Validar si es 1 o 2 (texto 1), si introduce un número distinto, manda otro texto (texto2)

            if (opcion == 1)
                navController.navigate("gameover")
            else if (opcion == 2)
                navController.navigate("lista")
            else
                aviso1 = "Por favor, ingrese alguno de estos números: 1, 2"

        }) {
            Text(text = "Validar Opción")

            Text(aviso1)
        }
        Spacer(modifier = Modifier.padding(16.dp))
    }

    //nombre del alumno hasta el fondo de la columna
    Row ( modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom) {
        Text("Salazar Ortiz Yahir. 22627")
    }

}