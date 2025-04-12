package io.github.madmaximuus.persianSymbols.server

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Server: ImageVector
    get() {
        if (server != null) {
            return server!!
        }
        server = ImageVector.Builder(
            name = "server-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 4f)
                curveTo(3.97f, 4f, 2f, 5.97f, 2f, 8.4f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(8.4f)
                curveTo(22f, 5.97f, 20.03f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                close()
                moveTo(17.75f, 8.5f)
                curveTo(18.164f, 8.5f, 18.5f, 8.164f, 18.5f, 7.75f)
                curveTo(18.5f, 7.336f, 18.164f, 7f, 17.75f, 7f)
                curveTo(17.336f, 7f, 17f, 7.336f, 17f, 7.75f)
                curveTo(17f, 8.164f, 17.336f, 8.5f, 17.75f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 10.5f)
                horizontalLineTo(2f)
                verticalLineTo(13.5f)
                horizontalLineTo(22f)
                verticalLineTo(10.5f)
                close()
                moveTo(18.5f, 12f)
                curveTo(18.5f, 12.414f, 18.164f, 12.75f, 17.75f, 12.75f)
                curveTo(17.336f, 12.75f, 17f, 12.414f, 17f, 12f)
                curveTo(17f, 11.586f, 17.336f, 11.25f, 17.75f, 11.25f)
                curveTo(18.164f, 11.25f, 18.5f, 11.586f, 18.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 15.6f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(15.6f)
                curveTo(22f, 18.03f, 20.03f, 20f, 17.6f, 20f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                close()
                moveTo(17.75f, 17f)
                curveTo(18.164f, 17f, 18.5f, 16.664f, 18.5f, 16.25f)
                curveTo(18.5f, 15.836f, 18.164f, 15.5f, 17.75f, 15.5f)
                curveTo(17.336f, 15.5f, 17f, 15.836f, 17f, 16.25f)
                curveTo(17f, 16.664f, 17.336f, 17f, 17.75f, 17f)
                close()
            }
        }.build()

        return server!!
    }

private var server: ImageVector? = null