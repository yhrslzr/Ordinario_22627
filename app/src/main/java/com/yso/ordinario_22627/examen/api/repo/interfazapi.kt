package com.yso.ordinario_22627.examen.api.repo


import com.yso.ordinario_22627.examen.api.ui.model.ModeloDatosPkm
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface InterfacitaAPI {

    /*
    Aquí solo se definen las urls relativas, parámetros y tipo de respuesta
    */

    @GET("pokemon/data") //el metodo url, entre comillas la url relativa
    suspend fun datosPkm(): Response<ModeloDatosPkm>


}