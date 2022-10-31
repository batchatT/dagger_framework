package com.example.di_frameworks.ui.feature

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.di_frameworks.databinding.FragmentFeatureBinding
import com.example.di_frameworks.di.feature.FeatureComponentViewModel
import javax.inject.Inject

class FeatureFragment : Fragment() {

    @Inject
    lateinit var viewModel: FeatureViewModel

    private val binding: FragmentFeatureBinding by lazy{
        FragmentFeatureBinding.inflate(layoutInflater)
    }

    override fun onAttach(context: Context) {
        ViewModelProvider(this)
            .get<FeatureComponentViewModel>()
            .featureComponent
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