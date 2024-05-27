package io.github.madmaximuus.persianSymbols.clock.timer

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

val PersianSymbols.Filled.ClockTimer: ImageVector
    get() {
        if (clockTimer != null) {
            return clockTimer!!
        }
        clockTimer = Builder(
            name = "clock-timer-filled",
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
                moveTo(21.2929f, 5.7071f)
                lineTo(18.2929f, 2.7071f)
                curveTo(17.9024f, 2.3166f, 17.9024f, 1.6834f, 18.2929f, 1.2929f)
                curveTo(18.6834f, 0.9024f, 19.3166f, 0.9024f, 19.7071f, 1.2929f)
                lineTo(22.7071f, 4.2929f)
                curveTo(23.0976f, 4.6834f, 23.0976f, 5.3166f, 22.7071f, 5.7071f)
                curveTo(22.3166f, 6.0976f, 21.6834f, 6.0976f, 21.2929f, 5.7071f)
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
                moveTo(2.7071f, 5.7071f)
                lineTo(5.7071f, 2.7071f)
                curveTo(6.0976f, 2.3166f, 6.0976f, 1.6834f, 5.7071f, 1.2929f)
                curveTo(5.3166f, 0.9024f, 4.6834f, 0.9024f, 4.2929f, 1.2929f)
                lineTo(1.2929f, 4.2929f)
                curveTo(0.9024f, 4.6834f, 0.9024f, 5.3166f, 1.2929f, 5.7071f)
                curveTo(1.6834f, 6.0976f, 2.3166f, 6.0976f, 2.7071f, 5.7071f)
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
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.75f, 8.0f)
                curveTo(12.75f, 7.4477f, 12.3023f, 7.0f, 11.75f, 7.0f)
                curveTo(11.1977f, 7.0f, 10.75f, 7.4477f, 10.75f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(10.75f, 12.5523f, 11.1977f, 13.0f, 11.75f, 13.0f)
                curveTo(12.3023f, 13.0f, 12.75f, 12.5523f, 12.75f, 12.0f)
                verticalLineTo(8.0f)
                close()
            }
        }.build()
        return clockTimer!!
    }

private var clockTimer: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.ClockTimer,
                contentDescription = ""
            )
        }
    }
}