package io.github.madmaximuus.persianSymbols.server

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Server: ImageVector
    get() {
        if (server != null) {
            return server!!
        }
        server = ImageVector.Builder(
            name = "server-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.75f, 8.5f)
                curveTo(18.164f, 8.5f, 18.5f, 8.164f, 18.5f, 7.75f)
                curveTo(18.5f, 7.336f, 18.164f, 7f, 17.75f, 7f)
                curveTo(17.336f, 7f, 17f, 7.336f, 17f, 7.75f)
                curveTo(17f, 8.164f, 17.336f, 8.5f, 17.75f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 12f)
                curveTo(18.5f, 12.414f, 18.164f, 12.75f, 17.75f, 12.75f)
                curveTo(17.336f, 12.75f, 17f, 12.414f, 17f, 12f)
                curveTo(17f, 11.586f, 17.336f, 11.25f, 17.75f, 11.25f)
                curveTo(18.164f, 11.25f, 18.5f, 11.586f, 18.5f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.75f, 17f)
                curveTo(18.164f, 17f, 18.5f, 16.664f, 18.5f, 16.25f)
                curveTo(18.5f, 15.836f, 18.164f, 15.5f, 17.75f, 15.5f)
                curveTo(17.336f, 15.5f, 17f, 15.836f, 17f, 16.25f)
                curveTo(17f, 16.664f, 17.336f, 17f, 17.75f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 20f, 22f, 17.985f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 6f, 20f, 7.119f, 20f, 8.5f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(8.5f)
                close()
                moveTo(4f, 10.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(20f)
                verticalLineTo(10.5f)
                horizontalLineTo(4f)
                close()
                moveTo(4f, 15.5f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(15.5f)
                curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                close()
            }
        }.build()

        return server!!
    }

private var server: ImageVector? = null