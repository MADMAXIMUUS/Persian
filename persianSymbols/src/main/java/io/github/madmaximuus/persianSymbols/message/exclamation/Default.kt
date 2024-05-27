package io.github.madmaximuus.persianSymbols.message.exclamation

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

val PersianSymbols.Default.MessageExclamation: ImageVector
    get() {
        if (messageExclamation != null) {
            return messageExclamation!!
        }
        messageExclamation = Builder(
            name = "message-exclamation-default",
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
                moveTo(12.0f, 7.5f)
                curveTo(12.5523f, 7.5f, 13.0f, 7.9477f, 13.0f, 8.5f)
                verticalLineTo(12.5f)
                curveTo(13.0f, 13.0523f, 12.5523f, 13.5f, 12.0f, 13.5f)
                curveTo(11.4477f, 13.5f, 11.0f, 13.0523f, 11.0f, 12.5f)
                verticalLineTo(8.5f)
                curveTo(11.0f, 7.9477f, 11.4477f, 7.5f, 12.0f, 7.5f)
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
                moveTo(11.0f, 15.5f)
                curveTo(11.0f, 16.0523f, 11.4477f, 16.5f, 12.0f, 16.5f)
                curveTo(12.5523f, 16.5f, 13.0f, 16.0523f, 13.0f, 15.5f)
                curveTo(13.0f, 14.9477f, 12.5523f, 14.5f, 12.0f, 14.5f)
                curveTo(11.4477f, 14.5f, 11.0f, 14.9477f, 11.0f, 15.5f)
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
                moveTo(6.5f, 4.0f)
                curveTo(4.0147f, 4.0f, 2.0f, 6.0147f, 2.0f, 8.5f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.3318f, 2.1646f, 21.642f, 2.4394f, 21.8281f)
                curveTo(2.7141f, 22.0141f, 3.0633f, 22.0517f, 3.3714f, 21.9285f)
                lineTo(7.7456f, 20.1788f)
                curveTo(8.0409f, 20.0607f, 8.356f, 20.0f, 8.674f, 20.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 20.0f, 22.0f, 17.9853f, 22.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 6.0147f, 19.9853f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4.0f, 8.5f)
                curveTo(4.0f, 7.1193f, 5.1193f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 6.0f, 20.0f, 7.1193f, 20.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20.0f, 16.8807f, 18.8807f, 18.0f, 17.5f, 18.0f)
                horizontalLineTo(8.674f)
                curveTo(8.1016f, 18.0f, 7.5343f, 18.1092f, 7.0028f, 18.3219f)
                lineTo(4.0f, 19.523f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()
        return messageExclamation!!
    }

private var messageExclamation: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.MessageExclamation,
                contentDescription = ""
            )
        }
    }
}