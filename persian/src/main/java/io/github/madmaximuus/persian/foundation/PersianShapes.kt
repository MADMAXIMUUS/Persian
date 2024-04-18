package io.github.madmaximuus.persian.foundation

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

@Immutable
class PersianShapes(
    val shape4: RoundedCornerShape = RoundedCornerShape(4.dp),
    val shape6: RoundedCornerShape = RoundedCornerShape(6.dp),
    val shape8: RoundedCornerShape = RoundedCornerShape(8.dp),
    val shape10: RoundedCornerShape = RoundedCornerShape(10.dp),
    val shape12: RoundedCornerShape = RoundedCornerShape(12.dp),
    val shape14: RoundedCornerShape = RoundedCornerShape(14.dp),
    val shape16: RoundedCornerShape = RoundedCornerShape(16.dp),
    val shape18: RoundedCornerShape = RoundedCornerShape(18.dp),
    val shape20: RoundedCornerShape = RoundedCornerShape(20.dp),
    val full: RoundedCornerShape = CircleShape,
)

val LocalPersianShapes = staticCompositionLocalOf { PersianShapes() }

val MaterialTheme.shape: PersianShapes
    @Composable
    @ReadOnlyComposable
    get() = LocalPersianShapes.current