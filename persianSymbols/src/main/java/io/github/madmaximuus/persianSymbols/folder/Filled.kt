package io.github.madmaximuus.persianSymbols.folder

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Folder: ImageVector
    get() {
        if (folder != null) {
            return folder!!
        }
        folder = ImageVector.Builder(
            name = "folder-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 10.75f)
                verticalLineTo(16.6f)
                curveTo(22f, 19.03f, 20.03f, 21f, 17.6f, 21f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 21f, 2f, 19.03f, 2f, 16.6f)
                verticalLineTo(10.75f)
                horizontalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.25f)
                verticalLineTo(8.25f)
                curveTo(22f, 6.593f, 20.657f, 5.25f, 19f, 5.25f)
                horizontalLineTo(11.876f)
                curveTo(11.29f, 5.25f, 10.717f, 5.079f, 10.227f, 4.757f)
                lineTo(8.306f, 3.493f)
                curveTo(7.817f, 3.171f, 7.244f, 3f, 6.658f, 3f)
                horizontalLineTo(4f)
                curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
                verticalLineTo(9.25f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return folder!!
    }

private var folder: ImageVector? = null