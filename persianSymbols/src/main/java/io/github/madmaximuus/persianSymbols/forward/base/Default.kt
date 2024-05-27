package io.github.madmaximuus.persianSymbols.forward.base

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

val PersianSymbols.Default.Forward: ImageVector
    get() {
        if (forward != null) {
            return forward!!
        }
        forward = Builder(
            name = "forward-default",
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
                moveTo(13.5036f, 6.7114f)
                curveTo(12.5037f, 6.1197f, 11.2397f, 6.8404f, 11.2397f, 8.0023f)
                verticalLineTo(10.2476f)
                lineTo(5.2639f, 6.7114f)
                curveTo(4.264f, 6.1197f, 3.0f, 6.8404f, 3.0f, 8.0023f)
                verticalLineTo(16.0003f)
                curveTo(3.0f, 17.1621f, 4.264f, 17.8829f, 5.2639f, 17.2912f)
                lineTo(11.2397f, 13.755f)
                verticalLineTo(16.0003f)
                curveTo(11.2397f, 17.1621f, 12.5037f, 17.8829f, 13.5036f, 17.2912f)
                lineTo(20.2615f, 13.2922f)
                curveTo(21.243f, 12.7114f, 21.243f, 11.2912f, 20.2615f, 10.7104f)
                lineTo(13.5036f, 6.7114f)
                close()
                moveTo(13.2397f, 15.1234f)
                verticalLineTo(8.8792f)
                lineTo(18.5158f, 12.0013f)
                lineTo(13.2397f, 15.1234f)
                close()
                moveTo(5.0f, 15.1234f)
                verticalLineTo(8.8792f)
                lineTo(10.2761f, 12.0013f)
                lineTo(5.0f, 15.1234f)
                close()
            }
        }.build()
        return forward!!
    }

private var forward: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Forward,
                contentDescription = ""
            )
        }
    }
}