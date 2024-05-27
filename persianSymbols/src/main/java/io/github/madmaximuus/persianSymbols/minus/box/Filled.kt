package io.github.madmaximuus.persianSymbols.minus.box

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

val PersianSymbols.Filled.MinusBox: ImageVector
    get() {
        if (minusBox != null) {
            return minusBox!!
        }
        minusBox = Builder(
            name = "minus-box-filled",
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
                moveTo(7.4f, 3.0f)
                curveTo(4.97f, 3.0f, 3.0f, 4.97f, 3.0f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(3.0f, 19.0301f, 4.97f, 21.0f, 7.4f, 21.0f)
                horizontalLineTo(16.6f)
                curveTo(19.0301f, 21.0f, 21.0f, 19.0301f, 21.0f, 16.6f)
                verticalLineTo(7.4f)
                curveTo(21.0f, 4.97f, 19.0301f, 3.0f, 16.6f, 3.0f)
                horizontalLineTo(7.4f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(7.4477f, 11.0f, 7.0f, 11.4477f, 7.0f, 12.0f)
                curveTo(7.0f, 12.5523f, 7.4477f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(16.0038f)
                curveTo(16.5561f, 13.0f, 17.0038f, 12.5523f, 17.0038f, 12.0f)
                curveTo(17.0038f, 11.4477f, 16.5561f, 11.0f, 16.0038f, 11.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }.build()
        return minusBox!!
    }

private var minusBox: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.MinusBox,
                contentDescription = ""
            )
        }
    }
}