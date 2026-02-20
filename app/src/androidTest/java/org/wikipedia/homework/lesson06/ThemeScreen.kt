package org.wikipedia.homework.lesson06

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.progress.KSeekBar
import io.github.kakaocup.kakao.switch.KSwitch
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object Theme: KScreen<Theme>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val sectionText = KTextView {
        withId(R.id.textSettingsCategory)
    }

    val sizePercentText = KTextView {
        withId(R.id.text_size_percent)
    }

    val btnDecreaseText = KTextView {
        withId(R.id.buttonDecreaseTextSize)
    }

    val btnIncreaseText = KTextView {
        withId(R.id.buttonIncreaseTextSize)
    }

    val btnFontFamilySansSerif = KButton {
        withId(R.id.button_font_family_sans_serif)
    }

    val btnFontFamilySerif = KButton {
        withId(R.id.button_font_family_serif)
    }

    val readingFocusModeImg = KImageView {
        withId(R.id.readingFocusModeContainer)
    }

    val readingFocusModeText = KTextView {
        withId(R.id.theme_chooser_reading_focus_mode_description)
    }

    val readingFocusModeSwitcher = KSwitch {
        withId(R.id.theme_chooser_reading_focus_mode_switch)
    }

    val btnThemeLight = KButton {
        withId(R.id.button_theme_light)
    }

    val btnThemeSepia = KButton {
        withId(R.id.button_theme_sepia)
    }

    val btnThemeDark = KButton {
        withId(R.id.button_theme_dark)
    }

    val btnThemeBlack = KButton {
        withId(R.id.button_theme_black)
    }

    val themeSwitcher = KSwitch {
        withId(R.id.theme_chooser_match_system_theme_switch)
    }

    val imgDarkThemeSwitcher = KSwitch {
        withId(R.id.theme_chooser_dark_mode_dim_images_switch)
    }

    val seekBar = KSeekBar {
        withId(R.id.text_size_seek_bar)
    }
}
