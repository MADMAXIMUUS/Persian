package io.github.madmaximuus.persian.buttons

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianSubcomposeLayout
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.ProvideTextStyle
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.progressBars.PersianCircularProgressBar
import io.github.madmaximuus.persian.progressBars.PersianProgressBarDefaults
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.plus.base.Plus


/**
 * The primary button should only be used once per view
 * @param text The text inside the button
 * @param modifier The [Modifier] to be applied to the component
 * @param leadingIcon The optional icon to be displayed at the start of the button container
 * @param trailingIcon The optional icon to be displayed at the end of the button container
 * @param enabled True if you can click on the button, otherwise false
 * @param loading True if loader displayed on the button, otherwise false
 * @param colors The colors of the background and the content in enabled and disabled
 * @param sizes The sizes for the content, paddings, shape and height
 * @param onClick The callback to be called when the user click on the button
 */
@Composable
fun PersianPrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    additionInfoText: String? = null,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    colors: ButtonColors = PersianButtonDefaults.primaryColors(),
    sizes: ButtonSizes = PersianButtonDefaults.mediumSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) = PersianButton(
    modifier = modifier,
    text = text,
    additionInfoText = additionInfoText,
    enabled = enabled,
    colors = colors,
    loading = loading,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    border = null,
    interactionSource = interactionSource,
    onClick = onClick
)

/**
 * The secondary button should be used only with primary action
 * @param text The text inside the button
 * @param modifier The [Modifier] to be applied to the component
 * @param leadingIcon The optional icon to be displayed at the start of the button container
 * @param trailingIcon The optional icon to be displayed at the end of the button container
 * @param enabled True if you can click on the button, otherwise false
 * @param loading True if loader displayed on the button, otherwise false
 * @param colors The colors of the background and the content in enabled and disabled
 * @param sizes The sizes for the content, paddings, shape and height
 * @param onClick The callback to be called when the user click on the button
 */
@Composable
fun PersianSecondaryButton(
    text: String,
    modifier: Modifier = Modifier,
    additionInfoText: String? = null,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    colors: ButtonColors = PersianButtonDefaults.secondaryColors(),
    sizes: ButtonSizes = PersianButtonDefaults.mediumSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) = PersianButton(
    modifier = modifier,
    text = text,
    additionInfoText = additionInfoText,
    enabled = enabled,
    colors = colors,
    loading = loading,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    border = null,
    interactionSource = interactionSource,
    onClick = onClick
)

/**
 * The tertiary button should only be used for the lowest priority actions,
 * especially when presenting multiple options.
 * @param text The text inside the button
 * @param modifier The [Modifier] to be applied to the component
 * @param leadingIcon The optional icon to be displayed at the start of the button container
 * @param trailingIcon The optional icon to be displayed at the end of the button container
 * @param enabled True if you can click on the button, otherwise false
 * @param loading True if loader displayed on the button, otherwise false
 * @param colors The colors of the background and the content in enabled and disabled
 * @param sizes The sizes for the content, paddings, shape and height
 * @param onClick The callback to be called when the user click on the button
 */
@Composable
fun PersianTertiaryButton(
    text: String,
    modifier: Modifier = Modifier,
    additionInfoText: String? = null,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    colors: ButtonColors = PersianButtonDefaults.tertiaryColors(),
    sizes: ButtonSizes = PersianButtonDefaults.mediumSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) = PersianButton(
    modifier = modifier,
    text = text,
    additionInfoText = additionInfoText,
    enabled = enabled,
    colors = colors,
    loading = loading,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    border = null,
    interactionSource = interactionSource,
    onClick = onClick
)

/**
 * The outline button should only be used for more emphasis than text buttons due to the stroke.
 * @param text The text inside the button
 * @param modifier The [Modifier] to be applied to the component
 * @param leadingIcon The optional icon to be displayed at the start of the button container
 * @param trailingIcon The optional icon to be displayed at the end of the button container
 * @param enabled True if you can click on the button, otherwise false
 * @param colors The colors of the background and the content in enabled and disabled
 * @param sizes The sizes for the content, paddings, shape and height
 * @param onClick The callback to be called when the user click on the button
 */
