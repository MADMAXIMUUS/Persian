package io.github.madmaximuus.persian.foundation

import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize

/**
 * Creates a [Modifier] that draws a dashed border around its content with the specified stroke width, color,
 * and corner radius.
 *
 * @param strokeWidth The width of the border stroke.
 * @param color The color of the border.
 * @param cornerRadiusDp The corner radius of the border.
 */
fun Modifier.dashedBorder(strokeWidth: Dp, color: Color, cornerRadiusDp: Dp) = composed(
    factory = {
        val density = LocalDensity.current
        val strokeWidthPx = density.run { strokeWidth.toPx() }
        val cornerRadiusPx = density.run { cornerRadiusDp.toPx() }

        this.then(
            Modifier.drawWithCache {
                onDrawBehind {
                    val stroke = Stroke(
                        width = strokeWidthPx,
                        cap = StrokeCap.Round,
                        pathEffect = PathEffect.dashPathEffect(floatArrayOf(30f, 40f), 0f)
                    )

                    drawRoundRect(
                        color = color,
                        style = stroke,
                        cornerRadius = CornerRadius(cornerRadiusPx)
                    )
                }
            }
        )
    }
)

/**
 * Creates a [Modifier] that applies a shimmer effect to its content. The shimmer effect is a gradient
 * animation that moves across the content.
 *
 * @param showShimmer Whether to show the shimmer effect.
 */
fun Modifier.shimmer(
    showShimmer: Boolean
) = composed(
    factory = {

        var size by remember {
            mutableStateOf(IntSize.Zero)
        }

        val brush = shimmerBrush(showShimmer, size)

        this.then(
            Modifier
                .drawWithContent {
                    drawContent()

                    drawRect(brush)
                }
                .onSizeChanged {
                    size = it
                }
        )
    }
)

/**
 * Creates a [Brush] for the shimmer effect. If `showShimmer` is `true`, the brush will be a linear gradient
 * with an animation that moves across the content. If `showShimmer` is `false`, the brush will be transparent.
 *
 * @param showShimmer Whether to show the shimmer effect.
 * @param size The size of the content.
 *
 */
@Composable
internal fun shimmerBrush(showShimmer: Boolean, size: IntSize): Brush {
    return if (showShimmer) {
        val shimmerColors = listOf(
            PersianTheme.colorScheme.surface,
            PersianTheme.colorScheme.surfaceContainerHighest,
            PersianTheme.colorScheme.surface,
        )
        val shimmerWidthPercentage = 0.8

        val spaceMaxWidth = size.width.toFloat()
        val spaceMaxHeight = size.height.toFloat()

        val transition = rememberInfiniteTransition(label = "Shimmer animation root")
        val translateAnimation = transition.animateFloat(
            initialValue = 0f,
            targetValue = spaceMaxWidth * (1 + shimmerWidthPercentage).toFloat(),
            animationSpec = infiniteRepeatable(
                animation = tween(
                    durationMillis = 1000,
                    easing = FastOutLinearInEasing
                ),
                repeatMode = RepeatMode.Restart
            ), label = "Shimmer animation"
        )
        Brush.linearGradient(
            colors = shimmerColors,
            start = Offset(
                translateAnimation.value -
                        (spaceMaxWidth * shimmerWidthPercentage).toFloat(), spaceMaxHeight
            ),
            end = Offset(translateAnimation.value, spaceMaxHeight)
        )

    } else {
        Brush.linearGradient(
            colors = listOf(Color.Transparent, Color.Transparent),
            start = Offset.Zero,
            end = Offset.Zero
        )
    }
}