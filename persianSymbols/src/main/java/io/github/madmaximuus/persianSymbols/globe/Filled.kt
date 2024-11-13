package io.github.madmaximuus.persianSymbols.globe

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Globe: ImageVector
    get() {
        if (globe != null) {
            return globe!!
        }
        globe = Builder(
            name = "globe-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 3.646f)
                curveTo(11.439f, 4.347f, 10.762f, 5.343f, 10.171f, 6.529f)
                curveTo(9.901f, 7.072f, 9.651f, 7.648f, 9.438f, 8.25f)
                horizontalLineTo(14.562f)
                curveTo(14.349f, 7.648f, 14.099f, 7.072f, 13.829f, 6.529f)
                curveTo(13.238f, 5.344f, 12.561f, 4.347f, 12f, 3.646f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.994f, 9.75f)
                horizontalLineTo(9.006f)
                curveTo(8.844f, 10.482f, 8.75f, 11.237f, 8.75f, 12f)
                curveTo(8.75f, 12.763f, 8.844f, 13.517f, 9.006f, 14.25f)
                horizontalLineTo(14.994f)
                curveTo(15.156f, 13.518f, 15.25f, 12.763f, 15.25f, 12f)
                curveTo(15.25f, 11.237f, 15.156f, 10.482f, 14.994f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.526f, 14.25f)
                curveTo(16.668f, 13.521f, 16.75f, 12.768f, 16.75f, 12f)
                curveTo(16.75f, 11.232f, 16.668f, 10.478f, 16.526f, 9.75f)
                horizontalLineTo(21.746f)
                curveTo(21.912f, 10.473f, 22f, 11.226f, 22f, 12f)
                curveTo(22f, 12.774f, 21.912f, 13.527f, 21.746f, 14.25f)
                horizontalLineTo(16.526f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.562f, 15.75f)
                horizontalLineTo(9.438f)
                curveTo(9.651f, 16.351f, 9.901f, 16.928f, 10.171f, 17.471f)
                curveTo(10.762f, 18.656f, 11.439f, 19.652f, 12f, 20.354f)
                curveTo(12.561f, 19.652f, 13.238f, 18.656f, 13.829f, 17.471f)
                curveTo(14.099f, 16.928f, 14.349f, 16.351f, 14.562f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.575f, 21.984f)
                curveTo(13.292f, 21.219f, 14.317f, 19.853f, 15.171f, 18.14f)
                curveTo(15.536f, 17.408f, 15.874f, 16.604f, 16.143f, 15.75f)
                horizontalLineTo(21.273f)
                curveTo(19.858f, 19.246f, 16.522f, 21.76f, 12.575f, 21.984f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.143f, 8.25f)
                curveTo(15.874f, 7.396f, 15.536f, 6.592f, 15.171f, 5.86f)
                curveTo(14.317f, 4.147f, 13.292f, 2.781f, 12.575f, 2.016f)
                curveTo(16.523f, 2.24f, 19.858f, 4.754f, 21.273f, 8.25f)
                horizontalLineTo(16.143f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.727f, 8.25f)
                curveTo(4.142f, 4.754f, 7.477f, 2.24f, 11.425f, 2.016f)
                curveTo(10.708f, 2.781f, 9.683f, 4.147f, 8.829f, 5.86f)
                curveTo(8.464f, 6.592f, 8.126f, 7.396f, 7.857f, 8.25f)
                horizontalLineTo(2.727f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.474f, 9.75f)
                curveTo(7.332f, 10.478f, 7.25f, 11.232f, 7.25f, 12f)
                curveTo(7.25f, 12.768f, 7.332f, 13.521f, 7.474f, 14.25f)
                horizontalLineTo(2.254f)
                curveTo(2.088f, 13.527f, 2f, 12.774f, 2f, 12f)
                curveTo(2f, 11.226f, 2.088f, 10.473f, 2.254f, 9.75f)
                horizontalLineTo(7.474f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.857f, 15.75f)
                curveTo(8.126f, 16.604f, 8.464f, 17.408f, 8.829f, 18.14f)
                curveTo(9.683f, 19.853f, 10.708f, 21.219f, 11.425f, 21.984f)
                curveTo(7.477f, 21.76f, 4.142f, 19.246f, 2.727f, 15.75f)
                horizontalLineTo(7.857f)
                close()
            }
        }.build()
        return globe!!
    }

private var globe: ImageVector? = null