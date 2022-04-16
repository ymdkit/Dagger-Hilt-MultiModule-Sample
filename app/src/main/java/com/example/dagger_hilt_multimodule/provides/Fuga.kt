package com.example.dagger_hilt_multimodule.provides

class Fuga private constructor() {

    companion object {
        fun create() = Fuga()
    }

    fun call() = println("called ${this.javaClass.name}")

}