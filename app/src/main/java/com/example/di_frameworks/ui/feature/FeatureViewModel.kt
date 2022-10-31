package com.example.di_frameworks.ui.feature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.di_frameworks.feature.FeatureRepository
import javax.inject.Inject

class FeatureViewModel @Inject constructor(
   val featureRepository: FeatureRepository
) : ViewModel() {

    val dataFromFeature: LiveData<String>
        get() = _dataFromFeature
    private val _dataFromFeature = MutableLiveData("Initial data")

    fun getDataFromFeatureRepository() {
        _dataFromFeature.value = featureRepository.getSmthFromFeature()
    }
}