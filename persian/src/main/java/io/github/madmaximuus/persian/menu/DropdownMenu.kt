package io.github.madmaximuus.persian.menu

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.menu.util.DropdownMenuPositionProvider
import io.github.madmaximuus.persian.menu.util.calculateTransformOrigin
import kotlinx.coroutines.flow.filter

/**
 * Composable function to create a dropdown menu.
 *
 * This function provides a way to define a dropdown menu with various customization options, including an anchor,
 * modifier, expanded state, interaction source, dismiss request callback, scroll state, colors, sizes, offset,
 * header, and children content.
 *
 * @param anchor The composable content that serves as the anchor for the dropdown menu.
 * @param modifier The modifier to be applied to the dropdown menu. Default is [Modifier].
 * @param expanded Whether the dropdown menu is initially expanded. Default is `false`.
 * @param interactionSource The interaction source to be used for the dropdown menu. Default is a remembered [MutableInteractionSource].
 * @param onDismissRequest The callback to be invoked when the dropdown menu is dismissed. Default is an empty function.
 * @param scrollState The scroll state to be used for the dropdown menu. Default is a remembered [ScrollState].
 * @param colors The colors to be used for the dropdown menu. Default is [MenuDefaults.colors].
 * @param sizes The sizes to be used for the dropdown menu. Default is [MenuDefaults.sizes].
 * @param offset The offset to be applied to the dropdown menu. Default is [DpOffset((-8).dp, (-40).dp)].
 * @param header The optional composable content to be displayed as the header of the dropdown menu.
 * @param children The composable content to be displayed within the dropdown menu.
 */
@Composable
fun DropdownMenu(
    anchor: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    expanded: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onDismissRequest: () -> Unit = {},
    scrollState: ScrollState = rememberScrollState(),
    colors: MenuColors = MenuDefaults.colors(),
    sizes: MenuSizes = MenuDefaults.sizes(),
    offset: DpOffset = DpOffset((-8).dp, (-40).dp),
    header: (@Composable DropdownMenuHeaderScope.() -> Unit)? = null,
    children: @Composable DropdownMenuItemScope.() -> Unit
) {
    val expandedState = remember { MutableTransitionState(false) }
    expandedState.targetState = expanded

    LaunchedEffect(interactionSource) {
        interactionSource.interactions
            .filter { it is PressInteraction.Press }
            .collect {
                expandedState.targetState = !expandedState.currentState
            }
    }

    Box {
        anchor()
        DropdownMenu(
            modifier = modifier,
            expanded = expandedState.targetState,
            offset = offset,
            onDismissRequest = {
                onDismissRequest()
                expandedState.targetState = false
            },
            colors = colors,
            sizes = sizes,
            scrollState = scrollState,
            shadowElevation = PersianTheme.elevation.small,
            properties = PopupProperties(clippingEnabled = false),
            header = header,
            content = children
        )
    }
}

/**
 * Composable function to create a dropdown menu.
 *
 * This function provides a way to define a dropdown menu with various customization options, including expanded state,
 * dismiss request callback, modifier, offset, scroll state, popup properties, shadow elevation, colors, sizes,
 * header, and content.
 *
 * @param expanded Whether the dropdown menu is expanded.
 * @param onDismissRequest The callback to be invoked when the dropdown menu is dismissed.
 * @param modifier The modifier to be applied to the dropdown menu.
 * @param offset The offset to be applied to the dropdown menu.
 * @param scrollState The scroll state to be used for the dropdown menu.
 * @param properties The popup properties to be used for the dropdown menu.
 * @param shadowElevation The shadow elevation to be applied to the dropdown menu.
 * @param colors The colors to be used for the dropdown menu.
 * @param sizes The sizes to be used for the dropdown menu.
 * @param header The optional composable content to be displayed as the header of the dropdown menu.
 * @param content The composable content to be displayed within the dropdown menu.
 */
@Composable
fun DropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    offset: DpOffset = DpOffset.Zero,
    scrollState: ScrollState = rememberScrollState(),
    properties: PopupProperties = PopupProperties(),
    shadowElevation: Dp = PersianTheme.elevation.large,
    colors: MenuColors = MenuDefaults.colors(),
    sizes: MenuSizes = MenuDefaults.sizes(),
    header: (@Composable DropdownMenuHeaderScope.() -> Unit)? = null,
    content: @Composable DropdownMenuItemScope.() -> Unit
) {
    val expandedState = remember { MutableTransitionState(false) }
    expandedState.targetState = expanded

    if (expandedState.currentState || expandedState.targetState) {
        val transformOriginState = remember { mutableStateOf(TransformOrigin.Center) }
        val density = LocalDensity.current
        val popupPositionProvider =
            remember(offset, density) {
                DropdownMenuPositionProvider(offset, density) { parentBounds, menuBounds ->
                    transformOriginState.value = calculateTransformOrigin(parentBounds, menuBounds)
                }
            }

        Popup(
            onDismissRequest = onDismissRequest,
            popupPositionProvider = popupPositionProvider,
            properties = properties
        ) {
            DropdownMenuContent(
                expandedState = expandedState,
                transformOriginState = transformOriginState,
                scrollState = scrollState,
                shadowElevation = shadowElevation,
                modifier = modifier,
                colors = colors,
                sizes = sizes,
                header = header,
                matchAnchorWidth = false,
                content = content,
            )
        }
    }
}

// Size defaults.
internal val MenuVerticalMargin = 48.dp
internal val DropdownMenuItemHorizontalPadding = 12.dp