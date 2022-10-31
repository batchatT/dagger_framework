package com.example.di_frameworks.network

import javax.inject.Inject

class SomeAPI @Inject constructor(): API {

    override fun getDataFromNetwork(): String {
        return "Data returned from API\nAPI: $this"
    }
}