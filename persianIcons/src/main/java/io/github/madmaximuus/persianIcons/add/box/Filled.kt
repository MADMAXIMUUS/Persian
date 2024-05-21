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

val PersianSymbols.Filled.AddBox: ImageVector
    get() {
        if (addBox != null) {
            return addBox!!
        }
        addBox = ImageVector.Builder(
            name = "add-box-filled",
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
                moveTo(7.4f, 3f)
                curveTo(4.9699f, 3f, 3f, 4.9699f, 3f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(3f, 19.0301f, 4.9699f, 21f, 7.4f, 21f)
                horizontalLineTo(16.6f)
                curveTo(19.0301f, 21f, 21f, 19.0301f, 21f, 16.6f)
                verticalLineTo(7.4f)
                curveTo(21f, 4.9699f, 19.0301f, 3f, 16.6f, 3f)
                horizontalLineTo(7.4f)
                close()
                moveTo(13.0212f, 8.00002f)
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
                verticalLineTo(8.00002f)
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
                imageVector = PersianSymbols.Filled.AddBox,
                contentDescription = ""
            )
        }
    }
}