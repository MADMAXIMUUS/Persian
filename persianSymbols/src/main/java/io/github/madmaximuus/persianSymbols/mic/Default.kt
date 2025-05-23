package io.github.madmaximuus.persianSymbols.mic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Mic: ImageVector
    get() {
        if (mic != null) {
            return mic!!
        }
        mic = Builder(
            name = "mic-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 5f)
                curveTo(8f, 3.343f, 9.343f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(14.657f, 2f, 16f, 3.343f, 16f, 5f)
                verticalLineTo(11f)
                curveTo(16f, 12.657f, 14.657f, 14f, 13f, 14f)
                horizontalLineTo(11f)
                curveTo(9.343f, 14f, 8f, 12.657f, 8f, 11f)
                verticalLineTo(5f)
                close()
                moveTo(11f, 4f)
                curveTo(10.448f, 4f, 10f, 4.448f, 10f, 5f)
                verticalLineTo(11f)
                curveTo(10f, 11.552f, 10.448f, 12f, 11f, 12f)
                horizontalLineTo(13f)
                curveTo(13.552f, 12f, 14f, 11.552f, 14f, 11f)
                verticalLineTo(5f)
                curveTo(14f, 4.448f, 13.552f, 4f, 13f, 4f)
                horizontalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 11f)
                curveTo(6.552f, 11f, 7f, 11.448f, 7f, 12f)
                curveTo(7f, 13.657f, 8.343f, 15f, 10f, 15f)
                horizontalLineTo(14f)
                curveTo(15.657f, 15f, 17f, 13.657f, 17f, 12f)
                curveTo(17f, 11.448f, 17.448f, 11f, 18f, 11f)
                curveTo(18.552f, 11f, 19f, 11.448f, 19f, 12f)
                curveTo(19f, 14.762f, 16.761f, 17f, 14f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                curveTo(16.552f, 20f, 17f, 20.448f, 17f, 21f)
                curveTo(17f, 21.552f, 16.552f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(7.448f, 22f, 7f, 21.552f, 7f, 21f)
                curveTo(7f, 20.448f, 7.448f, 20f, 8f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                curveTo(7.239f, 17f, 5f, 14.762f, 5f, 12f)
                curveTo(5f, 11.448f, 5.448f, 11f, 6f, 11f)
                close()
            }
        }.build()
        return mic!!
    }

private var mic: ImageVector? = null