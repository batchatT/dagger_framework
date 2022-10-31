package com.example.di_frameworks.repo

interface Repository {

    fun getDataFromNetwork(): String

    fun getDataFromDB(): String
}