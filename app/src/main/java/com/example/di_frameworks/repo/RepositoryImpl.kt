package com.example.di_frameworks.repo

import com.example.di_frameworks.db.DataBase
import com.example.di_frameworks.network.API
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val api: API,
    val db: DataBase
) : Repository {

    override fun getDataFromNetwork(): String {
        return api.getDataFromNetwork()
    }

    override fun getDataFromDB(): String {
        return db.getDataFromDB()
    }
}