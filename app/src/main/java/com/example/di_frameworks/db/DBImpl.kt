package com.example.di_frameworks.db

import javax.inject.Inject

class DBImpl @Inject constructor(): DataBase {
    override fun getDataFromDB(): String {
        return "Returned Data From DB\nDB: $this"
    }

    override fun getDataFromDBForFeature(): String {
        return "Returned Data From Feature DB\nDB: $this"
    }
}