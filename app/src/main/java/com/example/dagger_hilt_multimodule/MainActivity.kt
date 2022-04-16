package com.example.dagger_hilt_multimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // 一番基本の Inject
    @Inject
    lateinit var injectedClass: InjectedClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectedClass.call()
        injectedClass.callChild()

    }
}