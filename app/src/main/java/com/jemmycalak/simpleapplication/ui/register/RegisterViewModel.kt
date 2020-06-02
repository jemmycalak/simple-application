package com.jemmycalak.simpleapplication.ui.register

import android.content.Context
import android.content.DialogInterface
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.jemmycalak.simpleapplication.R

class RegisterViewModel(private val context: Context) : ViewModel() {

    val email = MutableLiveData<String>()
    val firstname = MutableLiveData<String>()
    val lastname = MutableLiveData<String>()
    val handphone = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    fun onSignup(v:View) {
        if(email.value.isNullOrBlank()) {
            email.value = ""
            return
        }
        if(firstname.value.isNullOrBlank()) return
        if(lastname.value.isNullOrBlank()) return
        if(handphone.value.isNullOrBlank()) return
        if(password.value.isNullOrBlank()) return

        AlertDialog.Builder(context)
            .setTitle(context.getString(R.string.label_success_register))
            .setPositiveButton("OK", { dialog, which ->
                dialog.dismiss()
                v.findNavController().navigateUp()
            }).show()
    }

}