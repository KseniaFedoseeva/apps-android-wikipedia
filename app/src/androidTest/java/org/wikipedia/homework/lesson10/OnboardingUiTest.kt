package org.wikipedia.homework.lesson10

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity

class OnboardingUiTest : TestCase() {

    @get: Rule
    val testRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun uiTest() {
        run {
            OnboardingUiScreen {
                skip.isDisplayed()
            }
        }
    }

    @Test
    fun checkDataText() {
        run {
            OnboardingUiScreen.skip.containsText("Skip")
        }
    }

    @Test
    fun checkPrimaryText() {
        run {
            OnboardingUiScreen.primaryText.containsText("300")
        }
    }

    @Test
    fun checkLanguageText() {
        run {
            OnboardingUiScreen.addOrEditLanguagesButton.containsText("Add or edit languages")
        }
    }

    @Test
    fun checkContinueText() {
        run {
            OnboardingUiScreen.continueButton.containsText("Continue")
        }

    }
}