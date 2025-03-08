package io.github.madmaximuus.persian.foundation

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.shape.SquircleShape
import io.github.madmaximuus.persian.foundation.shape.SquircleSmoothing

/**
 * An immutable data class that holds various predefined [RoundedCornerShape] instances.
 *
 * This class provides a set of commonly used rounded corner shapes with different radii,
 * as well as a full circle shape.
 *
 * @property shape4 A [SquircleShape] with a radius of 4 density-independent pixels (dp).
 * @property shape6 A [SquircleShape] with a radius of 6 density-independent pixels (dp).
 * @property shape8 A [SquircleShape] with a radius of 8 density-independent pixels (dp).
 * @property shape10 A [SquircleShape] with a radius of 10 density-independent pixels (dp).
 * @property shape12 A [SquircleShape] with a radius of 12 density-independent pixels (dp).
 * @property shape14 A [SquircleShape] with a radius of 14 density-independent pixels (dp).
 * @property shape16 A [SquircleShape] with a radius of 16 density-independent pixels (dp).
 * @property shape18 A [SquircleShape] with a radius of 18 density-independent pixels (dp).
 * @property shape20 A [SquircleShape] with a radius of 20 density-independent pixels (dp).
 * @property shape22 A [SquircleShape] with a radius of 20 density-independent pixels (dp).
 * @property shape24 A [SquircleShape] with a radius of 20 density-independent pixels (dp).
 * @property full A [RoundedCornerShape] representing a full circle.
 */
@Immutable
class Shapes(
    val shape4: SquircleShape = SquircleShape(4.dp, SquircleSmoothing.MEDIUM),
    val shape6: SquircleShape = SquircleShape(6.dp, SquircleSmoothing.MEDIUM),
    val shape8: SquircleShape = SquircleShape(8.dp, SquircleSmoothing.MEDIUM),
    val shape10: SquircleShape = SquircleShape(10.dp, SquircleSmoothing.MEDIUM),
    val shape12: SquircleShape = SquircleShape(12.dp, SquircleSmoothing.MEDIUM),
    val shape14: SquircleShape = SquircleShape(14.dp, SquircleSmoothing.MEDIUM),
    val shape16: SquircleShape = SquircleShape(16.dp, SquircleSmoothing.MEDIUM),
    val shape18: SquircleShape = SquircleShape(18.dp, SquircleSmoothing.MEDIUM),
    val shape20: SquircleShape = SquircleShape(20.dp, SquircleSmoothing.MEDIUM),
    val shape22: SquircleShape = SquircleShape(22.dp, SquircleSmoothing.MEDIUM),
    val shape24: SquircleShape = SquircleShape(24.dp, SquircleSmoothing.MEDIUM),
    val full: RoundedCornerShape = CircleShape,
)

/**
 * A static composition local that provides a default instance of [Shapes].
 */
val LocalShapes = staticCompositionLocalOf { Shapes() }