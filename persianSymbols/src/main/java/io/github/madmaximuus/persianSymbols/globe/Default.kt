package io.github.madmaximuus.persianSymbols.globe

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Globe: ImageVector
    get() {
        if (globe != null) {
            return globe!!
        }
        globe = Builder(
            name = "globe-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                close()
                moveTo(4.321f, 9.75f)
                curveTo(4.112f, 10.464f, 4f, 11.219f, 4f, 12f)
                curveTo(4f, 12.781f, 4.112f, 13.536f, 4.321f, 14.25f)
                horizontalLineTo(7.498f)
                curveTo(7.341f, 13.524f, 7.25f, 12.77f, 7.25f, 12f)
                curveTo(7.25f, 11.23f, 7.341f, 10.476f, 7.498f, 9.75f)
                horizontalLineTo(4.321f)
                close()
                moveTo(4.932f, 15.75f)
                horizontalLineTo(7.92f)
                curveTo(8.18f, 16.499f, 8.497f, 17.204f, 8.836f, 17.849f)
                curveTo(9.205f, 18.55f, 9.605f, 19.189f, 9.999f, 19.748f)
                curveTo(7.803f, 19.182f, 5.973f, 17.708f, 4.932f, 15.75f)
                close()
                moveTo(12f, 19.889f)
                curveTo(12.562f, 19.226f, 13.243f, 18.279f, 13.836f, 17.151f)
                curveTo(14.071f, 16.706f, 14.289f, 16.237f, 14.481f, 15.75f)
                horizontalLineTo(9.519f)
                curveTo(9.711f, 16.237f, 9.929f, 16.706f, 10.164f, 17.151f)
                curveTo(10.757f, 18.279f, 11.438f, 19.226f, 12f, 19.889f)
                close()
                moveTo(16.08f, 15.75f)
                curveTo(15.82f, 16.499f, 15.503f, 17.204f, 15.164f, 17.849f)
                curveTo(14.795f, 18.55f, 14.395f, 19.189f, 14.001f, 19.748f)
                curveTo(16.197f, 19.182f, 18.028f, 17.708f, 19.068f, 15.75f)
                horizontalLineTo(16.08f)
                close()
                moveTo(16.503f, 14.25f)
                curveTo(16.659f, 13.524f, 16.75f, 12.77f, 16.75f, 12f)
                curveTo(16.75f, 11.23f, 16.659f, 10.476f, 16.503f, 9.75f)
                horizontalLineTo(19.679f)
                curveTo(19.888f, 10.464f, 20f, 11.219f, 20f, 12f)
                curveTo(20f, 12.781f, 19.888f, 13.536f, 19.679f, 14.25f)
                horizontalLineTo(16.503f)
                close()
                moveTo(14.963f, 9.75f)
                curveTo(15.144f, 10.481f, 15.25f, 11.237f, 15.25f, 12f)
                curveTo(15.25f, 12.763f, 15.144f, 13.519f, 14.963f, 14.25f)
                horizontalLineTo(9.037f)
                curveTo(8.856f, 13.519f, 8.75f, 12.763f, 8.75f, 12f)
                curveTo(8.75f, 11.237f, 8.856f, 10.481f, 9.037f, 9.75f)
                horizontalLineTo(14.963f)
                close()
                moveTo(16.08f, 8.25f)
                horizontalLineTo(19.068f)
                curveTo(18.028f, 6.292f, 16.197f, 4.818f, 14.001f, 4.252f)
                curveTo(14.395f, 4.811f, 14.795f, 5.45f, 15.164f, 6.151f)
                curveTo(15.503f, 6.796f, 15.82f, 7.501f, 16.08f, 8.25f)
                close()
                moveTo(12f, 4.111f)
                curveTo(12.562f, 4.774f, 13.243f, 5.721f, 13.836f, 6.849f)
                curveTo(14.071f, 7.294f, 14.289f, 7.763f, 14.481f, 8.25f)
                horizontalLineTo(9.519f)
                curveTo(9.711f, 7.763f, 9.929f, 7.294f, 10.164f, 6.849f)
                curveTo(10.757f, 5.721f, 11.438f, 4.774f, 12f, 4.111f)
                close()
                moveTo(4.932f, 8.25f)
                curveTo(5.973f, 6.292f, 7.803f, 4.818f, 9.999f, 4.252f)
                curveTo(9.605f, 4.811f, 9.205f, 5.45f, 8.836f, 6.151f)
                curveTo(8.497f, 6.796f, 8.18f, 7.501f, 7.92f, 8.25f)
                horizontalLineTo(4.932f)
                close()
            }
        }.build()
        return globe!!
    }

private var globe: ImageVector? = null