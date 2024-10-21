package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * An interface that defines the scope for the bottom section of a modal page.
 *
 * This interface extends [RowScope] and provides additional properties for colors and sizes specific to the modal page.
 *
 * @property colors The colors to be used for the modal page.
 * @property sizes The sizes to be used for the modal page.
 */
interface ModalPageBottomScope : RowScope {
    val colors: ModalPageColors
    val sizes: ModalPageSizes
}

/**
 * An internal class that wraps a [RowScope] to provide additional properties for the bottom section of a modal page.
 *
 * This class implements the [ModalPageBottomScope] interface and delegates the [RowScope] methods to the provided scope.
 *
 * @param scope The [RowScope] to be wrapped.
 * @param sizes The sizes to be used for the modal page.
 * @param colors The colors to be used for the modal page.
 */
internal class ModalPageBottomScopeWrapper(
    scope: RowScope,
    override val sizes: ModalPageSizes,
    override val colors: ModalPageColors,
) : ModalPageBottomScope, RowScope by scope

/**
 * A composable function that defines an action button within the bottom section of a modal page.
 *
 * This function creates a [PrimaryButton] with the specified text and click handler. The button's layout
 * is adjusted based on the current window size class to ensure optimal presentation on different screen sizes.
 *
 * @param modifier The modifier to be applied to the action button.
 * @param text The text to be displayed on the action button.
 * @param onClick The callback to be invoked when the action button is clicked.
 */
@Composable
fun ModalPageBottomScope.Action(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    val fillModifier =
        if (widthSizeClass == WindowWidthSizeClass.COMPACT || heightSizeClass == WindowHeightSizeClass.COMPACT)
            modifier.weight(1f)
        else modifier
    PrimaryButton(
        modifier = fillModifier,
        text = text,
        onClick = onClick,
        colors = this@Action.colors.actionColors,
        sizes = this@Action.sizes.actionSizes
    )
}

/**
 * An internal composable function that creates a row of actions for the bottom section of a modal page.
 *
 * This function arranges the actions in a row with the specified horizontal alignment and padding.
 * The layout is adjusted based on the current window size class to ensure optimal presentation on different screen sizes.
 *
 * @param modifier The modifier to be applied to the action row.
 * @param horizontalAlignment The horizontal alignment of the actions within the row.
 * @param paddingValues The padding values to be applied to the action row.
 * @param colors The colors to be used for the modal page.
 * @param sizes The sizes to be used for the modal page.
 * @param bottom An optional composable function that defines the content for the bottom section of the modal page.
 */
@Composable
internal fun ActionRow(
    modifier: Modifier = Modifier,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    paddingValues: PaddingValues,
    colors: ModalPageColors,
    sizes: ModalPageSizes,
    bottom: (@Composable ModalPageBottomScope.() -> Unit)?
) {
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    val navModifier =
        if (widthSizeClass == WindowWidthSizeClass.COMPACT || heightSizeClass == WindowHeightSizeClass.COMPACT)
            Modifier.navigationBarsPadding()
        else Modifier
    Row(
        modifier
            .fillMaxWidth()
            .padding(paddingValues)
            .then(navModifier),
        horizontalArrangement = Arrangement.spacedBy(
            PersianTheme.spacing.size12,
            horizontalAlignment
        )
    ) {
        val scope = remember(colors, sizes) {
            ModalPageBottomScopeWrapper(this, sizes, colors)
        }
        bottom?.let { scope.it() }
    }
}