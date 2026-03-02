package org.wikipedia.homework.lesson08

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class Date(matcher: Matcher<View>): KRecyclerItem<Date>(matcher)  {
    val articleDay = KTextView(parent = matcher) {
        withId(R.id.day_header_text)
    }

    val articleImg = KImageView(parent = matcher) {
        withId(R.id.articleImage)
    }

    val articleTitle = KTextView(parent = matcher) {
        withId(R.id.articleTitle)
    }

    val articleText = KTextView(parent = matcher) {
        withId(R.id.articleExtract)
    }

    val articleDesc = KTextView(parent = matcher) {
        withId(R.id.articleDescription)
    }
}