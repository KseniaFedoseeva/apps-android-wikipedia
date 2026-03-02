package org.wikipedia.homework.lesson08

import android.view.View
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KButton
import org.hamcrest.Matcher
import org.wikipedia.R

class Customize(matcher: Matcher<View>): KRecyclerItem<Customize>(matcher) {
    val customizeButton = KButton (
        parent = matcher) {
            withId(
                R.id.view_announcement_action_positive
            )
        }

    val gotItButton = KButton (
        parent = matcher) {
        withId(
            R.id.view_announcement_action_negative
        )
    }

}