package io.github.madmaximuus.persianSymbols.unlock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Unlock: ImageVector
    get() {
        if (unlock != null) {
            return unlock!!
        }
        unlock = Builder(
            name = "unlock-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.25f, 15f)
                curveTo(13.25f, 15.69f, 12.69f, 16.25f, 12f, 16.25f)
                curveTo(11.31f, 16.25f, 10.75f, 15.69f, 10.75f, 15f)
                curveTo(10.75f, 14.31f, 11.31f, 13.75f, 12f, 13.75f)
                curveTo(12.69f, 13.75f, 13.25f, 14.31f, 13.25f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.428f, 5.353f)
                curveTo(9.638f, 4.96f, 9.919f, 4.635f, 10.301f, 4.404f)
                curveTo(10.682f, 4.173f, 11.221f, 4f, 12f, 4f)
                curveTo(12.798f, 4f, 13.344f, 4.181f, 13.728f, 4.421f)
                curveTo(14.113f, 4.662f, 14.395f, 5.002f, 14.603f, 5.412f)
                curveTo(15.014f, 6.223f, 15.097f, 7.24f, 15.079f, 8f)
                horizontalLineTo(8f)
                curveTo(7.847f, 8f, 7.702f, 8.034f, 7.573f, 8.096f)
                curveTo(5.532f, 8.523f, 4f, 10.333f, 4f, 12.5f)
                verticalLineTo(17.5f)
                curveTo(4f, 19.985f, 6.015f, 22f, 8.5f, 22f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 22f, 20f, 19.985f, 20f, 17.5f)
                verticalLineTo(12.5f)
                curveTo(20f, 10.567f, 18.781f, 8.918f, 17.069f, 8.281f)
                curveTo(17.072f, 8.253f, 17.073f, 8.225f, 17.074f, 8.197f)
                curveTo(17.108f, 7.316f, 17.052f, 5.82f, 16.387f, 4.508f)
                curveTo(16.046f, 3.835f, 15.537f, 3.194f, 14.789f, 2.726f)
                curveTo(14.04f, 2.257f, 13.113f, 2f, 12f, 2f)
                curveTo(10.914f, 2f, 10.005f, 2.245f, 9.265f, 2.693f)
                curveTo(8.526f, 3.141f, 8.013f, 3.757f, 7.664f, 4.411f)
                curveTo(7.404f, 4.898f, 7.588f, 5.504f, 8.075f, 5.764f)
                curveTo(8.562f, 6.024f, 9.168f, 5.84f, 9.428f, 5.353f)
                close()
                moveTo(8.5f, 10f)
                curveTo(7.119f, 10f, 6f, 11.119f, 6f, 12.5f)
                verticalLineTo(17.5f)
                curveTo(6f, 18.881f, 7.119f, 20f, 8.5f, 20f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 20f, 18f, 18.881f, 18f, 17.5f)
                verticalLineTo(12.5f)
                curveTo(18f, 11.119f, 16.881f, 10f, 15.5f, 10f)
                horizontalLineTo(8.5f)
                close()
            }
        }.build()
        return unlock!!
    }

private var unlock: ImageVector? = null