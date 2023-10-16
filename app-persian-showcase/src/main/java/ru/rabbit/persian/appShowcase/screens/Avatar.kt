package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.avatars.PersianAvatars
import io.github.madmaximuus.persian.avatars.PersianAvatarsSizes
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Avatar : Screen {

    override val name: String = "Avatars"

    override val navigation: String = "avatar"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(title = name, onBackClick = { navController?.navigateUp() }) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Placeholder", firstItem = true) {
                        PersianAvatars.Round(imageUrl = "", size = PersianAvatarsSizes.profile())
                        PersianAvatars.Round(imageUrl = "", size = PersianAvatarsSizes.large())
                        PersianAvatars.Round(imageUrl = "", size = PersianAvatarsSizes.medium())
                        PersianAvatars.Round(imageUrl = "", size = PersianAvatarsSizes.small())
                    }
                }
                item {
                    SampleRow(text = "Placeholder edit") {
                        PersianAvatars.Round(
                            imageUrl = "",
                            size = PersianAvatarsSizes.profile(),
                            isEdit = true,
                            onClick = {}
                        )
                        PersianAvatars.Round(
                            imageUrl = "",
                            size = PersianAvatarsSizes.large(),
                            isEdit = true,
                            onClick = {}
                        )
                        PersianAvatars.Round(
                            imageUrl = "",
                            size = PersianAvatarsSizes.medium(),
                            isEdit = true,
                            onClick = {}
                        )
                        PersianAvatars.Round(
                            imageUrl = "",
                            size = PersianAvatarsSizes.small(),
                            isEdit = true,
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Avatar") {
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.profile(),
                        )
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.large(),
                        )
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.medium()
                        )
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.small()
                        )
                    }
                }
                item {
                    SampleRow(text = "Avatar edit") {
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.profile(),
                            isEdit = true,
                            onClick = {}
                        )
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.large(),
                            isEdit = true,
                            onClick = {}
                        )
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.medium(),
                            isEdit = true,
                            onClick = {}
                        )
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.small(),
                            isEdit = true,
                            onClick = {}
                        )
                    }
                }
            }
        }
    }
}