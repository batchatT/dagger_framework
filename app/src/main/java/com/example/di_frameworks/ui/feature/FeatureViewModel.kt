package com.example.di_frameworks.ui.feature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.di_frameworks.feature.FeatureRepository
import javax.inject.Inject

class FeatureViewModel @Inject constructor(
   val featureRepository: FeatureRepository
) : ViewModel() {

    val dataText: LiveData<String>
        get() = _dataText
    private val _dataText = MutableLiveData("Initial data")

    fun getDataFromDB() {
        _dataText.value = featureRepository.getDataFromDBForFeature()
    }
}