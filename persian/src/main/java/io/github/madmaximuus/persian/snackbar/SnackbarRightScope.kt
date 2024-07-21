package io.github.madmaximuus.persian.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.button.PersianButtonDefaults
import io.github.madmaximuus.persian.button.TertiaryButton
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark


@Stable
class SnackbarRightScope(
    private val snackbarData: SnackbarData
) {

    @Composable
    fun Close(
        customIcon: Painter? = null,
        onClick: (SnackbarData) -> Unit = { it.dismiss() }
    ) {
        Box(
            modifier = Modifier.padding(horizontal = PersianTheme.spacing.size4)
        ) {
            TertiaryIconButton(
                icon = customIcon ?: rememberVectorPainter(image = PersianSymbols.Default.XMark),
                colors = IconButtonDefaults.tertiaryIconButtonColors(
                    contentColor = PersianTheme.colorScheme.onSurfaceVariant
                ),
                onClick = {
                    onClick(snackbarData)
                }
            )
        }
    }

    @Composable
    fun Action(
        text: String,
        onClick: (SnackbarData) -> Unit
    ) {
        Box(
            modifier = Modifier.padding(horizontal = PersianTheme.spacing.size2)
        ) {
            TertiaryButton(
                text = text,
                sizes = PersianButtonDefaults.smallSizes(),
                onClick = {
                    onClick(snackbarData)
                }
            )
        }
    }
}