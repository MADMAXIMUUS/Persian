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
                    SampleRow(text = "Round Avatar", firstItem = true) {
                        PersianAvatars.Round(imageUrl = "", size = PersianAvatarsSizes.large())
                        PersianAvatars.Round(imageUrl = "", size = PersianAvatarsSizes.medium())
                        PersianAvatars.Round(imageUrl = "", size = PersianAvatarsSizes.small())
                    }
                }
                item {
                    SampleRow(text = "Round Avatar Edit") {
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.large(),
                            isEdit = true
                        )
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.medium(),
                            isEdit = true
                        )
                        PersianAvatars.Round(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarsSizes.small(),
                            isEdit = true
                        )
                    }
                }
            }
        }
    }
}