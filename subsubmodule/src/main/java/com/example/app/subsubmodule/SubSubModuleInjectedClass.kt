package com.example.app.subsubmodule

import javax.inject.Inject

class SubSubModuleInjectedClass @Inject constructor(){
    fun call() = println("called ${this.javaClass.name}")
}