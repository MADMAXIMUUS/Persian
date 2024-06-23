package io.github.madmaximuus.persian.fab

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.VectorConverter
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.animateElevation
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSize
import kotlinx.coroutines.launch

object FabDefaults {
    @Composable
    fun primaryColors(
        backgroundColor: Color = PersianTheme.colorScheme.primaryContainer,
        content: Color = PersianTheme.colorScheme.onPrimaryContainer,
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            contentColor = content,
        )
    }

    @Composable
    fun secondaryColors(
        backgroundColor: Color = PersianTheme.colorScheme.secondaryContainer,
        content: Color = PersianTheme.colorScheme.onSecondaryContainer,
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            contentColor = content
        )
    }

    @Composable
    fun tertiaryColors(
        backgroundColor: Color = PersianTheme.colorScheme.tertiaryContainer,
        content: Color = PersianTheme.colorScheme.onTertiaryContainer
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            contentColor = content
        )
    }

    @Composable
    fun neutralColors(
        backgroundColor: Color = PersianTheme.colorScheme.surface3,
        content: Color = PersianTheme.colorScheme.primary
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            contentColor = content
        )
    }

    @Composable
    fun smallSizes(
        boxSize: Dp = 40.dp,
        iconSize: IconSize = IconDefaults.size20(),
        textStyle: TextStyle = PersianTheme.typography.labelLarge,
        cornerShape: Shape = PersianTheme.shapes.shape12
    ) = remember(
        boxSize,
        iconSize,
        textStyle,
        cornerShape
    ) {
        FabSizes(
            boxSize = boxSize,
            iconSize = iconSize,
            textStyle = textStyle,
            cornerShape = cornerShape
        )
    }

    @Composable
    fun mediumSizes(
        boxSize: Dp = 56.dp,
        iconSize: IconSize = IconDefaults.size20(),
        textStyle: TextStyle = PersianTheme.typography.labelLarge,
        cornerShape: Shape = PersianTheme.shapes.shape16
    ) = remember(
        boxSize,
        iconSize,
        textStyle,
        cornerShape
    )
    {
        FabSizes(
            boxSize = boxSize,
            iconSize = iconSize,
            textStyle = textStyle,
            cornerShape = cornerShape
        )
    }

    /**
     * Creates a [FabElevation] that represents the elevation of a
     * [Fab] in different states. For use cases in which a less prominent
     * [Fab] is possible consider the [loweredElevation].
     *
     * @param defaultElevation the elevation used when the [Fab] has no other
     *   [Interaction]s.
     * @param pressedElevation the elevation used when the [Fab] is pressed.
     * @param focusedElevation the elevation used when the [Fab] is focused.
     * @param hoveredElevation the elevation used when the [Fab] is hovered.
     */
    @Composable
    fun elevation(
        defaultElevation: Dp = PersianTheme.elevation.medium,
        pressedElevation: Dp = PersianTheme.elevation.medium,
        focusedElevation: Dp = PersianTheme.elevation.medium,
        hoveredElevation: Dp = PersianTheme.elevation.large,
    ): FabElevation =
        FabElevation(
            defaultElevation = defaultElevation,
            pressedElevation = pressedElevation,
            focusedElevation = focusedElevation,
            hoveredElevation = hoveredElevation,
        )
}

@Immutable
data class FabColors(
    val backgroundColor: Color,
    val contentColor: Color,
)

@Immutable
data class FabSizes(
    val boxSize: Dp,
    val iconSize: IconSize,
    val textStyle: TextStyle,
    val cornerShape: Shape
)


/**
 * Represents the tonal and shadow elevation for a floating action button in different states.
 *
 * See [FabDefaults.elevation] for the default elevation used in a
 * [Fab] and [MediumFab].
 */
