package com.example.di_frameworks.di.main

import android.app.Application
import com.example.di_frameworks.db.DataBase
import com.example.di_frameworks.di.feature.MainDeps
import com.example.di_frameworks.di.second_main.SecondAppComponent
import com.example.di_frameworks.ui.main.MainActivity
import com.example.di_frameworks.ui.main.MainFragment
import dagger.*
import javax.inject.Singleton

@Singleton
@Component(modules = [
    DataModule::class,
    ViewModelModule::class,
    RepositoryModule::class]
)
interface AppComponent : MainDeps {

    fun createSecondMainComponent(): SecondAppComponent.Builder

    override val dataBase: DataBase

    fun inject(activity: MainActivity)

    fun inject(fragment: MainFragment)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun applicationContext(application: Application): Builder

        fun build(): AppComponent
    }
}
