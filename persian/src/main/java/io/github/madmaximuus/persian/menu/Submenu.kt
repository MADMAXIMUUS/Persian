package io.github.madmaximuus.persian.menu

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.menu.util.DropdownMenuPositionProvider
import io.github.madmaximuus.persian.menu.util.calculateTransformOrigin
import io.github.madmaximuus.persianSymbols.arrow.left.base.ArrowLeft
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import kotlinx.coroutines.flow.filter

@Composable
fun Submenu(
    anchor: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    expanded: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onDismissRequest: () -> Unit = {},
    scrollState: ScrollState = rememberScrollState(),
    colors: MenuColors = MenuDefaults.colors(),
    sizes: MenuSizes = MenuDefaults.sizes(),
    offset: DpOffset = DpOffset(230.dp, 18.dp),
    children: @Composable DropdownMenuItemScope.() -> Unit
) {
    val expandedState = remember { MutableTransitionState(expanded) }

    val screeWidth = with(LocalConfiguration.current) { this.screenWidthDp.dp }
    val resolvedOffset = offset.copy(x = screeWidth - offset.x)

    LaunchedEffect(interactionSource) {
        interactionSource.interactions
            .filter { it is PressInteraction.Press }
            .collect {
                expandedState.targetState = !expandedState.currentState
            }
    }

    Box {
        anchor()
        Submenu(
            modifier = modifier,
            expanded = expandedState.targetState,
            offset = resolvedOffset,
            onDismissRequest = {
                onDismissRequest()
                expandedState.targetState = false
            },
            colors = colors,
            sizes = sizes,
            scrollState = scrollState,
            shadowElevation = PersianTheme.elevation.small,
            properties = PopupProperties(clippingEnabled = false),
            content = children
        )
    }
}

@Composable
internal fun Submenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier,
    offset: DpOffset,
    scrollState: ScrollState,
    properties: PopupProperties,
    shadowElevation: Dp,
    colors: MenuColors,
    sizes: MenuSizes,
    content: @Composable DropdownMenuItemScope.() -> Unit
) {
    val expandedState = remember { MutableTransitionState(expanded) }

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
                header = null,
                matchAnchorWidth = false,
                content = {
                    Column {
                        val scope = remember(colors, sizes) {
                            DropdownMenuItemScopeWrapper(this, colors.itemColors, sizes.itemSizes)
                        }
                        scope.DropdownMenuItem(
                            leadingIcon = rememberVectorPainter(image = PersianSymbols.Default.ArrowLeft),
                            text = "Back",
                            onClick = {
                                expandedState.targetState = false
                            }
                        )
                        scope.content()
                    }
                },
            )
        }
    }
}