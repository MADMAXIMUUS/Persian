package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.modalPage.util.LayoutId
import io.github.madmaximuus.persian.topAppBar.TopAppBar
import io.github.madmaximuus.persian.topAppBar.TopAppBarLeadingScope
import io.github.madmaximuus.persian.topAppBar.TopAppBarScrollBehavior
import io.github.madmaximuus.persian.topAppBar.TopAppBarTrailingScope

/**
 * An interface that defines the scope for the top section of a modal page.
 *
 * This interface provides properties for colors, sizes, and a dismiss callback specific to the modal page.
 *
 * @property colors The colors to be used for the modal page.
 * @property sizes The sizes to be used for the modal page.
 */
interface ModalPageTopScope {
    val colors: ModalPageColors
    val sizes: ModalPageSizes
}

/**
 * An internal class that implements the [ModalPageTopScope] interface.
 *
 * This class provides the necessary properties for the top section of a modal page, including colors, sizes, and a dismiss callback.
 *
 * @param sizes The sizes to be used for the modal page.
 * @param colors The colors to be used for the modal page.
 */
internal class ModalPageTopScopeWrapper(
    override val sizes: ModalPageSizes,
    override val colors: ModalPageColors,
) : ModalPageTopScope

/**
 * A composable function that defines the top bar for a modal page.
 *
 * This function creates a [TopAppBar] with a title, a dismiss icon button on the left, and an action button on the right.
 *
 * @param title The title to be displayed in the top bar.
 */
@Composable
fun ModalPageTopScope.TopBar(
    title: String,
    modifier: Modifier = Modifier,
    counterValue: Int = 0,
    leading: (@Composable TopAppBarLeadingScope.() -> Unit)? = null,
    trailing: (@Composable TopAppBarTrailingScope.() -> Unit)? = null,
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    TopAppBar(
        modifier = Modifier
            .layoutId(LayoutId.TOP_BAR)
            .then(modifier),
        colors = colors.topAppBarColors,
        sizes = sizes.topAppBarSizes,
        windowInsets = WindowInsets(0, 0, 0, 0),
        counterValue = counterValue,
        leading = leading,
        title = title,
        trailing = trailing,
        scrollBehavior = scrollBehavior
    )
}

/**
 * A composable function that defines a drag handle for a modal page.
 *
 * This function creates a draggable handle that is displayed only when the window size class is compact.
 * The handle is centered within a box and styled according to the provided sizes and colors.
 */
@Composable
internal fun ModalPageTopScope.Handle() {
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    if (widthSizeClass == WindowWidthSizeClass.COMPACT || heightSizeClass == WindowHeightSizeClass.COMPACT) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = PersianTheme.spacing.size16),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(this@Handle.sizes.dragHandleSizes)
                    .background(this@Handle.colors.dragHandleColor, PersianTheme.shapes.full)
            )
        }
    }
}