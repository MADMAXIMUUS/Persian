package io.github.madmaximuus.persianSymbols.arrow.down.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowDownCircle: ImageVector
    get() {
        if (arrowDownCircle != null) {
            return arrowDownCircle!!
        }
        arrowDownCircle = ImageVector.Builder(
            name = "arrow-down-circle-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.01f, 11.7f)
                curveTo(16.314f, 11.982f, 16.331f, 12.457f, 16.049f, 12.76f)
                lineTo(12.572f, 16.504f)
                curveTo(12.486f, 16.597f, 12.379f, 16.665f, 12.262f, 16.705f)
                curveTo(12.18f, 16.735f, 12.091f, 16.752f, 11.998f, 16.751f)
                curveTo(11.718f, 16.751f, 11.475f, 16.597f, 11.347f, 16.37f)
                lineTo(7.954f, 12.764f)
                curveTo(7.67f, 12.462f, 7.684f, 11.988f, 7.986f, 11.704f)
                curveTo(8.288f, 11.42f, 8.762f, 11.434f, 9.046f, 11.736f)
                lineTo(11.255f, 14.083f)
                lineTo(11.269f, 7.998f)
                curveTo(11.27f, 7.584f, 11.607f, 7.249f, 12.021f, 7.25f)
                curveTo(12.435f, 7.251f, 12.77f, 7.588f, 12.769f, 8.002f)
                lineTo(12.755f, 14.104f)
                lineTo(14.95f, 11.74f)
                curveTo(15.232f, 11.436f, 15.707f, 11.419f, 16.01f, 11.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
            }
        }.build()
        return arrowDownCircle!!
    }

private var arrowDownCircle: ImageVector? = null