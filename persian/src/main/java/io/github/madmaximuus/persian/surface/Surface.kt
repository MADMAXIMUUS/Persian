package io.github.madmaximuus.persian.surface

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.isContainer
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.ColorScheme
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.contentColorFor
import io.github.madmaximuus.persian.foundation.minimumInteractiveComponentSize
import io.github.madmaximuus.persian.iconBox.Icon
import io.github.madmaximuus.persian.text.Text
import kotlin.math.ln

/**
 * Material surface is the central metaphor in material design. Each surface exists at a given
 * elevation, which influences how that piece of surface visually relates to other surfaces and how
 * that surface is modified by tonal variance.
 *
 * See the other overloads for clickable, selectable, and toggleable surfaces.
 *
 * The Surface is responsible for:
 *
 * 1) Clipping: Surface clips its children to the shape specified by [shape]
 *
 * 2) Borders: If [shape] has a border, then it will also be drawn.
 *
 * 3) Background: Surface fills the shape specified by [shape] with the [color]. If [color] is
 * [ColorScheme.surface] a color overlay will be applied. The color of the overlay depends on the
 * [tonalElevation] of this Surface, and the [LocalAbsoluteTonalElevation] set by any parent
 * surfaces. This ensures that a Surface never appears to have a lower elevation overlay than its
 * ancestors, by summing the elevation of all previous Surfaces.
 *
 * 4) Content color: Surface uses [contentColor] to specify a preferred color for the content of
 * this surface - this is used by the [Text] and [Icon] components as a default color.
 *
 * If no [contentColor] is set, this surface will try and match its background color to a color
 * defined in the theme [ColorScheme], and return the corresponding content color. For example, if
 * the [color] of this surface is [ColorScheme.surface], [contentColor] will be set to
 * [ColorScheme.onSurface]. If [color] is not part of the theme palette, [contentColor] will keep
 * the same value set above this Surface.
 *
 * To manually retrieve the content color inside a surface, use [LocalContentColor].
 *
 * 5) Blocking touch propagation behind the surface.
 *
 * @param modifier Modifier to be applied to the layout corresponding to the surface
 * @param shape Defines the surface's shape as well its shadow.
 * @param color The background color. Use [Color.Transparent] to have no color.
 * @param contentColor The preferred content color provided by this Surface to its children.
 * Defaults to either the matching content color for [color], or if [color] is not a color from the
 * theme, this will keep the same value set above this Surface.
 * @param tonalElevation When [color] is [ColorScheme.surface], a higher the elevation will result
 * in a darker color in light theme and lighter color in dark theme.
 * @param shadowElevation The size of the shadow below the surface. To prevent shadow creep, only
 * apply shadow elevation when absolutely necessary, such as when the surface requires visual
 * separation from a patterned background. Note that It will not affect z index of the Surface.
 * If you want to change the drawing order you can use `Modifier.zIndex`.
 * @param border Optional border to draw on top of the surface
 */
@Composable
@NonRestartableComposable
fun Surface(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    color: Color = PersianTheme.colorScheme.surface,
    contentColor: Color = contentColorFor(color),
    tonalElevation: Dp = 0.dp,
    shadowElevation: Dp = 0.dp,
    border: BorderStroke? = null,
    content: @Composable () -> Unit
) {
    val absoluteElevation = LocalAbsoluteTonalElevation.current + tonalElevation
    CompositionLocalProvider(
        androidx.compose.material3.LocalContentColor provides contentColor,
        LocalAbsoluteTonalElevation provides absoluteElevation
    ) {
        Box(
            modifier = modifier
                .surface(
                    shape = shape,
                    backgroundColor = surfaceColorAtElevation(
                        color = color,
                        elevation = absoluteElevation
                    ),
                    border = border,
                    shadowElevation = with(LocalDensity.current) { shadowElevation.toPx() }
                )
                .semantics(mergeDescendants = false) {
                    @Suppress("DEPRECATION")
                    isContainer = true
                }
                .pointerInput(Unit) {},
            propagateMinConstraints = true
        ) {
            content()
        }
    }
}

