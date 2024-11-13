package io.github.madmaximuus.persianSymbols.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.File: ImageVector
    get() {
        if (file != null) {
            return file!!
        }
        file = Builder(
            name = "file-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.5f, 22f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 22f, 4f, 20.433f, 4f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
                horizontalLineTo(14.286f)
                lineTo(20f, 7.556f)
                verticalLineTo(18.5f)
                curveTo(20f, 20.433f, 18.433f, 22f, 16.5f, 22f)
                close()
                moveTo(12f, 4.5f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 10f, 18f, 9.776f, 18f, 9.5f)
                verticalLineTo(9.143f)
                lineTo(12.857f, 4f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 4f, 12f, 4.224f, 12f, 4.5f)
                close()
            }
        }.build()
        return file!!
    }

private var file: ImageVector? = null