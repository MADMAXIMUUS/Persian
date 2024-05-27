package io.github.madmaximuus.persianSymbols.message.base

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

val PersianSymbols.Default.Message: ImageVector
    get() {
        if (message != null) {
            return message!!
        }
        message = Builder(
            name = "message-default",
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
                moveTo(2.0f, 7.5f)
                curveTo(2.0f, 5.0147f, 4.0147f, 3.0f, 6.5f, 3.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 3.0f, 22.0f, 5.0147f, 22.0f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(22.0f, 16.9853f, 19.9853f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(8.674f)
                curveTo(8.356f, 19.0f, 8.0409f, 19.0607f, 7.7456f, 19.1788f)
                lineTo(3.3714f, 20.9285f)
                curveTo(3.0633f, 21.0517f, 2.7141f, 21.0141f, 2.4394f, 20.8281f)
                curveTo(2.1646f, 20.642f, 2.0f, 20.3318f, 2.0f, 20.0f)
                verticalLineTo(7.5f)
                close()
                moveTo(6.5f, 5.0f)
                curveTo(5.1193f, 5.0f, 4.0f, 6.1193f, 4.0f, 7.5f)
                verticalLineTo(18.523f)
                lineTo(7.0028f, 17.3219f)
                curveTo(7.5343f, 17.1092f, 8.1016f, 17.0f, 8.674f, 17.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 17.0f, 20.0f, 15.8807f, 20.0f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(20.0f, 6.1193f, 18.8807f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return message!!
    }

private var message: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Message,
                contentDescription = ""
            )
        }
    }
}