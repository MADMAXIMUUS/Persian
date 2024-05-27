package io.github.madmaximuus.persianSymbols.location.dot.slash

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.LocationDotSlash: ImageVector
    get() {
        if (locationDotSlash != null) {
            return locationDotSlash!!
        }
        locationDotSlash = Builder(
            name = "location-dot-slash-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.7071f, 2.2929f)
                curveTo(3.3166f, 1.9024f, 2.6834f, 1.9024f, 2.2929f, 2.2929f)
                curveTo(1.9024f, 2.6834f, 1.9024f, 3.3166f, 2.2929f, 3.7071f)
                lineTo(20.2929f, 21.7071f)
                curveTo(20.6834f, 22.0976f, 21.3166f, 22.0976f, 21.7071f, 21.7071f)
                curveTo(22.0976f, 21.3166f, 22.0976f, 20.6834f, 21.7071f, 20.2929f)
                lineTo(3.7071f, 2.2929f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0001f, 22.0f)
                curveTo(10.3253f, 22.0f, 6.5729f, 13.3432f, 6.0588f, 8.5588f)
                lineTo(15.1479f, 17.6479f)
                curveTo(14.0056f, 20.13f, 12.7784f, 22.0f, 12.0001f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0001f, 7.5556f)
                curveTo(18.0001f, 9.2217f, 17.4098f, 11.6687f, 16.577f, 14.0769f)
                lineTo(13.2349f, 10.7349f)
                curveTo(14.2758f, 10.2641f, 15.0001f, 9.2167f, 15.0001f, 8.0f)
                curveTo(15.0001f, 6.3432f, 13.6569f, 5.0f, 12.0001f, 5.0f)
                curveTo(10.7834f, 5.0f, 9.7359f, 5.7242f, 9.2652f, 6.7651f)
                lineTo(6.9932f, 4.4931f)
                curveTo(8.0671f, 2.9908f, 9.9086f, 2.0f, 12.0001f, 2.0f)
                curveTo(15.3138f, 2.0f, 18.0001f, 4.4873f, 18.0001f, 7.5556f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0001f, 8.0f)
                curveTo(11.0001f, 7.4477f, 11.4478f, 7.0f, 12.0001f, 7.0f)
                curveTo(12.5523f, 7.0f, 13.0001f, 7.4477f, 13.0001f, 8.0f)
                curveTo(13.0001f, 8.5523f, 12.5523f, 9.0f, 12.0001f, 9.0f)
                curveTo(11.4478f, 9.0f, 11.0001f, 8.5523f, 11.0001f, 8.0f)
                close()
            }
        }.build()
        return locationDotSlash!!
    }

private var locationDotSlash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.LocationDotSlash,
                contentDescription = ""
            )
        }
    }
}