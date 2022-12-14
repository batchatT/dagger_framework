package com.example.di_frameworks.di.feature

import androidx.lifecycle.ViewModel
import com.example.di_frameworks.feature.FeatureRepository
import com.example.di_frameworks.feature.FeatureRepositoryImpl
import com.example.di_frameworks.ui.feature.FeatureViewModel
import dagger.Binds
import dagger.Module

@Module
interface FeatureModule {

    @Binds
    fun provideFeatureViewModel(viewModel: FeatureViewModel): ViewModel

    @Binds
    fun provideFeatureRepository(repo: FeatureRepositoryImpl): FeatureRepository
}
