package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarsDefaults
import io.github.madmaximuus.persian.avatarsAndImages.PersianImage
import io.github.madmaximuus.persian.avatarsAndImages.PersianImagesDefaults
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.forms.PersianForm
import io.github.madmaximuus.persian.forms.PersianFormContent
import io.github.madmaximuus.persian.forms.PersianFormSubheadConfig
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.radioButtons.PersianRadioButton
import io.github.madmaximuus.persian.select.SelectActionItem
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
            val (overlay, onOverlayChange) = remember { mutableStateOf(false) }
            val (content, onContentChange) = remember { mutableStateOf(false) }
            var shape by remember { mutableStateOf(ImageShape.LARGE) }
            var selectedSize by remember { mutableStateOf("96") }
            val imageSizes = listOf(
                PersianImagesDefaults.size96(),
                PersianImagesDefaults.size88(),
                PersianImagesDefaults.size80(),
                PersianImagesDefaults.size72(),
                PersianImagesDefaults.size64(),
                PersianImagesDefaults.size56(),
                PersianImagesDefaults.size48(),
                PersianImagesDefaults.size44(),
                PersianImagesDefaults.size40(),
                PersianImagesDefaults.size36(),
                PersianImagesDefaults.size32(),
                PersianImagesDefaults.size28(),
                PersianImagesDefaults.size24(),
                PersianImagesDefaults.size20(),
                PersianImagesDefaults.size16(),
            )
            val avatarSizes = listOf(
                PersianAvatarsDefaults.size96(),
                PersianAvatarsDefaults.size88(),
                PersianAvatarsDefaults.size80(),
                PersianAvatarsDefaults.size72(),
                PersianAvatarsDefaults.size64(),
                PersianAvatarsDefaults.size56(),
                PersianAvatarsDefaults.size48(),
                PersianAvatarsDefaults.size44(),
                PersianAvatarsDefaults.size40(),
                PersianAvatarsDefaults.size36(),
                PersianAvatarsDefaults.size32(),
                PersianAvatarsDefaults.size28(),
                PersianAvatarsDefaults.size24(),
                PersianAvatarsDefaults.size20(),
                PersianAvatarsDefaults.size16(),
            )
            var imageSizeState by remember { mutableStateOf(imageSizes[0]) }
            var avatarSizeState by remember { mutableStateOf(avatarSizes[0]) }
            val shapeStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                SampleRow(
                    text = "Sample",
                    firstItem = true
                ) {
                    PersianAvatar(
                        imageUrl = if (content) "https://loremflickr.com/320/240" else "",
                        overlay = overlay,
                        size = avatarSizeState
                    )
                    PersianImage(
                        imageUrl = if (content) "https://loremflickr.com/320/240" else "",
                        size = imageSizeState,
                        shape = shape,
                        overlay = overlay
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = MaterialTheme.spacing.large,
                            start = MaterialTheme.spacing.large,
                            end = MaterialTheme.spacing.large
                        )
                ) {
                    PersianCheckbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Overlay",
                        checked = overlay,
                        onCheckedChange = onOverlayChange
                    )
                    PersianCheckbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Content",
                        checked = content,
                        onCheckedChange = onContentChange
                    )
                    PersianForm(
                        subhead = PersianFormSubheadConfig(
                            text = "Size",
                            textStyle = MaterialTheme.typography.titleMedium,
                        ),
                        content = PersianFormContent.Select(
                            selected = selectedSize,
                            values = listOf(
                                SelectActionItem.WithoutIcon(
                                    title = "96"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "88"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "80"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "72"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "64"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "56"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "48"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "44"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "40"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "36"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "32"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "28"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "24"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "20"
                                ),
                                SelectActionItem.WithoutIcon(
                                    title = "16"
                                ),
                            ),
                            onSelectedChange = { option, index ->
                                selectedSize = option
                                imageSizeState = imageSizes[index]
                                avatarSizeState = avatarSizes[index]
                            }
                        ),
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                    ) {
                        Text(
                            text = "Shape",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectableGroup()
                        ) {
                            PersianRadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Large",
                                checked = shapeStates[0].value,
                                onCheckedChange = {
                                    shapeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                    shape = ImageShape.LARGE
                                }
                            )
                            PersianRadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Medium",
                                checked = shapeStates[1].value,
                                onCheckedChange = {
                                    shapeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                    shape = ImageShape.MEDIUM
                                }
                            )
                            PersianRadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Small",
                                checked = shapeStates[2].value,
                                onCheckedChange = {
                                    shapeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                    shape = ImageShape.SMALL
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}