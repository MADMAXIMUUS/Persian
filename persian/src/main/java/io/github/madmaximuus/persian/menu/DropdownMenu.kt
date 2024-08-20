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
                content = content,
            )
        }
    }
}


// Size defaults.
internal val MenuVerticalMargin = 48.dp
internal val DropdownMenuItemHorizontalPadding = 12.dp