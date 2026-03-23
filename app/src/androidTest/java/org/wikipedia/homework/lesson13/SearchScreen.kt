package org.wikipedia.homework.lesson13

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.edit.KEditText
import org.wikipedia.R

object SearchScreen : KScreen<SearchScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val search = KEditText {
        withId(R.id.search_input)
    }

}