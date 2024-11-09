package io.github.madmaximuus.persian.topAppBar

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * A top app bar is useful for providing users with a consistent and easily accessible navigation
 * and action interface, offering a prominent and organized space for key functionalities.
 * It offers a straightforward and effective method for enhancing user interaction and navigation,
 * making it an essential tool for improving user experience and usability.
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
) = TopAppBarImpl(
    modifier = modifier,
    title = title,
    left = left,
    right = right,
    expandedHeight = 64.0.dp,
    windowInsets = windowInsets,
    colors = colors,
    sizes = sizes,
    scrollBehavior = scrollBehavior
)