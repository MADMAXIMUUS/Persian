package io.github.madmaximuus.persianSymbols.pallete

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

val PersianSymbols.Default.Palette: ImageVector
    get() {
        if (palette != null) {
            return palette!!
        }
        palette = Builder(
            name = "palette-default",
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
                moveTo(15.0f, 6.5f)
                curveTo(15.0f, 7.3284f, 14.3284f, 8.0f, 13.5f, 8.0f)
                curveTo(12.6716f, 8.0f, 12.0f, 7.3284f, 12.0f, 6.5f)
                curveTo(12.0f, 5.6716f, 12.6716f, 5.0f, 13.5f, 5.0f)
                curveTo(14.3284f, 5.0f, 15.0f, 5.6716f, 15.0f, 6.5f)
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
                moveTo(8.5f, 9.0f)
                curveTo(9.3284f, 9.0f, 10.0f, 8.3284f, 10.0f, 7.5f)
                curveTo(10.0f, 6.6716f, 9.3284f, 6.0f, 8.5f, 6.0f)
                curveTo(7.6716f, 6.0f, 7.0f, 6.6716f, 7.0f, 7.5f)
                curveTo(7.0f, 8.3284f, 7.6716f, 9.0f, 8.5f, 9.0f)
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
                moveTo(8.0f, 12.5f)
                curveTo(8.0f, 13.3284f, 7.3284f, 14.0f, 6.5f, 14.0f)
                curveTo(5.6716f, 14.0f, 5.0f, 13.3284f, 5.0f, 12.5f)
                curveTo(5.0f, 11.6716f, 5.6716f, 11.0f, 6.5f, 11.0f)
                curveTo(7.3284f, 11.0f, 8.0f, 11.6716f, 8.0f, 12.5f)
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
                moveTo(16.5f, 12.0f)
                curveTo(17.3284f, 12.0f, 18.0f, 11.3284f, 18.0f, 10.5f)
                curveTo(18.0f, 9.6716f, 17.3284f, 9.0f, 16.5f, 9.0f)
                curveTo(15.6716f, 9.0f, 15.0f, 9.6716f, 15.0f, 10.5f)
                curveTo(15.0f, 11.3284f, 15.6716f, 12.0f, 16.5f, 12.0f)
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
                moveTo(3.9885f, 5.7907f)
                curveTo(5.5239f, 3.6582f, 8.0741f, 2.0f, 12.0f, 2.0f)
                curveTo(15.9259f, 2.0f, 18.4761f, 3.6582f, 20.0115f, 5.7907f)
                curveTo(21.5102f, 7.8722f, 22.0f, 10.34f, 22.0f, 12.0f)
                curveTo(22.0f, 12.6624f, 21.8423f, 13.2542f, 21.5098f, 13.7529f)
                curveTo(21.1805f, 14.2469f, 20.7285f, 14.5765f, 20.2592f, 14.8007f)
                curveTo(19.3701f, 15.2255f, 18.2492f, 15.3426f, 17.3495f, 15.4325f)
                lineTo(17.235f, 15.444f)
                curveTo(16.2888f, 15.5383f, 15.5577f, 15.6113f, 15.0343f, 15.8148f)
                curveTo(14.786f, 15.9114f, 14.6672f, 16.0092f, 14.6083f, 16.084f)
                curveTo(14.5713f, 16.131f, 14.5258f, 16.2083f, 14.5078f, 16.3582f)
                curveTo(14.516f, 16.3703f, 14.5255f, 16.384f, 14.5364f, 16.3992f)
                curveTo(14.6409f, 16.5455f, 14.7961f, 16.7283f, 15.0057f, 16.9701f)
                lineTo(15.0802f, 17.0558f)
                curveTo(15.4516f, 17.4831f, 15.9707f, 18.0803f, 16.2694f, 18.6778f)
                curveTo(16.4333f, 19.0055f, 16.5895f, 19.4425f, 16.547f, 19.9272f)
                curveTo(16.4997f, 20.4658f, 16.2207f, 20.9199f, 15.7789f, 21.2439f)
                curveTo(15.3736f, 21.5411f, 14.8487f, 21.7196f, 14.259f, 21.8304f)
                curveTo(13.6573f, 21.9435f, 12.9108f, 22.0f, 12.0f, 22.0f)
                curveTo(8.0741f, 22.0f, 5.5239f, 20.3418f, 3.9885f, 18.2093f)
                curveTo(2.4898f, 16.1278f, 2.0f, 13.66f, 2.0f, 12.0f)
                curveTo(2.0f, 10.34f, 2.4898f, 7.8722f, 3.9885f, 5.7907f)
                close()
                moveTo(5.6115f, 6.9593f)
                curveTo(4.4102f, 8.6278f, 4.0f, 10.66f, 4.0f, 12.0f)
                curveTo(4.0f, 13.34f, 4.4102f, 15.3722f, 5.6115f, 17.0407f)
                curveTo(6.7761f, 18.6582f, 8.7259f, 20.0f, 12.0f, 20.0f)
                curveTo(12.8392f, 20.0f, 13.4521f, 19.9471f, 13.8895f, 19.8649f)
                curveTo(14.2308f, 19.8007f, 14.4247f, 19.726f, 14.526f, 19.6734f)
                curveTo(14.5154f, 19.6462f, 14.5008f, 19.6127f, 14.4806f, 19.5722f)
                curveTo(14.2999f, 19.2109f, 13.9334f, 18.7866f, 13.4943f, 18.2799f)
                curveTo(13.2976f, 18.053f, 13.0779f, 17.7982f, 12.9089f, 17.5617f)
                curveTo(12.8234f, 17.4419f, 12.7315f, 17.3005f, 12.6581f, 17.1472f)
                curveTo(12.5899f, 17.0048f, 12.5f, 16.776f, 12.5f, 16.5f)
                curveTo(12.5f, 15.8716f, 12.6733f, 15.3091f, 13.0363f, 14.8476f)
                curveTo(13.3875f, 14.401f, 13.8546f, 14.1277f, 14.3094f, 13.9508f)
                curveTo(15.1011f, 13.6429f, 16.0988f, 13.5454f, 16.9327f, 13.4639f)
                curveTo(17.0067f, 13.4567f, 17.0793f, 13.4496f, 17.1505f, 13.4425f)
                curveTo(18.1258f, 13.3449f, 18.8799f, 13.2432f, 19.397f, 12.9961f)
                curveTo(19.6308f, 12.8844f, 19.7648f, 12.7648f, 19.8457f, 12.6435f)
                curveTo(19.9233f, 12.5271f, 20.0f, 12.3376f, 20.0f, 12.0f)
                curveTo(20.0f, 10.66f, 19.5898f, 8.6278f, 18.3885f, 6.9593f)
                curveTo(17.2239f, 5.3418f, 15.2741f, 4.0f, 12.0f, 4.0f)
                curveTo(8.7259f, 4.0f, 6.7761f, 5.3418f, 5.6115f, 6.9593f)
                close()
                moveTo(14.462f, 16.2835f)
                curveTo(14.46f, 16.2793f, 14.4608f, 16.2802f, 14.4632f, 16.2858f)
                lineTo(14.462f, 16.2835f)
                close()
            }
        }.build()
        return palette!!
    }

private var palette: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Palette,
                contentDescription = ""
            )
        }
    }
}