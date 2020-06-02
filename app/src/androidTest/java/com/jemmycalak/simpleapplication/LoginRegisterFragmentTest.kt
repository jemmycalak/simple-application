package com.jemmycalak.simpleapplication

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.jemmycalak.simpleapplication.ui.MainActivity

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class LoginRegisterFragmentTest {

    @Rule
    @JvmField
    val activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun `login_onclick`() {
        Espresso.onView(ViewMatchers.withId(R.id.et_username)).perform(typeText("username"))
        Espresso.onView(ViewMatchers.withId(R.id.et_password)).perform(typeText("Password1!"))
        closeSoftKeyboard()
        Espresso.onView(ViewMatchers.withId(R.id.bt_login)).perform(click())
    }

    @Test
    fun `onChange_to_registerPage`(){
        Espresso.onView(ViewMatchers.withId(R.id.bt_register)).perform(click()).check(matches(isDisplayed()))
    }

    @Test
    fun `register_onclick`(){
        Espresso.onView(ViewMatchers.withId(R.id.bt_register)).perform(click()).check(matches(isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.et_email)).perform(typeText("username"))
        Espresso.onView(ViewMatchers.withId(R.id.et_firstname)).perform(typeText("firts name"))
        Espresso.onView(ViewMatchers.withId(R.id.et_lastname)).perform(typeText("last name"))
        Espresso.onView(ViewMatchers.withId(R.id.et_handphone)).perform(typeText("08123123"))
        Espresso.onView(ViewMatchers.withId(R.id.et_password)).perform(typeText("Password1!"))
        closeSoftKeyboard()
        Espresso.onView(ViewMatchers.withId(R.id.bt_register)).perform(click())
    }

}