/**
 * Material surface is the central metaphor in material design. Each surface exists at a given
 * elevation, which influences how that piece of surface visually relates to other surfaces and how
 * that surface is modified by tonal variance.
 *
 * This version of Surface is responsible for a click handling as well as everything else that a
 * regular Surface does:
 *
 * This clickable Surface is responsible for:
 *
 * 1) Clipping: Surface clips its children to the shape specified by [shape]
 *
 * 2) Borders: If [shape] has a border, then it will also be drawn.
 *
 * 3) Background: Surface fills the shape specified by [shape] with the [color]. If [color] is
 * [ColorScheme.surface] a color overlay may be applied. The color of the overlay depends on the
 * [tonalElevation] of this Surface, and the [LocalAbsoluteTonalElevation] set by any
 * parent surfaces. This ensures that a Surface never appears to have a lower elevation overlay than
 * its ancestors, by summing the elevation of all previous Surfaces.
 *
 * 4) Content color: Surface uses [contentColor] to specify a preferred color for the content of
 * this surface - this is used by the [Text] and [Icon] components as a default color. If no
 * [contentColor] is set, this surface will try and match its background color to a color defined in
 * the theme [ColorScheme], and return the corresponding content color. For example, if the [color]
 * of this surface is [ColorScheme.surface], [contentColor] will be set to [ColorScheme.onSurface].
 * If [color] is not part of the theme palette, [contentColor] will keep the same value set above
 * this Surface.
 *
 * 5) Click handling. This version of surface will react to the clicks, calling [onClick] lambda,
 * updating the [interactionSource] when [PressInteraction] occurs, and showing ripple indication in
 * response to press events. If you don't need click handling, consider using the Surface function
 * that doesn't require [onClick] param. If you need to set a custom label for the [onClick], apply
 * a `Modifier.semantics { onClick(label = "YOUR_LABEL", action = null) }` to the Surface.
 *
 * 6) Semantics for clicks. Just like with [Modifier.clickable], clickable version of Surface will
 * produce semantics to indicate that it is clicked. No semantic role is set by default, you
 * may specify one by passing a desired [Role] with a [Modifier.semantics].
 *
 * To manually retrieve the content color inside a surface, use [LocalContentColor].
 *
 * @param onClick callback to be called when the surface is clicked
 * @param modifier Modifier to be applied to the layout corresponding to the surface
 * @param enabled Controls the enabled state of the surface. When `false`, this surface will not be
 * clickable
 * @param shape Defines the surface's shape as well its shadow. A shadow is only displayed if the
 * [tonalElevation] is greater than zero.
 * @param color The background color. Use [Color.Transparent] to have no color.
 * @param contentColor The preferred content color provided by this Surface to its children.
 * Defaults to either the matching content color for [color], or if [color] is not a color from the
 * theme, this will keep the same value set above this Surface.
 * @param border Optional border to draw on top of the surface
 * @param tonalElevation When [color] is [ColorScheme.surface], a higher the elevation will result
 * in a darker color in light theme and lighter color in dark theme.
 * @param shadowElevation The size of the shadow below the surface. Note that It will not affect z
 * index of the Surface. If you want to change the drawing order you can use `Modifier.zIndex`.
 * @param interactionSource the [MutableInteractionSource] representing the stream of [Interaction]s
 * for this Surface. You can create and pass in your own remembered [MutableInteractionSource] if
 * you want to observe [Interaction]s and customize the appearance / behavior of this Surface in
 * different [Interaction]s.
 */
@Composable
@NonRestartableComposable
fun Surface(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RectangleShape,
    color: Color = PersianTheme.colorScheme.surface,
    contentColor: Color = contentColorFor(color),
    tonalElevation: Dp = 0.dp,
    shadowElevation: Dp = 0.dp,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    val absoluteElevation = LocalAbsoluteTonalElevation.current + tonalElevation
    CompositionLocalProvider(
        androidx.compose.material3.LocalContentColor provides contentColor,
        LocalAbsoluteTonalElevation provides absoluteElevation
    ) {
        @Suppress("DEPRECATION_ERROR")
        Box(
            modifier = modifier
                .minimumInteractiveComponentSize()
                .surface(
                    shape = shape,
                    backgroundColor = surfaceColorAtElevation(
                        color = color,
                        elevation = absoluteElevation
                    ),
                    border = border,
                    shadowElevation = with(LocalDensity.current) { shadowElevation.toPx() }
                )
                .clickable(
                    interactionSource = interactionSource,
                    indication = androidx.compose.material.ripple.rememberRipple(),
                    enabled = enabled,
                    onClick = onClick
                ),
            propagateMinConstraints = true
        ) {
            content()
        }
    }
}

