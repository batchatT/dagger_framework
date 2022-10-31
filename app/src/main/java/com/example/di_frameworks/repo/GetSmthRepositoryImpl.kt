package com.example.di_frameworks.repo

import com.example.di_frameworks.db.DataBase
import com.example.di_frameworks.network.API
import javax.inject.Inject

class GetSmthRepositoryImpl @Inject constructor(
    val api: API,
    val db: DataBase
) : GetSmthRepository {

    override fun getSmthFromNetwork(): String {
        return api.getSmthFromNetwork()
    }

    override fun getSmthFromDB(): String {
        return db.getSmthFromDB()
    }
}