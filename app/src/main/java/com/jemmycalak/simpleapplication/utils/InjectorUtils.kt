package com.jemmycalak.simpleapplication.utils

import android.content.Context
import com.jemmycalak.simpleapplication.ui.login.LoginViewModelFactory
import com.jemmycalak.simpleapplication.ui.register.RegisterViewModelFactory

object InjectorUtils {
    fun provideLoginViewModelFactory(context: Context) = LoginViewModelFactory(context)
    fun provideRegisterViewModelFactory(context:Context) = RegisterViewModelFactory(context)
}