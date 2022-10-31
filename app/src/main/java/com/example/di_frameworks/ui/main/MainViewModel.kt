package com.example.di_frameworks.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.di_frameworks.repo.Repository
import com.example.di_frameworks.ui.SingleLiveEvent
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    val mainFragmentDataText: LiveData<String>
        get() = _mainFragmentDataText
    private val _mainFragmentDataText = MutableLiveData("Initial data")

    val secondMainFragmentDataText: LiveData<String>
        get() = _secondMainFragmentDataText
    private val _secondMainFragmentDataText = MutableLiveData("Initial data")

    val goToFeatureFragmentListener: SingleLiveEvent<Void>
        get() = _goToFeatureFragmentListener
    private val _goToFeatureFragmentListener = SingleLiveEvent<Void>()

    val goToSecondMainFragmentListener: SingleLiveEvent<Void>
        get() = _goToSecondMainFragmentListener
    private val _goToSecondMainFragmentListener = SingleLiveEvent<Void>()

    fun getDataFromNetwork() {
        _secondMainFragmentDataText.value = repository.getDataFromNetwork()
    }

    fun getDataFromDB() {
        _mainFragmentDataText.value = repository.getDataFromDB()
    }

    fun onGoToFeatureFragmentClick() {
        _goToFeatureFragmentListener.call()
    }

    fun onGoToSecondMainFragmentClick() {
        _goToSecondMainFragmentListener.call()
    }
}