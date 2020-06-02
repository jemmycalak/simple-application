package com.jemmycalak.simpleapplication.ui.login

import android.content.Context
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.jemmycalak.simpleapplication.R

class LoginViewModel(private val context:Context) : ViewModel() {


    val password = MutableLiveData<String>()
    val username = MutableLiveData<String>()

    fun onLogin(v: View){
        if(username.value.isNullOrBlank()){
            return
        }
        if(password.value.isNullOrBlank()){
            return
        }

        AlertDialog.Builder(context)
            .setTitle(context.getString(R.string.label_success_login))
            .setPositiveButton("OK", { dialog, which ->
                dialog.dismiss()
                v.findNavController().navigate(LoginFragmentDirections.loginToHome())
            }).show()
    }

    fun onRegister(v: View){
        v.findNavController().navigate(LoginFragmentDirections.loginToRegister())
    }
}