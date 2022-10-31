package com.example.di_frameworks.di.second_main

import com.example.di_frameworks.network.API
import com.example.di_frameworks.network.SomeAPI
import dagger.Module
import dagger.Provides

@Module
class APIModule {

    @Provides
    fun provideApi(): API = SomeAPI()
}