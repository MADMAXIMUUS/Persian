package io.github.madmaximuus.persianIcons.xmark.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

val PersianSymbols.Default.XMark: ImageVector
    get() {
        if (xMark != null) {
            return xMark!!
        }
        xMark = ImageVector.Builder(
            name = "xMark-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.92541f, 17.6604f)
                curveTo(4.5349f, 18.0509f, 4.5365f, 18.6825f, 4.9289f, 19.0711f)
                curveTo(5.3214f, 19.4596f, 5.9562f, 19.4581f, 6.3467f, 19.0675f)
                lineTo(12f, 13.4142f)
                lineTo(17.6533f, 19.0675f)
                curveTo(18.0439f, 19.4581f, 18.6786f, 19.4597f, 19.0711f, 19.0711f)
                curveTo(19.4635f, 18.6825f, 19.4651f, 18.0509f, 19.0746f, 17.6604f)
                lineTo(13.4142f, 12f)
                lineTo(19.0746f, 6.3396f)
                curveTo(19.4651f, 5.9491f, 19.4635f, 5.3175f, 19.0711f, 4.9289f)
                curveTo(18.6786f, 4.5404f, 18.0439f, 4.542f, 17.6533f, 4.9325f)
                lineTo(12f, 10.5858f)
                lineTo(6.34668f, 4.9325f)
                curveTo(5.9562f, 4.542f, 5.3214f, 4.5404f, 4.9289f, 4.929f)
                curveTo(4.5365f, 5.3175f, 4.5349f, 5.9491f, 4.9254f, 6.3396f)
                lineTo(10.5858f, 12f)
                lineTo(4.92541f, 17.6604f)
                close()
            }
        }.build()
        return xMark!!
    }

private var xMark: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.XMark,
                contentDescription = ""
            )
        }
    }
}