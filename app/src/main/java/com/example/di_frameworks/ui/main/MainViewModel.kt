package com.example.di_frameworks.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.di_frameworks.repo.GetSmthRepository
import com.example.di_frameworks.ui.SingleLiveEvent
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val repository: GetSmthRepository
) : ViewModel() {

    val mainText: LiveData<String>
        get() = _mainText
    private val _mainText = MutableLiveData("Main Text!")

    val secondMainText: LiveData<String>
        get() = _secondMainText
    private val _secondMainText = MutableLiveData("Second Main Text!")

    val isGoToFeatureClicked: SingleLiveEvent<Void>
        get() = _isGoToFeatureClicked
    private val _isGoToFeatureClicked = SingleLiveEvent<Void>()

    val isGoToSecondMainClicked: SingleLiveEvent<Void>
        get() = _isGoToSecondMainClicked
    private val _isGoToSecondMainClicked = SingleLiveEvent<Void>()

    fun getSmthFromNetwork() {
        _secondMainText.value = repository.getSmthFromNetwork()
    }

    fun getSmthFromDB() {
        _mainText.value = repository.getSmthFromDB()
    }

    fun goToFeatureClicked() {
        _isGoToFeatureClicked.call()
    }

    fun goToSecondMainClicked() {
        _isGoToSecondMainClicked.call()
    }
}