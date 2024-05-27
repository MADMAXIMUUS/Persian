package io.github.madmaximuus.persianSymbols.chevronRight.toLine

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

val PersianSymbols.Default.ChevronRightToLine: ImageVector
    get() {
        if (chevronRightToLine != null) {
            return chevronRightToLine!!
        }
        chevronRightToLine = Builder(
            name = "chevron-right-to-line-default",
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
                moveTo(14.0f, 17.0f)
                curveTo(14.0f, 17.5523f, 14.4477f, 18.0f, 15.0f, 18.0f)
                curveTo(15.5523f, 18.0f, 16.0f, 17.5523f, 16.0f, 17.0f)
                lineTo(16.0f, 7.0f)
                curveTo(16.0f, 6.4477f, 15.5523f, 6.0f, 15.0f, 6.0f)
                curveTo(14.4477f, 6.0f, 14.0f, 6.4477f, 14.0f, 7.0f)
                verticalLineTo(17.0f)
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
                moveTo(7.1715f, 7.0501f)
                curveTo(7.5662f, 6.6638f, 8.2027f, 6.6672f, 8.5933f, 7.0577f)
                lineTo(12.8359f, 11.3003f)
                curveTo(13.2264f, 11.6909f, 13.2231f, 12.3206f, 12.8284f, 12.707f)
                lineTo(12.8242f, 12.7111f)
                lineTo(8.5933f, 16.942f)
                curveTo(8.2028f, 17.3326f, 7.5663f, 17.336f, 7.1716f, 16.9496f)
                curveTo(6.7769f, 16.5633f, 6.7736f, 15.9335f, 7.1641f, 15.543f)
                lineTo(10.7072f, 11.9999f)
                lineTo(7.1641f, 8.4568f)
                curveTo(6.7735f, 8.0663f, 6.7769f, 7.4365f, 7.1715f, 7.0501f)
                close()
            }
        }.build()
        return chevronRightToLine!!
    }

private var chevronRightToLine: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ChevronRightToLine,
                contentDescription = ""
            )
        }
    }
}