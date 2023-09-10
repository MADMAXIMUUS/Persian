package ru.rabbit.persian.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.PersianTheme
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.foundation.spacing
import ru.rabbit.persian.progressBars.PersianCircularProgressBarSize
import ru.rabbit.persian.progressBars.PersianProgressBar
import ru.rabbit.persian.progressBars.PersianProgressBarColors

object PersianButton {

    @Composable
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        style: PersianComponentStyle = PersianComponentStyle.FILL,
        colors: ButtonColors = PersianButtonColors.primary(style),
        size: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = when (style) {
        PersianComponentStyle.FILL -> {
            PersianFillButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        PersianComponentStyle.OUTLINED -> {
            PersianOutlineButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        PersianComponentStyle.STANDARD -> {
            PersianTextButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        else -> {}
    }

    @Composable
    fun Secondary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        style: PersianComponentStyle = PersianComponentStyle.FILL,
        colors: ButtonColors = PersianButtonColors.secondary(style),
        size: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = when (style) {
        PersianComponentStyle.FILL -> {
            PersianFillButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        PersianComponentStyle.OUTLINED -> {
            PersianOutlineButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        PersianComponentStyle.STANDARD -> {
            PersianTextButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        else -> {}
    }

    @Composable
    fun Tertiary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        style: PersianComponentStyle = PersianComponentStyle.FILL,
        colors: ButtonColors = PersianButtonColors.tertiary(style),
        size: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = when (style) {
        PersianComponentStyle.FILL -> {
            PersianFillButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        PersianComponentStyle.OUTLINED -> {
            PersianOutlineButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        PersianComponentStyle.STANDARD -> {
            PersianTextButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        else -> {}
    }

    @Composable
    fun Negative(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        style: PersianComponentStyle = PersianComponentStyle.FILL,
        colors: ButtonColors = PersianButtonColors.negative(style),
        size: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = when (style) {
        PersianComponentStyle.FILL -> {
            PersianFillButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        PersianComponentStyle.OUTLINED -> {
            PersianOutlineButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        PersianComponentStyle.STANDARD -> {
            PersianTextButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        else -> {}
    }

    @Composable
    fun Neutral(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        style: PersianComponentStyle = PersianComponentStyle.FILL,
        colors: ButtonColors = PersianButtonColors.neutral(style),
        size: ButtonSizes = PersianButtonSizes.medium(loading),
        onClick: () -> Unit
    ) = when (style) {
        PersianComponentStyle.FILL -> {
            PersianFillButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        PersianComponentStyle.OUTLINED -> {
            PersianOutlineButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        PersianComponentStyle.STANDARD -> {
            PersianTextButtonImpl(
                modifier = modifier,
                text = text,
                enabled = enabled,
                colors = colors,
                loading = loading,
                size = size,
                icon = icon,
                iconSide = iconSide,
                onClick = onClick
            )
        }

        else -> {}
    }
}

enum class IconSide { LEFT, RIGHT }

@Composable
private fun PersianFillButtonImpl(
    text: String,
    modifier: Modifier = Modifier,
    icon: Painter? = null,
    iconSide: IconSide? = null,
    enabled: Boolean,
    colors: ButtonColors,
    loading: Boolean,
    size: ButtonSizes,
    onClick: () -> Unit
) {
    val iconButton = @Composable {
        icon?.let {
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.size(size.iconSize),
                tint = colors.contentColor(enabled)
            )
        }
    }
    Button(
        enabled = enabled,
        modifier = modifier
            .widthIn(min = size.minWidth)
            .height(size.height),
        colors = ButtonDefaults
            .buttonColors(
                contentColor = colors.contentColor,
                containerColor = colors.containerColor,
                disabledContentColor = colors.disabledContentColor,
                disabledContainerColor = colors.disabledContainerColor
            ),
        shape = MaterialTheme.shapes.large,
        contentPadding = size.contentPadding,
        onClick = onClick
    ) {
        if (loading && enabled) {
            Box {
                PersianProgressBar.Circular(
                    modifier = Modifier
                        .padding(horizontal = MaterialTheme.spacing.small),
                    sizes = when (size) {
                        PersianButtonSizes.small(true) -> PersianCircularProgressBarSize.small()
                        PersianButtonSizes.medium(true) -> PersianCircularProgressBarSize.medium()
                        PersianButtonSizes.large(true) -> PersianCircularProgressBarSize.large()
                        else -> PersianCircularProgressBarSize.small()
                    },
                    colors = PersianProgressBarColors.primary(
                        backgroundColor = Color.Transparent,
                        progressColor = colors.contentColor
                    )
                )
            }
        } else {
            if (iconSide == IconSide.LEFT) iconButton()
            Box {
                Text(
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 0.dp),
                    text = text,
                    style = size.textStyle,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center,
                    maxLines = 1
                )
            }
            if (iconSide == IconSide.RIGHT) iconButton()
        }
    }
}

@Composable
private fun PersianOutlineButtonImpl(
    text: String,
    modifier: Modifier = Modifier,
    icon: Painter? = null,
    iconSide: IconSide? = null,
    enabled: Boolean,
    colors: ButtonColors,
    loading: Boolean,
    size: ButtonSizes,
    onClick: () -> Unit
) {
    val iconButton = @Composable {
        icon?.let {
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.size(size.iconSize),
                tint = colors.contentColor(enabled)
            )
        }
    }
    OutlinedButton(
        enabled = enabled,
        modifier = modifier
            .height(size.height)
            .widthIn(min = size.minWidth),
        colors = ButtonDefaults
            .outlinedButtonColors(
                contentColor = colors.contentColor,
                containerColor = colors.containerColor,
                disabledContentColor = colors.disabledContentColor,
                disabledContainerColor = colors.disabledContainerColor
            ),
        shape = MaterialTheme.shapes.large,
        contentPadding = size.contentPadding,
        onClick = onClick,
        border = BorderStroke(1.dp, colors.contentColor(enabled))
    ) {
        if (loading && enabled) {
            Box {
                PersianProgressBar.Circular(
                    modifier = Modifier
                        .padding(horizontal = MaterialTheme.spacing.small),
                    sizes = when (size) {
                        PersianButtonSizes.small(true) -> PersianCircularProgressBarSize.small()
                        PersianButtonSizes.medium(true) -> PersianCircularProgressBarSize.medium()
                        PersianButtonSizes.large(true) -> PersianCircularProgressBarSize.large()
                        else -> PersianCircularProgressBarSize.small()
                    },
                    colors = PersianProgressBarColors.primary(
                        backgroundColor = Color.Transparent,
                        progressColor = colors.contentColor
                    )
                )
            }
        } else {
            if (iconSide == IconSide.LEFT) iconButton()
            Box {
                Text(
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 0.dp),
                    text = text,
                    style = size.textStyle,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center,
                    maxLines = 1
                )
            }
            if (iconSide == IconSide.RIGHT) iconButton()
        }
    }
}

@Composable
private fun PersianTextButtonImpl(
    text: String,
    modifier: Modifier = Modifier,
    icon: Painter? = null,
    iconSide: IconSide? = null,
    enabled: Boolean,
    colors: ButtonColors,
    loading: Boolean,
    size: ButtonSizes,
    onClick: () -> Unit
) {
    val iconButton = @Composable {
        icon?.let {
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.size(size.iconSize),
                tint = colors.contentColor(enabled)
            )
        }
    }
    TextButton(
        enabled = enabled,
        modifier = modifier
            .widthIn(min = size.minWidth)
            .height(size.height),
        colors = ButtonDefaults
            .textButtonColors(
                contentColor = colors.contentColor,
                containerColor = colors.containerColor,
                disabledContentColor = colors.disabledContentColor,
                disabledContainerColor = colors.disabledContainerColor
            ),
        shape = MaterialTheme.shapes.large,
        contentPadding = size.contentPadding,
        onClick = onClick,
    ) {
        if (loading && enabled) {
            Box {
                PersianProgressBar.Circular(
                    modifier = Modifier
                        .padding(horizontal = MaterialTheme.spacing.small),
                    sizes = when (size) {
                        PersianButtonSizes.small(true) -> PersianCircularProgressBarSize.small()
                        PersianButtonSizes.medium(true) -> PersianCircularProgressBarSize.medium()
                        PersianButtonSizes.large(true) -> PersianCircularProgressBarSize.large()
                        else -> PersianCircularProgressBarSize.small()
                    },
                    colors = PersianProgressBarColors.primary(
                        backgroundColor = Color.Transparent,
                        progressColor = colors.contentColor
                    )
                )
            }
        } else {
            if (iconSide == IconSide.LEFT) iconButton()
            Box {
                Text(
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 0.dp),
                    text = text,
                    style = size.textStyle,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center,
                    maxLines = 1
                )
            }
            if (iconSide == IconSide.RIGHT) iconButton()
        }
    }
}


@Preview
@Composable
fun PrimaryFillButton() {
    PersianTheme {
        val isLoading = true
        Surface {
            Column(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                PersianButton.Primary(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.FILL,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Secondary(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.FILL,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Tertiary(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.FILL,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Negative(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.FILL,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Neutral(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.FILL,
                    onClick = {}
                )
            }
        }
    }
}

@Preview(name = "Persian Outlined Button")
@Composable
fun PrimaryOutlineButton() {
    PersianTheme {
        val isLoading = false
        Surface {
            Column(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                PersianButton.Primary(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.OUTLINED,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Secondary(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.OUTLINED,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Tertiary(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.OUTLINED,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Negative(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.OUTLINED,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Neutral(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.OUTLINED,
                    onClick = {}
                )
            }
        }
    }
}

@Preview
@Composable
fun PrimaryTextButton() {
    PersianTheme {
        val isLoading = false
        Surface {
            Column(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                PersianButton.Primary(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.STANDARD,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Secondary(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.STANDARD,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Tertiary(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.STANDARD,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Negative(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.STANDARD,
                    onClick = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                PersianButton.Neutral(
                    icon = MaterialTheme.icons.appLogo,
                    iconSide = IconSide.LEFT,
                    text = "Persian",
                    loading = isLoading,
                    size = PersianButtonSizes.large(isLoading),
                    style = PersianComponentStyle.STANDARD,
                    onClick = {}
                )
            }
        }
    }
}