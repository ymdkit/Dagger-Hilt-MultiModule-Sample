package com.example.dagger_hilt_multimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.app.submodule.SubModuleInjectedClass
import com.example.dagger_hilt_multimodule.binds.HogeInterface
import com.example.dagger_hilt_multimodule.modifier.FirstPiyo
import com.example.dagger_hilt_multimodule.modifier.Piyo
import com.example.dagger_hilt_multimodule.modifier.SecondPiyo
import com.example.dagger_hilt_multimodule.provides.Fuga
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

    // @Inject をつけられないクラスの Inject
    @Inject
    lateinit var fuga: Fuga

    // 同じ型で複数種類の Inject を定義したい場合
    @FirstPiyo
    @Inject
    lateinit var firstPiyo: Piyo
    @SecondPiyo
    @Inject
    lateinit var secondPiyo: Piyo

    // サブモジュールのクラスの Inject
    @Inject
    lateinit var subModuleInjectedClass: SubModuleInjectedClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectedClass.call()
        injectedClass.callChild()

        singletonInjectedClass1.call()
        singletonInjectedClass2.call()

        viewModel.call()

        hoge.call()
        fuga.call()

        firstPiyo.call()
        secondPiyo.call()

        subModuleInjectedClass.call()
        subModuleInjectedClass.callSubSubModule()
    }
}