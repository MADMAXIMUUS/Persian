package io.github.madmaximuus.persianSymbols.bolt.base

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

val PersianSymbols.Default.Bolt: ImageVector
    get() {
        if (bolt != null) {
            return bolt!!
        }
        bolt = Builder(
            name = "bolt-default",
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
                moveTo(14.3171f, 2.0731f)
                curveTo(14.7589f, 2.2353f, 15.0278f, 2.6836f, 14.9629f, 3.1497f)
                lineTo(14.1488f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(17.3652f, 9.0f, 17.7013f, 9.199f, 17.8768f, 9.5192f)
                curveTo(18.0524f, 9.8394f, 18.0395f, 10.2298f, 17.8431f, 10.5377f)
                lineTo(10.8201f, 21.5496f)
                curveTo(10.5666f, 21.9471f, 10.07f, 22.1135f, 9.6282f, 21.9491f)
                curveTo(9.1864f, 21.7846f, 8.9194f, 21.334f, 8.9875f, 20.8675f)
                lineTo(9.8435f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(6.6353f, 15.0f, 6.2994f, 14.8014f, 6.1237f, 14.4818f)
                curveTo(5.948f, 14.1621f, 5.9602f, 13.7722f, 6.1556f, 13.4642f)
                lineTo(13.1281f, 2.4761f)
                curveTo(13.3802f, 2.0787f, 13.8753f, 1.911f, 14.3171f, 2.0731f)
                close()
                moveTo(8.8189f, 13.0f)
                horizontalLineTo(11.0f)
                curveTo(11.2904f, 13.0f, 11.5665f, 13.1262f, 11.7564f, 13.3459f)
                curveTo(11.9464f, 13.5656f, 12.0315f, 13.857f, 11.9895f, 14.1444f)
                lineTo(11.6391f, 16.546f)
                lineTo(15.1762f, 11.0f)
                horizontalLineTo(13.0f)
                curveTo(12.7107f, 11.0f, 12.4357f, 10.8747f, 12.2457f, 10.6566f)
                curveTo(12.0558f, 10.4384f, 11.9697f, 10.1487f, 12.0095f, 9.8622f)
                lineTo(12.3465f, 7.4407f)
                lineTo(8.8189f, 13.0f)
                close()
            }
        }.build()
        return bolt!!
    }

private var bolt: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Bolt,
                contentDescription = ""
            )
        }
    }
}