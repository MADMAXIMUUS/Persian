package io.github.madmaximuus.persian.foundation

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

/**
 * An immutable data class that holds various predefined [RoundedCornerShape] instances.
 *
 * This class provides a set of commonly used rounded corner shapes with different radii,
 * as well as a full circle shape.
 *
 * @property shape4 A [RoundedCornerShape] with a radius of 4 density-independent pixels (dp).
 * @property shape6 A [RoundedCornerShape] with a radius of 6 density-independent pixels (dp).
 * @property shape8 A [RoundedCornerShape] with a radius of 8 density-independent pixels (dp).
 * @property shape10 A [RoundedCornerShape] with a radius of 10 density-independent pixels (dp).
 * @property shape12 A [RoundedCornerShape] with a radius of 12 density-independent pixels (dp).
 * @property shape14 A [RoundedCornerShape] with a radius of 14 density-independent pixels (dp).
 * @property shape16 A [RoundedCornerShape] with a radius of 16 density-independent pixels (dp).
 * @property shape18 A [RoundedCornerShape] with a radius of 18 density-independent pixels (dp).
 * @property shape20 A [RoundedCornerShape] with a radius of 20 density-independent pixels (dp).
 * @property shape22 A [RoundedCornerShape] with a radius of 20 density-independent pixels (dp).
 * @property shape24 A [RoundedCornerShape] with a radius of 20 density-independent pixels (dp).
 * @property full A [RoundedCornerShape] representing a full circle.
 */
@Immutable
class Shapes(
    val shape4: RoundedCornerShape = RoundedCornerShape(4.dp),
    val shape6: RoundedCornerShape = RoundedCornerShape(6.dp),
    val shape8: RoundedCornerShape = RoundedCornerShape(8.dp),
    val shape10: RoundedCornerShape = RoundedCornerShape(10.dp),
    val shape12: RoundedCornerShape = RoundedCornerShape(12.dp),
    val shape14: RoundedCornerShape = RoundedCornerShape(14.dp),
    val shape16: RoundedCornerShape = RoundedCornerShape(16.dp),
    val shape18: RoundedCornerShape = RoundedCornerShape(18.dp),
    val shape20: RoundedCornerShape = RoundedCornerShape(20.dp),
    val shape22: RoundedCornerShape = RoundedCornerShape(22.dp),
    val shape24: RoundedCornerShape = RoundedCornerShape(24.dp),
    val full: RoundedCornerShape = CircleShape,
)

/**
 * A static composition local that provides a default instance of [Shapes].
 */
val LocalShapes = staticCompositionLocalOf { Shapes() }