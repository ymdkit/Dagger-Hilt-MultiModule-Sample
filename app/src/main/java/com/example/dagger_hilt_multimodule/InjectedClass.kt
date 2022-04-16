package com.example.dagger_hilt_multimodule

import javax.inject.Inject

class InjectedClass @Inject constructor(
    private val childInjectedClass: ChildInjectedClass
){
    fun call() = println("called ${this.javaClass.name}")
    fun callChild() = childInjectedClass.call()
}