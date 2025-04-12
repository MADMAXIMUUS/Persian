package io.github.madmaximuus.persianSymbols.camera.badge.clock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CameraBadgeClock: ImageVector
    get() {
        if (cameraBadgeClock != null) {
            return cameraBadgeClock!!
        }
        cameraBadgeClock = ImageVector.Builder(
            name = "camera-badge-clock-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 9.42f)
                curveTo(2f, 7.117f, 3.867f, 5.25f, 6.17f, 5.25f)
                curveTo(7.056f, 5.25f, 7.906f, 4.895f, 8.529f, 4.264f)
                lineTo(9.191f, 3.595f)
                curveTo(9.566f, 3.214f, 10.079f, 3f, 10.613f, 3f)
                horizontalLineTo(13.387f)
                curveTo(13.921f, 3f, 14.434f, 3.214f, 14.809f, 3.595f)
                lineTo(15.471f, 4.264f)
                curveTo(16.094f, 4.895f, 16.944f, 5.25f, 17.83f, 5.25f)
                curveTo(20.133f, 5.25f, 22f, 7.117f, 22f, 9.42f)
                verticalLineTo(14.225f)
                curveTo(20.997f, 13.163f, 19.576f, 12.5f, 18f, 12.5f)
                curveTo(17.565f, 12.5f, 17.142f, 12.55f, 16.737f, 12.646f)
                curveTo(16.556f, 10.188f, 14.504f, 8.25f, 12f, 8.25f)
                curveTo(9.377f, 8.25f, 7.25f, 10.377f, 7.25f, 13f)
                curveTo(7.25f, 15.623f, 9.377f, 17.75f, 12f, 17.75f)
                curveTo(12.171f, 17.75f, 12.34f, 17.741f, 12.507f, 17.723f)
                curveTo(12.502f, 17.815f, 12.5f, 17.907f, 12.5f, 18f)
                curveTo(12.5f, 19.107f, 12.827f, 20.137f, 13.389f, 21f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 21f, 2f, 19.03f, 2f, 16.6f)
                verticalLineTo(9.42f)
                close()
                moveTo(17.75f, 9.5f)
                curveTo(18.164f, 9.5f, 18.5f, 9.164f, 18.5f, 8.75f)
                curveTo(18.5f, 8.336f, 18.164f, 8f, 17.75f, 8f)
                curveTo(17.336f, 8f, 17f, 8.336f, 17f, 8.75f)
                curveTo(17f, 9.164f, 17.336f, 9.5f, 17.75f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.25f, 13f)
                curveTo(15.25f, 13.081f, 15.247f, 13.161f, 15.241f, 13.241f)
                curveTo(14.127f, 13.888f, 13.261f, 14.916f, 12.821f, 16.146f)
                curveTo(12.558f, 16.214f, 12.283f, 16.25f, 12f, 16.25f)
                curveTo(10.205f, 16.25f, 8.75f, 14.795f, 8.75f, 13f)
                curveTo(8.75f, 11.205f, 10.205f, 9.75f, 12f, 9.75f)
                curveTo(13.795f, 9.75f, 15.25f, 11.205f, 15.25f, 13f)
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

        return cameraBadgeClock!!
    }

private var cameraBadgeClock: ImageVector? = null
