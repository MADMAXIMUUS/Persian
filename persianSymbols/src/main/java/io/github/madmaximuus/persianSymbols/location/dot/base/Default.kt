package io.github.madmaximuus.persianSymbols.location.dot.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.LocationDot: ImageVector
    get() {
        if (locationDot != null) {
            return locationDot!!
        }
        locationDot = Builder(
            name = "location-dot-default",
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
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 4.0f)
                curveTo(9.7909f, 4.0f, 8.0f, 5.7909f, 8.0f, 8.0f)
                curveTo(8.0f, 9.831f, 8.7066f, 12.9544f, 9.6898f, 15.6583f)
                curveTo(10.178f, 17.0007f, 10.713f, 18.1796f, 11.2246f, 19.0039f)
                curveTo(11.4822f, 19.4189f, 11.7092f, 19.7035f, 11.8914f, 19.8727f)
                curveTo(11.9359f, 19.914f, 11.9721f, 19.9433f, 12.0f, 19.9638f)
                curveTo(12.0279f, 19.9433f, 12.0641f, 19.914f, 12.1086f, 19.8727f)
                curveTo(12.2908f, 19.7035f, 12.5178f, 19.4189f, 12.7754f, 19.0039f)
                curveTo(13.287f, 18.1796f, 13.822f, 17.0007f, 14.3102f, 15.6583f)
                curveTo(15.2934f, 12.9544f, 16.0f, 9.831f, 16.0f, 8.0f)
                curveTo(16.0f, 5.7909f, 14.2091f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(6.0f, 8.0f)
                curveTo(6.0f, 4.6863f, 8.6863f, 2.0f, 12.0f, 2.0f)
                curveTo(15.3137f, 2.0f, 18.0f, 4.6863f, 18.0f, 8.0f)
                curveTo(18.0f, 10.169f, 17.2066f, 13.5456f, 16.1898f, 16.3417f)
                curveTo(15.678f, 17.7493f, 15.088f, 19.0704f, 14.4746f, 20.0586f)
                curveTo(14.1697f, 20.5499f, 13.8342f, 20.9996f, 13.4695f, 21.3383f)
                curveTo(13.1232f, 21.6598f, 12.6222f, 22.0f, 12.0f, 22.0f)
                curveTo(11.3778f, 22.0f, 10.8768f, 21.6598f, 10.5305f, 21.3383f)
                curveTo(10.1658f, 20.9996f, 9.8303f, 20.5499f, 9.5254f, 20.0586f)
                curveTo(8.912f, 19.0704f, 8.3221f, 17.7493f, 7.8102f, 16.3417f)
                curveTo(6.7934f, 13.5456f, 6.0f, 10.169f, 6.0f, 8.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                curveTo(11.0f, 8.5523f, 11.4477f, 9.0f, 12.0f, 9.0f)
                curveTo(12.5523f, 9.0f, 13.0f, 8.5523f, 13.0f, 8.0f)
                curveTo(13.0f, 7.4477f, 12.5523f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveTo(9.0f, 6.3432f, 10.3431f, 5.0f, 12.0f, 5.0f)
                curveTo(13.6569f, 5.0f, 15.0f, 6.3432f, 15.0f, 8.0f)
                curveTo(15.0f, 9.6568f, 13.6569f, 11.0f, 12.0f, 11.0f)
                curveTo(10.3431f, 11.0f, 9.0f, 9.6568f, 9.0f, 8.0f)
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
                imageVector = PersianSymbols.Default.LocationDot,
                contentDescription = ""
            )
        }
    }
}