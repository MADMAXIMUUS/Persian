package io.github.madmaximuus.persianSymbols.chevronLeft.toLine

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

val PersianSymbols.Default.ChevronLeftToLine: ImageVector
    get() {
        if (chevronLeftToLine != null) {
            return chevronLeftToLine!!
        }
        chevronLeftToLine = Builder(
            name = "chevron-left-to-line-default",
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
                moveTo(9.0f, 7.0f)
                curveTo(9.0f, 6.4477f, 8.5523f, 6.0f, 8.0f, 6.0f)
                curveTo(7.4477f, 6.0f, 7.0f, 6.4477f, 7.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 17.5523f, 7.4477f, 18.0f, 8.0f, 18.0f)
                curveTo(8.5523f, 18.0f, 9.0f, 17.5523f, 9.0f, 17.0f)
                verticalLineTo(7.0f)
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
                moveTo(15.8284f, 16.9496f)
                curveTo(15.4338f, 17.3359f, 14.7973f, 17.3326f, 14.4067f, 16.942f)
                lineTo(10.1641f, 12.6994f)
                curveTo(9.7736f, 12.3089f, 9.7769f, 11.6791f, 10.1716f, 11.2927f)
                lineTo(10.1758f, 11.2886f)
                lineTo(14.4067f, 7.0577f)
                curveTo(14.7972f, 6.6672f, 15.4337f, 6.6638f, 15.8284f, 7.0501f)
                curveTo(16.2231f, 7.4365f, 16.2264f, 8.0662f, 15.8359f, 8.4568f)
                lineTo(12.2928f, 11.9999f)
                lineTo(15.8359f, 15.5429f)
                curveTo(16.2265f, 15.9335f, 16.2231f, 16.5633f, 15.8284f, 16.9496f)
                close()
            }
        }.build()
        return chevronLeftToLine!!
    }

private var chevronLeftToLine: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ChevronLeftToLine,
                contentDescription = ""
            )
        }
    }
}