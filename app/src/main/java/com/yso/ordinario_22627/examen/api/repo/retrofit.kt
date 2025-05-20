package com.yso.ordinario_22627.examen.api.repo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    //Configurar retrofit , creamos el objeto retrofit
    private val URL_BASE = "https://pokeapi.co/api/v2/pokemon/"

    fun getRetrofitService(): InterfacitaAPI {
        val retrofit = Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: InterfacitaAPI = retrofit.create(InterfacitaAPI::class.java)
        return service
    }
}