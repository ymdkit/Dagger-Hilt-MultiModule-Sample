package com.example.dagger_hilt_multimodule

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {

    fun call(){
        println("called ${this.javaClass.name}")
    }

}