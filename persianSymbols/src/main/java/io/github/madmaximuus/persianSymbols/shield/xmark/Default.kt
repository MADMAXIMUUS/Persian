package io.github.madmaximuus.persianSymbols.shield.xmark

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

val PersianSymbols.Default.ShieldXMark: ImageVector
    get() {
        if (shieldXMark != null) {
            return shieldXMark!!
        }
        shieldXMark = Builder(
            name = "shield-xmark-default",
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
                moveTo(8.9253f, 14.4448f)
                curveTo(8.533f, 14.056f, 8.5314f, 13.4241f, 8.9218f, 13.0334f)
                lineTo(10.5857f, 11.3677f)
                lineTo(8.9217f, 9.702f)
                curveTo(8.5314f, 9.3113f, 8.533f, 8.6794f, 8.9252f, 8.2906f)
                curveTo(9.3175f, 7.9018f, 9.9519f, 7.9034f, 10.3422f, 8.2942f)
                lineTo(11.9991f, 9.9528f)
                lineTo(13.6561f, 8.2941f)
                curveTo(14.0464f, 7.9034f, 14.6808f, 7.9018f, 15.0731f, 8.2906f)
                curveTo(15.4654f, 8.6793f, 15.4669f, 9.3112f, 15.0766f, 9.702f)
                lineTo(13.4126f, 11.3677f)
                lineTo(15.0766f, 13.0335f)
                curveTo(15.4669f, 13.4242f, 15.4653f, 14.0561f, 15.0731f, 14.4449f)
                curveTo(14.6808f, 14.8337f, 14.0464f, 14.8321f, 13.6561f, 14.4414f)
                lineTo(11.9991f, 12.7827f)
                lineTo(10.3423f, 14.4413f)
                curveTo(9.952f, 14.832f, 9.3175f, 14.8336f, 8.9253f, 14.4448f)
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
                moveTo(12.3417f, 3.0602f)
                curveTo(12.121f, 2.9799f, 11.879f, 2.9799f, 11.6583f, 3.0602f)
                lineTo(3.6583f, 5.9693f)
                curveTo(3.2631f, 6.113f, 3.0f, 6.4886f, 3.0f, 6.9091f)
                curveTo(3.0f, 12.6952f, 6.2671f, 18.0121f, 11.5211f, 20.8779f)
                curveTo(11.8196f, 21.0407f, 12.1804f, 21.0407f, 12.4789f, 20.8779f)
                curveTo(17.7329f, 18.0121f, 21.0f, 12.6952f, 21.0f, 6.9091f)
                curveTo(21.0f, 6.4886f, 20.7369f, 6.113f, 20.3417f, 5.9693f)
                lineTo(12.3417f, 3.0602f)
                close()
                moveTo(12.0f, 18.8496f)
                curveTo(7.8474f, 16.3863f, 5.257f, 12.1777f, 5.0181f, 7.6029f)
                lineTo(12.0f, 5.0641f)
                lineTo(18.9819f, 7.6029f)
                curveTo(18.743f, 12.1777f, 16.1526f, 16.3863f, 12.0f, 18.8496f)
                close()
            }
        }.build()
        return shieldXMark!!
    }

private var shieldXMark: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ShieldXMark,
                contentDescription = ""
            )
        }
    }
}