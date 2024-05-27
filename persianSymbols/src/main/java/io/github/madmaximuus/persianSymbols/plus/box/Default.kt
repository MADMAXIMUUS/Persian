package io.github.madmaximuus.persianSymbols.plus.box

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PlusBox: ImageVector
    get() {
        if (plusBox != null) {
            return plusBox!!
        }
        plusBox = ImageVector.Builder(
            name = "add-box-default",
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
                pathFillType = NonZero
            ) {
                moveTo(13.0212f, 8.0f)
                curveTo(13.0212f, 7.4477f, 12.5735f, 7.0f, 12.0212f, 7.0f)
                curveTo(11.4689f, 7.0f, 11.0212f, 7.4477f, 11.0212f, 8.0f)
                verticalLineTo(11.0642f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 11.0642f, 7.0f, 11.5119f, 7.0f, 12.0642f)
                curveTo(7.0f, 12.6165f, 7.4477f, 13.0642f, 8.0f, 13.0642f)
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.5f, 3.0128f)
                curveTo(5.0147f, 3.0128f, 3.0f, 5.0275f, 3.0f, 7.5128f)
                verticalLineTo(16.5128f)
                curveTo(3.0f, 18.9981f, 5.0147f, 21.0128f, 7.5f, 21.0128f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 21.0128f, 21.0f, 18.9981f, 21.0f, 16.5128f)
                verticalLineTo(7.5128f)
                curveTo(21.0f, 5.0275f, 18.9853f, 3.0128f, 16.5f, 3.0128f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5.0f, 7.5128f)
                curveTo(5.0f, 6.1321f, 6.1193f, 5.0128f, 7.5f, 5.0128f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 5.0128f, 19.0f, 6.1321f, 19.0f, 7.5128f)
                verticalLineTo(16.5128f)
                curveTo(19.0f, 17.8935f, 17.8807f, 19.0128f, 16.5f, 19.0128f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 19.0128f, 5.0f, 17.8935f, 5.0f, 16.5128f)
                verticalLineTo(7.5128f)
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
                imageVector = PersianSymbols.Default.PlusBox,
                contentDescription = ""
            )
        }
    }
}