package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.PersianImage
import io.github.madmaximuus.persian.avatarsAndImages.PersianImagesDefaults
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object AvatarAndImage : Screen {

    override val name: String = "Avatars and Images"

    override val navigation: String = "avatar"

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
                    SampleRow(text = "Size 24") {
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
                item {
                    SampleRow(text = "Image Small Shape Size 96") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize96()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize96(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize96()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize96(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Small Shape Size 80") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize80()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize80(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize80()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize80(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Small Shape Size 64") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize64()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize64(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize64()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize64(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Small Shape Size 48") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize48()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize48(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize48()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize48(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Small Shape Size 32") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize32()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize32(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize32()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize32(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Small Shape Size 24") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize24()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.smallShapeSize24(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize24()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.smallShapeSize24(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Medium Shape Size 96") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.mediumShapeSize96()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.mediumShapeSize96(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize96()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize96(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Medium Shape Size 80") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.mediumShapeSize80()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.mediumShapeSize80(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize80()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize80(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Medium Shape Size 64") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.mediumShapeSize64()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.mediumShapeSize64(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize64()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize64(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Medium Shape Size 48") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.mediumShapeSize48()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.mediumShapeSize48(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize48()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize48(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Medium Shape Size 32") {
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize32()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize32(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize32()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize32(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Medium Shape Size 24") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.mediumShapeSize24()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.mediumShapeSize24(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize24()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.mediumShapeSize24(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Large Shape Size 96") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize96()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize96(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize96()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize96(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Large Shape Size 80") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize80()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize80(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize80()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize80(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Large Shape Size 64") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize64()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize64(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize64()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize64(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Large Shape Size 48") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize48()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize48(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize48()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize48(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Large Shape Size 32") {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize32()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize32(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize32()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize32(),
                            isEdit = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Image Large Shape Size 24", lastItem = true) {
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize24()
                        )
                        PersianImage(
                            imageUrl = "https://loremflickr.com/320/240",
                            size = PersianImagesDefaults.largeShapeSize24(),
                            isEdit = true
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize24()
                        )
                        PersianImage(
                            imageUrl = "",
                            size = PersianImagesDefaults.largeShapeSize24(),
                            isEdit = true
                        )
                    }
                }
            }
        }
    }
}