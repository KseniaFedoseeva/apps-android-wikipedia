package org.wikipedia.homework.lesson08

import android.view.View
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class FeatureArticalsItem(matcher: Matcher<View>): KRecyclerItem<FeatureArticalsItem>(matcher) {
    val menuHeader = KTextView(matcher) {
        withId(R.id.view_card_header_title)
        withText("Feature article")
    }


}