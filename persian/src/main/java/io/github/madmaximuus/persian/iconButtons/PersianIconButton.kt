package io.github.madmaximuus.persian.iconButtons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.iconBox.PersianIconBox

@Composable
fun PersianPrimaryIconButton(
    onClick: () -> Unit,
    icon: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = PersianIconButtonDefaults.shape,
    colors: NewIconButtonColors = PersianIconButtonDefaults.primaryIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = Surface(
    onClick = onClick,
    modifier = modifier.semantics { role = Role.Button },
    enabled = enabled,
    shape = shape,
    color = colors.containerColor(enabled).value,
    contentColor = colors.contentColor(enabled).value,
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        PersianIconBox(icon = icon)
    }
}

@Composable
fun PersianSecondaryIconButton(
    onClick: () -> Unit,
    icon: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = PersianIconButtonDefaults.shape,
    colors: NewIconButtonColors = PersianIconButtonDefaults.secondaryIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = Surface(
    onClick = onClick,
    modifier = modifier.semantics { role = Role.Button },
    enabled = enabled,
    shape = shape,
    color = colors.containerColor(enabled).value,
    contentColor = colors.contentColor(enabled).value,
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        PersianIconBox(icon = icon)
    }
}

@Composable
fun PersianTertiaryIconButton(
    onClick: () -> Unit,
    icon: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = PersianIconButtonDefaults.shape,
    colors: NewIconButtonColors = PersianIconButtonDefaults.tertiaryIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = Surface(
    onClick = onClick,
    modifier = modifier.semantics { role = Role.Button },
    enabled = enabled,
    shape = shape,
    color = colors.containerColor(enabled).value,
    contentColor = colors.contentColor(enabled).value,
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        PersianIconBox(icon = icon)
    }
}

@Composable
fun PersianOutlinedIconButton(
    onClick: () -> Unit,
    icon: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = PersianIconButtonDefaults.shape,
    colors: NewIconButtonColors = PersianIconButtonDefaults.outlinedIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = Surface(
    onClick = onClick,
    modifier = modifier.semantics { role = Role.Button },
    enabled = enabled,
    shape = shape,
    color = colors.containerColor(enabled).value,
    contentColor = colors.contentColor(enabled).value,
    border = BorderStroke(
        1.dp,
        colors.contentColor(enabled).value
    ),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        PersianIconBox(icon = icon)
    }
}

@Preview
@Composable
fun PrimaryIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianPrimaryIconButton(
                icon = MaterialTheme.icons.globeUk,
                onClick = {}
            )
        }
    }
}

@Preview
@Composable
fun SecondaryIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianSecondaryIconButton(
                icon = MaterialTheme.icons.globeUk,
                onClick = {}
            )
        }
    }
}

@Preview
@Composable
fun TertiaryIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianTertiaryIconButton(
                icon = MaterialTheme.icons.globeUk,
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
            PersianOutlinedIconButton(
                icon = MaterialTheme.icons.globeUk,
                onClick = {}
            )
        }
    }
}