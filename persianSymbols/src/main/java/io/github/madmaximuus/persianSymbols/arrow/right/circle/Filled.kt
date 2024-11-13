package io.github.madmaximuus.persianSymbols.arrow.right.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ArrowRightCircle: ImageVector
    get() {
        if (arrowRightCircle != null) {
            return arrowRightCircle!!
        }
        arrowRightCircle = ImageVector.Builder(
            name = "arrow-right-circle-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(11.7f, 7.99f)
                curveTo(11.982f, 7.686f, 12.457f, 7.669f, 12.76f, 7.95f)
                lineTo(16.504f, 11.428f)
                curveTo(16.597f, 11.514f, 16.665f, 11.621f, 16.705f, 11.738f)
                curveTo(16.735f, 11.82f, 16.752f, 11.909f, 16.751f, 12.002f)
                curveTo(16.751f, 12.281f, 16.597f, 12.525f, 16.37f, 12.653f)
                lineTo(12.764f, 16.046f)
                curveTo(12.462f, 16.33f, 11.988f, 16.316f, 11.704f, 16.014f)
                curveTo(11.42f, 15.712f, 11.434f, 15.238f, 11.736f, 14.954f)
                lineTo(14.083f, 12.745f)
                lineTo(7.998f, 12.731f)
                curveTo(7.584f, 12.73f, 7.249f, 12.393f, 7.25f, 11.979f)
                curveTo(7.251f, 11.565f, 7.587f, 11.23f, 8.002f, 11.231f)
                lineTo(14.104f, 11.245f)
                lineTo(11.74f, 9.05f)
                curveTo(11.436f, 8.768f, 11.418f, 8.293f, 11.7f, 7.99f)
                close()
            }
        }.build()
        return arrowRightCircle!!
    }

private var arrowRightCircle: ImageVector? = null