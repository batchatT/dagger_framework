package com.example.di_frameworks.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.di_frameworks.MainApplication
import com.example.di_frameworks.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    private val  binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}