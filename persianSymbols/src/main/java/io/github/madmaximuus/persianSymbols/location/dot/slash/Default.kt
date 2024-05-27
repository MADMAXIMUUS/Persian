package io.github.madmaximuus.persianSymbols.location.dot.slash

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

val PersianSymbols.Default.LocationDotSlash: ImageVector
    get() {
        if (locationDotSlash != null) {
            return locationDotSlash!!
        }
        locationDotSlash = Builder(
            name = "location-dot-slash-default",
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
                moveTo(7.8102f, 16.3417f)
                curveTo(6.8705f, 13.7576f, 6.1216f, 10.6777f, 6.0134f, 8.5134f)
                lineTo(8.3366f, 10.8366f)
                curveTo(8.6365f, 12.3599f, 9.1161f, 14.0805f, 9.6898f, 15.6583f)
                curveTo(10.1779f, 17.0007f, 10.713f, 18.1796f, 11.2246f, 19.0039f)
                curveTo(11.4822f, 19.4189f, 11.7092f, 19.7035f, 11.8914f, 19.8727f)
                curveTo(11.9359f, 19.914f, 11.9721f, 19.9433f, 12.0f, 19.9638f)
                curveTo(12.0279f, 19.9433f, 12.0641f, 19.914f, 12.1086f, 19.8727f)
                curveTo(12.2908f, 19.7035f, 12.5178f, 19.4189f, 12.7754f, 19.0039f)
                curveTo(13.178f, 18.3552f, 13.5951f, 17.4871f, 13.9924f, 16.4924f)
                lineTo(15.5209f, 18.0209f)
                curveTo(15.1876f, 18.7818f, 14.8352f, 19.4777f, 14.4746f, 20.0586f)
                curveTo(14.1697f, 20.5499f, 13.8342f, 20.9996f, 13.4695f, 21.3383f)
                curveTo(13.1232f, 21.6598f, 12.6222f, 22.0f, 12.0f, 22.0f)
                curveTo(11.3778f, 22.0f, 10.8768f, 21.6598f, 10.5305f, 21.3383f)
                curveTo(10.1658f, 20.9996f, 9.8303f, 20.5499f, 9.5253f, 20.0586f)
                curveTo(8.912f, 19.0704f, 8.322f, 17.7493f, 7.8102f, 16.3417f)
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
                moveTo(7.0738f, 4.5738f)
                lineTo(8.5223f, 6.0223f)
                curveTo(9.2107f, 4.8144f, 10.5102f, 4.0f, 12.0f, 4.0f)
                curveTo(14.2091f, 4.0f, 16.0f, 5.7909f, 16.0f, 8.0f)
                curveTo(16.0f, 9.1874f, 15.7028f, 10.9183f, 15.2258f, 12.7258f)
                lineTo(16.8474f, 14.3474f)
                curveTo(17.5288f, 12.06f, 18.0f, 9.6714f, 18.0f, 8.0f)
                curveTo(18.0f, 4.6863f, 15.3137f, 2.0f, 12.0f, 2.0f)
                curveTo(9.96f, 2.0f, 8.1579f, 3.018f, 7.0738f, 4.5738f)
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
                moveTo(9.2651f, 6.7651f)
                lineTo(13.2349f, 10.7349f)
                curveTo(14.2757f, 10.2641f, 15.0f, 9.2167f, 15.0f, 8.0f)
                curveTo(15.0f, 6.3432f, 13.6568f, 5.0f, 12.0f, 5.0f)
                curveTo(10.7833f, 5.0f, 9.7359f, 5.7242f, 9.2651f, 6.7651f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                curveTo(11.0f, 8.5523f, 11.4477f, 9.0f, 12.0f, 9.0f)
                curveTo(12.5523f, 9.0f, 13.0f, 8.5523f, 13.0f, 8.0f)
                curveTo(13.0f, 7.4477f, 12.5523f, 7.0f, 12.0f, 7.0f)
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
                imageVector = PersianSymbols.Default.LocationDotSlash,
                contentDescription = ""
            )
        }
    }
}