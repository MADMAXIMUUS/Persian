package io.github.madmaximuus.persian.input

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.BasicSecureTextField
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.KeyboardActionHandler
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton
import io.github.madmaximuus.persian.text.Text

/**
 * Display an input field in outline style.
 *
 * @param state The [TextFieldState] The state of the input field, which contains information
 * about the text in this input field.
 * @param modifier The [Modifier] to be applied to the input field.
 * @param enabled Whether the input field is enabled or disabled.
 * @param isError Whether the input field is in an error state.
 * @param isValid Whether the input field is in a valid state.
 * @param readOnly Whether the input field is read-only.
 * @param placeholder The placeholder text to be displayed when the input field is empty.
 * @param transformation The visual transformation to be applied to the input field.
 * @param colors The colors to be used for the input field.
 * @param sizes The sizes to be used for the input field.
 * @param leadingIcon The leading icon to be displayed in the input field.
 * @param trailingIcon The trailing icon to be displayed in the input field.
 * @param onTrailingIconClick A callback that is invoked when the trailing icon is clicked.
 * @param suffix The suffix text to be displayed in the input field.
 * @param keyboardOptions The keyboard options for the input field.
 * @param keyboardActionHandler The keyboard actions for the input field.
 * @param interactionSource The [MutableInteractionSource] to be used for the input field.
 */
