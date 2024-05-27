package io.github.madmaximuus.persianSymbols.backward.step

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

val PersianSymbols.Filled.BackwardStep: ImageVector
    get() {
        if (backwardStep != null) {
            return backwardStep!!
        }
        backwardStep = ImageVector.Builder(
            name = "backward-step-filled",
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
                moveTo(8.776f, 7f)
                curveTo(8.776f, 6.4477f, 8.3283f, 6f, 7.776f, 6f)
                curveTo(7.2237f, 6f, 6.776f, 6.4477f, 6.776f, 7f)
                verticalLineTo(17f)
                curveTo(6.776f, 17.5523f, 7.2237f, 18f, 7.776f, 18f)
                curveTo(8.3283f, 18f, 8.776f, 17.5523f, 8.776f, 17f)
                verticalLineTo(13.1682f)
                lineTo(15.707f, 17.3543f)
                curveTo(16.3735f, 17.7568f, 17.224f, 17.2769f, 17.224f, 16.4983f)
                verticalLineTo(7.50155f)
                curveTo(17.224f, 6.723f, 16.3735f, 6.243f, 15.707f, 6.6456f)
                lineTo(8.776f, 10.8317f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        return backwardStep!!
    }

private var backwardStep: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.BackwardStep,
                contentDescription = ""
            )
        }
    }
}