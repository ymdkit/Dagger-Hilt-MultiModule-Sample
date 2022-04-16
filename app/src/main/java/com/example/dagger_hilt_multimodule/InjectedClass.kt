package com.example.dagger_hilt_multimodule

import javax.inject.Inject

class InjectedClass @Inject constructor(){
    fun call() = println("called ${this.javaClass.name}")
}