package com.jemmycalak.simpleapplication.utils

import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import com.google.android.material.textfield.TextInputEditText
import com.jemmycalak.simpleapplication.R

object Bindings {

    private val passwordRegex = "^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{9,}\$"
    private val emailRegex = ""
    private val phoneRegex = ""

    @JvmStatic
    @InverseBindingAdapter(attribute = "app:email", event = "android:textAttrChanged")
    fun onEmail(e: TextInputEditText): String {
        e.apply {
            if (text.toString().length == 0) {
                error = context.getString(R.string.label_error_email_empty)
                return ""
            }
            else return text.toString()
        }
    }

    @JvmStatic
    @BindingAdapter("app:email")
    fun onEmail(e: TextInputEditText, s: String?) {
        e.apply {
            if(s!=null) {
                if (text.toString() != s) setText(s)
                if (s.length == 0) error = context.getString(R.string.label_error_email_empty)
            }
        }
    }

    @JvmStatic
    @InverseBindingAdapter(attribute = "app:firstname", event = "android:textAttrChanged")
    fun onFirstname(e: TextInputEditText): String {
        e.apply {
            if (text.toString().length == 0) {
                error = context.getString(R.string.label_error_firstname_empty)
                return ""
            }
            else return text.toString()
        }
    }

    @JvmStatic
    @BindingAdapter("app:firstname")
    fun onFirstname(e: TextInputEditText, s: String?) {
        e.apply {
            if(s!=null) {
                if (text.toString() != s) setText(s)
                if (s.length == 0) error = context.getString(R.string.label_error_firstname_empty)
            }
        }
    }

    @JvmStatic
    @InverseBindingAdapter(attribute = "app:lastname", event = "android:textAttrChanged")
    fun onLastname(e: TextInputEditText): String {
        e.apply {
            if (text.toString().length == 0) {
                error = context.getString(R.string.label_error_lastname_empty)
                return ""
            }
            else return text.toString()
        }
    }

    @JvmStatic
    @BindingAdapter("app:lastname")
    fun onLastname(e: TextInputEditText, s: String?) {
        e.apply {
            if(s!=null) {
                if (e.text.toString() != s) e.setText(s)
                if (s.length == 0) error = context.getString(R.string.label_error_lastname_empty)
            }
        }
    }

    @JvmStatic
    @InverseBindingAdapter(attribute = "app:handphone", event = "android:textAttrChanged")
    fun onHandphone(e: TextInputEditText): String {
        e.apply {
            if (text.toString().length == 0) {
                error = context.getString(R.string.label_error_handphone_empty)
                return ""
            }
            else return text.toString()
        }
    }

    @JvmStatic
    @BindingAdapter("app:handphone")
    fun onHandphone(e: TextInputEditText, s: String?) {
        e.apply {
            if(s!=null) {
                if (text.toString() != s) setText(s)
                if (s.length == 0) error = context.getString(R.string.label_error_handphone_empty)
            }
        }
    }

    @JvmStatic
    @InverseBindingAdapter(attribute = "app:password", event = "android:textAttrChanged")
    fun onPassword(e: TextInputEditText): String {
        val pass = e.text.toString()
        e.apply {
            if (pass.length == 0) {
                error = context.getString(R.string.label_error_password_empty)
                return ""
            }
            if(!pass.matches(passwordRegex.toRegex())){
                error = context.getString(R.string.label_error_password_regex)
                return ""
            }

            else return text.toString()
        }
    }

    @JvmStatic
    @BindingAdapter("app:password")
    fun onPassword(e: TextInputEditText, s: String?) {
        e.apply {
            if(s!=null) {
                if (text.toString() != s) setText(s)
                if (s.length == 0) error = context.getString(R.string.label_error_password_empty)
            }
        }
    }

    @JvmStatic
    @InverseBindingAdapter(attribute = "app:username", event = "android:textAttrChanged")
    fun onUsername(e:TextInputEditText):String{
        e.apply {
            val username = text.toString()
            if(username.isEmpty()) {
                error = context.getString(R.string.label_error_username)
                return ""
            }
            else return username
        }
    }

    @JvmStatic
    @BindingAdapter("app:username")
    fun onUsername(e: TextInputEditText, s: String?) {
        e.apply {
            if(s!=null) {
                if (text.toString() != s) setText(s)
                if (s.length == 0) error = context.getString(R.string.label_error_username)
            }
        }
    }


}