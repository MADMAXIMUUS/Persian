package io.github.madmaximuus.persian.topAppBar

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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