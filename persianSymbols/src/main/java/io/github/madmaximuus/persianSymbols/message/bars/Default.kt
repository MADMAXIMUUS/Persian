package io.github.madmaximuus.persianSymbols.message.bars

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

val PersianSymbols.Default.MessageBars: ImageVector
    get() {
        if (messageBars != null) {
            return messageBars!!
        }
        messageBars = Builder(
            name = "message-bars-default",
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
                moveTo(7.0f, 7.0f)
                curveTo(6.4477f, 7.0f, 6.0f, 7.4477f, 6.0f, 8.0f)
                curveTo(6.0f, 8.5523f, 6.4477f, 9.0f, 7.0f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 9.0f, 18.0f, 8.5523f, 18.0f, 8.0f)
                curveTo(18.0f, 7.4477f, 17.5523f, 7.0f, 17.0f, 7.0f)
                horizontalLineTo(7.0f)
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
                moveTo(7.0f, 10.0f)
                curveTo(6.4477f, 10.0f, 6.0f, 10.4477f, 6.0f, 11.0f)
                curveTo(6.0f, 11.5523f, 6.4477f, 12.0f, 7.0f, 12.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 12.0f, 18.0f, 11.5523f, 18.0f, 11.0f)
                curveTo(18.0f, 10.4477f, 17.5523f, 10.0f, 17.0f, 10.0f)
                horizontalLineTo(7.0f)
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
                moveTo(6.0f, 14.0f)
                curveTo(6.0f, 13.4477f, 6.4477f, 13.0f, 7.0f, 13.0f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 13.0f, 14.0f, 13.4477f, 14.0f, 14.0f)
                curveTo(14.0f, 14.5523f, 13.5523f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 15.0f, 6.0f, 14.5523f, 6.0f, 14.0f)
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
                moveTo(6.5f, 3.0f)
                curveTo(4.0147f, 3.0f, 2.0f, 5.0147f, 2.0f, 7.5f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.3318f, 2.1646f, 20.642f, 2.4394f, 20.8281f)
                curveTo(2.7141f, 21.0141f, 3.0633f, 21.0517f, 3.3714f, 20.9285f)
                lineTo(7.7456f, 19.1788f)
                curveTo(8.0409f, 19.0607f, 8.356f, 19.0f, 8.674f, 19.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 19.0f, 22.0f, 16.9853f, 22.0f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(22.0f, 5.0147f, 19.9853f, 3.0f, 17.5f, 3.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4.0f, 7.5f)
                curveTo(4.0f, 6.1193f, 5.1193f, 5.0f, 6.5f, 5.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 5.0f, 20.0f, 6.1193f, 20.0f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(20.0f, 15.8807f, 18.8807f, 17.0f, 17.5f, 17.0f)
                horizontalLineTo(8.674f)
                curveTo(8.1016f, 17.0f, 7.5343f, 17.1092f, 7.0028f, 17.3219f)
                lineTo(4.0f, 18.523f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()
        return messageBars!!
    }

private var messageBars: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.MessageBars,
                contentDescription = ""
            )
        }
    }
}