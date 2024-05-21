package io.github.madmaximuus.persianIcons.add.box

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

val PersianSymbols.Default.AddBox: ImageVector
    get() {
        if (addBox != null) {
            return addBox!!
        }
        addBox = ImageVector.Builder(
            name = "add-box-default",
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
                moveTo(13.0212f, 8f)
                curveTo(13.0212f, 7.4477f, 12.5735f, 7f, 12.0212f, 7f)
                curveTo(11.4689f, 7f, 11.0212f, 7.4477f, 11.0212f, 8f)
                verticalLineTo(11.0642f)
                horizontalLineTo(8.00003f)
                curveTo(7.4478f, 11.0642f, 7f, 11.5119f, 7f, 12.0642f)
                curveTo(7f, 12.6165f, 7.4478f, 13.0642f, 8f, 13.0642f)
                horizontalLineTo(11.0212f)
                verticalLineTo(16f)
                curveTo(11.0212f, 16.5523f, 11.4689f, 17f, 12.0212f, 17f)
                curveTo(12.5735f, 17f, 13.0212f, 16.5523f, 13.0212f, 16f)
                verticalLineTo(13.0642f)
                horizontalLineTo(16f)
                curveTo(16.5523f, 13.0642f, 17f, 12.6165f, 17f, 12.0642f)
                curveTo(17f, 11.5119f, 16.5523f, 11.0642f, 16f, 11.0642f)
                horizontalLineTo(13.0212f)
                verticalLineTo(8f)
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.50003f, 3.01282f)
                curveTo(5.0148f, 3.0128f, 3f, 5.0275f, 3f, 7.5128f)
                verticalLineTo(16.5128f)
                curveTo(3f, 18.9981f, 5.0148f, 21.0128f, 7.5f, 21.0128f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 21.0128f, 21f, 18.9981f, 21f, 16.5128f)
                verticalLineTo(7.51282f)
                curveTo(21f, 5.0275f, 18.9853f, 3.0128f, 16.5f, 3.0128f)
                horizontalLineTo(7.50003f)
                close()
                moveTo(5.00003f, 7.51282f)
                curveTo(5f, 6.1321f, 6.1193f, 5.0128f, 7.5f, 5.0128f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 5.0128f, 19f, 6.1321f, 19f, 7.5128f)
                verticalLineTo(16.5128f)
                curveTo(19f, 17.8935f, 17.8807f, 19.0128f, 16.5f, 19.0128f)
                horizontalLineTo(7.50003f)
                curveTo(6.1193f, 19.0128f, 5f, 17.8935f, 5f, 16.5128f)
                verticalLineTo(7.51282f)
                close()
            }
        }.build()
        return addBox!!
    }

private var addBox: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.AddBox,
                contentDescription = ""
            )
        }
    }
}