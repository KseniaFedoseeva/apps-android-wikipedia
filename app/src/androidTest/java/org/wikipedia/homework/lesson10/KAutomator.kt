package org.wikipedia.homework.lesson10

import androidx.test.uiautomator.By
import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object OnboardingUiScreen : UiScreen<OnboardingUiScreen>() {
    override val packageName: String = "org.wikipedia.alpha"

    val skip = UiButton {
        withId(this@OnboardingUiScreen.packageName, "fragment_onboarding_skip_button")
    }

    val continueButton = UiButton {
        withId(this@OnboardingUiScreen.packageName, "fragment_onboarding_forward_button")
    }

    val addOrEditLanguagesButton = UiButton {
        withId(this@OnboardingUiScreen.packageName, "addOrEditLanguages")
    }

    val primaryText = UiTextView {
        withId(this@OnboardingUiScreen.packageName, "primaryTextView")
    }
}