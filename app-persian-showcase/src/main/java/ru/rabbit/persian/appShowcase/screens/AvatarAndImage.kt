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
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.Select
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.menu.DropdownMenuItem
import io.github.madmaximuus.persian.radioButton.RadioButton
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object AvatarAndImage : Screen {

    override val name: String = "Avatar and Image"

    override val navigation: String = "avatar"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            //Sizes
            var selectedSize by remember { mutableStateOf("96") }
            val initialImageSize = ImageDefaults.size96()
            val initialAvatarSize = AvatarDefaults.size96()
            var imageSizeState by remember { mutableStateOf(initialImageSize) }
            var avatarSizeState by remember { mutableStateOf(initialAvatarSize) }
            val (expanded, onExpandedChange) = remember { mutableStateOf(false) }
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

            var shape by remember { mutableStateOf(ImageShape.LARGE) }
            val shapeStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }

            //Other settings
            val (overlay, onOverlayChange) = remember { mutableStateOf(false) }
            val (content, onContentChange) = remember { mutableStateOf(false) }
            val (initials, onInitialsChange) = remember { mutableStateOf(false) }
            val (badge, onBadgeChange) = remember { mutableStateOf(false) }
            val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
            val (clickable, onClickableChange) = remember { mutableStateOf(false) }
            val clickablePlaceholder = {}
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
                        initials = if (initials) "AB" else null,
                        badge = if (badge) {
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            PersianTheme.colorScheme.surfaceContainerHighest,
                                            PersianTheme.shapes.shape6
                                        )
                                )
                            }
                        } else null,
                        onClick = if (clickable) clickablePlaceholder else null,
                        enabled = enabled
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
                                            PersianTheme.colorScheme.surfaceContainerHighest,
                                            PersianTheme.shapes.shape6
                                        )
                                )
                            }
                        } else null,
                        onClick = if (clickable) clickablePlaceholder else null,
                        enabled = enabled
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size16)
                        .padding(horizontal = PersianTheme.spacing.size16)
                ) {
                    Text(
                        text = "Settings",
                        style = PersianTheme.typography.titleMedium,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Form(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size8),
                        subhead = {
                            Subhead(text = "Sizes")
                        },
                        content = {
                            Select(
                                selected = selectedSize,
                                expanded = expanded,
                                onExpandedChange = onExpandedChange,
                                menuItems = {
                                    DropdownMenuItem(
                                        text = "96",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "96"
                                            avatarSizeState = avatarSizes[0]
                                            imageSizeState = imageSizes[0]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "88",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "88"
                                            avatarSizeState = avatarSizes[1]
                                            imageSizeState = imageSizes[1]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "80",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "80"
                                            avatarSizeState = avatarSizes[2]
                                            imageSizeState = imageSizes[2]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "72",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "72"
                                            avatarSizeState = avatarSizes[3]
                                            imageSizeState = imageSizes[3]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "64",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "64"
                                            avatarSizeState = avatarSizes[4]
                                            imageSizeState = imageSizes[4]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "56",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "56"
                                            avatarSizeState = avatarSizes[5]
                                            imageSizeState = imageSizes[5]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "48",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "48"
                                            avatarSizeState = avatarSizes[6]
                                            imageSizeState = imageSizes[6]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "44",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "44"
                                            avatarSizeState = avatarSizes[7]
                                            imageSizeState = imageSizes[7]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "40",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "40"
                                            avatarSizeState = avatarSizes[8]
                                            imageSizeState = imageSizes[8]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "36",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "36"
                                            avatarSizeState = avatarSizes[9]
                                            imageSizeState = imageSizes[9]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "32",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "32"
                                            avatarSizeState = avatarSizes[10]
                                            imageSizeState = imageSizes[10]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "28",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "28"
                                            avatarSizeState = avatarSizes[11]
                                            imageSizeState = imageSizes[11]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "24",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "24"
                                            avatarSizeState = avatarSizes[12]
                                            imageSizeState = imageSizes[12]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "20",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "20"
                                            avatarSizeState = avatarSizes[13]
                                            imageSizeState = imageSizes[13]
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "16",
                                        onClick = {
                                            onExpandedChange(false)
                                            selectedSize = "16"
                                            avatarSizeState = avatarSizes[14]
                                            imageSizeState = imageSizes[14]
                                        }
                                    )
                                }
                            )
                        },
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = PersianTheme.spacing.size16),
                    ) {
                        Text(
                            text = "Shape",
                            style = PersianTheme.typography.labelLarge,
                            color = PersianTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.height(PersianTheme.spacing.size2))
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectableGroup()
                        ) {
                            RadioButton(
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
                            RadioButton(
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
                            RadioButton(
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
                    Column(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size16)
                    ) {
                        Text(
                            text = "Additional settings",
                            style = PersianTheme.typography.labelLarge,
                            color = PersianTheme.colorScheme.onSurface
                        )
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
                            text = "Initials",
                            checked = initials,
                            onCheckedChange = onInitialsChange
                        )
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Badge",
                            checked = badge,
                            onCheckedChange = onBadgeChange
                        )
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Clickable",
                            checked = clickable,
                            onCheckedChange = onClickableChange
                        )
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Enabled",
                            checked = enabled,
                            onCheckedChange = onEnabledChange
                        )
                    }
                }
            }
        }
    }
}