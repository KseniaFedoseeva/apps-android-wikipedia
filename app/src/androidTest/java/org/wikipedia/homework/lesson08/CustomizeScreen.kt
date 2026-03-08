package org.wikipedia.homework.lesson08

import android.view.View
import androidx.appcompat.widget.AppCompatImageButton
import com.google.android.material.appbar.MaterialToolbar
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.check.KCheckBox
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.toolbar.KToolbar
import org.hamcrest.Matcher
import org.wikipedia.R

object CustomizeScreen : KScreen<CustomizeScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val items = KRecyclerView(
        builder = {
            withId(R.id.feed_view)
        },
        itemTypeBuilder = {
            itemType (::CustomizeRecycler)
        }
    )

    val toolbar = KToolbar {
        withId(R.id.toolbar)
    }

    val backButton = KImageView {
        withParent{
            withId(R.id.toolbar)
        }
        isInstanceOf(AppCompatImageButton::class.java)
    }
}

class CustomizeRecycler(matcher: Matcher<View>) : KRecyclerItem<CustomizeRecycler>(matcher) {
    val image = KImageView(matcher) {
        withId(R.id.feed_content_type_drag_handle)
    }

    val title = KTextView(matcher) {
        withId(R.id.feed_content_type_title)
    }

    val checkbox = KCheckBox(matcher) {
        withId(R.id.feed_content_type_checkbox)
    }
}