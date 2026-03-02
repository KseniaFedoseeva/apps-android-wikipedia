package org.wikipedia.homework.lesson08

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import org.hamcrest.Matcher
import org.wikipedia.R
import org.wikipedia.feed.view.FeedView

object ExploreScreen : KScreen<ExploreScreen>() {

    override val layoutId: Int? = R.layout.fragment_feed
    override val viewClass: Class<*>? = FeedView::class.java

    val logo = KImageView {
        withId(R.id.main_toolbar_wordmark)
    }

    val items = KRecyclerView (
        builder = {withId(R.id.feed_view)},
        itemTypeBuilder = {
            itemType (provideItem = ::SearchItem)
        }

    )

    val newsCard = KRecyclerView(
        builder = {
            withId(R.id.news_cardview_recycler_view)
        },
        itemTypeBuilder = {
            itemType(provideItem = ::InTheNews)
        }
    )

    val dateArticle = KRecyclerView (
        builder = {withId(R.id.view_featured_article_card_content_container)},
        itemTypeBuilder = {
            itemType (provideItem = ::Date)
        }

    )

    val topReadItems = KRecyclerView(
        builder = {
            withId(R.id.view_list_card_list)
        },
        itemTypeBuilder = {
            itemType(::TopReadItem)
        }
    )
}

class SearchItem(matcher: Matcher<View>): KRecyclerItem<SearchItem>(matcher) {
    val icon = KImageView(parent = matcher) {
        isInstanceOf(clazz = AppCompatImageView::class.java)
        isDisabled()
    }
}


