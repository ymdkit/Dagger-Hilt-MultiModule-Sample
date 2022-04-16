package com.example.dagger_hilt_multimodule.provides

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object FugaModule {

    @Provides
    fun provideFuga(): Fuga = Fuga.create()

}