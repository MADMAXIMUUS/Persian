package io.github.madmaximuus.persianSymbols.lock.badge.clock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.LockBadgeClock: ImageVector
    get() {
        if (lockBadgeClock != null) {
            return lockBadgeClock!!
        }
        lockBadgeClock = ImageVector.Builder(
            name = "lock-badge-clock-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.929f, 8.252f)
                curveTo(6.927f, 8.234f, 6.927f, 8.216f, 6.926f, 8.197f)
                curveTo(6.892f, 7.316f, 6.949f, 5.82f, 7.613f, 4.508f)
                curveTo(7.954f, 3.835f, 8.463f, 3.194f, 9.211f, 2.726f)
                curveTo(9.96f, 2.257f, 10.887f, 2f, 12f, 2f)
                curveTo(13.113f, 2f, 14.04f, 2.257f, 14.789f, 2.726f)
                curveTo(15.537f, 3.194f, 16.046f, 3.835f, 16.387f, 4.508f)
                curveTo(17.052f, 5.82f, 17.108f, 7.316f, 17.074f, 8.197f)
                curveTo(17.073f, 8.216f, 17.073f, 8.234f, 17.071f, 8.252f)
                curveTo(18.778f, 8.857f, 20f, 10.486f, 20f, 12.4f)
                verticalLineTo(12.875f)
                curveTo(19.38f, 12.633f, 18.706f, 12.5f, 18f, 12.5f)
                curveTo(15.952f, 12.5f, 14.165f, 13.62f, 13.219f, 15.28f)
                curveTo(13.239f, 15.19f, 13.25f, 15.096f, 13.25f, 15f)
                curveTo(13.25f, 14.31f, 12.69f, 13.75f, 12f, 13.75f)
                curveTo(11.31f, 13.75f, 10.75f, 14.31f, 10.75f, 15f)
                curveTo(10.75f, 15.69f, 11.31f, 16.25f, 12f, 16.25f)
                curveTo(12.383f, 16.25f, 12.725f, 16.078f, 12.955f, 15.807f)
                curveTo(12.662f, 16.479f, 12.5f, 17.221f, 12.5f, 18f)
                curveTo(12.5f, 19.576f, 13.163f, 20.997f, 14.225f, 22f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22f, 4f, 20.03f, 4f, 17.6f)
                verticalLineTo(12.4f)
                curveTo(4f, 10.486f, 5.222f, 8.857f, 6.929f, 8.252f)
                close()
                moveTo(14.603f, 5.412f)
                curveTo(15.014f, 6.223f, 15.097f, 7.24f, 15.079f, 8f)
                horizontalLineTo(8.921f)
                curveTo(8.903f, 7.24f, 8.986f, 6.223f, 9.397f, 5.412f)
                curveTo(9.605f, 5.002f, 9.887f, 4.662f, 10.273f, 4.421f)
                curveTo(10.656f, 4.181f, 11.202f, 4f, 12f, 4f)
                curveTo(12.798f, 4f, 13.344f, 4.181f, 13.728f, 4.421f)
                curveTo(14.113f, 4.662f, 14.395f, 5.002f, 14.603f, 5.412f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.75f)
                curveTo(18.414f, 15.75f, 18.75f, 16.086f, 18.75f, 16.5f)
                verticalLineTo(17.689f)
                lineTo(19.53f, 18.47f)
                curveTo(19.823f, 18.763f, 19.823f, 19.237f, 19.53f, 19.53f)
                curveTo(19.237f, 19.823f, 18.763f, 19.823f, 18.47f, 19.53f)
                lineTo(17.47f, 18.53f)
                curveTo(17.329f, 18.39f, 17.25f, 18.199f, 17.25f, 18f)
                verticalLineTo(16.5f)
                curveTo(17.25f, 16.086f, 17.586f, 15.75f, 18f, 15.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()

        return lockBadgeClock!!
    }

private var lockBadgeClock: ImageVector? = null