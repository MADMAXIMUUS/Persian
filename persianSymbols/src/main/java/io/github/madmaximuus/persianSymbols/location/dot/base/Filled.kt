package io.github.madmaximuus.persianSymbols.location.dot.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

val PersianSymbols.Filled.LocationDot: ImageVector
    get() {
        if (locationDot != null) {
            return locationDot!!
        }
        locationDot = Builder(
            name = "location-dot-filled",
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
                moveTo(11.0f, 8.0f)
                curveTo(11.0f, 7.4477f, 11.4477f, 7.0f, 12.0f, 7.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                curveTo(13.0f, 8.5523f, 12.5523f, 9.0f, 12.0f, 9.0f)
                curveTo(11.4477f, 9.0f, 11.0f, 8.5523f, 11.0f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(14.0f, 22.0f, 18.0f, 12.0f, 18.0f, 7.5556f)
                curveTo(18.0f, 4.4873f, 15.3137f, 2.0f, 12.0f, 2.0f)
                curveTo(8.6863f, 2.0f, 6.0f, 4.4873f, 6.0f, 7.5556f)
                curveTo(6.0f, 12.0f, 10.0f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(10.3431f, 5.0f, 9.0f, 6.3432f, 9.0f, 8.0f)
                curveTo(9.0f, 9.6568f, 10.3431f, 11.0f, 12.0f, 11.0f)
                curveTo(13.6569f, 11.0f, 15.0f, 9.6568f, 15.0f, 8.0f)
                curveTo(15.0f, 6.3432f, 13.6569f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }.build()
        return locationDot!!
    }

private var locationDot: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.LocationDot,
                contentDescription = ""
            )
        }
    }
}