package com.example.dagger_hilt_multimodule

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SingletonInjectedClass @Inject constructor() {
    private var count = 0

    fun call(){
        println("called ${this.javaClass.name}: $count")
        count++
    }
}