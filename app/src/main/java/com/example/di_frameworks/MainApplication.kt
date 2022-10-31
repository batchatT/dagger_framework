package com.example.di_frameworks

import android.app.Application
import com.example.di_frameworks.di.feature.MainDepsStore
import com.example.di_frameworks.di.main.AppComponent
import com.example.di_frameworks.di.main.DaggerAppComponent

class MainApplication: Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .applicationContext(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        MainDepsStore.mainDeps = appComponent
    }
}