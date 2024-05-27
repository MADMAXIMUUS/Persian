package io.github.madmaximuus.persianSymbols.arrow.right.fromBracket

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

val PersianSymbols.Default.ArrowRightFromBracket: ImageVector
    get() {
        if (arrowRightFromBracket != null) {
            return arrowRightFromBracket!!
        }
        arrowRightFromBracket = ImageVector.Builder(
            name = "arrow-right-from-bracket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5.9999f, 6.4999f)
                curveTo(5.9999f, 5.1192f, 7.1192f, 3.9999f, 8.4999f, 3.9999f)
                horizontalLineTo(11.9999f)
                curveTo(12.5522f, 3.9999f, 12.9999f, 3.5522f, 12.9999f, 2.9999f)
                curveTo(12.9999f, 2.4476f, 12.5522f, 1.9999f, 11.9999f, 1.9999f)
                horizontalLineTo(8.4999f)
                curveTo(6.0146f, 1.9999f, 3.9999f, 4.0146f, 3.9999f, 6.4999f)
                verticalLineTo(17.4999f)
                curveTo(3.9999f, 19.9852f, 6.0146f, 21.9999f, 8.4999f, 21.9999f)
                horizontalLineTo(11.9999f)
                curveTo(12.5522f, 21.9999f, 12.9999f, 21.5522f, 12.9999f, 20.9999f)
                curveTo(12.9999f, 20.4476f, 12.5522f, 19.9999f, 11.9999f, 19.9999f)
                horizontalLineTo(8.4999f)
                curveTo(7.1192f, 19.9999f, 5.9999f, 18.8806f, 5.9999f, 17.4999f)
                verticalLineTo(6.4999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(14.2928f, 15.2929f)
                curveTo(13.9022f, 15.6834f, 13.9022f, 16.3166f, 14.2928f, 16.7071f)
                curveTo(14.6833f, 17.0977f, 15.3164f, 17.0977f, 15.707f, 16.7071f)
                lineTo(19.707f, 12.7071f)
                curveTo(20.0975f, 12.3166f, 20.0975f, 11.6834f, 19.707f, 11.2929f)
                lineTo(15.707f, 7.2929f)
                curveTo(15.3164f, 6.9024f, 14.6833f, 6.9024f, 14.2928f, 7.2929f)
                curveTo(13.9022f, 7.6834f, 13.9022f, 8.3166f, 14.2928f, 8.7071f)
                lineTo(16.5857f, 11.0f)
                horizontalLineTo(8.9999f)
                curveTo(8.4476f, 11.0f, 7.9999f, 11.4477f, 7.9999f, 12.0f)
                curveTo(7.9999f, 12.5523f, 8.4476f, 13.0f, 8.9999f, 13.0f)
                horizontalLineTo(16.5857f)
                lineTo(14.2928f, 15.2929f)
                close()
            }
        }.build()
        return arrowRightFromBracket!!
    }

private var arrowRightFromBracket: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ArrowRightFromBracket,
                contentDescription = ""
            )
        }
    }
}