@Composable
fun PersianOutlinedButton(
    text: String,
    modifier: Modifier = Modifier,
    additionInfoText: String? = null,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    colors: ButtonColors = PersianButtonDefaults.outlinedColors(),
    sizes: ButtonSizes = PersianButtonDefaults.mediumSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) = PersianButton(
    modifier = modifier,
    text = text,
    additionInfoText = additionInfoText,
    enabled = enabled,
    colors = colors,
    loading = loading,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    border = BorderStroke(
        1.dp,
        color = colors.contentColor(enabled),
    ),
    interactionSource = interactionSource,
    onClick = onClick
)

@Composable
private fun PersianButton(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    additionInfoText: String? = null,
    enabled: Boolean,
    colors: ButtonColors,
    loading: Boolean,
    sizes: ButtonSizes,
    border: BorderStroke?,
    interactionSource: MutableInteractionSource,
    onClick: () -> Unit
) {
    val containerColor = colors.containerColor(enabled)
    val contentColor = colors.contentColor(enabled)
    Surface(
        onClick = onClick,
        modifier = modifier.semantics { role = Role.Button },
        enabled = enabled,
        shape = sizes.shape,
        color = containerColor,
        contentColor = contentColor,
        border = border,
        interactionSource = interactionSource
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            ProvideTextStyle(value = sizes.textStyle) {
                Row(
                    Modifier
                        .height(sizes.height),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val textWithIcons = @Composable {
                        Row(
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(sizes.contentPadding),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            leadingIcon?.let {
                                Icon(
                                    painter = it,
                                    size = sizes.iconSize
                                )
                            }
                            Column(
                                modifier = Modifier
                                    .padding(horizontal = 8.dp),
                            ) {
                                Text(
                                    modifier = Modifier.align(Alignment.CenterHorizontally),
                                    text = text,
                                    style = sizes.textStyle,
                                    overflow = TextOverflow.Ellipsis,
                                    textAlign = TextAlign.Center,
                                    color = colors.contentColor(enabled),
                                    maxLines = 1
                                )
                                if (sizes.additionInfoTextStyle != null && additionInfoText != null)
                                    Text(
                                        modifier = Modifier.align(Alignment.CenterHorizontally),
                                        text = additionInfoText,
                                        style = sizes.additionInfoTextStyle,
                                        overflow = TextOverflow.Ellipsis,
                                        textAlign = TextAlign.Center,
                                        color = colors.contentColor(enabled),
                                        maxLines = 1
                                    )
                            }
                            trailingIcon?.let {
                                Icon(
                                    painter = it,
                                    size = sizes.iconSize
                                )
                            }
                        }
                    }

                    val loader = @Composable {
                        Box(
                            modifier = Modifier
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center
                        ) {
                            PersianCircularProgressBar(
                                sizes = sizes.loaderSize,
                                colors = PersianProgressBarDefaults.colors(
                                    backgroundColor = Color.Transparent,
                                    progressColor = colors.contentColor(true)
                                )
                            )
                        }
                    }
                    PersianSubcomposeLayout(
                        mainContent = {
                            textWithIcons()
                        },
                        dependentContent = {
                            Box(
                                modifier = Modifier
                                    .size(it),
                                contentAlignment = Alignment.Center
                            ) {
                                if (loading && enabled)
                                    loader()
                                else
                                    textWithIcons()
                            }
                        }
                    )
                }
            }
        }
    }
}


@Preview
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun PersianButtonPreview() {
    PersianTheme {
        val isLoading = false
        Surface {
            Column(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                PersianPrimaryButton(
                    leadingIcon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                    trailingIcon = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
                    text = "Button",
                    additionInfoText = "Addition Info",
                    loading = isLoading,
                    sizes = PersianButtonDefaults.smallSizes(),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianSecondaryButton(
                    leadingIcon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                    trailingIcon = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
                    text = "Button",
                    additionInfoText = "Addition Info",
                    loading = isLoading,
                    sizes = PersianButtonDefaults.mediumSizes(),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianTertiaryButton(
                    leadingIcon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                    trailingIcon = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
                    text = "Button",
                    additionInfoText = "Addition Info",
                    loading = isLoading,
                    sizes = PersianButtonDefaults.largeSizes(),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianOutlinedButton(
                    leadingIcon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                    trailingIcon = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
                    text = "Button",
                    additionInfoText = "Addition Info",
                    loading = isLoading,
                    sizes = PersianButtonDefaults.largeSizes(),
                    onClick = {}
                )
            }
        }
    }
}