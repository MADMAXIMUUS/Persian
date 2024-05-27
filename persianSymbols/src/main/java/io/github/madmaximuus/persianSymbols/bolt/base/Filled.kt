package io.github.madmaximuus.persianSymbols.bolt.base

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

val PersianSymbols.Filled.Bolt: ImageVector
    get() {
        if (bolt != null) {
            return bolt!!
        }
        bolt = Builder(
            name = "bolt-filled",
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
                moveTo(6.8961f, 14.2376f)
                curveTo(6.494f, 14.2376f, 6.2564f, 13.7871f, 6.4834f, 13.4553f)
                lineTo(13.1582f, 3.6985f)
                curveTo(13.458f, 3.2602f, 14.1441f, 3.5299f, 14.0653f, 4.055f)
                lineTo(13.2976f, 9.1721f)
                curveTo(13.2522f, 9.4744f, 13.4864f, 9.7463f, 13.7921f, 9.7463f)
                horizontalLineTo(17.103f)
                curveTo(17.5056f, 9.7463f, 17.7431f, 10.1978f, 17.515f, 10.5296f)
                lineTo(10.8003f, 20.2953f)
                curveTo(10.4987f, 20.7339f, 9.8116f, 20.4602f, 9.8943f, 19.9343f)
                lineTo(10.6995f, 14.8153f)
                curveTo(10.7472f, 14.5119f, 10.5127f, 14.2376f, 10.2056f, 14.2376f)
                horizontalLineTo(6.8961f)
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
                imageVector = PersianSymbols.Filled.Bolt,
                contentDescription = ""
            )
        }
    }
}