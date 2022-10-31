package com.example.di_frameworks.di.main

import com.example.di_frameworks.repo.Repository
import com.example.di_frameworks.repo.RepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun getSmthFromNetworkRepository(repo: RepositoryImpl): Repository
}