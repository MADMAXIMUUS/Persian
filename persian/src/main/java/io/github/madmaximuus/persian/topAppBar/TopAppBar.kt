package io.github.madmaximuus.persian.topAppBar

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * A composable function that creates a top app bar with a centered title.
 *
 * This function provides a simple way to create a top app bar with a title that is centered,
 * along with optional left and right content.
 *
 * @param title The title to be displayed in the top app bar.
 * @param modifier The modifier to be applied to the top app bar.
 * @param left A composable lambda that defines the content to be displayed on the left side of the top app bar.
 * @param right A composable lambda that defines the content to be displayed on the right side of the top app bar.
 * @param windowInsets The window insets to be applied to the top app bar.
 * @param colors The colors to be used for the top app bar.
 * @param sizes The sizes to be used for the top app bar.
 * @param scrollBehavior The scroll behavior to be applied to the top app bar.
 */
@Composable
fun CenteredTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    left: (@Composable TopAppBarLeftScope.() -> Unit)? = null,
    right: (@Composable TopAppBarRightScope.() -> Unit)? = null,
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.colors(),
    sizes: TopAppBarSizes = TopAppBarDefaults.sizes(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) = SingleRowTopAppBar(
    modifier = modifier,
    title = title,
    centeredTitle = true,
    left = left,
    right = right,
    expandedHeight = 64.0.dp,
    windowInsets = windowInsets,
    colors = colors,
    sizes = sizes,
    scrollBehavior = scrollBehavior
)

/**
 * A composable function that creates a top app bar with a non-centered title.
 *
 * This function provides a simple way to create a top app bar with a title that is not centered,
 * along with optional left and right content.
 *
 * @param title The title to be displayed in the top app bar.
 * @param modifier The modifier to be applied to the top app bar.
 * @param left A composable lambda that defines the content to be displayed on the left side of the top app bar.
 * @param right A composable lambda that defines the content to be displayed on the right side of the top app bar.
 * @param windowInsets The window insets to be applied to the top app bar.
 * @param colors The colors to be used for the top app bar.
 * @param sizes The sizes to be used for the top app bar.
 * @param scrollBehavior The scroll behavior to be applied to the top app bar.
 */
@Composable
fun TopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    left: (@Composable TopAppBarLeftScope.() -> Unit)? = null,
    right: (@Composable TopAppBarRightScope.() -> Unit)? = null,
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.colors(),
    sizes: TopAppBarSizes = TopAppBarDefaults.sizes(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) = SingleRowTopAppBar(
    modifier = modifier,
    title = title,
    centeredTitle = false,
    left = left,
    right = right,
    expandedHeight = 64.0.dp,
    windowInsets = windowInsets,
    colors = colors,
    sizes = sizes,
    scrollBehavior = scrollBehavior
)