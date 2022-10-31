package com.example.di_frameworks.di.feature

import androidx.lifecycle.ViewModel
import com.example.di_frameworks.db.DataBase
import com.example.di_frameworks.ui.feature.FeatureFragment
import dagger.Component
import kotlin.properties.Delegates.notNull

@Component(
    modules = [FeatureModule::class],
    dependencies = [MainDeps::class]
)
internal interface FeatureComponent {

    fun inject(fragment: FeatureFragment)

    @Component.Builder
    interface Builder {

        fun deps(applicationMainDeps: MainDeps): Builder

        fun build(): FeatureComponent
    }
}

interface MainDeps {

    val dataBase: DataBase
}

interface MainDepsProvider {

    val mainDeps: MainDeps

    companion object : MainDepsProvider by MainDepsStore
}

object MainDepsStore : MainDepsProvider {

    override var mainDeps: MainDeps by notNull()
}

internal class FeatureComponentViewModel : ViewModel() {

    val featureComponent = DaggerFeatureComponent
        .builder()
        .deps(MainDepsProvider.mainDeps)
        .build()
}