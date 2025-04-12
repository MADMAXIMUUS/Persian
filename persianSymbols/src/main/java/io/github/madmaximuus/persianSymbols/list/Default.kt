package io.github.madmaximuus.persianSymbols.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.List: ImageVector
    get() {
        if (list != null) {
            return list!!
        }
        list = ImageVector.Builder(
            name = "list-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.5f, 8.25f)
                curveTo(6.19f, 8.25f, 6.75f, 7.69f, 6.75f, 7f)
                curveTo(6.75f, 6.31f, 6.19f, 5.75f, 5.5f, 5.75f)
                curveTo(4.81f, 5.75f, 4.25f, 6.31f, 4.25f, 7f)
                curveTo(4.25f, 7.69f, 4.81f, 8.25f, 5.5f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.75f, 6f)
                curveTo(8.198f, 6f, 7.75f, 6.448f, 7.75f, 7f)
                curveTo(7.75f, 7.552f, 8.198f, 8f, 8.75f, 8f)
                horizontalLineTo(18.75f)
                curveTo(19.302f, 8f, 19.75f, 7.552f, 19.75f, 7f)
                curveTo(19.75f, 6.448f, 19.302f, 6f, 18.75f, 6f)
                horizontalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.75f, 12f)
                curveTo(7.75f, 11.448f, 8.198f, 11f, 8.75f, 11f)
                horizontalLineTo(18.75f)
                curveTo(19.302f, 11f, 19.75f, 11.448f, 19.75f, 12f)
                curveTo(19.75f, 12.552f, 19.302f, 13f, 18.75f, 13f)
                horizontalLineTo(8.75f)
                curveTo(8.198f, 13f, 7.75f, 12.552f, 7.75f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.5f, 13.25f)
                curveTo(6.19f, 13.25f, 6.75f, 12.69f, 6.75f, 12f)
                curveTo(6.75f, 11.309f, 6.19f, 10.75f, 5.5f, 10.75f)
                curveTo(4.81f, 10.75f, 4.25f, 11.309f, 4.25f, 12f)
                curveTo(4.25f, 12.69f, 4.81f, 13.25f, 5.5f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.75f, 17f)
                curveTo(7.75f, 16.447f, 8.198f, 16f, 8.75f, 16f)
                horizontalLineTo(18.75f)
                curveTo(19.302f, 16f, 19.75f, 16.447f, 19.75f, 17f)
                curveTo(19.75f, 17.552f, 19.302f, 18f, 18.75f, 18f)
                horizontalLineTo(8.75f)
                curveTo(8.198f, 18f, 7.75f, 17.552f, 7.75f, 17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.5f, 18.25f)
                curveTo(6.19f, 18.25f, 6.75f, 17.69f, 6.75f, 17f)
                curveTo(6.75f, 16.309f, 6.19f, 15.75f, 5.5f, 15.75f)
                curveTo(4.81f, 15.75f, 4.25f, 16.309f, 4.25f, 17f)
                curveTo(4.25f, 17.69f, 4.81f, 18.25f, 5.5f, 18.25f)
                close()
            }
        }.build()

        return list!!
    }

private var list: ImageVector? = null