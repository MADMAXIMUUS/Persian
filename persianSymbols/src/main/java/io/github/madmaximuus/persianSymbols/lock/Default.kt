package io.github.madmaximuus.persianSymbols.lock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Lock: ImageVector
    get() {
        if (lock != null) {
            return lock!!
        }
        lock = Builder(
            name = "lock-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.25f)
                curveTo(12.69f, 16.25f, 13.25f, 15.69f, 13.25f, 15f)
                curveTo(13.25f, 14.31f, 12.69f, 13.75f, 12f, 13.75f)
                curveTo(11.31f, 13.75f, 10.75f, 14.31f, 10.75f, 15f)
                curveTo(10.75f, 15.69f, 11.31f, 16.25f, 12f, 16.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.926f, 8.197f)
                curveTo(6.927f, 8.225f, 6.929f, 8.253f, 6.931f, 8.281f)
                curveTo(5.219f, 8.918f, 4f, 10.567f, 4f, 12.5f)
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
                curveTo(10.887f, 2f, 9.96f, 2.257f, 9.211f, 2.726f)
                curveTo(8.463f, 3.194f, 7.954f, 3.835f, 7.613f, 4.508f)
                curveTo(6.949f, 5.82f, 6.892f, 7.316f, 6.926f, 8.197f)
                close()
                moveTo(15.079f, 8f)
                curveTo(15.097f, 7.24f, 15.014f, 6.223f, 14.603f, 5.412f)
                curveTo(14.395f, 5.002f, 14.113f, 4.662f, 13.728f, 4.421f)
                curveTo(13.344f, 4.181f, 12.798f, 4f, 12f, 4f)
                curveTo(11.202f, 4f, 10.656f, 4.181f, 10.273f, 4.421f)
                curveTo(9.887f, 4.662f, 9.605f, 5.002f, 9.397f, 5.412f)
                curveTo(8.986f, 6.223f, 8.903f, 7.24f, 8.921f, 8f)
                horizontalLineTo(15.079f)
                close()
                moveTo(8.5f, 10f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 10f, 18f, 11.119f, 18f, 12.5f)
                verticalLineTo(17.5f)
                curveTo(18f, 18.881f, 16.881f, 20f, 15.5f, 20f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 20f, 6f, 18.881f, 6f, 17.5f)
                verticalLineTo(12.5f)
                curveTo(6f, 11.119f, 7.119f, 10f, 8.5f, 10f)
                close()
            }
        }.build()
        return lock!!
    }

private var lock: ImageVector? = null