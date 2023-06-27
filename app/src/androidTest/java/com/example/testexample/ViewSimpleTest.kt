package com.example.testexample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ViewSimpleTest {
    @Rule
    @JvmField
    val rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun tvIsWorking() {
        onView(withId(R.id.et_num_1)).perform(typeText("2"))
        onView(withId(R.id.et_num_2)).perform(typeText("2"))

        onView(withId(R.id.btn_add)).perform(click())
        onView(withId(R.id.btn_sub)).perform(click())
        onView(withId(R.id.btn_mult)).perform(click())
        onView(withId(R.id.btn_dev)).perform(click())

        onView(withId(R.id.tv_result)).check(matches(isDisplayed()))
    }

    @Test
    fun checkMathAddLogic() {
        onView(withId(R.id.et_num_1)).perform(typeText("2"))
        onView(withId(R.id.et_num_2)).perform(typeText("2"))
        onView(withId(R.id.btn_add)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("4")))
    }

    @Test
    fun checkMathSubLogic() {
        onView(withId(R.id.et_num_1)).perform(typeText("2"))
        onView(withId(R.id.et_num_2)).perform(typeText("2"))
        onView(withId(R.id.btn_sub)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("0")))
    }

    @Test
    fun checkMathMultLogic() {
        onView(withId(R.id.et_num_1)).perform(typeText("2"))
        onView(withId(R.id.et_num_2)).perform(typeText("2"))
        onView(withId(R.id.btn_mult)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("4")))
    }

    @Test
    fun checkMathDevLogic() {
        onView(withId(R.id.et_num_1)).perform(typeText("2"))
        onView(withId(R.id.et_num_2)).perform(typeText("2"))
        onView(withId(R.id.btn_dev)).perform(click())
    }
}
