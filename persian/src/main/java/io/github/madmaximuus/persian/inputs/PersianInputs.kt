package io.github.madmaximuus.persian.inputs

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxColors

object PersianInputs {

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
        transformation: VisualTransformation = InputsTransformations.none,
        colors: InputColors = PersianInputColors.primary(),
        leadingIcon: Painter? = null,
        trailingIcon: Painter? = null,
        suffix: String? = null,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        onTrailingIconClick: (() -> Unit)? = null
    ) {
        val isFocused = interactionSource.collectIsFocusedAsState().value
        val textColor = colors.textColor(enabled, isSuccess, isError, interactionSource).value
        val mergedTextStyle =
            textStyle.merge(TextStyle(color = textColor, baselineShift = BaselineShift.None))

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
                singleLine = true,
                maxLines = 1,
                minLines = 1,
                visualTransformation = transformation,
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
                                shape = MaterialTheme.shapes.large
                            )
                            .border(
                                width = borderThickness,
                                color = borderColor,
                                shape = MaterialTheme.shapes.large
                            )
                            .padding(all = MaterialTheme.spacing.medium)
                            .height(24.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        leadingIcon?.let { icon ->
                            PersianIconBox.Primary(
                                icon = icon,
                                colors = PersianIconBoxColors.primary(
                                    defaultColor = colors.leadingIconColor(
                                        enabled = enabled,
                                        isSuccess = isSuccess,
                                        isError = isError,
                                        interactionSource = interactionSource
                                    ).value
                                )
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = MaterialTheme.spacing.extraSmall)
                                .weight(1f),
                            verticalAlignment = Alignment.CenterVertically
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
                                        .copy(baselineShift = BaselineShift.None),
                                )
                            }
                            innerTextField()
                        }
                        if (suffix != null) {
                            Box(
                                modifier = Modifier
                                    .wrapContentSize()
                                    .padding(horizontal = MaterialTheme.spacing.extraSmall)
                            ) {
                                Text(
                                    text = suffix,
                                    color = colors.suffixColor(
                                        enabled = enabled,
                                        isSuccess = isSuccess,
                                        isError = isError,
                                        interactionSource = interactionSource
                                    ).value,
                                    style = MaterialTheme.typography.bodyLarge
                                )
                            }
                        }
                        trailingIcon?.let { icon ->
                            PersianIconBox.Primary(
                                modifier = Modifier
                                    .clip(MaterialTheme.shapes.small)
                                    .clickable(
                                        enabled = onTrailingIconClick != null,
                                        onClick = { onTrailingIconClick?.invoke() },
                                        role = Role.Button
                                    ),
                                icon = icon,
                                colors = PersianIconBoxColors.primary(
                                    defaultColor = colors.trailingIconColor(
                                        enabled = enabled,
                                        isSuccess = isSuccess,
                                        isError = isError,
                                        interactionSource = interactionSource
                                    ).value
                                )
                            )
                        }
                        colors.stateIcon(
                            enabled = enabled,
                            isError = isError,
                            isSuccess = isSuccess
                        ).value?.let { icon ->
                            Spacer(modifier = Modifier.width(MaterialTheme.spacing.small))
                            PersianIconBox.Primary(
                                icon = icon,
                                colors = PersianIconBoxColors.primary(
                                    defaultColor = colors.trailingIconColor(
                                        enabled = enabled,
                                        isSuccess = isSuccess,
                                        isError = isError,
                                        interactionSource = interactionSource
                                    ).value
                                )
                            )
                        }
                    }
                }
            )
        }
    }
}

object InputsTransformations {
    val none = VisualTransformation.None
    val password = PasswordVisualTransformation()
}


@Suppress("UNUSED")
@Composable
private fun animateBorderStrokeAsState(
    enabled: Boolean,
    isError: Boolean,
    isSuccess: Boolean,
    interactionSource: InteractionSource,
    colors: InputColors,
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
        animateDpAsState(targetThickness, tween(durationMillis = 150), label = "")
    } else {
        rememberUpdatedState(unfocusedBorderThickness)
    }
    return rememberUpdatedState(
        BorderStroke(animatedThickness.value, SolidColor(indicatorColor.value))
    )
}

@Preview
@Composable
fun InputPreview() {
    PersianTheme {
        Surface {
            PersianInputs.Primary(
                modifier = Modifier
                    .padding(10.dp),
                value = "",
                isSuccess = true,
                placeholder = "Я текст",
                onValueChange = {}
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkInputPreview() {
    PersianTheme {
        Surface {
            PersianInputs.Primary(
                modifier = Modifier
                    .padding(10.dp),
                value = "Я введенный текст",
                isSuccess = true,
                placeholder = "Я текст",
                trailingIcon = MaterialTheme.icons.visibility,
                onValueChange = {}
            )
        }
    }
}