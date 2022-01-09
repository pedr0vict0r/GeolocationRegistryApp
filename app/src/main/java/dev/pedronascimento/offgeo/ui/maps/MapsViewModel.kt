package dev.pedronascimento.offgeo.ui.maps

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MapsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Maps Fragment"
    }
    val text: LiveData<String> = _text
}