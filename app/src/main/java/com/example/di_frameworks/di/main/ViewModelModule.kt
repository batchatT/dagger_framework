package com.example.di_frameworks.di.main

import com.example.di_frameworks.repo.GetSmthRepositoryImpl
import com.example.di_frameworks.repo.GetSmthRepository
import dagger.Binds
import dagger.Module

@Module
interface ViewModelModule {

    @Binds
    fun getSmthFromNetworkRepository(repo: GetSmthRepositoryImpl): GetSmthRepository
}