package io.github.madmaximuus.persianSymbols.backward.fast

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

val PersianSymbols.Filled.BackwardFast: ImageVector
    get() {
        if (backwardFast != null) {
            return backwardFast!!
        }
        backwardFast = ImageVector.Builder(
            name = "backward-fast-filled",
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
                moveTo(4.49878f, 7f)
                curveTo(4.4988f, 6.4477f, 4.0511f, 6f, 3.4988f, 6f)
                curveTo(2.9465f, 6f, 2.4988f, 6.4477f, 2.4988f, 7f)
                verticalLineTo(17f)
                curveTo(2.4988f, 17.5523f, 2.9465f, 18f, 3.4988f, 18f)
                curveTo(4.0511f, 18f, 4.4988f, 17.5523f, 4.4988f, 17f)
                verticalLineTo(13.1682f)
                lineTo(11.4298f, 17.3543f)
                curveTo(12.0962f, 17.7568f, 12.9468f, 17.2769f, 12.9468f, 16.4983f)
                verticalLineTo(13.1038f)
                lineTo(19.9843f, 17.3543f)
                curveTo(20.6508f, 17.7568f, 21.5013f, 17.2769f, 21.5013f, 16.4983f)
                verticalLineTo(7.50155f)
                curveTo(21.5013f, 6.723f, 20.6508f, 6.243f, 19.9843f, 6.6456f)
                lineTo(12.9468f, 10.8961f)
                verticalLineTo(7.50155f)
                curveTo(12.9468f, 6.723f, 12.0962f, 6.243f, 11.4298f, 6.6456f)
                lineTo(4.49878f, 10.8317f)
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
                imageVector = PersianSymbols.Filled.BackwardFast,
                contentDescription = ""
            )
        }
    }
}