package io.github.madmaximuus.persianSymbols.bell.exclamation

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

val PersianSymbols.Filled.BellExclamation: ImageVector
    get() {
        if (bellExclamation != null) {
            return bellExclamation!!
        }
        bellExclamation = Builder(
            name = "bell-exclamation-filled",
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
                moveTo(12.0f, 2.0f)
                curveTo(12.5523f, 2.0f, 13.0f, 2.4477f, 13.0f, 3.0f)
                verticalLineTo(3.083f)
                curveTo(15.8377f, 3.559f, 18.0f, 6.027f, 18.0f, 9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 17.0f, 20.0f, 17.4477f, 20.0f, 18.0f)
                curveTo(20.0f, 18.5523f, 19.5523f, 19.0f, 19.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                curveTo(4.4477f, 19.0f, 4.0f, 18.5523f, 4.0f, 18.0f)
                curveTo(4.0f, 17.4477f, 4.4477f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                curveTo(6.0f, 6.027f, 8.1623f, 3.559f, 11.0f, 3.083f)
                verticalLineTo(3.0f)
                curveTo(11.0f, 2.4477f, 11.4477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(13.0f, 12.5523f, 12.5523f, 13.0f, 12.0f, 13.0f)
                curveTo(11.4477f, 13.0f, 11.0f, 12.5523f, 11.0f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(11.0f, 7.4477f, 11.4477f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(11.0f, 15.0f)
                curveTo(11.0f, 15.5523f, 11.4477f, 16.0f, 12.0f, 16.0f)
                curveTo(12.5523f, 16.0f, 13.0f, 15.5523f, 13.0f, 15.0f)
                curveTo(13.0f, 14.4477f, 12.5523f, 14.0f, 12.0f, 14.0f)
                curveTo(11.4477f, 14.0f, 11.0f, 14.4477f, 11.0f, 15.0f)
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
                moveTo(12.0f, 22.0f)
                curveTo(11.1993f, 22.0f, 10.4718f, 21.6863f, 9.9338f, 21.1751f)
                curveTo(9.4335f, 20.6997f, 9.8946f, 20.0f, 10.5848f, 20.0f)
                horizontalLineTo(13.4152f)
                curveTo(14.1054f, 20.0f, 14.5665f, 20.6997f, 14.0662f, 21.1751f)
                curveTo(13.5282f, 21.6863f, 12.8007f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }.build()
        return bellExclamation!!
    }

private var bellExclamation: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.BellExclamation,
                contentDescription = ""
            )
        }
    }
}