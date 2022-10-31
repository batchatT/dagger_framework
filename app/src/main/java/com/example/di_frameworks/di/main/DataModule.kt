package com.example.di_frameworks.di.main

import com.example.di_frameworks.db.DBImpl
import com.example.di_frameworks.db.DataBase
import com.example.di_frameworks.di.second_main.SecondAppComponent
import com.example.di_frameworks.network.API
import com.example.di_frameworks.network.SomeAPI
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(subcomponents = [SecondAppComponent::class])
interface DataModule {

    @Singleton
    @Binds
    fun getSmthFromDB(db: DBImpl): DataBase

    @Singleton
    @Binds
    fun getSmthFromApi(api: SomeAPI): API
}