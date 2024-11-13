package io.github.madmaximuus.persianSymbols.bell.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BellExclamation: ImageVector
    get() {
        if (bellExclamation != null) {
            return bellExclamation!!
        }
        bellExclamation = Builder(
            name = "bell-exclamation=-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 6.621f)
                curveTo(12.414f, 6.621f, 12.75f, 6.957f, 12.75f, 7.371f)
                lineTo(12.75f, 12.844f)
                curveTo(12.75f, 13.259f, 12.414f, 13.594f, 12f, 13.594f)
                curveTo(11.586f, 13.594f, 11.25f, 13.259f, 11.25f, 12.844f)
                lineTo(11.25f, 7.371f)
                curveTo(11.25f, 6.957f, 11.586f, 6.621f, 12f, 6.621f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.002f, 15.21f)
                curveTo(13.002f, 15.763f, 12.554f, 16.211f, 12.002f, 16.211f)
                curveTo(11.45f, 16.211f, 11.002f, 15.763f, 11.002f, 15.21f)
                curveTo(11.002f, 14.658f, 11.45f, 14.21f, 12.002f, 14.21f)
                curveTo(12.554f, 14.21f, 13.002f, 14.658f, 13.002f, 15.21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(12.552f, 2f, 13f, 2.448f, 13f, 3f)
                verticalLineTo(3.02f)
                curveTo(15.838f, 3.497f, 18f, 5.964f, 18f, 8.938f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                curveTo(19.552f, 17f, 20f, 17.448f, 20f, 18f)
                curveTo(20f, 18.552f, 19.552f, 19f, 19f, 19f)
                lineTo(5f, 19f)
                curveTo(4.448f, 19f, 4f, 18.552f, 4f, 18f)
                curveTo(4f, 17.448f, 4.448f, 17f, 5f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(8.938f)
                curveTo(6f, 5.964f, 8.162f, 3.497f, 11f, 3.02f)
                verticalLineTo(3f)
                curveTo(11f, 2.448f, 11.448f, 2f, 12f, 2f)
                close()
                moveTo(16f, 17f)
                verticalLineTo(8.938f)
                curveTo(16f, 6.97f, 14.58f, 5.334f, 12.708f, 5f)
                horizontalLineTo(11.292f)
                curveTo(9.42f, 5.334f, 8f, 6.97f, 8f, 8.938f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22f)
                curveTo(11.199f, 22f, 10.472f, 21.686f, 9.934f, 21.175f)
                curveTo(9.434f, 20.7f, 9.895f, 20f, 10.585f, 20f)
                horizontalLineTo(13.415f)
                curveTo(14.105f, 20f, 14.566f, 20.7f, 14.066f, 21.175f)
                curveTo(13.528f, 21.686f, 12.801f, 22f, 12f, 22f)
                close()
            }
        }.build()
        return bellExclamation!!
    }

private var bellExclamation: ImageVector? = null