package com.example.dagger_hilt_multimodule.modifier

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstPiyo

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondPiyo

@Module
@InstallIn(SingletonComponent::class)
object PiyoModule {

    @FirstPiyo
    @Provides
    fun provideFirstPiyo(): Piyo = Piyo.create("first")

    @SecondPiyo
    @Provides
    fun provideSecondPiyo(): Piyo = Piyo.create("second")
}