package com.example.dagger_hilt_multimodule.binds

import javax.inject.Inject

class HogeImpl @Inject constructor(): HogeInterface {
    override fun call() = println("called ${this.javaClass.name}")
}