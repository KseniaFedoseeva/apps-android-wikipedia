package org.wikipedia.homework.lesson06

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import org.wikipedia.R

object Onboarding: KScreen<Onboarding>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val skipButton = KButton {
        withId(R.id.fragment_onboarding_skip_button)

    }

}

fun main() {
    Onboarding {
        skipButton {
            isDisplayed()
            click()
        }
    }
}