package io.github.madmaximuus.persian.buttons

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianSubcomposeLayout
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxColors
import io.github.madmaximuus.persian.progressBars.PersianProgressBar
import io.github.madmaximuus.persian.progressBars.PersianProgressBarColors

object PersianButton {

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
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        leadingIcon: Painter? = null,
        trailingIcon: Painter? = null,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = PersianButtonColors.primary(),
        sizes: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = PersianFillButtonImpl(
        modifier = modifier,
        text = text,
        enabled = enabled,
        colors = colors,
        loading = loading,
        sizes = sizes,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
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
    fun Secondary(
        text: String,
        modifier: Modifier = Modifier,
        leadingIcon: Painter? = null,
        trailingIcon: Painter? = null,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = PersianButtonColors.secondary(),
        sizes: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = PersianFillButtonImpl(
        modifier = modifier,
        text = text,
        enabled = enabled,
        colors = colors,
        loading = loading,
        sizes = sizes,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
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
    fun Tertiary(
        text: String,
        modifier: Modifier = Modifier,
        leadingIcon: Painter? = null,
        trailingIcon: Painter? = null,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = PersianButtonColors.tertiary(),
        sizes: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = PersianTextButtonImpl(
        modifier = modifier,
        text = text,
        enabled = enabled,
        colors = colors,
        loading = loading,
        sizes = sizes,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
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
    fun Outline(
        text: String,
        modifier: Modifier = Modifier,
        leadingIcon: Painter? = null,
        trailingIcon: Painter? = null,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = PersianButtonColors.outline(),
        sizes: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = PersianOutlineButtonImpl(
        modifier = modifier,
        text = text,
        enabled = enabled,
        colors = colors,
        loading = loading,
        sizes = sizes,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        onClick = onClick
    )
}

@Composable
private fun PersianFillButtonImpl(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean,
    colors: ButtonColors,
    loading: Boolean,
    sizes: ButtonSizes,
    onClick: () -> Unit
) {
    Button(
        enabled = enabled,
        modifier = modifier
            .height(sizes.height),
        colors = ButtonDefaults
            .buttonColors(
                contentColor = colors.contentColor,
                containerColor = colors.containerColor,
                disabledContentColor = colors.disabledContentColor,
                disabledContainerColor = colors.disabledContainerColor
            ),
        shape = sizes.shape,
        contentPadding = PaddingValues(0.dp),
        onClick = onClick
    ) {
        val textWithIcons = @Composable {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(sizes.contentPadding),
                verticalAlignment = Alignment.CenterVertically
            ) {
                leadingIcon?.let {
                    PersianIconBox.Primary(
                        icon = it,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = colors.contentColor,
                            disabledColor = colors.disabledContentColor
                        ),
                        size = sizes.iconSize,
                        enabled = enabled
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                ) {
                    Text(
                        text = text,
                        style = sizes.textStyle,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Center,
                        color = colors.contentColor(enabled).value,
                        maxLines = 1
                    )
                }
                trailingIcon?.let {
                    PersianIconBox.Primary(
                        icon = it,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = colors.contentColor,
                            disabledColor = colors.disabledContentColor
                        ),
                        size = sizes.iconSize,
                        enabled = enabled
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
                PersianProgressBar.Circular(
                    sizes = sizes.loaderSize,
                    colors = PersianProgressBarColors.primary(
                        backgroundColor = Color.Transparent,
                        progressColor = colors.contentColor(true).value
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

@Composable
private fun PersianOutlineButtonImpl(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean,
    colors: ButtonColors,
    loading: Boolean,
    sizes: ButtonSizes,
    onClick: () -> Unit
) {
    Button(
        enabled = enabled,
        modifier = modifier
            .height(sizes.height),
        colors = ButtonDefaults
            .outlinedButtonColors(
                contentColor = colors.contentColor,
                containerColor = colors.containerColor,
                disabledContentColor = colors.disabledContentColor,
                disabledContainerColor = colors.disabledContainerColor
            ),
        shape = sizes.shape,
        contentPadding = PaddingValues(0.dp),
        onClick = onClick,
        border = BorderStroke(1.dp, colors.contentColor(enabled).value)
    ) {
        val textWithIcons = @Composable {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(sizes.contentPadding),
                verticalAlignment = Alignment.CenterVertically
            ) {
                leadingIcon?.let {
                    PersianIconBox.Primary(
                        icon = it,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = colors.contentColor,
                            disabledColor = colors.disabledContentColor
                        ),
                        size = sizes.iconSize,
                        enabled = enabled
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                ) {
                    Text(
                        text = text,
                        style = sizes.textStyle,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Center,
                        color = colors.contentColor(enabled).value,
                        maxLines = 1
                    )
                }
                trailingIcon?.let {
                    PersianIconBox.Primary(
                        icon = it,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = colors.contentColor,
                            disabledColor = colors.disabledContentColor
                        ),
                        size = sizes.iconSize,
                        enabled = enabled
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
                PersianProgressBar.Circular(
                    sizes = sizes.loaderSize,
                    colors = PersianProgressBarColors.primary(
                        backgroundColor = Color.Transparent,
                        progressColor = colors.contentColor(true).value
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

@Composable
private fun PersianTextButtonImpl(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean,
    colors: ButtonColors,
    loading: Boolean,
    sizes: ButtonSizes,
    onClick: () -> Unit
) {
    Button(
        enabled = enabled,
        modifier = modifier
            .height(sizes.height),
        colors = ButtonDefaults
            .textButtonColors(
                contentColor = colors.contentColor,
                containerColor = colors.containerColor,
                disabledContentColor = colors.disabledContentColor,
                disabledContainerColor = colors.disabledContainerColor
            ),
        shape = sizes.shape,
        contentPadding = PaddingValues(0.dp),
        onClick = onClick,
    ) {
        val textWithIcons = @Composable {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(sizes.contentPadding),
                verticalAlignment = Alignment.CenterVertically
            ) {
                leadingIcon?.let {
                    PersianIconBox.Primary(
                        icon = it,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = colors.contentColor,
                            disabledColor = colors.disabledContentColor
                        ),
                        size = sizes.iconSize,
                        enabled = enabled
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                ) {
                    Text(
                        text = text,
                        style = sizes.textStyle,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Center,
                        color = colors.contentColor(enabled).value,
                        maxLines = 1
                    )
                }
                trailingIcon?.let {
                    PersianIconBox.Primary(
                        icon = it,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = colors.contentColor,
                            disabledColor = colors.disabledContentColor
                        ),
                        size = sizes.iconSize,
                        enabled = enabled
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
                PersianProgressBar.Circular(
                    sizes = sizes.loaderSize,
                    colors = PersianProgressBarColors.primary(
                        backgroundColor = Color.Transparent,
                        progressColor = colors.contentColor(true).value
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


@Preview
@Composable
fun PersianButtonPreview() {
    PersianTheme {
        val isLoading = false
        Surface {
            Column(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                PersianButton.Primary(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    sizes = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Secondary(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    sizes = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Tertiary(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    sizes = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Outline(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    sizes = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
            }
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PersianButtonDarkPreview() {
    PersianTheme {
        val isLoading = false
        Surface {
            Column(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                PersianButton.Primary(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    sizes = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Secondary(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    sizes = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Tertiary(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    sizes = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Outline(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    sizes = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
            }
        }
    }
}