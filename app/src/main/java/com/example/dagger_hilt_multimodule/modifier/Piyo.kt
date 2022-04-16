package com.example.dagger_hilt_multimodule.modifier

class Piyo private constructor(val name: String) {
    companion object {
        fun create(name: String) = Piyo(name)
    }

    fun call() = println("called ${this.javaClass.name}: $name")
}