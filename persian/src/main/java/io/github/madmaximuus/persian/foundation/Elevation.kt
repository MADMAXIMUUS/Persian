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

/**
 * Data class representing different elevation levels.
 *
 * @property none The elevation level representing no elevation.
 * @property elevation1 The elevation level representing extra small elevation.
 * @property elevation2 The elevation level representing small elevation.
 * @property elevation3 The elevation level representing medium elevation.
 * @property elevation4 The elevation level representing large elevation.
 * @property elevation5 The elevation level representing extra large elevation.
 */
data class Elevation(
    val none: Dp = 0.dp,
    val elevation1: Dp = 1.dp,
    val elevation2: Dp = 3.dp,
    val elevation3: Dp = 6.dp,
    val elevation4: Dp = 8.dp,
    val elevation5: Dp = 12.dp
)

/**
 * CompositionLocal for providing elevation settings.
 */
val LocalElevation = staticCompositionLocalOf { Elevation() }

/**
 * Suspend function to animate elevation changes.
 *
 * @param target The target elevation value to animate to.
 * @param from The interaction that triggered the animation, if any.
 * @param to The interaction that the animation is targeting, if any.
 */
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

/**
 * Private object containing default animation specifications for elevation changes.
 */
private object ElevationDefaults {

    /**
     * Returns the incoming animation specification for the given interaction.
     *
     * @param interaction The interaction that triggered the animation.
     */
    fun incomingAnimationSpecForInteraction(interaction: Interaction): AnimationSpec<Dp>? {
        return when (interaction) {
            is PressInteraction.Press -> DefaultIncomingSpec
            is DragInteraction.Start -> DefaultIncomingSpec
            is HoverInteraction.Enter -> DefaultIncomingSpec
            is FocusInteraction.Focus -> DefaultIncomingSpec
            else -> null
        }
    }

    /**
     * Returns the outgoing animation specification for the given interaction.
     *
     * @param interaction The interaction that triggered the animation.
     */
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