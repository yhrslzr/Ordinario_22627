package com.yso.ordinario_22627.examen.api.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.yso.ordinario_22627.R
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PantallaLista(opcion: Int) {

    val navController = rememberNavController()

    Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){

        LazyColumn(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {

            item {

                Row(modifier = Modifier.fillMaxWidth().background(Color.Gray)) {

                    Text("Bulbasaur")

                    Image(
                        painter = painterResource(id = R.drawable.bulbasaur),
                        contentDescription = "Bulbasaur"
                    )
                }


                Row (modifier = Modifier.fillMaxWidth().background(Color.Gray)) {

                    Text("Charmander")

                    Image(
                        painter = painterResource(id = R.drawable.charmander),
                        contentDescription = "Charmander"
                    )
                }

                Row (modifier = Modifier.fillMaxWidth().background(Color.Gray)) {

                    Text("Squirtle")

                    Image(
                        painter = painterResource(id = R.drawable.squirtle),
                        contentDescription = "Squirtle"
                    )
                }

                Row (modifier = Modifier.fillMaxWidth().background(Color.Gray)) {

                    Text("Pikachu")

                    Image(
                        painter = painterResource(id = R.drawable.pikachu),
                        contentDescription = "Pikachu"
                    )
                }

                Row (modifier = Modifier.fillMaxWidth().background(Color.Gray)) {

                    Text("Eevee")

                    Image(
                        painter = painterResource(id = R.drawable.eevee),
                        contentDescription = "Eevee"
                    )
                }

            }
        }
    }
}