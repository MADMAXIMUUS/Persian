package io.github.madmaximuus.persianSymbols.bell

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Bell: ImageVector
    get() {
        if (bell != null) {
            return bell!!
        }
        bell = Builder(
            name = "bell-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
                verticalLineTo(3.02f)
                curveTo(8.162f, 3.497f, 6f, 5.964f, 6f, 8.938f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                curveTo(4.448f, 17f, 4f, 17.448f, 4f, 18f)
                curveTo(4f, 18.552f, 4.448f, 19f, 5f, 19f)
                lineTo(19f, 19f)
                curveTo(19.552f, 19f, 20f, 18.552f, 20f, 18f)
                curveTo(20f, 17.448f, 19.552f, 17f, 19f, 17f)
                horizontalLineTo(18f)
                verticalLineTo(8.938f)
                curveTo(18f, 5.964f, 15.838f, 3.497f, 13f, 3.02f)
                verticalLineTo(3f)
                close()
                moveTo(16f, 8.938f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(8.938f)
                curveTo(8f, 6.97f, 9.42f, 5.334f, 11.292f, 5f)
                horizontalLineTo(12.708f)
                curveTo(14.58f, 5.334f, 16f, 6.97f, 16f, 8.938f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.934f, 21.175f)
                curveTo(10.472f, 21.686f, 11.199f, 22f, 12f, 22f)
                curveTo(12.801f, 22f, 13.528f, 21.686f, 14.066f, 21.175f)
                curveTo(14.566f, 20.7f, 14.105f, 20f, 13.415f, 20f)
                horizontalLineTo(10.585f)
                curveTo(9.895f, 20f, 9.434f, 20.7f, 9.934f, 21.175f)
                close()
            }
        }.build()
        return bell!!
    }

private var bell: ImageVector? = null