/**
 * Material surface is the central metaphor in material design. Each surface exists at a given
 * elevation, which influences how that piece of surface visually relates to other surfaces and how
 * that surface is modified by tonal variance.
 *
 * This version of Surface is responsible for a selection handling as well as everything else that
 * a regular Surface does:
 *
 * This selectable Surface is responsible for:
 *
 * 1) Clipping: Surface clips its children to the shape specified by [shape]
 *
 * 2) Borders: If [shape] has a border, then it will also be drawn.
 *
 * 3) Background: Surface fills the shape specified by [shape] with the [color]. If [color] is
 * [ColorScheme.surface] a color overlay may be applied. The color of the overlay depends on the
 * [tonalElevation] of this Surface, and the [LocalAbsoluteTonalElevation] set by any
 * parent surfaces. This ensures that a Surface never appears to have a lower elevation overlay than
 * its ancestors, by summing the elevation of all previous Surfaces.
 *
 * 4) Content color: Surface uses [contentColor] to specify a preferred color for the content of
 * this surface - this is used by the [Text] and [Icon] components as a default color. If no
 * [contentColor] is set, this surface will try and match its background color to a color defined in
 * the theme [ColorScheme], and return the corresponding content color. For example, if the [color]
 * of this surface is [ColorScheme.surface], [contentColor] will be set to [ColorScheme.onSurface].
 * If [color] is not part of the theme palette, [contentColor] will keep the same value set above
 * this Surface.
 *
 * 5) Click handling. This version of surface will react to the clicks, calling [onClick] lambda,
 * updating the [interactionSource] when [PressInteraction] occurs, and showing ripple indication in
 * response to press events. If you don't need click handling, consider using the Surface function
 * that doesn't require [onClick] param.
 *
 * 6) Semantics for selection. Just like with [Modifier.selectable], selectable version of Surface
 * will produce semantics to indicate that it is selected. No semantic role is set by default, you
 * may specify one by passing a desired [Role] with a [Modifier.semantics].
 *
 * To manually retrieve the content color inside a surface, use [LocalContentColor].
 *
 * @param selected whether or not this Surface is selected
 * @param onClick callback to be called when the surface is clicked
 * @param modifier Modifier to be applied to the layout corresponding to the surface
 * @param enabled Controls the enabled state of the surface. When `false`, this surface will not be
 * clickable
 * @param shape Defines the surface's shape as well its shadow. A shadow is only displayed if the
 * [tonalElevation] is greater than zero.
 * @param color The background color. Use [Color.Transparent] to have no color.
 * @param contentColor The preferred content color provided by this Surface to its children.
 * Defaults to either the matching content color for [color], or if [color] is not a color from the
 * theme, this will keep the same value set above this Surface.
 * @param border Optional border to draw on top of the surface
 * @param tonalElevation When [color] is [ColorScheme.surface], a higher the elevation will result
 * in a darker color in light theme and lighter color in dark theme.
 * @param shadowElevation The size of the shadow below the surface. Note that It will not affect z
 * index of the Surface. If you want to change the drawing order you can use `Modifier.zIndex`.
 * @param interactionSource the [MutableInteractionSource] representing the stream of [Interaction]s
 * for this Surface. You can create and pass in your own remembered [MutableInteractionSource] if
 * you want to observe [Interaction]s and customize the appearance / behavior of this Surface in
 * different [Interaction]s.
 */
