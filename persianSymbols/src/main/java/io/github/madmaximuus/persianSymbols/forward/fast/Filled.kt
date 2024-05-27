package io.github.madmaximuus.persianSymbols.forward.fast

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
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ForwardFast: ImageVector
    get() {
        if (backwardFast != null) {
            return backwardFast!!
        }
        backwardFast = ImageVector.Builder(
            name = "forward-fast-filled",
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 7f)
                curveTo(21f, 6.4477f, 20.5523f, 6f, 20f, 6f)
                curveTo(19.4477f, 6f, 19f, 6.4477f, 19f, 7f)
                verticalLineTo(10.2278f)
                lineTo(13.069f, 6.64562f)
                curveTo(12.4025f, 6.2431f, 11.552f, 6.723f, 11.552f, 7.5016f)
                lineTo(11.552f, 10.8961f)
                lineTo(4.51445f, 6.64562f)
                curveTo(3.848f, 6.2431f, 2.9975f, 6.723f, 2.9975f, 7.5016f)
                verticalLineTo(16.4983f)
                curveTo(2.9975f, 17.2769f, 3.848f, 17.7568f, 4.5145f, 17.3543f)
                lineTo(11.552f, 13.1038f)
                verticalLineTo(16.4983f)
                curveTo(11.552f, 17.2769f, 12.4025f, 17.7568f, 13.069f, 17.3543f)
                lineTo(19f, 13.7722f)
                verticalLineTo(17f)
                curveTo(19f, 17.5523f, 19.4477f, 18f, 20f, 18f)
                curveTo(20.5523f, 18f, 21f, 17.5523f, 21f, 17f)
                verticalLineTo(12.0007f)
                curveTo(21f, 12.0002f, 21f, 11.9997f, 21f, 11.9992f)
                verticalLineTo(7f)
                close()
            }
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
                moveTo(21.0013f, 7f)
                curveTo(21.0013f, 6.4477f, 20.5536f, 6f, 20.0013f, 6f)
                curveTo(19.449f, 6f, 19.0013f, 6.4477f, 19.0013f, 7f)
                verticalLineTo(10.2278f)
                lineTo(13.0703f, 6.64562f)
                curveTo(12.4039f, 6.2431f, 11.5533f, 6.723f, 11.5533f, 7.5016f)
                verticalLineTo(10.8961f)
                lineTo(4.51577f, 6.64562f)
                curveTo(3.8493f, 6.2431f, 2.9988f, 6.723f, 2.9988f, 7.5016f)
                verticalLineTo(16.4983f)
                curveTo(2.9988f, 17.2769f, 3.8493f, 17.7568f, 4.5158f, 17.3543f)
                lineTo(11.5533f, 13.1038f)
                verticalLineTo(16.4983f)
                curveTo(11.5533f, 17.2769f, 12.4039f, 17.7568f, 13.0703f, 17.3543f)
                lineTo(19.0013f, 13.7722f)
                verticalLineTo(17f)
                curveTo(19.0013f, 17.5523f, 19.449f, 18f, 20.0013f, 18f)
                curveTo(20.5536f, 18f, 21.0013f, 17.5523f, 21.0013f, 17f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        return backwardFast!!
    }

private var backwardFast: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.ForwardFast,
                contentDescription = ""
            )
        }
    }
}