@Stable
open class FabElevation
internal constructor(
    private val defaultElevation: Dp,
    private val pressedElevation: Dp,
    private val focusedElevation: Dp,
    private val hoveredElevation: Dp,
) {
    @Composable
    internal fun shadowElevation(interactionSource: InteractionSource): State<Dp> {
        return animateElevation(interactionSource = interactionSource)
    }

    internal fun tonalElevation(): Dp {
        return defaultElevation
    }

    @Composable
    private fun animateElevation(interactionSource: InteractionSource): State<Dp> {
        val animatable =
            remember(interactionSource) {
                FloatingActionButtonElevationAnimatable(
                    defaultElevation = defaultElevation,
                    pressedElevation = pressedElevation,
                    hoveredElevation = hoveredElevation,
                    focusedElevation = focusedElevation
                )
            }

        LaunchedEffect(this) {
            animatable.updateElevation(
                defaultElevation = defaultElevation,
                pressedElevation = pressedElevation,
                hoveredElevation = hoveredElevation,
                focusedElevation = focusedElevation
            )
        }

        LaunchedEffect(interactionSource) {
            val interactions = mutableListOf<Interaction>()
            interactionSource.interactions.collect { interaction ->
                when (interaction) {
                    is HoverInteraction.Enter -> {
                        interactions.add(interaction)
                    }

                    is HoverInteraction.Exit -> {
                        interactions.remove(interaction.enter)
                    }

                    is FocusInteraction.Focus -> {
                        interactions.add(interaction)
                    }

                    is FocusInteraction.Unfocus -> {
                        interactions.remove(interaction.focus)
                    }

                    is PressInteraction.Press -> {
                        interactions.add(interaction)
                    }

                    is PressInteraction.Release -> {
                        interactions.remove(interaction.press)
                    }

                    is PressInteraction.Cancel -> {
                        interactions.remove(interaction.press)
                    }
                }
                val targetInteraction = interactions.lastOrNull()
                launch { animatable.animateElevation(to = targetInteraction) }
            }
        }

        return animatable.asState()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is FabElevation) return false

        if (defaultElevation != other.defaultElevation) return false
        if (pressedElevation != other.pressedElevation) return false
        if (focusedElevation != other.focusedElevation) return false
        return hoveredElevation == other.hoveredElevation
    }

    override fun hashCode(): Int {
        var result = defaultElevation.hashCode()
        result = 31 * result + pressedElevation.hashCode()
        result = 31 * result + focusedElevation.hashCode()
        result = 31 * result + hoveredElevation.hashCode()
        return result
    }
}

private class FloatingActionButtonElevationAnimatable(
    private var defaultElevation: Dp,
    private var pressedElevation: Dp,
    private var hoveredElevation: Dp,
    private var focusedElevation: Dp
) {
    private val animatable = Animatable(defaultElevation, Dp.VectorConverter)

    private var lastTargetInteraction: Interaction? = null
    private var targetInteraction: Interaction? = null

    private fun Interaction?.calculateTarget(): Dp {
        return when (this) {
            is PressInteraction.Press -> pressedElevation
            is HoverInteraction.Enter -> hoveredElevation
            is FocusInteraction.Focus -> focusedElevation
            else -> defaultElevation
        }
    }

    suspend fun updateElevation(
        defaultElevation: Dp,
        pressedElevation: Dp,
        hoveredElevation: Dp,
        focusedElevation: Dp
    ) {
        this.defaultElevation = defaultElevation
        this.pressedElevation = pressedElevation
        this.hoveredElevation = hoveredElevation
        this.focusedElevation = focusedElevation
        snapElevation()
    }

    private suspend fun snapElevation() {
        val target = targetInteraction.calculateTarget()
        if (animatable.targetValue != target) {
            try {
                animatable.snapTo(target)
            } finally {
                lastTargetInteraction = targetInteraction
            }
        }
    }

    suspend fun animateElevation(to: Interaction?) {
        val target = to.calculateTarget()
        // Update the interaction even if the values are the same, for when we change to another
        // interaction later
        targetInteraction = to
        try {
            if (animatable.targetValue != target) {
                animatable.animateElevation(target = target, from = lastTargetInteraction, to = to)
            }
        } finally {
            lastTargetInteraction = to
        }
    }

    fun asState(): State<Dp> = animatable.asState()
}