@Composable
@NonRestartableComposable
fun Surface(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RectangleShape,
    color: Color = PersianTheme.colorScheme.surface,
    contentColor: Color = contentColorFor(color),
    tonalElevation: Dp = 0.dp,
    shadowElevation: Dp = 0.dp,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    val absoluteElevation = LocalAbsoluteTonalElevation.current + tonalElevation
    CompositionLocalProvider(
        androidx.compose.material3.LocalContentColor provides contentColor,
        LocalAbsoluteTonalElevation provides absoluteElevation
    ) {
        @Suppress("DEPRECATION_ERROR")
        Box(
            modifier = modifier
                .minimumInteractiveComponentSize()
                .surface(
                    shape = shape,
                    backgroundColor = surfaceColorAtElevation(
                        color = color,
                        elevation = absoluteElevation
                    ),
                    border = border,
                    shadowElevation = with(LocalDensity.current) { shadowElevation.toPx() }
                )
                .selectable(
                    selected = selected,
                    interactionSource = interactionSource,
                    indication = rememberRipple(),
                    enabled = enabled,
                    onClick = onClick
                ),
            propagateMinConstraints = true
        ) {
            content()
        }
    }
}

/**
 * Material surface is the central metaphor in material design. Each surface exists at a given
 * elevation, which influences how that piece of surface visually relates to other surfaces and how
 * that surface is modified by tonal variance.
 *
 * This version of Surface is responsible for a toggling its checked state as well as everything
 * else that a regular Surface does:
 *
 * This toggleable Surface is responsible for:
 *
 * 1) Clipping: Surface clips its children to the shape specified by [shape]
 *
 * 2) Borders: If [shape] has a border, then it will also be drawn.
 *
 * 3) Background: Surface fills the shape specified by [shape] with the [color]. If [color] is
 * [ColorScheme.surface] a color overlay may be applied. The color of the overlay depends on the
 * [tonalElevation] of this Surface, and the [LocalAbsoluteTonalElevation] set by any
 * parent surfaces. This ensures that a Surface never appears to have a lower elevation overlay than
 * its ancestors, by summing the elevation of all previous Surfaces.
 *
 * 4) Content color: Surface uses [contentColor] to specify a preferred color for the content of
 * this surface - this is used by the [Text] and [Icon] components as a default color. If no
 * [contentColor] is set, this surface will try and match its background color to a color defined in
 * the theme [ColorScheme], and return the corresponding content color. For example, if the [color]
 * of this surface is [ColorScheme.surface], [contentColor] will be set to [ColorScheme.onSurface].
 * If [color] is not part of the theme palette, [contentColor] will keep the same value set above
 * this Surface.
 *
 * 5) Click handling. This version of surface will react to the check toggles, calling
 * [onCheckedChange] lambda, updating the [interactionSource] when [PressInteraction] occurs, and
 * showing ripple indication in response to press events. If you don't need check
 * handling, consider using a Surface function that doesn't require [onCheckedChange] param.
 *
 * 6) Semantics for toggle. Just like with [Modifier.toggleable], toggleable version of Surface
 * will produce semantics to indicate that it is checked.  No semantic role is set by default, you
 * may specify one by passing a desired [Role] with a [Modifier.semantics].
 *
 * To manually retrieve the content color inside a surface, use [LocalContentColor].
 *
 * @param checked whether or not this Surface is toggled on or off
 * @param onCheckedChange callback to be invoked when the toggleable Surface is clicked
 * @param modifier Modifier to be applied to the layout corresponding to the surface
 * @param enabled Controls the enabled state of the surface. When `false`, this surface will not be
 * clickable
 * @param shape Defines the surface's shape as well its shadow. A shadow is only displayed if the
 * [tonalElevation] is greater than zero.
 * @param color The background color. Use [Color.Transparent] to have no color.
 * @param contentColor The preferred content color provided by this Surface to its children.
 * Defaults to either the matching content color for [color], or if [color] is not a color from the
 * theme, this will keep the same value set above this Surface.
 * @param border Optional border to draw on top of the surface
 * @param tonalElevation When [color] is [ColorScheme.surface], a higher the elevation will result
 * in a darker color in light theme and lighter color in dark theme.
 * @param shadowElevation The size of the shadow below the surface. Note that It will not affect z
 * index of the Surface. If you want to change the drawing order you can use `Modifier.zIndex`.
 * @param interactionSource the [MutableInteractionSource] representing the stream of [Interaction]s
 * for this Surface. You can create and pass in your own remembered [MutableInteractionSource] if
 * you want to observe [Interaction]s and customize the appearance / behavior of this Surface in
 * different [Interaction]s.
 */
