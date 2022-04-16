package com.example.app.submodule

import javax.inject.Inject

class SubModuleInjectedClass @Inject constructor(){
    fun call() = println("called ${this.javaClass.name}")
}