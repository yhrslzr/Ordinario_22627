package com.yso.ordinario_22627.examen.api.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.yso.ordinario_22627.R
import androidx.compose.material3.Text

@Composable
fun PantallaGameOver(opcion: Int) {

    val navController = rememberNavController()

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.game_over),
            contentDescription = "Game Over")

        Button(onClick = { navController.navigate("inicial") }) {

            Text(text = "Regresar")

        }

    }

}

