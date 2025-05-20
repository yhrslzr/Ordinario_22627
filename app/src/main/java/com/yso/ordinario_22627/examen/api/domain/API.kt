package com.yso.ordinario_22627.examen.api.domain


import android.util.Log
import com.yso.ordinario_22627.examen.api.repo.Retrofit

class API {
    // Accedemos a la única función que creamos en nuestro objeto
    private val service = Retrofit.getRetrofitService()

    suspend fun getDatosPkm(): String {
        val msg: String
        val response = service.datosPkm() // llamada a la api


        /*obtenemos la respuesta y aplicamos la logica de que deseamos hacer con los campos*/

        msg = if (response.body()?.estatus.equals("success", true)) {
            response.body()?.mensaje ?: "-- NO HAY IMAGEN --"
        } else {
            "NO fue exitoso"
        }

        // debug
        Log.d("API_PRUEBA", "status es " + response.body()?.estatus) //.d es debug
        Log.e("API_PRUEBA ", "message es " + response.body()?.mensaje) //.e es error
        return msg
    }

}

