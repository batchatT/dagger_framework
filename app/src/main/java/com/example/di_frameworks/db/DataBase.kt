package com.example.di_frameworks.db

interface DataBase {

    fun getDataFromDB(): String

    fun getDataFromDBForFeature(): String
}