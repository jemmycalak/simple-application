package com.jemmycalak.simpleapplication.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.jemmycalak.simpleapplication.databinding.FragmentRegisterBinding
import com.jemmycalak.simpleapplication.utils.InjectorUtils

class RegisterFragment : Fragment() {

    private val vModel : RegisterViewModel by viewModels { InjectorUtils.provideRegisterViewModelFactory(requireContext()) }
    private lateinit var binding : FragmentRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentRegisterBinding.inflate(inflater, container, false).apply{
            viewModel = vModel
            binding = this
        }.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.toolbar.setNavigationOnClickListener { it.findNavController().navigateUp() }
    }

}