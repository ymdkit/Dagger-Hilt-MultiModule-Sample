package com.example.dagger_hilt_multimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.dagger_hilt_multimodule.binds.HogeInterface
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // 一番基本の Inject
    @Inject
    lateinit var injectedClass: InjectedClass

    // シングルトンクラスの Inject
    @Inject
    lateinit var singletonInjectedClass1: SingletonInjectedClass
    @Inject
    lateinit var singletonInjectedClass2: SingletonInjectedClass

    // ViewModel の Inject
    private val viewModel: MainViewModel by viewModels()

    // Interface を経由した Inject
    @Inject
    lateinit var hoge: HogeInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectedClass.call()
        injectedClass.callChild()

        singletonInjectedClass1.call()
        singletonInjectedClass2.call()

        viewModel.call()

        hoge.call()
    }
}