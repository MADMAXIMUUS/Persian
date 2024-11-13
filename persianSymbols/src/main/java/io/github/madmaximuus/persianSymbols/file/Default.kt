package io.github.madmaximuus.persianSymbols.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.File: ImageVector
    get() {
        if (file != null) {
            return file!!
        }
        file = Builder(
            name = "file-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.5f, 2f)
                curveTo(6.015f, 2f, 4f, 4.015f, 4f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(4f, 19.985f, 6.015f, 22f, 8.5f, 22f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 22f, 20f, 19.985f, 20f, 17.5f)
                verticalLineTo(8f)
                curveTo(20f, 7.735f, 19.895f, 7.48f, 19.707f, 7.293f)
                lineTo(14.707f, 2.293f)
                curveTo(14.52f, 2.105f, 14.265f, 2f, 14f, 2f)
                horizontalLineTo(8.5f)
                close()
                moveTo(6f, 6.5f)
                curveTo(6f, 5.119f, 7.119f, 4f, 8.5f, 4f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(17.5f)
                curveTo(18f, 18.881f, 16.881f, 20f, 15.5f, 20f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 20f, 6f, 18.881f, 6f, 17.5f)
                verticalLineTo(6.5f)
                close()
            }
        }.build()
        return file!!
    }

private var file: ImageVector? = null