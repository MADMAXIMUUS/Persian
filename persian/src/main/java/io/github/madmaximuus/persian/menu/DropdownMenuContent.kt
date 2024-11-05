package io.github.madmaximuus.persian.menu

import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.surface.Surface

@Composable
internal fun DropdownMenuContent(
    modifier: Modifier,
    matchAnchorWidth: Boolean,
    expandedState: MutableTransitionState<Boolean>,
    transformOriginState: MutableState<TransformOrigin>,
    scrollState: ScrollState,
    shadowElevation: Dp,
    colors: MenuColors,
    sizes: MenuSizes,
    header: (@Composable DropdownMenuHeaderScope.() -> Unit)?,
    content: @Composable DropdownMenuItemScope.() -> Unit
) {
    // Menu open/close animation.
    @Suppress("DEPRECATION") val transition = updateTransition(expandedState, "DropDownMenu")

    val scale by transition.animateFloat(
        transitionSpec = {
            if (false isTransitioningTo true) {
                // Dismissed to expanded
                tween(durationMillis = InTransitionDuration, easing = LinearOutSlowInEasing)
            } else {
                // Expanded to dismissed.
                tween(durationMillis = 1, delayMillis = OutTransitionDuration - 1)
            }
        },
        label = ""
    ) { expanded ->
        if (expanded) ExpandedScaleTarget else ClosedScaleTarget
    }

    val alpha by transition.animateFloat(
        transitionSpec = {
            if (false isTransitioningTo true) {
                // Dismissed to expanded
                tween(durationMillis = 30)
            } else {
                // Expanded to dismissed.
                tween(durationMillis = OutTransitionDuration)
            }
        },
        label = ""
    ) { expanded ->
        if (expanded) ExpandedAlphaTarget else ClosedAlphaTarget
    }
    val widthModifier = if (!matchAnchorWidth) Modifier.width(220.dp) else Modifier

    val isInspecting = LocalInspectionMode.current
    Surface(
        modifier = modifier
            .graphicsLayer {
                scaleX =
                    if (!isInspecting) scale
                    else if (expandedState.targetState) ExpandedScaleTarget
                    else ClosedScaleTarget
                scaleY =
                    if (!isInspecting) scale
                    else if (expandedState.targetState) ExpandedScaleTarget
                    else ClosedScaleTarget
                this.alpha =
                    if (!isInspecting) alpha
                    else if (expandedState.targetState) ExpandedAlphaTarget
                    else ClosedAlphaTarget
                transformOrigin = transformOriginState.value
            }
            .then(widthModifier),
        shape = sizes.containerShape,
        color = colors.containerColor,
        shadowElevation = shadowElevation,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(scrollState),
            content = {
                val scope = remember(colors, sizes) {
                    DropdownMenuItemScopeWrapper(
                        this,
                        colors = colors.itemColors,
                        sizes = sizes.itemSizes
                    )
                }
                if (header != null) {
                    val headerScope = remember {
                        DropdownMenuHeaderScopeWrapper(this)
                    }
                    headerScope.header()
                    scope.GroupDivider()
                }
                scope.content()
            }
        )
    }
}

// Menu open/close animation.
internal const val InTransitionDuration = 120
internal const val OutTransitionDuration = 75
internal const val ExpandedScaleTarget = 1f
internal const val ClosedScaleTarget = 0.8f
internal const val ExpandedAlphaTarget = 1f
internal const val ClosedAlphaTarget = 0f