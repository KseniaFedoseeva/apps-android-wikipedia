package org.wikipedia.lesson03

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import org.wikipedia.R

val skipButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_skip_button,
    R.string.onboarding_skip
)

val negativeButton = listOf(
    MaterialButton::class.java,
    R.id.view_announcement_action_negative,
    R.string.reading_list_prompt_turned_sync_on_dialog_no_thanks
)

val continueButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_forward_button,
    R.string.onboarding_continue
)

val tab = listOf(
    TabLayout::class.java,
    R.id.view_onboarding_page_indicator,
)

val scroll = listOf(
    LinearLayout::class.java,
    R.id.scrollViewContainer,
)

val bottom = listOf(
    View::class.java,
    R.id.bottomOffset,
    R.string.description_edit_tutorial_promise
)

val imageCenter = listOf(
    ImageView::class.java,
    R.id.imageViewCentered,
)

val languageList = listOf(
    RecyclerView::class.java,
    R.id.languagesList,
)

val languageButton = listOf(
    Button::class.java,
    R.id.addLanguageButton,
)