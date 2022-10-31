package com.example.di_frameworks.feature

import com.example.di_frameworks.db.DataBase
import javax.inject.Inject

class FeatureRepositoryImpl @Inject constructor(
    private val dataBase: DataBase
): FeatureRepository {

    override fun getDataFromDBForFeature(): String {
        return dataBase.getDataFromDBForFeature()
    }
}