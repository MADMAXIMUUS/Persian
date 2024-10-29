package io.github.madmaximuus.persian.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.TertiaryButton
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark

interface SnackbarRightScope : RowScope {
    val snackbarData: SnackbarData
    val colors: SnackbarColors
    val sizes: SnackbarSizes
}

class SnackbarRightScopeWrapper(
    scope: RowScope,
    override val snackbarData: SnackbarData,
    override val colors: SnackbarColors,
    override val sizes: SnackbarSizes,
) : SnackbarRightScope, RowScope by scope

@Composable
fun SnackbarRightScope.Close(
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.XMark),
    onClick: (SnackbarData) -> Unit = { it.dismiss() }
) {
    Box(
        modifier = Modifier
            .padding(horizontal = PersianTheme.spacing.size4)
    ) {
        TertiaryIconButton(
            icon = icon,
            sizes = this@Close.sizes.rightCloseSizes,
            colors = IconButtonDefaults.tertiaryIconButtonColors(
                contentColor = this@Close.colors.rightCloseColor
            ),
            onClick = {
                onClick(this@Close.snackbarData)
            }
        )
    }
}

@Composable
fun SnackbarRightScope.Action(
    text: String,
    onClick: (SnackbarData) -> Unit
) {
    Box(
        modifier = Modifier.padding(horizontal = PersianTheme.spacing.size2)
    ) {
        TertiaryButton(
            text = text,
            sizes = this@Action.sizes.rightActionSizes,
            colors = ButtonDefaults.tertiaryColors(
                contentColor = this@Action.colors.rightActionColor
            ),
            onClick = {
                onClick(this@Action.snackbarData)
            }
        )
    }
}