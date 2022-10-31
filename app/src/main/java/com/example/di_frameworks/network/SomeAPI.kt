package com.example.di_frameworks.network

import javax.inject.Inject

class SomeAPI @Inject constructor(): API {

    override fun getSmthFromNetwork(): String {
        return "Something returned from API"
    }
}