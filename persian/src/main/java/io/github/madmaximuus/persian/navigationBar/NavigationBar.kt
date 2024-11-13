package io.github.madmaximuus.persian.navigationBar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.surface.Surface

/**
 * Navigation bars offer a persistent and convenient way to switch between primary destinations in
 * an app.
 *
 * [NavigationBar] should contain three to five [NavigationBarItem]s, each representing a singular
 * destination.
 *
 * See [NavigationBarItem] for configuration specific to each item, and not the overall
 * [NavigationBar] component.
 *
 * @param modifier the [Modifier] to be applied to this navigation bar
 * @param windowInsets a window insets of the navigation bar.
 * @param colors a [NavigationBarColors] used for [NavigationBar]
 * @param sizes a [NavigationBarSizes] used for [NavigationBar]
 * @param content the content of this navigation bar, typically 3-5 [NavigationBarItem]s
 */
@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    windowInsets: WindowInsets = NavigationBarDefaults.windowInsets,
    colors: NavigationBarColors = NavigationBarDefaults.colors(),
    sizes: NavigationBarSizes = NavigationBarDefaults.sizes(),
    content: @Composable NavigationBarRowScope.() -> Unit
) {
    Surface(
        color = colors.backgroundColor,
        modifier = modifier,
        needClip = false
    ) {
        Row(
            modifier =
            Modifier
                .fillMaxWidth()
                .windowInsetsPadding(windowInsets)
                .defaultMinSize(minHeight = NavigationBarHeight)
                .selectableGroup(),
            horizontalArrangement = Arrangement.spacedBy(NavigationBarItemHorizontalPadding),
            verticalAlignment = Alignment.CenterVertically,
            content = {
                val scope =
                    remember(sizes, colors) {
                        NavigationBarScopeWrapper(
                            this,
                            sizes,
                            colors.itemColors
                        )
                    }
                scope.content()
            }
        )
    }
}

internal val NavigationBarHeight = 76.dp

internal val NavigationBarItemHorizontalPadding: Dp = 8.dp

internal const val IndicatorRippleLayoutIdTag: String = "indicatorRipple"

internal const val IndicatorLayoutIdTag: String = "indicator"

internal const val IconLayoutIdTag: String = "icon"

internal const val LabelLayoutIdTag: String = "label"

internal const val ItemAnimationDurationMillis: Int = 100

/*@VisibleForTesting*/
internal val NavigationBarIndicatorToLabelPadding: Dp = 4.dp

internal val IndicatorHorizontalPadding: Dp = 40.dp / 2

/*@VisibleForTesting*/
internal val IndicatorVerticalPadding: Dp = 8.dp / 2

internal val IndicatorVerticalOffset: Dp = 12.dp
