package io.github.madmaximuus.persianSymbols.shield.xmark

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

val PersianSymbols.Filled.ShieldXNark: ImageVector
    get() {
        if (shieldXMark != null) {
            return shieldXMark!!
        }
        shieldXMark = Builder(
            name = "ShieldXmarkFilled",
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
                moveTo(12.3418f, 3.1242f)
                curveTo(12.121f, 3.0439f, 11.879f, 3.0439f, 11.6583f, 3.1242f)
                lineTo(3.6583f, 6.0333f)
                curveTo(3.2631f, 6.177f, 2.997f, 6.553f, 3.0152f, 6.9731f)
                curveTo(3.2601f, 12.6036f, 6.4463f, 17.7617f, 11.525f, 20.7315f)
                curveTo(11.8185f, 20.9032f, 12.1815f, 20.9032f, 12.475f, 20.7315f)
                curveTo(17.5538f, 17.7617f, 20.7399f, 12.6036f, 20.9848f, 6.9731f)
                curveTo(21.0031f, 6.553f, 20.7369f, 6.177f, 20.3418f, 6.0333f)
                lineTo(12.3418f, 3.1242f)
                close()
                moveTo(8.9253f, 14.4447f)
                curveTo(8.533f, 14.0559f, 8.5314f, 13.424f, 8.9218f, 13.0333f)
                lineTo(10.5857f, 11.3676f)
                lineTo(8.9217f, 9.7019f)
                curveTo(8.5314f, 9.3112f, 8.533f, 8.6793f, 8.9253f, 8.2905f)
                curveTo(9.3175f, 7.9017f, 9.9519f, 7.9033f, 10.3422f, 8.2941f)
                lineTo(11.9991f, 9.9527f)
                lineTo(13.6561f, 8.294f)
                curveTo(14.0464f, 7.9033f, 14.6808f, 7.9017f, 15.0731f, 8.2905f)
                curveTo(15.4654f, 8.6792f, 15.467f, 9.3111f, 15.0766f, 9.7019f)
                lineTo(13.4126f, 11.3676f)
                lineTo(15.0766f, 13.0334f)
                curveTo(15.4669f, 13.4241f, 15.4653f, 14.056f, 15.0731f, 14.4448f)
                curveTo(14.6808f, 14.8336f, 14.0464f, 14.832f, 13.6561f, 14.4413f)
                lineTo(11.9991f, 12.7826f)
                lineTo(10.3423f, 14.4412f)
                curveTo(9.952f, 14.8319f, 9.3175f, 14.8335f, 8.9253f, 14.4447f)
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
                imageVector = PersianSymbols.Filled.ShieldXNark,
                contentDescription = ""
            )
        }
    }
}