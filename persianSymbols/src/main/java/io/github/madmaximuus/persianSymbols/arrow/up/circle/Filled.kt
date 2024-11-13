package io.github.madmaximuus.persianSymbols.arrow.up.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ArrowUpCircle: ImageVector
    get() {
        if (arrowUpCircle != null) {
            return arrowUpCircle!!
        }
        arrowUpCircle = ImageVector.Builder(
            name = "arrow-up-circle-filled",
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
                moveTo(7.989f, 12.3f)
                curveTo(7.686f, 12.018f, 7.668f, 11.543f, 7.95f, 11.24f)
                lineTo(11.428f, 7.496f)
                curveTo(11.514f, 7.403f, 11.621f, 7.335f, 11.738f, 7.295f)
                curveTo(11.82f, 7.265f, 11.909f, 7.248f, 12.002f, 7.248f)
                curveTo(12.281f, 7.249f, 12.525f, 7.403f, 12.653f, 7.63f)
                lineTo(16.046f, 11.236f)
                curveTo(16.33f, 11.538f, 16.316f, 12.012f, 16.014f, 12.296f)
                curveTo(15.712f, 12.58f, 15.238f, 12.566f, 14.954f, 12.264f)
                lineTo(12.745f, 9.917f)
                lineTo(12.731f, 16.002f)
                curveTo(12.73f, 16.416f, 12.393f, 16.751f, 11.979f, 16.75f)
                curveTo(11.565f, 16.749f, 11.23f, 16.412f, 11.231f, 15.998f)
                lineTo(11.245f, 9.896f)
                lineTo(9.049f, 12.26f)
                curveTo(8.767f, 12.564f, 8.293f, 12.581f, 7.989f, 12.3f)
                close()
            }
        }.build()
        return arrowUpCircle!!
    }

private var arrowUpCircle: ImageVector? = null