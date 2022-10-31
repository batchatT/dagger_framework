package com.example.di_frameworks.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.di_frameworks.MainApplication
import com.example.di_frameworks.R
import com.example.di_frameworks.databinding.FragmentMainBinding
import javax.inject.Inject

class MainFragment : Fragment() {

    private val binding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (requireActivity().application as MainApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        setObservers()
        return binding.root
    }

    private fun setObservers() {
        viewModel.goToFeatureFragmentListener.observe(viewLifecycleOwner) {
            findNavController().navigate(R.id.action_mainFragment_to_featureFragment)
        }

        viewModel.goToSecondMainFragmentListener.observe(viewLifecycleOwner) {
            findNavController().navigate(R.id.action_mainFragment_to_secondMainFragment)
        }
    }
}