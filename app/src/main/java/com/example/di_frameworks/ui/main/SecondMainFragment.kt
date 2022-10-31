package com.example.di_frameworks.ui.main

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.di_frameworks.MainApplication
import com.example.di_frameworks.databinding.FragmentSecondMainBinding
import javax.inject.Inject

class SecondMainFragment : Fragment() {

    @Inject
    lateinit var viewModel: MainViewModel

    private val binding: FragmentSecondMainBinding by lazy {
        FragmentSecondMainBinding.inflate(layoutInflater)
    }

    override fun onAttach(context: Context) {
        (requireActivity().application as MainApplication)
            .appComponent
            .createSecondMainComponent()
            .build()
            .inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }
}