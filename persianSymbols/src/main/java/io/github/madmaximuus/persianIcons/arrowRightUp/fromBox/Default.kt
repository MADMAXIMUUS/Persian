package io.github.madmaximuus.persianIcons.arrowRightUp.fromBox

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

val PersianSymbols.Default.ArrowRightUpFromBox: ImageVector
    get() {
        if (arrowRightUpFromBox != null) {
            return arrowRightUpFromBox!!
        }
        arrowRightUpFromBox = ImageVector.Builder(
            name = "arrow-right-up-from-box",
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
                moveTo(5f, 7.49994f)
                curveTo(5f, 6.1192f, 6.1193f, 4.9999f, 7.5f, 4.9999f)
                horizontalLineTo(9.99967f)
                curveTo(10.552f, 4.9999f, 10.9997f, 4.5522f, 10.9997f, 3.9999f)
                curveTo(10.9997f, 3.4476f, 10.552f, 2.9999f, 9.9997f, 2.9999f)
                horizontalLineTo(7.5f)
                curveTo(5.0147f, 2.9999f, 3f, 5.0147f, 3f, 7.4999f)
                verticalLineTo(16.4999f)
                curveTo(3f, 18.9852f, 5.0147f, 20.9999f, 7.5f, 20.9999f)
                horizontalLineTo(16.4999f)
                curveTo(18.9852f, 20.9999f, 20.9999f, 18.9852f, 20.9999f, 16.4999f)
                verticalLineTo(14f)
                curveTo(20.9999f, 13.4477f, 20.5522f, 13f, 19.9999f, 13f)
                curveTo(19.4477f, 13f, 18.9999f, 13.4477f, 18.9999f, 14f)
                verticalLineTo(16.4999f)
                curveTo(18.9999f, 17.8806f, 17.8807f, 18.9999f, 16.4999f, 18.9999f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 18.9999f, 5f, 17.8806f, 5f, 16.4999f)
                verticalLineTo(7.49994f)
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
                moveTo(14f, 2.99994f)
                curveTo(13.4477f, 2.9999f, 13f, 3.4476f, 13f, 3.9999f)
                curveTo(13f, 4.5522f, 13.4477f, 4.9999f, 14f, 4.9999f)
                horizontalLineTo(17.5856f)
                lineTo(9.29288f, 13.2929f)
                curveTo(8.9024f, 13.6834f, 8.9024f, 14.3166f, 9.2929f, 14.7071f)
                curveTo(9.6834f, 15.0976f, 10.3166f, 15.0976f, 10.7071f, 14.7071f)
                lineTo(18.9997f, 6.41421f)
                verticalLineTo(10f)
                curveTo(18.9997f, 10.5523f, 19.4475f, 11f, 19.9997f, 11f)
                curveTo(20.552f, 11f, 20.9997f, 10.5523f, 20.9997f, 10f)
                verticalLineTo(3.99994f)
                curveTo(20.9997f, 3.4476f, 20.552f, 2.9999f, 19.9997f, 2.9999f)
                horizontalLineTo(14f)
                close()
            }
        }.build()
        return arrowRightUpFromBox!!
    }

private var arrowRightUpFromBox: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ArrowRightUpFromBox,
                contentDescription = ""
            )
        }
    }
}