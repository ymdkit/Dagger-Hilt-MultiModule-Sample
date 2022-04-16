package com.example.dagger_hilt_multimodule.bind

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class HogeModule {

    @Binds
    abstract fun bindHoge(
        hogeImpl: HogeImpl
    ): HogeInterface

}