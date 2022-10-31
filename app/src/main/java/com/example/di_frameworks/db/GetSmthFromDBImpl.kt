package com.example.di_frameworks.db

import javax.inject.Inject

class GetSmthFromDBImpl @Inject constructor(): DataBase {
    override fun getSmthFromDB(): String {
        return "Returned Smth From DB"
    }

    override fun getSmthFromFeatureDB(): String {
        return "Returned Smth From Feature DB"
    }
}