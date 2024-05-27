package io.github.madmaximuus.persianSymbols.clock.alarm

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

val PersianSymbols.Default.ClockAlarm: ImageVector
    get() {
        if (clockAlarm != null) {
            return clockAlarm!!
        }
        clockAlarm = Builder(
            name = "clock-alarm-default",
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
                moveTo(21.0429f, 5.7071f)
                curveTo(21.4334f, 6.0976f, 22.0666f, 6.0976f, 22.4571f, 5.7071f)
                curveTo(22.8476f, 5.3166f, 22.8476f, 4.6834f, 22.4571f, 4.2929f)
                lineTo(19.4571f, 1.2929f)
                curveTo(19.0666f, 0.9024f, 18.4334f, 0.9024f, 18.0429f, 1.2929f)
                curveTo(17.6524f, 1.6834f, 17.6524f, 2.3166f, 18.0429f, 2.7071f)
                lineTo(21.0429f, 5.7071f)
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
                moveTo(5.9571f, 2.7071f)
                lineTo(2.9571f, 5.7071f)
                curveTo(2.5666f, 6.0976f, 1.9334f, 6.0976f, 1.5429f, 5.7071f)
                curveTo(1.1524f, 5.3166f, 1.1524f, 4.6834f, 1.5429f, 4.2929f)
                lineTo(4.5429f, 1.2929f)
                curveTo(4.9334f, 0.9024f, 5.5666f, 0.9024f, 5.9571f, 1.2929f)
                curveTo(6.3476f, 1.6834f, 6.3476f, 2.3166f, 5.9571f, 2.7071f)
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
                moveTo(13.0f, 8.0f)
                curveTo(13.0f, 7.4477f, 12.5523f, 7.0f, 12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                verticalLineTo(11.5858f)
                curveTo(11.0f, 12.1162f, 11.2107f, 12.6249f, 11.5858f, 13.0f)
                lineTo(15.2929f, 16.7071f)
                curveTo(15.6834f, 17.0976f, 16.3166f, 17.0976f, 16.7071f, 16.7071f)
                curveTo(17.0976f, 16.3166f, 17.0976f, 15.6834f, 16.7071f, 15.2929f)
                lineTo(13.0f, 11.5858f)
                verticalLineTo(8.0f)
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
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 14.4013f, 21.1536f, 16.6049f, 19.7429f, 18.3287f)
                lineTo(21.7071f, 20.2929f)
                curveTo(22.0976f, 20.6834f, 22.0976f, 21.3166f, 21.7071f, 21.7071f)
                curveTo(21.3166f, 22.0976f, 20.6834f, 22.0976f, 20.2929f, 21.7071f)
                lineTo(18.3287f, 19.7429f)
                curveTo(16.6049f, 21.1536f, 14.4013f, 22.0f, 12.0f, 22.0f)
                curveTo(9.5987f, 22.0f, 7.3951f, 21.1536f, 5.6713f, 19.7429f)
                lineTo(3.7071f, 21.7071f)
                curveTo(3.3166f, 22.0976f, 2.6834f, 22.0976f, 2.2929f, 21.7071f)
                curveTo(1.9024f, 21.3166f, 1.9024f, 20.6834f, 2.2929f, 20.2929f)
                lineTo(4.2571f, 18.3287f)
                curveTo(2.8464f, 16.6049f, 2.0f, 14.4013f, 2.0f, 12.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }.build()
        return clockAlarm!!
    }

private var clockAlarm: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ClockAlarm,
                contentDescription = ""
            )
        }
    }
}