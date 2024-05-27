package io.github.madmaximuus.persianSymbols.pause.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Pause: ImageVector
    get() {
        if (pause != null) {
            return pause!!
        }
        pause = Builder(
            name = "pause-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 17.9999f)
                verticalLineTo(5.9961f)
                curveTo(10.0f, 5.4438f, 9.5523f, 4.9961f, 9.0f, 4.9961f)
                horizontalLineTo(7.9897f)
                curveTo(7.4375f, 4.9961f, 6.9897f, 5.4438f, 6.9897f, 5.9961f)
                verticalLineTo(17.9999f)
                curveTo(6.9897f, 18.5522f, 7.4375f, 18.9999f, 7.9897f, 18.9999f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 18.9999f, 10.0f, 18.5522f, 10.0f, 17.9999f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 17.9999f)
                verticalLineTo(5.9961f)
                curveTo(14.0f, 5.4438f, 14.4477f, 4.9961f, 15.0f, 4.9961f)
                horizontalLineTo(15.9598f)
                curveTo(16.5121f, 4.9961f, 16.9598f, 5.4438f, 16.9598f, 5.9961f)
                verticalLineTo(17.9999f)
                curveTo(16.9598f, 18.5522f, 16.5121f, 18.9999f, 15.9598f, 18.9999f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 18.9999f, 14.0f, 18.5522f, 14.0f, 17.9999f)
                close()
            }
        }.build()
        return pause!!
    }

private var pause: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Pause,
                contentDescription = ""
            )
        }
    }
}