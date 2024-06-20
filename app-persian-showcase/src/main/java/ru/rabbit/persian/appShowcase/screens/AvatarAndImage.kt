package ru.rabbit.persian.appShowcase.screens

import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.avatarsAndImages.Avatar
import io.github.madmaximuus.persian.avatarsAndImages.AvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageDefaults
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.forms.PersianForm
import io.github.madmaximuus.persian.forms.PersianFormContent
import io.github.madmaximuus.persian.forms.PersianFormSubheadConfig
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.radioButtons.PersianRadioButton
import io.github.madmaximuus.persian.select.SelectActionItem
import io.github.madmaximuus.persian.text.Text
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
            val (badge, onBadgeChange) = remember { mutableStateOf(false) }
            var shape by remember { mutableStateOf(ImageShape.LARGE) }
            var selectedSize by remember { mutableStateOf("96") }
            val imageSizes = listOf(
                ImageDefaults.size96(),
                ImageDefaults.size88(),
                ImageDefaults.size80(),
                ImageDefaults.size72(),
                ImageDefaults.size64(),
                ImageDefaults.size56(),
                ImageDefaults.size48(),
                ImageDefaults.size44(),
                ImageDefaults.size40(),
                ImageDefaults.size36(),
                ImageDefaults.size32(),
                ImageDefaults.size28(),
                ImageDefaults.size24(),
                ImageDefaults.size20(),
                ImageDefaults.size16(),
            )
            val avatarSizes = listOf(
                AvatarDefaults.size96(),
                AvatarDefaults.size88(),
                AvatarDefaults.size80(),
                AvatarDefaults.size72(),
                AvatarDefaults.size64(),
                AvatarDefaults.size56(),
                AvatarDefaults.size48(),
                AvatarDefaults.size44(),
                AvatarDefaults.size40(),
                AvatarDefaults.size36(),
                AvatarDefaults.size32(),
                AvatarDefaults.size28(),
                AvatarDefaults.size24(),
                AvatarDefaults.size20(),
                AvatarDefaults.size16(),
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
                    Avatar(
                        imageUrl = if (content) Uri.parse("https://loremflickr.com/320/240") else Uri.EMPTY,
                        overlay = overlay,
                        sizes = avatarSizeState,
                        badge = if (badge) {
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            PersianTheme.colorScheme.surface5,
                                            PersianTheme.shapes.shape6
                                        )
                                )
                            }
                        } else null
                    )
                    Image(
                        imageUrl = if (content) Uri.parse("https://loremflickr.com/320/240") else Uri.EMPTY,
                        sizes = imageSizeState,
                        shape = shape,
                        overlay = overlay,
                        badge = if (badge) {
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            PersianTheme.colorScheme.surface5,
                                            PersianTheme.shapes.shape6
                                        )
                                )
                            }
                        } else null
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = PersianTheme.spacing.size16,
                            start = PersianTheme.spacing.size16,
                            end = PersianTheme.spacing.size16
                        )
                ) {
                    Checkbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Overlay",
                        checked = overlay,
                        onCheckedChange = onOverlayChange
                    )
                    Checkbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Content",
                        checked = content,
                        onCheckedChange = onContentChange
                    )
                    Checkbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Badge",
                        checked = badge,
                        onCheckedChange = onBadgeChange
                    )
                    PersianForm(
                        subhead = PersianFormSubheadConfig(
                            text = "Size",
                            textStyle = PersianTheme.typography.titleMedium,
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
                            style = PersianTheme.typography.titleMedium,
                            color = PersianTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
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