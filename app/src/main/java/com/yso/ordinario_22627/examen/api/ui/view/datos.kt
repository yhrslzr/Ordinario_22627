package com.yso.ordinario_22627.examen.api.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import coil3.compose.AsyncImage
import com.yso.ordinario_22627.R
import com.yso.ordinario_22627.examen.api.ui.viewmodel.ViewModelPkm


@Composable
fun PantallaDatos(viewModelPkm: ViewModelPkm) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Bienvenido, conoce al mejor cachorro del año")
        // Imagen

        AsyncImage(
            model = viewModelPkm.urlImage,
            contentDescription = null,
        )

        Button(onClick = { viewModelPkm.mostrarDatosPkm() }) {
            Text("Cargar Imagen")
        }

    }
}