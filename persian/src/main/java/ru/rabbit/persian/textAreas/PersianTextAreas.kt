package ru.rabbit.persian.textAreas

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.foundation.PersianTheme
import ru.rabbit.persian.foundation.spacing

object PersianTextAreas {

    @Composable
    fun Primary(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        isError: Boolean = false,
        isSuccess: Boolean = false,
        readOnly: Boolean = false,
        textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
        placeholder: String? = null,
        colors: TextAreaColors = PersianTextAreaColors.primary(),
        leadingIcon: Painter? = null,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    ) {
        val isFocused = interactionSource.collectIsFocusedAsState().value
        val textColor = colors.textColor(enabled, isSuccess, isError, interactionSource).value
        val mergedTextStyle = textStyle.merge(
            TextStyle(
                color = textColor,
                textAlign = TextAlign.Justify,
                baselineShift = BaselineShift.Superscript
            )
        )

        val borderThickness = if (enabled && (isFocused || isError || isSuccess)) 2.dp else 1.dp
        val borderColor = colors.indicatorColor(
            enabled = enabled,
            isSuccess = isSuccess,
            isError = isError,
            interactionSource = interactionSource
        ).value
        CompositionLocalProvider(LocalTextSelectionColors provides colors.selectionColors) {
            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = modifier,
                enabled = enabled,
                readOnly = readOnly,
                textStyle = mergedTextStyle,
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                interactionSource = interactionSource,
                cursorBrush = SolidColor(
                    colors.cursorColor(
                        isError = isError,
                        isSuccess = isSuccess
                    ).value
                ),
                decorationBox = { innerTextField ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                color = colors.containerColor(
                                    enabled = enabled,
                                    isSuccess = isSuccess,
                                    isError = isError,
                                    interactionSource = interactionSource
                                ).value,
                                shape = MaterialTheme.shapes.extraLarge
                            )
                            .border(
                                width = borderThickness,
                                color = borderColor,
                                shape = MaterialTheme.shapes.extraLarge
                            )
                            .padding(all = MaterialTheme.spacing.medium)
                            .height(120.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        if (leadingIcon != null) {
                            Icon(
                                modifier = Modifier
                                    .size(24.dp),
                                painter = leadingIcon,
                                tint = colors.leadingIconColor(
                                    enabled = enabled,
                                    isSuccess = isSuccess,
                                    isError = isError,
                                    interactionSource = interactionSource
                                ).value,
                                contentDescription = ""
                            )
                        }
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
                                        isError = isError,
                                        interactionSource = interactionSource
                                    ).value,
                                    style = MaterialTheme.typography.bodyLarge
                                        .copy(baselineShift = BaselineShift.Superscript)
                                )
                            }
                            innerTextField()
                        }
                        colors.stateIcon(
                            enabled = enabled,
                            isError = isError,
                            isSuccess = isSuccess
                        ).value?.let {
                            Spacer(modifier = Modifier.width(MaterialTheme.spacing.small))
                            Icon(
                                modifier = Modifier
                                    .size(24.dp),
                                painter = it,
                                contentDescription = "",
                                tint = colors.stateIconColor(
                                    enabled = enabled,
                                    isSuccess = isSuccess,
                                    isError = isError
                                ).value
                            )
                        }
                    }
                }
            )
        }
    }
}

//Check this in Future
@Suppress("UNUSED")
@Composable
private fun animateBorderStrokeAsState(
    enabled: Boolean,
    isError: Boolean,
    isSuccess: Boolean,
    interactionSource: InteractionSource,
    colors: TextAreaColors,
    focusedBorderThickness: Dp,
    unfocusedBorderThickness: Dp
): State<BorderStroke> {
    val focused by interactionSource.collectIsFocusedAsState()
    val indicatorColor = colors.indicatorColor(enabled, isError, isSuccess, interactionSource)
    val targetThickness = if (focused || isError || isSuccess)
        focusedBorderThickness
    else
        unfocusedBorderThickness
    val animatedThickness = if (enabled) {
        animateDpAsState(targetThickness, tween(durationMillis = 150))
    } else {
        rememberUpdatedState(unfocusedBorderThickness)
    }
    return rememberUpdatedState(
        BorderStroke(animatedThickness.value, SolidColor(indicatorColor.value))
    )
}

@Preview
@Composable
fun TextAreaPreview() {
    PersianTheme {
        Surface {
            PersianTextAreas.Primary(
                modifier = Modifier
                    .padding(10.dp),
                value = "",
                placeholder = "Я текст",
                onValueChange = {}
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkTextAreaPreview() {
    PersianTheme {
        Surface {
            PersianTextAreas.Primary(
                modifier = Modifier
                    .padding(10.dp),
                value = "Я введенный текст",
                placeholder = "Я текст",
                onValueChange = {}
            )
        }
    }
}