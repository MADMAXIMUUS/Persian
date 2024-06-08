package io.github.madmaximuus.persian.snackbar

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianTertiaryButton
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.iconButtons.PersianIconButtonDefaults
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryIconButton
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark

sealed class PersianSnackbarRight {

    data class Close(
        val customIcon: Painter? = null,
        val onClick: () -> Unit
    ) : PersianSnackbarRight()

    data class Action(
        val text: String,
        val onClick: () -> Unit
    ) : PersianSnackbarRight()
}

@Composable
internal fun PersianSnackbarRightClose(
    customIcon: Painter? = null,
    onClick: () -> Unit
) {
    PersianTertiaryIconButton(
        icon = customIcon ?: rememberVectorPainter(image = PersianSymbols.Default.XMark),
        colors = PersianIconButtonDefaults.tertiaryIconButtonColors(
            contentColor = MaterialTheme.extendedColorScheme.onSurfaceVariant
        ),
        onClick = onClick
    )
}

@Composable
internal fun PersianSnackbarRightAction(
    text: String,
    onClick: () -> Unit
) {
    PersianTertiaryButton(
        text = text,
        sizes = PersianButtonDefaults.smallSizes(),
        onClick = onClick
    )
}