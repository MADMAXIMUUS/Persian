package io.github.madmaximuus.persianSymbols.plus.box

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PlusBox: ImageVector
    get() {
        if (plusBox != null) {
            return plusBox!!
        }
        plusBox = ImageVector.Builder(
            name = "add-box-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                moveTo(13.0212f, 8.0f)
                curveTo(13.0212f, 7.4477f, 12.5735f, 7.0f, 12.0212f, 7.0f)
                curveTo(11.4689f, 7.0f, 11.0212f, 7.4477f, 11.0212f, 8.0f)
                verticalLineTo(11.0642f)
                horizontalLineTo(8.0f)
                curveTo(7.4478f, 11.0642f, 7.0f, 11.5119f, 7.0f, 12.0642f)
                curveTo(7.0f, 12.6165f, 7.4478f, 13.0642f, 8.0f, 13.0642f)
                horizontalLineTo(11.0212f)
                verticalLineTo(16.0f)
                curveTo(11.0212f, 16.5523f, 11.4689f, 17.0f, 12.0212f, 17.0f)
                curveTo(12.5735f, 17.0f, 13.0212f, 16.5523f, 13.0212f, 16.0f)
                verticalLineTo(13.0642f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 13.0642f, 17.0f, 12.6165f, 17.0f, 12.0642f)
                curveTo(17.0f, 11.5119f, 16.5523f, 11.0642f, 16.0f, 11.0642f)
                horizontalLineTo(13.0212f)
                verticalLineTo(8.0f)
                close()
            }
        }.build()
        return plusBox!!
    }

private var plusBox: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.PlusBox,
                contentDescription = ""
            )
        }
    }
}