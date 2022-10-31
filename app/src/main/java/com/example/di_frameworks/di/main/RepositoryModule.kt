package com.example.di_frameworks.di.main

import com.example.di_frameworks.db.DataBase
import com.example.di_frameworks.db.GetSmthFromDBImpl
import com.example.di_frameworks.network.API
import com.example.di_frameworks.network.SomeAPI
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun getSmthFromDB(db: GetSmthFromDBImpl): DataBase

    @Binds
    fun getSmthFromApi(api: SomeAPI): API
}