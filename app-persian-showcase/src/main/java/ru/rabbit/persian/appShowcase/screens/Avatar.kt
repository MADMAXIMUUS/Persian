package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarDefaults
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
                    SampleRow(text = "Size 96", firstItem = true) {
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size96()
                        )
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size96(),
                            isEdit = true
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size96()
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size96(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Size 80") {
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size80()
                        )
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size80(),
                            isEdit = true
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size80()
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size80(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Size 64") {
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size64()
                        )
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size64(),
                            isEdit = true
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size64()
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size64(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Size 48") {
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size48()
                        )
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size48(),
                            isEdit = true
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size48()
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size48(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Size 32") {
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size32()
                        )
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size32(),
                            isEdit = true
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size32()
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size32(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Size 24", lastItem = true) {
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size24()
                        )
                        PersianAvatar(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianAvatarDefaults.size24(),
                            isEdit = true
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size24()
                        )
                        PersianAvatar(
                            imageUrl = "",
                            size = PersianAvatarDefaults.size24(),
                            isEdit = true
                        )
                    }
                }
            }
        }
    }
}