@Composable
fun OutlineInput(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    readOnly: Boolean = false,
    placeholder: String? = null,
    transformation: InputTransformation? = null,
    secure: SecureInputSettings = SecureInputSettings.NotSecure,
    colors: InputColors = InputsDefaults.outlineColors(),
    sizes: InputSizes = InputsDefaults.sizes(),
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    onTrailingIconClick: (() -> Unit)? = null,
    suffix: String? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActionHandler: KeyboardActionHandler? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = InputImpl(
    state = state,
    modifier = modifier,
    enabled = enabled,
    isError = isError,
    isValid = isValid,
    readOnly = readOnly,
    placeholder = placeholder,
    transformation = transformation,
    colors = colors,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    onTrailingIconClick = onTrailingIconClick,
    suffix = suffix,
    border = animateBorderStrokeAsState(
        enabled = enabled,
        isError = isError,
        isSuccess = isValid,
        colors = colors,
        interactionSource = interactionSource,
        unfocusedBorderThickness = sizes.unfocusedBorderThickness,
        focusedBorderThickness = sizes.focusedBorderThickness
    ).value,
    keyboardOptions = keyboardOptions,
    keyboardActions = keyboardActionHandler,
    interactionSource = interactionSource,
    secret = secure
)

/**
 * Display an input field in plain style.
 *
 * @param state The [TextFieldState] The state of the input field, which contains information
 * about the text in this input field.
 * @param modifier The [Modifier] to be applied to the input field.
 * @param enabled Whether the input field is enabled or disabled.
 * @param isError Whether the input field is in an error state.
 * @param isValid Whether the input field is in a valid state.
 * @param readOnly Whether the input field is read-only.
 * @param placeholder The placeholder text to be displayed when the input field is empty.
 * @param transformation The visual transformation to be applied to the input field.
 * @param colors The colors to be used for the input field.
 * @param sizes The sizes to be used for the input field.
 * @param leadingIcon The leading icon to be displayed in the input field.
 * @param trailingIcon The trailing icon to be displayed in the input field.
 * @param onTrailingIconClick A callback that is invoked when the trailing icon is clicked.
 * @param suffix The suffix text to be displayed in the input field.
 * @param keyboardOptions The keyboard options for the input field.
 * @param keyboardActionHandler The keyboard actions for the input field.
 * @param interactionSource The [MutableInteractionSource] to be used for the input field.
 */
@Composable
fun PlainInput(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    readOnly: Boolean = false,
    placeholder: String? = null,
    transformation: InputTransformation? = null,
    secure: SecureInputSettings = SecureInputSettings.NotSecure,
    colors: InputColors = InputsDefaults.plainColors(),
    sizes: InputSizes = InputsDefaults.sizes(),
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    onTrailingIconClick: (() -> Unit)? = null,
    suffix: String? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActionHandler: KeyboardActionHandler? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = InputImpl(
    state = state,
    modifier = modifier,
    enabled = enabled,
    isError = isError,
    isValid = isValid,
    readOnly = readOnly,
    placeholder = placeholder,
    transformation = transformation,
    colors = colors,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    onTrailingIconClick = onTrailingIconClick,
    suffix = suffix,
    border = null,
    keyboardOptions = keyboardOptions,
    keyboardActions = keyboardActionHandler,
    interactionSource = interactionSource,
    secret = secure

)

/**
 * A composable function that animates the border stroke of an input field based on its state.
 *
 * @param enabled Whether the input field is enabled or disabled.
 * @param isError Whether the input field is in an error state.
 * @param isSuccess Whether the input field is in a valid state.
 * @param interactionSource The [InteractionSource] to be used for the input field.
 * @param colors The colors to be used for the input field.
 * @param focusedBorderThickness The thickness of the border when the input field is focused.
 * @param unfocusedBorderThickness The thickness of the border when the input field is not focused.
 */
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
    val indicatorColor = colors.indicatorColor(
        enabled = enabled,
        isValid = isSuccess,
        isError = isError,
        interactionSource = interactionSource
    )
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

/**
 * A base implementation of input
 *
 * @param state
 * @param modifier The [Modifier] to be applied to the input field.
 * @param enabled Whether the input field is enabled or disabled.
 * @param isError Whether the input field is in an error state.
 * @param isValid Whether the input field is in a valid state.
 * @param readOnly Whether the input field is read-only.
 * @param placeholder The placeholder text to be displayed when the input field is empty.
 * @param transformation The visual transformation to be applied to the input field.
 * @param colors The colors to be used for the input field.
 * @param sizes The sizes to be used for the input field.
 * @param leadingIcon The leading icon to be displayed in the input field.
 * @param trailingIcon The trailing icon to be displayed in the input field.
 * @param onTrailingIconClick A callback that is invoked when the trailing icon is clicked.
 * @param suffix The suffix text to be displayed in the input field.
 * @param border The border stroke to be applied to the input field.
 * @param keyboardOptions The keyboard options for the input field.
 * @param keyboardActions The keyboard actions for the input field.
 * @param interactionSource The [MutableInteractionSource] to be used for the input field.
 */
@Composable
private fun InputImpl(
    state: TextFieldState,
    modifier: Modifier,
    enabled: Boolean,
    isError: Boolean,
    isValid: Boolean,
    readOnly: Boolean,
    placeholder: String?,
    secret: SecureInputSettings,
    transformation: InputTransformation?,
    colors: InputColors,
    sizes: InputSizes,
    leadingIcon: Painter?,
    trailingIcon: Painter?,
    onTrailingIconClick: (() -> Unit)?,
    suffix: String?,
    border: BorderStroke?,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActionHandler?,
    interactionSource: MutableInteractionSource,
) {
    val textColor = colors.textColor(enabled, isValid, isError, interactionSource).value
    val mergedTextStyle = sizes.inputTextStyle
        .merge(TextStyle(color = textColor, baselineShift = BaselineShift.None))

    CompositionLocalProvider(LocalTextSelectionColors provides colors.selectionColors) {
        when (secret) {
            SecureInputSettings.NotSecure -> {
                BasicTextField(
                    modifier = modifier,
                    state = state,
                    enabled = enabled,
                    readOnly = readOnly,
                    textStyle = mergedTextStyle,
                    keyboardOptions = keyboardOptions,
                    onKeyboardAction = keyboardActions,
                    lineLimits = TextFieldLineLimits.SingleLine,
                    inputTransformation = transformation,
                    interactionSource = interactionSource,
                    cursorBrush = SolidColor(
                        colors.cursorColor(
                            isError = isError,
                            isValid = isValid
                        ).value
                    ),
                    decorator = { innerTextField ->
                        DecorationBox(
                            innerTextField = innerTextField,
                            colors = colors,
                            sizes = sizes,
                            border = border,
                            enabled = enabled,
                            isValid = isValid,
                            isError = isError,
                            interactionSource = interactionSource,
                            leadingIcon = leadingIcon,
                            trailingIcon = trailingIcon,
                            placeholder = placeholder,
                            suffix = suffix,
                            needPlaceholder = state.text.isEmpty(),
                            onTrailingIconClick = onTrailingIconClick
                        )
                    }
                )
            }

            is SecureInputSettings.Secure -> {
                BasicSecureTextField(
                    modifier = modifier,
                    state = state,
                    enabled = enabled,
                    textStyle = mergedTextStyle,
                    keyboardOptions = keyboardOptions,
                    onKeyboardAction = keyboardActions,
                    inputTransformation = transformation,
                    interactionSource = interactionSource,
                    textObfuscationCharacter = secret.textObfuscationChar,
                    textObfuscationMode = if (secret.visible) TextObfuscationMode.Visible
                    else TextObfuscationMode.RevealLastTyped,
                    cursorBrush = SolidColor(
                        colors.cursorColor(
                            isError = isError,
                            isValid = isValid
                        ).value
                    ),
                    decorator = { innerTextField ->
                        DecorationBox(
                            innerTextField = innerTextField,
                            colors = colors,
                            sizes = sizes,
                            border = border,
                            enabled = enabled,
                            isValid = isValid,
                            isError = isError,
                            interactionSource = interactionSource,
                            leadingIcon = leadingIcon,
                            trailingIcon = trailingIcon,
                            placeholder = placeholder,
                            suffix = suffix,
                            needPlaceholder = state.text.isEmpty(),
                            onTrailingIconClick = onTrailingIconClick
                        )
                    }
                )
            }
        }
    }
}

@Composable
internal fun DecorationBox(
    innerTextField: @Composable () -> Unit,
    colors: InputColors,
    sizes: InputSizes,
    border: BorderStroke?,
    enabled: Boolean,
    isValid: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
    leadingIcon: Painter?,
    trailingIcon: Painter?,
    placeholder: String?,
    suffix: String?,
    needPlaceholder: Boolean,
    onTrailingIconClick: (() -> Unit)?
) {
    val rowModifier = if (border == null)
        Modifier
            .fillMaxWidth()
            .background(
                color = colors.containerColor(
                    enabled = enabled,
                    isValid = isValid,
                    isError = isError,
                    interactionSource = interactionSource
                ).value,
                shape = sizes.shape
            )
            .height(52.dp)
            .padding(sizes.contentPaddingValues)
    else
        Modifier
            .fillMaxWidth()
            .background(
                color = colors.containerColor(
                    enabled = enabled,
                    isValid = isValid,
                    isError = isError,
                    interactionSource = interactionSource
                ).value,
                shape = sizes.shape
            )
            .border(border, sizes.shape)
            .height(52.dp)
            .padding(sizes.contentPaddingValues)
    Row(
        modifier = rowModifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        colors.stateIcon(
            enabled = enabled,
            isError = isError,
            isSuccess = isValid
        ).value?.let { icon ->
            Icon(
                painter = icon,
                tint = colors.stateIconColor(
                    enabled = enabled,
                    isValid = isValid,
                    isError = isError,
                ).value
            )
            Spacer(modifier = Modifier.width(PersianTheme.spacing.size4))
        } ?: leadingIcon?.let { icon ->
            Icon(
                painter = icon,
                tint = colors.leadingIconColor(
                    enabled = enabled,
                    isValid = isValid,
                    isError = isError,
                    interactionSource = interactionSource
                ).value
            )
            Spacer(modifier = Modifier.width(PersianTheme.spacing.size4))
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
        ) {
            if (needPlaceholder && placeholder != null) {
                Text(
                    text = placeholder,
                    color = colors.placeholderColor(
                        enabled = enabled,
                        isError = isError,
                        isValid = isValid,
                        interactionSource = interactionSource
                    ).value,
                    style = sizes.placeholderTextStyle
                        .copy(baselineShift = BaselineShift.None),
                )
            }
            innerTextField()
        }
        if (suffix != null && trailingIcon == null) {
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(horizontal = PersianTheme.spacing.size4)
                    .padding(end = PersianTheme.spacing.size8)
            ) {
                Text(
                    text = suffix,
                    color = colors.suffixColor(
                        enabled = enabled,
                        isValid = isValid,
                        isError = isError,
                        interactionSource = interactionSource
                    ).value,
                    style = sizes.suffixTextStyle
                )
            }
        }
        trailingIcon?.let { icon ->
            TertiaryIconButton(
                icon = icon,
                onClick = {
                    onTrailingIconClick?.invoke()
                },
                enabled = onTrailingIconClick != null,
                colors = IconButtonDefaults.tertiaryIconButtonColors(
                    contentColor = colors.trailingIconColor(
                        enabled = enabled,
                        isValid = isValid,
                        isError = isError,
                        interactionSource = interactionSource
                    ).value,
                    disabledContentColor = colors.trailingIconColor(
                        enabled = enabled,
                        isValid = isValid,
                        isError = isError,
                        interactionSource = interactionSource
                    ).value
                )
            )
        } ?: Spacer(modifier = Modifier.height(PersianTheme.spacing.size8))
    }
}