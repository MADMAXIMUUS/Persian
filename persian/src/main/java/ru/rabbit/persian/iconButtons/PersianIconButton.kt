package ru.rabbit.persian.iconButtons

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.PersianTheme
import ru.rabbit.persian.foundation.icons

object PersianIconButton {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        icon: Painter,
        style: PersianComponentStyle = PersianComponentStyle.FILL,
        enabled: Boolean = true,
        sizes: IconButtonSizes = PersianIconButtonSizes.medium(),
        colors: IconButtonColors = PersianIconButtonColors.primary(style = style),
        onClick: () -> Unit
    ) {
        when (style) {
            PersianComponentStyle.FILL -> PersianFilledIconButtonImpl(
                modifier = modifier,
                icon = icon,
                enabled = enabled,
                sizes = sizes,
                colors = colors,
                onClick = onClick
            )

            PersianComponentStyle.OUTLINED -> PersianOutlinedIconButtonImpl(
                modifier = modifier,
                icon = icon,
                enabled = enabled,
                sizes = sizes,
                colors = colors,
                onClick = onClick
            )

            PersianComponentStyle.STANDARD -> PersianIconButtonImpl(
                modifier = modifier,
                icon = icon,
                enabled = enabled,
                sizes = sizes,
                colors = colors,
                onClick = onClick
            )

            PersianComponentStyle.TONAL -> PersianTonalIconButtonImpl(
                modifier = modifier,
                icon = icon,
                enabled = enabled,
                sizes = sizes,
                colors = colors,
                onClick = onClick
            )
        }
    }
}

@Composable
private fun PersianFilledIconButtonImpl(
    modifier: Modifier = Modifier,
    icon: Painter,
    enabled: Boolean,
    sizes: IconButtonSizes,
    colors: IconButtonColors,
    onClick: () -> Unit
) {
    FilledIconButton(
        modifier = modifier,
        colors = IconButtonDefaults.filledIconButtonColors(
            containerColor = colors.containerColor,
            contentColor = colors.contentColor,
            disabledContentColor = colors.disabledContentColor,
            disabledContainerColor = colors.disabledContainerColor
        ),
        shape = sizes.cornerRadius,
        enabled = enabled,
        onClick = onClick
    ) {
        Icon(
            painter = icon,
            contentDescription = ""
        )
    }
}

@Composable
private fun PersianOutlinedIconButtonImpl(
    modifier: Modifier = Modifier,
    icon: Painter,
    enabled: Boolean,
    sizes: IconButtonSizes,
    colors: IconButtonColors,
    onClick: () -> Unit
) {
    OutlinedIconButton(
        modifier = modifier,
        colors = IconButtonDefaults.outlinedIconButtonColors(
            containerColor = colors.containerColor,
            contentColor = colors.contentColor,
            disabledContentColor = colors.disabledContentColor,
            disabledContainerColor = colors.disabledContainerColor
        ),
        shape = sizes.cornerRadius,
        border = BorderStroke(1.dp, colors.contentColor),
        enabled = enabled,
        onClick = onClick
    ) {
        Icon(
            painter = icon,
            contentDescription = ""
        )
    }
}

@Composable
private fun PersianIconButtonImpl(
    modifier: Modifier = Modifier,
    icon: Painter,
    enabled: Boolean,
    sizes: IconButtonSizes,
    colors: IconButtonColors,
    onClick: () -> Unit
) {
    IconButton(
        modifier = modifier
            .clip(sizes.cornerRadius),
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = colors.containerColor,
            contentColor = colors.contentColor,
            disabledContentColor = colors.disabledContentColor,
            disabledContainerColor = colors.disabledContainerColor
        ),
        enabled = enabled,
        onClick = onClick
    ) {
        Icon(
            painter = icon,
            contentDescription = ""
        )
    }
}

@Composable
private fun PersianTonalIconButtonImpl(
    modifier: Modifier = Modifier,
    icon: Painter,
    enabled: Boolean,
    sizes: IconButtonSizes,
    colors: IconButtonColors,
    onClick: () -> Unit
) {
    FilledTonalIconButton(
        modifier = modifier,
        colors = IconButtonDefaults.outlinedIconButtonColors(
            containerColor = colors.tonalContainerColor,
            contentColor = colors.tonalContentColor,
            disabledContentColor = colors.disabledContentColor,
            disabledContainerColor = colors.disabledContainerColor
        ),
        shape = sizes.cornerRadius,
        enabled = enabled,
        onClick = onClick
    ) {
        Icon(
            painter = icon,
            contentDescription = ""
        )
    }
}

@Preview
@Composable
fun FiledIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianIconButton.Primary(
                icon = MaterialTheme.icons.globeUk,
                style = PersianComponentStyle.FILL,
                onClick = {}
            )
        }
    }
}

@Preview
@Composable
fun OutlinedIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianIconButton.Primary(
                icon = MaterialTheme.icons.globeUk,
                style = PersianComponentStyle.OUTLINED,
                onClick = {}
            )
        }
    }
}

@Preview
@Composable
fun IconButtonPreview() {
    PersianTheme {
        Surface {
            PersianIconButton.Primary(
                icon = MaterialTheme.icons.globeUk,
                style = PersianComponentStyle.STANDARD,
                onClick = {}
            )
        }
    }
}

@Preview
@Composable
fun TonalIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianIconButton.Primary(
                icon = MaterialTheme.icons.globeUk,
                style = PersianComponentStyle.TONAL,
                onClick = {}
            )
        }
    }
}