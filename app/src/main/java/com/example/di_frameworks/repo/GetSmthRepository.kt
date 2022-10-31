package com.example.di_frameworks.repo

interface GetSmthRepository {

    fun getSmthFromNetwork(): String

    fun getSmthFromDB(): String
}