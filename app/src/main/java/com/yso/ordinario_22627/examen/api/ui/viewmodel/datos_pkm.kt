package com.yso.ordinario_22627.examen.api.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yso.ordinario_22627.examen.api.domain.API
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ViewModelPkm : ViewModel() {

    var urlImage by mutableStateOf("")
        private set

    var allImages by mutableStateOf<List<String>>(emptyList())

    fun mostrarDatosPkm() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                urlImage = API().getDatosPkm()
            }
        }
    }



}