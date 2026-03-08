package org.wikipedia.homework.lesson09

import androidx.compose.ui.test.hasText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.wikipedia.feed.announcement.Announcement
import org.wikipedia.feed.announcement.AnnouncementCardView
import org.wikipedia.feed.featured.FeaturedArticleCardView
import org.wikipedia.feed.news.NewsCardView
import org.wikipedia.homework.lesson08.Customize
import org.wikipedia.homework.lesson08.CustomizeRecycler
import org.wikipedia.homework.lesson08.CustomizeScreen
import org.wikipedia.homework.lesson08.ExploreScreen
import org.wikipedia.homework.lesson08.FeatureArticalsItem
import org.wikipedia.homework.lesson08.InTheNews
import org.wikipedia.homework.lesson08.LanguageItem
import org.wikipedia.homework.lesson08.OnboardingScreen
import org.wikipedia.homework.lesson08.PagerItem
import org.wikipedia.main.MainActivity

class SimpleTest: TestCase() {

    @get:Rule
    val testRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkOnboardingScreen() {
        run("Кнопка skip отображается на экране онбординга") {
            OnboardingScreen {
                step("Проверяем, что кнопка Skip отображается") {
                    skipButton {
                        isDisplayed()
                        hasText("Skip")
                    }
                }
                pager {
                    childAt<PagerItem>(3) {
                        image.isDisplayed()
                        title.containsText("Data")
                    }
                    childAt<PagerItem>(1) {
                        title.containsText("explore")
                    }
                    childAt<PagerItem>(0) {
                        languages.childWith<LanguageItem>() {
                            containsText("English")
                        } perform {
                            isDisplayed()
                            hasText("English")
                        }
                    }
                }
                continueButton.click()
            }
        }
    }

    @Test
    fun test() {
        run {
            OnboardingScreen {
                skipButton {
                    isDisplayed()
                    hasText("Skip")
                    click()
                }
            }
            ExploreScreen{
                items.childWith<InTheNews> {
                    isInstanceOf(NewsCardView::class.java)
                } perform {
                    title.hasText("In the news")
                }

            }
        }
    }

    @Test
    fun scenarioTest() {
        run {
            step("Нажимает Skip на экране онбординга"){
                OnboardingScreen {
                    skipButton {
                        isDisplayed()
                        hasText("Skip")
                        click()
                    }
                }
            }
            step("Проверяет отображение блока Featured Article экрана Explore") {
                ExploreScreen {
                    items {
                        childWith<FeatureArticalsItem> {
                            isInstanceOf(FeaturedArticleCardView::class.java)
                        } perform {
                            isDisplayed()
                        }
                        childWith<Customize> {
                            IsInstanceOf(AnnouncementCardView::class.java)
                        } perform {
                            step("Нажимает на кнопку Customize в блоке Customize your Explore feed экрана Explore"){
                               customizeButton.click()
                            }
                        }
                    }
                }
            }
            step("Отключает Featured Article") {
                CustomizeScreen {
                    items.childWith<CustomizeRecycler> {
                        withDescendant { withText("Featured article") }
                    } perform {
                        checkbox.click()
                        checkbox.isNotChecked()
                    }
                }
            }
            step ("Нажимает стрелку назад в верхнем тулбаре") {
                CustomizeScreen.backButton.click()
            }
            step ("Проверяет, что блок Featured Article не отображается на экране Explore (метод doesNotExist())") {
                ExploreScreen {
                    logo.isDisplayed()
                    items {
                        childWith<FeatureArticalsItem> {
                            isInstanceOf(FeaturedArticleCardView::class.java)
                        } perform {
                            doesNotExist()
                        }
                    }
                }
            }
        }
    }
}