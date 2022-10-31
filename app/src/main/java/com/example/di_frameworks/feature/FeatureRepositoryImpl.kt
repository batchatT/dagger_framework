package com.example.di_frameworks.feature

import com.example.di_frameworks.db.DataBase
import javax.inject.Inject

class FeatureRepositoryImpl @Inject constructor(
    val dataBase: DataBase
): FeatureRepository {

    override fun getSmthFromFeature(): String {
        return dataBase.getSmthFromFeatureDB()
    }
}