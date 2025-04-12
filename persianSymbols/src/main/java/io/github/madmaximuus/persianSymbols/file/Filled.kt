package io.github.madmaximuus.persianSymbols.file

import androidx.compose.ui.graphics.Color
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 2f, 4f, 3.567f, 4f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(4f, 20.433f, 5.567f, 22f, 7.5f, 22f)
                horizontalLineTo(16.5f)
                curveTo(18.433f, 22f, 20f, 20.433f, 20f, 18.5f)
                verticalLineTo(9.75f)
                horizontalLineTo(14.75f)
                curveTo(13.231f, 9.75f, 12f, 8.519f, 12f, 7f)
                verticalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.994f, 8.25f)
                curveTo(19.958f, 7.765f, 19.745f, 7.308f, 19.394f, 6.967f)
                lineTo(14.868f, 2.566f)
                curveTo(14.501f, 2.209f, 14.011f, 2.007f, 13.5f, 2f)
                verticalLineTo(7f)
                curveTo(13.5f, 7.69f, 14.06f, 8.25f, 14.75f, 8.25f)
                horizontalLineTo(19.994f)
                close()
            }
        }.build()
        return file!!
    }

private var file: ImageVector? = null