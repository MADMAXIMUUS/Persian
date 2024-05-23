package io.github.madmaximuus.persianIcons.caretDown.base

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
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

val PersianSymbols.Default.CaretDown: ImageVector
    get() {
        if (caretDown != null) {
            return caretDown!!
        }
        caretDown = ImageVector.Builder(
            name = "caret-down-default",
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
                moveTo(14.6953f, 9.90912f)
                curveTo(14.9769f, 9.9091f, 15.1072f, 10.298f, 14.8944f, 10.503f)
                lineTo(12.199f, 13.0993f)
                curveTo(12.0848f, 13.2094f, 11.9152f, 13.2094f, 11.801f, 13.0993f)
                lineTo(9.10561f, 10.503f)
                curveTo(8.8928f, 10.298f, 9.0231f, 9.9091f, 9.3047f, 9.9091f)
                lineTo(14.6953f, 9.90912f)
                close()
            }
        }.build()
        return caretDown!!
    }

private var caretDown: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CaretDown,
                contentDescription = ""
            )
        }
    }
}