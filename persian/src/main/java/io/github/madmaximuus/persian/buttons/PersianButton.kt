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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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

    @Composable
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        leadingIcon: Painter? = null,
        trailingIcon: Painter? = null,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = PersianButtonColors.primary(),
        size: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = PersianFillButtonImpl(
        modifier = modifier,
        text = text,
        enabled = enabled,
        colors = colors,
        loading = loading,
        size = size,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        onClick = onClick
    )

    @Composable
    fun Secondary(
        text: String,
        modifier: Modifier = Modifier,
        leadingIcon: Painter? = null,
        trailingIcon: Painter? = null,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = PersianButtonColors.secondary(),
        size: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = PersianFillButtonImpl(
        modifier = modifier,
        text = text,
        enabled = enabled,
        colors = colors,
        loading = loading,
        size = size,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        onClick = onClick
    )

    @Composable
    fun Tertiary(
        text: String,
        modifier: Modifier = Modifier,
        leadingIcon: Painter? = null,
        trailingIcon: Painter? = null,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = PersianButtonColors.tertiary(),
        size: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = PersianTextButtonImpl(
        modifier = modifier,
        text = text,
        enabled = enabled,
        colors = colors,
        loading = loading,
        size = size,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        onClick = onClick
    )

    @Composable
    fun Outline(
        text: String,
        modifier: Modifier = Modifier,
        leadingIcon: Painter? = null,
        trailingIcon: Painter? = null,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = PersianButtonColors.outline(),
        size: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = PersianOutlineButtonImpl(
        modifier = modifier,
        text = text,
        enabled = enabled,
        colors = colors,
        loading = loading,
        size = size,
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
    size: ButtonSizes,
    onClick: () -> Unit
) {
    Button(
        enabled = enabled,
        modifier = modifier
            .height(size.height),
        colors = ButtonDefaults
            .buttonColors(
                contentColor = colors.contentColor,
                containerColor = colors.containerColor,
                disabledContentColor = colors.disabledContentColor,
                disabledContainerColor = colors.disabledContainerColor
            ),
        shape = size.shape,
        contentPadding = PaddingValues(0.dp),
        onClick = onClick
    ) {
        val textWithIcons = @Composable {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(size.contentPadding),
                verticalAlignment = Alignment.CenterVertically
            ) {
                leadingIcon?.let {
                    PersianIconBox.Primary(
                        icon = it,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = colors.contentColor,
                            disabledColor = colors.disabledContentColor
                        ),
                        size = size.iconSize,
                        enabled = enabled
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                ) {
                    Text(
                        text = text,
                        style = size.textStyle,
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
                        size = size.iconSize,
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
                    sizes = size.loaderSize,
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
    size: ButtonSizes,
    onClick: () -> Unit
) {
    OutlinedButton(
        enabled = enabled,
        modifier = modifier
            .height(size.height),
        colors = ButtonDefaults
            .outlinedButtonColors(
                contentColor = colors.contentColor,
                containerColor = colors.containerColor,
                disabledContentColor = colors.disabledContentColor,
                disabledContainerColor = colors.disabledContainerColor
            ),
        shape = size.shape,
        contentPadding = PaddingValues(0.dp),
        onClick = onClick,
        border = BorderStroke(1.dp, colors.contentColor(enabled).value)
    ) {
        val textWithIcons = @Composable {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(size.contentPadding),
                verticalAlignment = Alignment.CenterVertically
            ) {
                leadingIcon?.let {
                    PersianIconBox.Primary(
                        icon = it,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = colors.contentColor,
                            disabledColor = colors.disabledContentColor
                        ),
                        size = size.iconSize,
                        enabled = enabled
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                ) {
                    Text(
                        text = text,
                        style = size.textStyle,
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
                        size = size.iconSize,
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
                    sizes = size.loaderSize,
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
    size: ButtonSizes,
    onClick: () -> Unit
) {
    TextButton(
        enabled = enabled,
        modifier = modifier
            .height(size.height),
        colors = ButtonDefaults
            .textButtonColors(
                contentColor = colors.contentColor,
                containerColor = colors.containerColor,
                disabledContentColor = colors.disabledContentColor,
                disabledContainerColor = colors.disabledContainerColor
            ),
        shape = size.shape,
        contentPadding = PaddingValues(0.dp),
        onClick = onClick,
    ) {
        val textWithIcons = @Composable {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(size.contentPadding),
                verticalAlignment = Alignment.CenterVertically
            ) {
                leadingIcon?.let {
                    PersianIconBox.Primary(
                        icon = it,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = colors.contentColor,
                            disabledColor = colors.disabledContentColor
                        ),
                        size = size.iconSize,
                        enabled = enabled
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                ) {
                    Text(
                        text = text,
                        style = size.textStyle,
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
                        size = size.iconSize,
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
                    sizes = size.loaderSize,
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
                    size = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Secondary(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Tertiary(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Outline(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
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
                    size = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Secondary(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Tertiary(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Outline(
                    leadingIcon = MaterialTheme.icons.appLogo,
                    trailingIcon = MaterialTheme.icons.chevronRight,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    onClick = {}
                )
            }
        }
    }
}