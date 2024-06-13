package io.github.madmaximuus.persian.foundation

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Elevation(
    val none: Dp = 0.dp,
    val extraSmall: Dp = 1.dp,
    val small: Dp = 3.dp,
    val medium: Dp = 6.dp,
    val large: Dp = 8.dp,
    val extraLarge: Dp = 12.dp
)

val LocalElevation = staticCompositionLocalOf { Elevation() }

internal suspend fun Animatable<Dp, *>.animateElevation(
    target: Dp,
    from: Interaction? = null,
    to: Interaction? = null
) {
    val spec = when {
        to != null -> ElevationDefaults.incomingAnimationSpecForInteraction(to)
        from != null -> ElevationDefaults.outgoingAnimationSpecForInteraction(from)
        else -> null
    }
    if (spec != null) animateTo(target, spec) else snapTo(target)
}

private object ElevationDefaults {

    fun incomingAnimationSpecForInteraction(interaction: Interaction): AnimationSpec<Dp>? {
        return when (interaction) {
            is PressInteraction.Press -> DefaultIncomingSpec
            is DragInteraction.Start -> DefaultIncomingSpec
            is HoverInteraction.Enter -> DefaultIncomingSpec
            is FocusInteraction.Focus -> DefaultIncomingSpec
            else -> null
        }
    }

    fun outgoingAnimationSpecForInteraction(interaction: Interaction): AnimationSpec<Dp>? {
        return when (interaction) {
            is PressInteraction.Press -> DefaultOutgoingSpec
            is DragInteraction.Start -> DefaultOutgoingSpec
            is HoverInteraction.Enter -> HoveredOutgoingSpec
            is FocusInteraction.Focus -> DefaultOutgoingSpec
            else -> null
        }
    }
}

private val OutgoingSpecEasing: Easing = CubicBezierEasing(0.40f, 0.00f, 0.60f, 1.00f)

private val DefaultIncomingSpec = TweenSpec<Dp>(
    durationMillis = 120,
    easing = FastOutSlowInEasing
)

private val DefaultOutgoingSpec = TweenSpec<Dp>(
    durationMillis = 150,
    easing = OutgoingSpecEasing
)

private val HoveredOutgoingSpec = TweenSpec<Dp>(
    durationMillis = 120,
    easing = OutgoingSpecEasing
)