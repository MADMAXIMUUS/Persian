package io.github.madmaximuus.persian.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.button.Button
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButton.IconButton
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.XMark

/**
 * An interface that represents the scope for a Snackbar that is aligned to the right.
 *
 * This interface extends the [RowScope] interface, which means that it can be used to compose
 * a row of composables. It provides access to the [snackbarData], [colors], and [sizes] of the
 * Snackbar.
 *
 * @property snackbarData The data for the Snackbar, such as the message and action label.
 * @property colors The colors used in the Snackbar, such as the background color and text color.
 * @property sizes The sizes used in the Snackbar, such as the padding and corner radius.
 */
interface SnackbarTrailingScope : RowScope {
    val snackbarData: SnackbarData
    val colors: SnackbarColors
    val sizes: SnackbarSizes
}

/**
 * A wrapper class that implements the [SnackbarTrailingScope] interface and delegates the [RowScope]
 * implementation to the provided [scope] parameter.
 *
 * This class is used to provide access to the [snackbarData], [colors], and [sizes] of a Snackbar
 * that is aligned to the right, while also allowing the composition of a row of composables using
 * the [RowScope] interface.
 *
 * @property scope The [RowScope] implementation to delegate to.
 * @property snackbarData The data for the Snackbar, such as the message and action label.
 * @property colors The colors used in the Snackbar, such as the background color and text color.
 * @property sizes The sizes used in the Snackbar, such as the padding and corner radius.
 */
class SnackbarTrailingScopeWrapper(
    scope: RowScope,
    override val snackbarData: SnackbarData,
    override val colors: SnackbarColors,
    override val sizes: SnackbarSizes,
) : SnackbarTrailingScope, RowScope by scope

/**
 * Displays a close button in a Snackbar that is aligned to the right.
 *
 * This function is an extension function of the [SnackbarTrailingScope] interface, which means that it
 * can be called on any instance of that interface. It takes an optional [icon] parameter, which is a
 * [Painter] that represents the icon to be displayed on the close button, and an optional [onClick]
 * parameter, which is a lambda function that is called when the close button is clicked.
 *
 * @param icon The optional [Painter] that represents the icon to be displayed on the close button.
 * @param onClick The optional lambda function that is called when the close button is clicked.
 */
@Composable
fun SnackbarTrailingScope.Close(
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.XMark),
    onClick: (SnackbarData) -> Unit = { it.dismiss() }
) {
    Box(
        modifier = Modifier.padding(end = PersianTheme.spacing.size4)
    ) {
        IconButton(
            icon = icon,
            sizes = this@Close.sizes.trailingCloseSizes,
            colors = IconButtonDefaults.tertiaryIconButtonColors(
                contentColor = this@Close.colors.trailingCloseColor
            ),
            onClick = {
                onClick(this@Close.snackbarData)
            }
        )
    }
}

/**
 * A composable function that displays an action button in a Snackbar that is aligned to the right.
 *
 * This function is an extension function of the [SnackbarTrailingScope] interface, which means that it
 * can be called on any instance of that interface. It takes a [text] parameter, which is a [String]
 * that represents the text to be displayed on the action button, and an [onClick] parameter, which
 * is a lambda function that is called when the action button is clicked.
 *
 * @param text The [String] that represents the text to be displayed on the action button.
 * @param onClick The lambda function that is called when the action button is clicked.
 */
@Composable
fun SnackbarTrailingScope.Action(
    text: String,
    onClick: (SnackbarData) -> Unit
) {
    Box(
        modifier = Modifier.padding(end = PersianTheme.spacing.size8)
    ) {
        Button(
            text = text,
            sizes = this@Action.sizes.trailingActionSizes,
            colors = ButtonDefaults.tertiaryColors(
                contentColor = this@Action.colors.trailingActionColor
            ),
            onClick = {
                onClick(this@Action.snackbarData)
            }
        )
    }
}