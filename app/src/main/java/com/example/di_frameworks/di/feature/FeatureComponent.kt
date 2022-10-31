package com.example.di_frameworks.di.feature

import androidx.lifecycle.ViewModel
import com.example.di_frameworks.db.DataBase
import com.example.di_frameworks.ui.feature.FeatureFragment
import dagger.Component
import kotlin.properties.Delegates.notNull

@Component(
    modules = [FeatureModule::class],
    dependencies = [ApplicationDeps::class]
)
internal interface FeatureComponent {

    fun inject(fragment: FeatureFragment)

    @Component.Builder
    interface Builder {

        fun deps(applicationDeps: ApplicationDeps): Builder

        fun build(): FeatureComponent
    }
}

interface ApplicationDeps {

    val dataBase: DataBase
}

interface ApplicationDepsProvider {

    val deps: ApplicationDeps

    companion object : ApplicationDepsProvider by ApplicationDepsStore
}

object ApplicationDepsStore : ApplicationDepsProvider {

    override var deps: ApplicationDeps by notNull()
}

internal class FeatureComponentViewModel : ViewModel() {

    val featureComponent = DaggerFeatureComponent
        .builder()
        .deps(ApplicationDepsProvider.deps)
        .build()
}