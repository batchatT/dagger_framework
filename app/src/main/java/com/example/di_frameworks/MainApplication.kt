package com.example.di_frameworks

import android.app.Application
import com.example.di_frameworks.di.feature.ApplicationDepsStore
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
        ApplicationDepsStore.deps = appComponent
    }
}