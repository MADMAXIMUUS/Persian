package io.github.madmaximuus.persianSymbols.backward.five

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Backward5: ImageVector
    get() {
        if (backward5 != null) {
            return backward5!!
        }
        backward5 = Builder(
            name = "backward-5-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.433f, 1.321f)
                curveTo(12.808f, 1.726f, 12.784f, 2.358f, 12.379f, 2.734f)
                lineTo(11.551f, 3.5f)
                horizontalLineTo(12f)
                curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
                curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
                curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
                curveTo(3.5f, 11.448f, 3.948f, 11f, 4.5f, 11f)
                curveTo(5.052f, 11f, 5.5f, 11.448f, 5.5f, 12f)
                curveTo(5.5f, 15.59f, 8.41f, 18.5f, 12f, 18.5f)
                curveTo(15.59f, 18.5f, 18.5f, 15.59f, 18.5f, 12f)
                curveTo(18.5f, 8.41f, 15.59f, 5.5f, 12f, 5.5f)
                horizontalLineTo(11.551f)
                lineTo(12.379f, 6.266f)
                curveTo(12.784f, 6.642f, 12.808f, 7.274f, 12.433f, 7.68f)
                curveTo(12.058f, 8.085f, 11.425f, 8.109f, 11.02f, 7.734f)
                lineTo(8.321f, 5.234f)
                curveTo(8.116f, 5.044f, 8f, 4.779f, 8f, 4.5f)
                curveTo(8f, 4.221f, 8.116f, 3.956f, 8.321f, 3.766f)
                lineTo(11.02f, 1.266f)
                curveTo(11.425f, 0.891f, 12.058f, 0.915f, 12.433f, 1.321f)
                close()
                moveTo(10.515f, 8.998f)
                curveTo(10.135f, 8.998f, 9.815f, 9.283f, 9.77f, 9.661f)
                lineTo(9.402f, 12.791f)
                curveTo(9.362f, 13.135f, 9.562f, 13.462f, 9.888f, 13.583f)
                curveTo(10.213f, 13.702f, 10.578f, 13.584f, 10.77f, 13.296f)
                curveTo(11.001f, 12.951f, 11.39f, 12.728f, 11.828f, 12.728f)
                curveTo(12.529f, 12.728f, 13.103f, 13.3f, 13.103f, 14.013f)
                curveTo(13.103f, 14.727f, 12.529f, 15.298f, 11.828f, 15.298f)
                curveTo(11.39f, 15.298f, 11.001f, 15.075f, 10.77f, 14.73f)
                curveTo(10.54f, 14.386f, 10.074f, 14.294f, 9.73f, 14.524f)
                curveTo(9.386f, 14.754f, 9.293f, 15.22f, 9.524f, 15.564f)
                curveTo(10.02f, 16.306f, 10.866f, 16.798f, 11.828f, 16.798f)
                curveTo(13.364f, 16.798f, 14.603f, 15.548f, 14.603f, 14.013f)
                curveTo(14.603f, 12.479f, 13.364f, 11.228f, 11.828f, 11.228f)
                curveTo(11.571f, 11.228f, 11.321f, 11.263f, 11.085f, 11.329f)
                lineTo(11.182f, 10.498f)
                horizontalLineTo(13.668f)
                curveTo(14.082f, 10.498f, 14.418f, 10.163f, 14.418f, 9.748f)
                curveTo(14.418f, 9.334f, 14.082f, 8.998f, 13.668f, 8.998f)
                horizontalLineTo(10.515f)
                close()
            }
        }.build()
        return backward5!!
    }

private var backward5: ImageVector? = null