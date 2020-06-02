package com.jemmycalak.simpleapplication.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.jemmycalak.simpleapplication.R
import com.jemmycalak.simpleapplication.databinding.FragmentLoginBinding
import com.jemmycalak.simpleapplication.utils.InjectorUtils

class LoginFragment : Fragment() {

    private val vModel : LoginViewModel by viewModels { InjectorUtils.provideLoginViewModelFactory(requireContext()) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentLoginBinding.inflate(inflater, container, false).apply {
            viewModel = vModel
        }.root
    }
}