package com.example.app.submodule

import com.example.app.subsubmodule.SubSubModuleInjectedClass
import javax.inject.Inject

class SubModuleInjectedClass @Inject constructor(
    private val subusbModuleInjectedClass: SubSubModuleInjectedClass
){
    fun call() = println("called ${this.javaClass.name}")

    fun callSubSubModule() = subusbModuleInjectedClass.call()
}