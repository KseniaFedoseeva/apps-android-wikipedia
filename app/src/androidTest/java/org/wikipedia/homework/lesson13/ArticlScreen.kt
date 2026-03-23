package org.wikipedia.homework.lesson13

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.web.KWebView
import org.wikipedia.R

object ArticlScreen: KScreen<ArticlScreen>() {

    override val layoutId: Int? = null

    override val viewClass: Class<*>? = null

    val webView = KWebView {
        withId(R.id.page_web_view)
    }
}