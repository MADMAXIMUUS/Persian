package io.github.madmaximuus.persianSymbols.play.pause

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

val PersianSymbols.Default.PlayPause: ImageVector
    get() {
        if (playPause != null) {
            return playPause!!
        }
        playPause = Builder(
            name = "play-pause-default",
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
                moveTo(5.9487f, 7.6776f)
                lineTo(11.3165f, 11.5117f)
                curveTo(11.6515f, 11.751f, 11.6515f, 12.2489f, 11.3165f, 12.4882f)
                lineTo(5.9487f, 16.3223f)
                curveTo(5.5516f, 16.6059f, 5.0f, 16.3221f, 5.0f, 15.8341f)
                verticalLineTo(8.1659f)
                curveTo(5.0f, 7.6778f, 5.5516f, 7.394f, 5.9487f, 7.6776f)
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
                moveTo(15.0f, 9.0f)
                curveTo(15.0f, 8.4477f, 14.5523f, 8.0f, 14.0f, 8.0f)
                curveTo(13.4477f, 8.0f, 13.0f, 8.4477f, 13.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 15.5522f, 13.4477f, 16.0f, 14.0f, 16.0f)
                curveTo(14.5523f, 16.0f, 15.0f, 15.5522f, 15.0f, 15.0f)
                verticalLineTo(9.0f)
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
                moveTo(19.0f, 9.0f)
                curveTo(19.0f, 8.4477f, 18.5523f, 8.0f, 18.0f, 8.0f)
                curveTo(17.4477f, 8.0f, 17.0f, 8.4477f, 17.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 15.5522f, 17.4477f, 16.0f, 18.0f, 16.0f)
                curveTo(18.5523f, 16.0f, 19.0f, 15.5522f, 19.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
            }
        }.build()
        return playPause!!
    }

private var playPause: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.PlayPause,
                contentDescription = ""
            )
        }
    }
}