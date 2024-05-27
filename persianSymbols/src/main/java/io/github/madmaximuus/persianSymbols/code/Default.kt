package io.github.madmaximuus.persianSymbols.code

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

val PersianSymbols.Default.Code: ImageVector
    get() {
        if (code != null) {
            return code!!
        }
        code = Builder(
            name = "code-default",
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
                moveTo(14.9483f, 6.2586f)
                curveTo(15.1229f, 5.7347f, 14.8397f, 5.1684f, 14.3158f, 4.9937f)
                curveTo(13.7919f, 4.8191f, 13.2255f, 5.1022f, 13.0509f, 5.6262f)
                lineTo(9.0509f, 17.6262f)
                curveTo(8.8762f, 18.1501f, 9.1594f, 18.7164f, 9.6833f, 18.8911f)
                curveTo(10.2073f, 19.0657f, 10.7736f, 18.7826f, 10.9483f, 18.2586f)
                lineTo(14.9483f, 6.2586f)
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
                moveTo(7.4068f, 16.9422f)
                curveTo(7.7973f, 17.3327f, 8.4338f, 17.3361f, 8.8285f, 16.9498f)
                curveTo(9.2231f, 16.5634f, 9.2265f, 15.9336f, 8.8359f, 15.5431f)
                lineTo(5.2929f, 12.0f)
                lineTo(8.8359f, 8.4569f)
                curveTo(9.2264f, 8.0664f, 9.2231f, 7.4366f, 8.8284f, 7.0503f)
                curveTo(8.4338f, 6.6639f, 7.7972f, 6.6673f, 7.4067f, 7.0578f)
                lineTo(3.1758f, 11.2888f)
                lineTo(3.1716f, 11.2929f)
                curveTo(2.7769f, 11.6792f, 2.7736f, 12.309f, 3.1641f, 12.6996f)
                lineTo(7.4068f, 16.9422f)
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
                moveTo(16.5933f, 7.0579f)
                curveTo(16.2027f, 6.6673f, 15.5662f, 6.664f, 15.1716f, 7.0503f)
                curveTo(14.7769f, 7.4366f, 14.7735f, 8.0664f, 15.1641f, 8.457f)
                lineTo(18.7072f, 12.0f)
                lineTo(15.1641f, 15.5431f)
                curveTo(14.7736f, 15.9337f, 14.7769f, 16.5634f, 15.1716f, 16.9498f)
                curveTo(15.5663f, 17.3361f, 16.2028f, 17.3327f, 16.5933f, 16.9422f)
                lineTo(20.8242f, 12.7113f)
                lineTo(20.8284f, 12.7072f)
                curveTo(21.2231f, 12.3208f, 21.2264f, 11.691f, 20.8359f, 11.3005f)
                lineTo(16.5933f, 7.0579f)
                close()
            }
        }.build()
        return code!!
    }

private var code: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Code,
                contentDescription = ""
            )
        }
    }
}