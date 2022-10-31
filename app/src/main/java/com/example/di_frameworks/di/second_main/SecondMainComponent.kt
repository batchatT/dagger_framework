package com.example.di_frameworks.di.second_main

import com.example.di_frameworks.ui.main.SecondMainFragment
import dagger.Subcomponent

@Subcomponent()
interface SecondMainComponent {

    fun inject(fragment: SecondMainFragment)

    @Subcomponent.Builder
    interface Builder {

        fun build(): SecondMainComponent
    }
}