package io.github.madmaximuus.persianSymbols.forward.step

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

val PersianSymbols.Filled.ForwardStep: ImageVector
    get() {
        if (forwardStep != null) {
            return forwardStep!!
        }
        forwardStep = ImageVector.Builder(
            name = "forward-step-filled",
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
                moveTo(15.224f, 17f)
                curveTo(15.224f, 17.5523f, 15.6717f, 18f, 16.224f, 18f)
                curveTo(16.7763f, 18f, 17.224f, 17.5523f, 17.224f, 17f)
                verticalLineTo(7f)
                curveTo(17.224f, 6.4477f, 16.7763f, 6f, 16.224f, 6f)
                curveTo(15.6717f, 6f, 15.224f, 6.4477f, 15.224f, 7f)
                lineTo(15.224f, 10.8318f)
                lineTo(8.29302f, 6.64574f)
                curveTo(7.6265f, 6.2432f, 6.776f, 6.7231f, 6.776f, 7.5017f)
                lineTo(6.77603f, 16.4984f)
                curveTo(6.776f, 17.277f, 7.6265f, 17.757f, 8.293f, 17.3544f)
                lineTo(15.224f, 13.1683f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        return forwardStep!!
    }

private var forwardStep: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.ForwardStep,
                contentDescription = ""
            )
        }
    }
}