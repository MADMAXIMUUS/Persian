package ru.rabbit.persian.search

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.PersianTheme
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.foundation.spacing
import ru.rabbit.persian.iconButtons.PersianIconButton
import ru.rabbit.persian.iconButtons.PersianIconButtonColors

object PersianSearch {

    @Composable
    fun Primary(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        showNavIcon: Boolean = false,
        placeholder: String? = null,
        enabled: Boolean = true,
        colors: SearchColors = PersianSearchColors.primary(),
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        onNavIconClick: (() -> Unit)? = null,
        onClearClick: (() -> Unit)? = null,
        clearIcon: Painter = MaterialTheme.icons.close,
        leadingIcon: Painter = MaterialTheme.icons.searchOutlined
    ) {
        val padding = if (showNavIcon) {
            PaddingValues(
                start = MaterialTheme.spacing.small,
                end = MaterialTheme.spacing.medium,
                top = MaterialTheme.spacing.small,
                bottom = MaterialTheme.spacing.small
            )
        } else {
            PaddingValues(
                horizontal = MaterialTheme.spacing.medium,
                vertical = MaterialTheme.spacing.small
            )
        }
        Row(
            modifier = modifier
                .padding(padding),
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraSmall)
        ) {
            if (showNavIcon) {
                PersianIconButton.Primary(
                    modifier = modifier,
                    icon = MaterialTheme.icons.arrowBack,
                    style = PersianComponentStyle.STANDARD,
                    colors = PersianIconButtonColors.primary(
                        style = PersianComponentStyle.STANDARD,
                        containerColor = MaterialTheme.colorScheme.onSurface
                    ),
                    onClick = onNavIconClick ?: {}
                )
            }
            val textColor = colors.textColor(enabled, interactionSource).value
            val mergedTextStyle = MaterialTheme.typography.bodyLarge.merge(
                TextStyle(
                    color = textColor,
                    baselineShift = BaselineShift.Superscript
                )
            )

            CompositionLocalProvider(LocalTextSelectionColors provides colors.selectionColors) {
                BasicTextField(
                    value = value,
                    onValueChange = onValueChange,
                    modifier = modifier,
                    enabled = enabled,
                    textStyle = mergedTextStyle,
                    keyboardOptions = KeyboardOptions.Default.copy(
                        capitalization = KeyboardCapitalization.Sentences,
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Search,
                    ),
                    singleLine = true,
                    maxLines = 1,
                    minLines = 1,
                    interactionSource = interactionSource,
                    cursorBrush = SolidColor(colors.cursorColor().value),
                    decorationBox = { innerTextField ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(
                                    color = colors.containerColor(
                                        enabled = enabled,
                                        interactionSource = interactionSource
                                    ).value,
                                    shape = MaterialTheme.shapes.large
                                )
                                .padding(all = MaterialTheme.spacing.medium)
                                .height(24.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                modifier = Modifier
                                    .size(24.dp),
                                painter = leadingIcon,
                                tint = colors.leadingIconColor(
                                    enabled = enabled,
                                    interactionSource = interactionSource
                                ).value,
                                contentDescription = ""
                            )
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = MaterialTheme.spacing.extraSmall)
                                    .weight(1f)
                            ) {
                                if (value.isEmpty() && placeholder != null) {
                                    Text(
                                        text = placeholder,
                                        color = colors.placeholderColor(
                                            enabled = enabled,
                                            interactionSource = interactionSource
                                        ).value,
                                        style = MaterialTheme.typography.bodyLarge
                                            .copy(baselineShift = BaselineShift.Superscript)
                                    )
                                }
                                innerTextField()
                            }
                            if (value.isNotEmpty()) {
                                Icon(
                                    modifier = Modifier
                                        .size(24.dp)
                                        .clickable(
                                            enabled = enabled,
                                            onClick = { onClearClick?.invoke() },
                                            role = Role.Button
                                        ),
                                    painter = clearIcon,
                                    tint = colors.clearIconColor(
                                        enabled = enabled,
                                        interactionSource = interactionSource
                                    ).value,
                                    contentDescription = ""
                                )
                            }
                        }
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun SearchPreview() {
    PersianTheme {
        Surface {
            PersianSearch.Primary(
                value = "sdsdf",
                showNavIcon = false,
                placeholder = "Search",
                onValueChange = {}
            )
        }
    }
}

