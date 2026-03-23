package org.wikipedia.homework.lesson13

import androidx.test.espresso.web.webdriver.Locator
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.uiautomator.UiSelector
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homework.lesson08.ExploreScreen
import org.wikipedia.homework.lesson08.OnboardingScreen
import org.wikipedia.homework.lesson08.SearchItem
import org.wikipedia.main.MainActivity

class WebViewTest : TestCase() {

    @get:Rule
    val testRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun webViewTest(){
        run {
            OnboardingScreen {
                step("Проверяем, что кнопка Skip отображается и нажать ") {
                    skipButton {
                        isDisplayed()
                        hasText("Skip")
                        click()
                    }
                }
            }
            step("Клик по поиску") {
                ExploreScreen {
                    items {
                        childWith<SearchItem> {
                            withDescendant { withContentDescription("Search Wikipedia") }
                        } perform {
                            textSearch.click()
                        }
                    }
                }
            }
            step("Пишем в поиск значение") {
                SearchScreen.search.typeText("Project Hail Mary")
            }
            step("Тап по первой статье") {
                device.uiDevice.findObject(UiSelector().text("Project Hail Mary")).click()
            }
            step("Проверяем наполнение статьи") {
                ArticlScreen {
                    webView {
                        withElement(Locator.NAME, "pcs-edit-section-title") {
                            scroll()
                            hasText("Project Hail Mary")
                        }
                    }
                }
            }

        }}
}