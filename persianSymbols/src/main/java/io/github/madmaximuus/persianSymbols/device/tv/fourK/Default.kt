package io.github.madmaximuus.persianSymbols.device.tv.fourK

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceTv4K: ImageVector
    get() {
        if (deviceTv4K != null) {
            return deviceTv4K!!
        }
        deviceTv4K = ImageVector.Builder(
            name = "device-tv-four-k-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.946f, 6.787f)
                curveTo(10.254f, 6.888f, 10.463f, 7.175f, 10.463f, 7.5f)
                verticalLineTo(11.951f)
                horizontalLineTo(11.42f)
                curveTo(11.835f, 11.951f, 12.17f, 12.287f, 12.17f, 12.701f)
                curveTo(12.17f, 13.115f, 11.835f, 13.451f, 11.42f, 13.451f)
                horizontalLineTo(10.463f)
                verticalLineTo(14.5f)
                curveTo(10.463f, 14.914f, 10.127f, 15.25f, 9.713f, 15.25f)
                curveTo(9.299f, 15.25f, 8.963f, 14.914f, 8.963f, 14.5f)
                verticalLineTo(13.451f)
                horizontalLineTo(5.92f)
                curveTo(5.638f, 13.451f, 5.38f, 13.293f, 5.252f, 13.041f)
                curveTo(5.124f, 12.79f, 5.148f, 12.487f, 5.314f, 12.259f)
                lineTo(9.107f, 7.058f)
                curveTo(9.298f, 6.796f, 9.637f, 6.686f, 9.946f, 6.787f)
                close()
                moveTo(8.963f, 11.951f)
                verticalLineTo(9.801f)
                lineTo(7.396f, 11.951f)
                horizontalLineTo(8.963f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.118f, 8.05f)
                curveTo(18.422f, 7.769f, 18.441f, 7.295f, 18.159f, 6.991f)
                curveTo(17.878f, 6.687f, 17.403f, 6.668f, 17.1f, 6.95f)
                lineTo(14.062f, 9.76f)
                verticalLineTo(7.5f)
                curveTo(14.062f, 7.086f, 13.727f, 6.75f, 13.312f, 6.75f)
                curveTo(12.898f, 6.75f, 12.562f, 7.086f, 12.562f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(12.562f, 14.914f, 12.898f, 15.25f, 13.312f, 15.25f)
                curveTo(13.727f, 15.25f, 14.062f, 14.914f, 14.062f, 14.5f)
                verticalLineTo(12.24f)
                lineTo(17.1f, 15.05f)
                curveTo(17.403f, 15.332f, 17.878f, 15.313f, 18.159f, 15.009f)
                curveTo(18.441f, 14.705f, 18.422f, 14.231f, 18.118f, 13.95f)
                lineTo(14.931f, 11f)
                lineTo(18.118f, 8.05f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 3f)
                curveTo(4.015f, 3f, 2f, 5.015f, 2f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(2f, 16.416f, 3.197f, 18.052f, 4.884f, 18.701f)
                lineTo(4.293f, 19.293f)
                curveTo(3.902f, 19.683f, 3.902f, 20.317f, 4.293f, 20.707f)
                curveTo(4.683f, 21.098f, 5.317f, 21.098f, 5.707f, 20.707f)
                lineTo(7.414f, 19f)
                horizontalLineTo(16.586f)
                lineTo(18.293f, 20.707f)
                curveTo(18.683f, 21.098f, 19.317f, 21.098f, 19.707f, 20.707f)
                curveTo(20.098f, 20.317f, 20.098f, 19.683f, 19.707f, 19.293f)
                lineTo(19.115f, 18.701f)
                curveTo(20.803f, 18.052f, 22f, 16.416f, 22f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(22f, 5.015f, 19.985f, 3f, 17.5f, 3f)
                horizontalLineTo(6.5f)
                close()
                moveTo(17.5f, 17f)
                curveTo(18.881f, 17f, 20f, 15.881f, 20f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(20f, 6.119f, 18.881f, 5f, 17.5f, 5f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 5f, 4f, 6.119f, 4f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(4f, 15.881f, 5.119f, 17f, 6.5f, 17f)
                horizontalLineTo(17.5f)
                close()
            }
        }.build()

        return deviceTv4K!!
    }

private var deviceTv4K: ImageVector? = null