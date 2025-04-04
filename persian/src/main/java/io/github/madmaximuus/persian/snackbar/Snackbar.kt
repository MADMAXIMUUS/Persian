package io.github.madmaximuus.persian.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

/**
 * A composable function to display a Snackbar with customizable data, modifiers, colors, and sizes.
 *
 * @param snackbarData The data containing visuals and other information for the Snackbar.
 * @param modifier The modifier to be applied to the Snackbar.
 * @param colors The color scheme for the Snackbar.
 * @param sizes The size scheme for the Snackbar.
 */
@Composable
fun Snackbar(
    snackbarData: SnackbarData,
    modifier: Modifier = Modifier,
    colors: SnackbarColors = SnackbarDefaults.colors(),
    sizes: SnackbarSizes = SnackbarDefaults.sizes(),
) {
    Surface(
        modifier = modifier
            .padding(horizontal = PersianTheme.spacing.size16)
            .widthIn(max = 500.dp)
            .fillMaxWidth()
            .heightIn(min = 52.dp)
            .imePadding(),
        shape = sizes.containerShape,
        color = colors.containerColor,
        content = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 52.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                val leftScope = remember(colors, sizes) {
                    SnackbarLeadingScopeWrapper(
                        scope = this,
                        snackbarData = snackbarData,
                        sizes = sizes,
                        colors = colors
                    )
                }
                snackbarData.visuals.left?.let { leftScope.it() }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = PersianTheme.spacing.size12),
                        text = snackbarData.visuals.message,
                        style = sizes.messageTextStyle,
                        color = colors.messageColor
                    )
                }
                val rightScope = remember(colors, sizes) {
                    SnackbarTrailingScopeWrapper(
                        scope = this,
                        snackbarData = snackbarData,
                        sizes = sizes,
                        colors = colors
                    )
                }
                snackbarData.visuals.right?.let { rightScope.it() }
            }
        }
    )
}