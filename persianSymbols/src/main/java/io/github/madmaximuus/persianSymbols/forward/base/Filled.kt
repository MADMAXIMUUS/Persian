package io.github.madmaximuus.persianSymbols.forward.base

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
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Forward: ImageVector
    get() {
        if (forward != null) {
            return forward!!
        }
        forward = Builder(
            name = "forward-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
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
                moveTo(13.069f, 17.3543f)
                lineTo(20.517f, 12.8559f)
                curveTo(21.161f, 12.4669f, 21.161f, 11.5329f, 20.517f, 11.1439f)
                lineTo(13.069f, 6.64556f)
                curveTo(12.4025f, 6.243f, 11.552f, 6.723f, 11.552f, 7.5015f)
                verticalLineTo(10.8961f)
                lineTo(4.51443f, 6.64556f)
                curveTo(3.848f, 6.243f, 2.9974f, 6.723f, 2.9974f, 7.5015f)
                lineTo(2.99744f, 16.4983f)
                curveTo(2.9974f, 17.2769f, 3.848f, 17.7568f, 4.5144f, 17.3543f)
                lineTo(11.552f, 13.1038f)
                verticalLineTo(16.4983f)
                curveTo(11.552f, 17.2769f, 12.4025f, 17.7568f, 13.069f, 17.3543f)
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
                imageVector = PersianSymbols.Filled.Forward,
                contentDescription = ""
            )
        }
    }
}