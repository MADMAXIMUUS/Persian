package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.banners.PersianBanner
import io.github.madmaximuus.persian.banners.PersianBannerLeft
import io.github.madmaximuus.persian.banners.PersianBannerRight
import io.github.madmaximuus.persian.foundation.icons
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Banner : Screen {

    override val name: String = "Banner"

    override val navigation: String = "banner"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Banner", firstItem = true) {
                        PersianBanner(
                            title = "Some Text",
                            subtitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet imperdiet consectetur. Nam vitae massa a metus dignissim malesuada. Duis.",
                        )
                    }
                }
                item {
                    SampleRow(text = "Banner with left icon") {
                        PersianBanner(
                            title = "Some Text",
                            subtitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet imperdiet consectetur. Nam vitae massa a metus dignissim malesuada. Duis.",
                            left = PersianBannerLeft.Icon(icon = MaterialTheme.icons.globeUk)
                        )
                    }
                }
                item {
                    SampleRow(text = "Banner with left avatar") {
                        PersianBanner(
                            title = "Some Text",
                            subtitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet imperdiet consectetur. Nam vitae massa a metus dignissim malesuada. Duis.",
                            left = PersianBannerLeft.Avatar(avatarUrl = "https://loremflickr.com/320/240")
                        )
                    }
                }
                item {
                    SampleRow(text = "Banner with left image") {
                        PersianBanner(
                            title = "Some Text",
                            subtitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet imperdiet consectetur. Nam vitae massa a metus dignissim malesuada. Duis.",
                            left = PersianBannerLeft.Image(imageUrl = "https://loremflickr.com/320/240")
                        )
                    }
                }
                item {
                    SampleRow(text = "Banner with right close") {
                        PersianBanner(
                            title = "Some Text",
                            subtitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet imperdiet consectetur. Nam vitae massa a metus dignissim malesuada. Duis.",
                            left = PersianBannerLeft.Image(imageUrl = "https://loremflickr.com/320/240"),
                            right = PersianBannerRight.Close {

                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Banner with right open", lastItem = true) {
                        PersianBanner(
                            title = "Some Text",
                            subtitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet imperdiet consectetur. Nam vitae massa a metus dignissim malesuada. Duis.",
                            left = PersianBannerLeft.Avatar(avatarUrl = "https://loremflickr.com/320/240"),
                            right = PersianBannerRight.Open {

                            }
                        )
                    }
                }
                item {
                    Spacer(
                        modifier = Modifier
                            .windowInsetsBottomHeight(WindowInsets.navigationBars)
                    )
                }
            }
        }
    }
}