package io.github.madmaximuus.persianSymbols.arrow.left.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowLeftCircle: ImageVector
    get() {
        if (arrowLeftCircle != null) {
            return arrowLeftCircle!!
        }
        arrowLeftCircle = ImageVector.Builder(
            name = "arrow-left-circle-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.299f, 16.01f)
                curveTo(12.017f, 16.314f, 11.543f, 16.331f, 11.239f, 16.049f)
                lineTo(7.496f, 12.572f)
                curveTo(7.403f, 12.486f, 7.335f, 12.379f, 7.295f, 12.262f)
                curveTo(7.265f, 12.18f, 7.248f, 12.091f, 7.248f, 11.998f)
                curveTo(7.249f, 11.719f, 7.403f, 11.475f, 7.63f, 11.347f)
                lineTo(11.236f, 7.954f)
                curveTo(11.538f, 7.67f, 12.012f, 7.684f, 12.296f, 7.986f)
                curveTo(12.58f, 8.288f, 12.566f, 8.762f, 12.264f, 9.046f)
                lineTo(9.917f, 11.255f)
                lineTo(16.002f, 11.269f)
                curveTo(16.416f, 11.27f, 16.751f, 11.607f, 16.75f, 12.021f)
                curveTo(16.749f, 12.435f, 16.412f, 12.77f, 15.998f, 12.769f)
                lineTo(9.896f, 12.755f)
                lineTo(12.26f, 14.95f)
                curveTo(12.564f, 15.232f, 12.581f, 15.707f, 12.299f, 16.01f)
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
        return arrowLeftCircle!!
    }

private var arrowLeftCircle: ImageVector? = null