@Composable
@NonRestartableComposable
fun Surface(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RectangleShape,
    color: Color = PersianTheme.colorScheme.surface,
    contentColor: Color = contentColorFor(color),
    tonalElevation: Dp = 0.dp,
    shadowElevation: Dp = 0.dp,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    val absoluteElevation = LocalAbsoluteTonalElevation.current + tonalElevation
    CompositionLocalProvider(
        androidx.compose.material3.LocalContentColor provides contentColor,
        LocalAbsoluteTonalElevation provides absoluteElevation
    ) {
        @Suppress("DEPRECATION_ERROR")
        Box(
            modifier = modifier
                .minimumInteractiveComponentSize()
                .surface(
                    shape = shape,
                    backgroundColor = surfaceColorAtElevation(
                        color = color,
                        elevation = absoluteElevation
                    ),
                    border = border,
                    shadowElevation = with(LocalDensity.current) { shadowElevation.toPx() }
                )
                .toggleable(
                    value = checked,
                    interactionSource = interactionSource,
                    indication = rememberRipple(),
                    enabled = enabled,
                    onValueChange = onCheckedChange
                ),
            propagateMinConstraints = true
        ) {
            content()
        }
    }
}

@Stable
private fun Modifier.surface(
    shape: Shape,
    backgroundColor: Color,
    border: BorderStroke?,
    shadowElevation: Float,
) = this
    .graphicsLayer(shadowElevation = shadowElevation, shape = shape, clip = false)
    .then(if (border != null) Modifier.border(border, shape) else Modifier)
    .background(color = backgroundColor, shape = shape)
    .clip(shape)

@Composable
private fun surfaceColorAtElevation(color: Color, elevation: Dp): Color =
    PersianTheme.colorScheme.applyTonalElevation(color, elevation)

/**
 * Returns [ColorScheme.surfaceColorAtElevation] with the provided elevation if
 * the provided background color matches [ColorScheme.surface].
 * Otherwise, the provided color is returned unchanged.
 *
 * @param backgroundColor The background color to compare to [ColorScheme.surface]
 * @param elevation The elevation provided to [ColorScheme.surfaceColorAtElevation] if
 * [backgroundColor] matches surface.
 *
 * @return [ColorScheme.surfaceColorAtElevation] at [elevation] if [backgroundColor] ==
 * [ColorScheme.surface]. Else [backgroundColor]
 */
@Composable
@ReadOnlyComposable
internal fun ColorScheme.applyTonalElevation(backgroundColor: Color, elevation: Dp): Color {
    return if (backgroundColor == surface) {
        surfaceColorAtElevation(elevation)
    } else {
        backgroundColor
    }
}

/**
 * Computes the surface tonal color at different elevation levels e.g. surface1 through surface5.
 *
 * @param elevation Elevation value used to compute alpha of the color overlay layer.
 *
 * @return the [ColorScheme.surface] color with an alpha of the [ColorScheme.surfaceTint] color
 * overlaid on top of it.
 */
@Stable
fun ColorScheme.surfaceColorAtElevation(
    elevation: Dp,
): Color {
    if (elevation == 0.dp) return surface
    val alpha = ((4.5f * ln(elevation.value + 1)) + 2f) / 100f
    return surfaceTint.copy(alpha = alpha).compositeOver(surface)
}

/**
 * CompositionLocal containing the current absolute elevation provided by [Surface] components. This
 * absolute elevation is a sum of all the previous elevations. Absolute elevation is only used for
 * calculating surface tonal colors, and is *not* used for drawing the shadow in a [Surface].
 */
val LocalAbsoluteTonalElevation = compositionLocalOf { 0.dp }