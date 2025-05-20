package com.yso.ordinario_22627.examen.api.ui.model

import com.google.gson.annotations.SerializedName

//La data class tendrá los datos que deseamos buscar en la respuesta JSON

data class ModeloDatosPkm(
    @SerializedName("message") val mensaje: String?,
    @SerializedName("status") val estatus: String?

)
