package io.github.madmaximuus.persianIcons.trash.base

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

val PersianSymbols.Default.Trash: ImageVector
    get() {
        if (trash != null) {
            return trash!!
        }
        trash = ImageVector.Builder(
            name = "trash-default",
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
                moveTo(9.99969f, 8.50006f)
                curveTo(9.9997f, 7.9478f, 9.552f, 7.5001f, 8.9997f, 7.5001f)
                curveTo(8.4474f, 7.5001f, 7.9997f, 7.9478f, 7.9997f, 8.5001f)
                verticalLineTo(16.5001f)
                curveTo(7.9997f, 17.0523f, 8.4474f, 17.5001f, 8.9997f, 17.5001f)
                curveTo(9.552f, 17.5001f, 9.9997f, 17.0523f, 9.9997f, 16.5001f)
                verticalLineTo(8.50006f)
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
                moveTo(12.9999f, 8.50006f)
                curveTo(12.9999f, 7.9478f, 12.5522f, 7.5001f, 11.9999f, 7.5001f)
                curveTo(11.4476f, 7.5001f, 10.9999f, 7.9478f, 10.9999f, 8.5001f)
                verticalLineTo(16.5001f)
                curveTo(10.9999f, 17.0523f, 11.4476f, 17.5001f, 11.9999f, 17.5001f)
                curveTo(12.5522f, 17.5001f, 12.9999f, 17.0523f, 12.9999f, 16.5001f)
                verticalLineTo(8.50006f)
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
                moveTo(14.9999f, 7.50006f)
                curveTo(15.5522f, 7.5001f, 15.9999f, 7.9478f, 15.9999f, 8.5001f)
                verticalLineTo(16.5001f)
                curveTo(15.9999f, 17.0523f, 15.5522f, 17.5001f, 14.9999f, 17.5001f)
                curveTo(14.4476f, 17.5001f, 13.9999f, 17.0523f, 13.9999f, 16.5001f)
                verticalLineTo(8.50006f)
                curveTo(13.9999f, 7.9478f, 14.4476f, 7.5001f, 14.9999f, 7.5001f)
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
                moveTo(7.99983f, 2.5f)
                curveTo(7.4475f, 2.5f, 6.9998f, 2.9477f, 6.9998f, 3.5f)
                lineTo(4f, 3.50024f)
                curveTo(3.4477f, 3.5002f, 3f, 3.948f, 3f, 4.5002f)
                curveTo(3f, 5.0525f, 3.4476f, 5.5002f, 3.9999f, 5.5002f)
                verticalLineTo(17f)
                curveTo(3.9999f, 19.4853f, 6.0146f, 21.5f, 8.4999f, 21.5f)
                horizontalLineTo(15.4999f)
                curveTo(17.9851f, 21.5f, 19.9999f, 19.4853f, 19.9999f, 17f)
                verticalLineTo(5.50024f)
                curveTo(20.5521f, 5.5002f, 21f, 5.0525f, 21f, 4.5002f)
                curveTo(21f, 3.948f, 20.5523f, 3.5002f, 20f, 3.5002f)
                horizontalLineTo(16.9998f)
                curveTo(16.9998f, 2.948f, 16.5521f, 2.5f, 15.9998f, 2.5f)
                horizontalLineTo(7.99983f)
                close()
                moveTo(5.99986f, 17f)
                verticalLineTo(5.50024f)
                horizontalLineTo(17.9999f)
                verticalLineTo(17f)
                curveTo(17.9999f, 18.3808f, 16.8806f, 19.5f, 15.4999f, 19.5f)
                horizontalLineTo(8.49986f)
                curveTo(7.1192f, 19.5f, 5.9999f, 18.3808f, 5.9999f, 17f)
                close()
            }
        }.build()
        return trash!!
    }

private var trash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Trash,
                contentDescription = ""
            )
        }
    }
}