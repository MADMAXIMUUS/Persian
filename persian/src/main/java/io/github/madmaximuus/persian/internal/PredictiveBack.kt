package io.github.madmaximuus.persian.internal

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.Easing

private val PredictiveBackEasing: Easing = CubicBezierEasing(0.1f, 0.1f, 0f, 1f)

/**
 * An internal object that provides a transformation function using the PredictiveBackEasing algorithm.
 */
internal object PredictiveBack {

    /**
     * Transforms the given progress value using the PredictiveBackEasing algorithm.
     *
     * This function applies a specific easing transformation to the input [progress] value.
     * The transformation is based on the PredictiveBackEasing algorithm, which is designed
     * to provide a smooth and predictable easing effect.
     *
     * @param progress The input progress value to be transformed. This value should be in the range [0, 1].
     * @return The transformed progress value after applying the PredictiveBackEasing algorithm.
     */
    internal fun transform(progress: Float) = PredictiveBackEasing.transform(progress)
}

