package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarsDefaults
import io.github.madmaximuus.persian.avatarsAndImages.PersianImagesDefaults
import io.github.madmaximuus.persian.dividers.PersianInsetHorizontalDivider
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconBox.IconDefaults
import io.github.madmaximuus.persian.snackbar.PersianSnackbarDefaults
import io.github.madmaximuus.persian.snackbar.SnackbarColors
import io.github.madmaximuus.persian.snackbar.SnackbarSizes

@Composable
fun PersianListCell(
    modifier: Modifier = Modifier,
    middle: ListCellMiddle,
    left: PersianListCellLeft? = null,
    right: PersianListCellRight? = null,
    edit: PersianListItemEdit? = null,
    divider: Boolean = false,
    enabled: Boolean = false,
    style: ListItemStyle = ListItemStyle.FULL,
    colors: SnackbarColors = PersianSnackbarDefaults.colors(),
    sizes: SnackbarSizes = PersianSnackbarDefaults.sizes(),
    onClick: (() -> Unit)? = null
) {
    Column(
        modifier = modifier
            .clip(
                if (style == ListItemStyle.ROUND) PersianTheme.shapes.shape12
                else RoundedCornerShape(0.dp)
            )
            .clickable(
                enabled = enabled && onClick != null,
                role = Role.Button,
                onClick = {
                    onClick?.let { it() }
                }
            )

    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = PersianTheme.spacing.size16),
            verticalAlignment = Alignment.CenterVertically
        ) {
            when (edit) {
                is PersianListItemEdit.Checkbox -> {
                    PersianListItemEditCheckbox(
                        checked = edit.checked,
                        onCheckedChange = edit.onCheckedChange
                    )
                }

                is PersianListItemEdit.Add -> {
                    PersianListItemEditAdd(
                        customIcon = edit.customIcon,
                        onClick = edit.onClick
                    )
                }

                is PersianListItemEdit.Drag -> {
                    PersianListItemEditDrag(
                        customIcon = edit.customIcon,
                        onClick = edit.onClick
                    )
                }

                is PersianListItemEdit.RadioButton -> {
                    PersianListItemEditRadio(
                        checked = edit.selected,
                        onClick = edit.onClick
                    )
                }

                is PersianListItemEdit.Remove -> {
                    PersianListItemEditRemove(
                        customIcon = edit.customIcon,
                        onClick = edit.onClick
                    )
                }

                null -> {}
            }
            when (left) {
                is PersianListCellLeft.Avatar -> {
                    val size = when {
                        middle.subhead != null && middle.body != null -> PersianAvatarsDefaults.size56()
                        middle.subhead != null || middle.body != null -> PersianAvatarsDefaults.size48()
                        else -> PersianAvatarsDefaults.size40()
                    }
                    val padding = when {
                        middle.subhead != null && middle.body != null -> PaddingValues(
                            top = 0.dp,
                            bottom = 0.dp,
                            end = PersianTheme.spacing.size12,
                            start = 0.dp
                        )

                        middle.subhead != null || middle.body != null -> PaddingValues(
                            top = PersianTheme.spacing.size2,
                            bottom = PersianTheme.spacing.size2,
                            end = PersianTheme.spacing.size12,
                            start = 0.dp
                        )

                        else -> PaddingValues(
                            top = PersianTheme.spacing.size4,
                            bottom = PersianTheme.spacing.size4,
                            end = PersianTheme.spacing.size12,
                            start = 0.dp
                        )
                    }
                    PersianListCellLeftAvatar(
                        avatarUrl = left.avatarUrl,
                        size = size,
                        paddingValues = padding,
                    )
                }

                is PersianListCellLeft.Icon -> {
                    val size = when {
                        middle.subhead != null && middle.body != null -> IconDefaults.size40()
                        middle.subhead != null || middle.body != null -> IconDefaults.size32()
                        else -> IconDefaults.size24()
                    }
                    val padding = when {
                        middle.subhead != null && middle.body != null -> PaddingValues(
                            vertical = PersianTheme.spacing.size4,
                            horizontal = 0.dp
                        )

                        middle.subhead != null || middle.body != null -> PaddingValues(
                            vertical = PersianTheme.spacing.size6,
                            horizontal = 0.dp
                        )

                        else -> PaddingValues(
                            vertical = PersianTheme.spacing.size8,
                            horizontal = 0.dp
                        )
                    }
                    PersianListCellLeftIcon(
                        icon = left.icon,
                        color = left.color,
                        size = size,
                        paddingValues = padding,
                        contentDescription = ""
                    )
                }

                is PersianListCellLeft.Image -> {
                    val size = when {
                        middle.subhead != null && middle.body != null -> PersianImagesDefaults.size56()
                        middle.subhead != null || middle.body != null -> PersianImagesDefaults.size48()
                        else -> PersianImagesDefaults.size40()
                    }
                    val padding = when {
                        middle.subhead != null && middle.body != null -> PaddingValues(
                            top = 0.dp,
                            bottom = 0.dp,
                            end = PersianTheme.spacing.size12,
                            start = 0.dp
                        )

                        middle.subhead != null || middle.body != null -> PaddingValues(
                            top = PersianTheme.spacing.size2,
                            bottom = PersianTheme.spacing.size2,
                            end = PersianTheme.spacing.size12,
                            start = 0.dp
                        )

                        else -> PaddingValues(
                            top = PersianTheme.spacing.size4,
                            bottom = PersianTheme.spacing.size4,
                            end = PersianTheme.spacing.size12,
                            start = 0.dp
                        )
                    }
                    PersianListCellLeftImage(
                        imageUrl = left.imageUrl,
                        size = size,
                        paddingValues = padding,
                    )
                }

                null -> {}
            }
            PersianListCellMiddle(
                modifier = Modifier.weight(1f),
                title = middle.title,
                subhead = middle.subhead,
                body = middle.body,
                multiline = middle.multiline,
                newLabel = middle.newLabel
            )
            when (right) {
                is PersianListCellRight.Button -> {
                    PersianListCellRightButton(
                        text = right.text,
                        onClick = right.onClick,
                        showOpen = right.showOpen
                    )
                }

                is PersianListCellRight.Counter -> {
                    PersianListCellRightCounter(
                        count = right.count,
                        showOpen = right.showOpen
                    )
                }

                is PersianListCellRight.Icon -> {
                    PersianListCellRightIcon(
                        icon = right.icon,
                        color = right.color,
                        showOpen = right.showOpen
                    )
                }

                is PersianListCellRight.More -> {
                    PersianListCellRightMore(
                        icon = right.customIcon,
                        color = null,
                        showOpen = right.showOpen
                    )
                }

                is PersianListCellRight.Open -> {
                    PersianListCellRightOpen(
                        icon = right.customIcon,
                        color = null
                    )
                }

                is PersianListCellRight.Suffix -> {
                    PersianListCellRightSuffix(
                        text = right.suffix,
                        showOpen = right.showOpen
                    )
                }

                is PersianListCellRight.Switch -> {
                    PersianListCellRightSwitch(
                        checked = right.checked,
                        onCheckedChange = right.onCheckedChange,
                        checkedIcon = right.checkedIcon,
                        uncheckedIcon = right.uncheckedIcon,
                        showOpen = right.showOpen
                    )
                }

                null -> {}
            }
        }
        if (divider && style != ListItemStyle.ROUND)
            PersianInsetHorizontalDivider(
                modifier = Modifier.fillMaxWidth()
            )
    }
}

enum class ListItemStyle {
    FULL, ROUND
}