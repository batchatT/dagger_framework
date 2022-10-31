package com.example.di_frameworks.di.main

import androidx.lifecycle.ViewModel
import com.example.di_frameworks.ui.main.MainViewModel
import dagger.Binds
import dagger.Module

@Module
interface ViewModelModule {

    @Binds
    fun provideMainViewModel(viewModel: MainViewModel): ViewModel
}