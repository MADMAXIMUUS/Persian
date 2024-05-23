package io.github.madmaximuus.persianIcons.arrowRight.toBracket

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

val PersianSymbols.Default.ArrowRightToBracket: ImageVector
    get() {
        if (arrowRightToBracket != null) {
            return arrowRightToBracket!!
        }
        arrowRightToBracket = ImageVector.Builder(
            name = "arrow-right-to-bracket",
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
                moveTo(17.9999f, 17.4999f)
                curveTo(17.9999f, 18.8806f, 16.8806f, 19.9999f, 15.4999f, 19.9999f)
                horizontalLineTo(13.4855f)
                curveTo(12.9332f, 19.9999f, 12.4855f, 20.4476f, 12.4855f, 20.9999f)
                curveTo(12.4855f, 21.5522f, 12.9332f, 21.9999f, 13.4855f, 21.9999f)
                horizontalLineTo(15.4999f)
                curveTo(17.9852f, 21.9999f, 19.9999f, 19.9852f, 19.9999f, 17.4999f)
                lineTo(19.9999f, 6.49988f)
                curveTo(19.9999f, 4.0146f, 17.9852f, 1.9999f, 15.4999f, 1.9999f)
                horizontalLineTo(13.4855f)
                curveTo(12.9332f, 1.9999f, 12.4855f, 2.4476f, 12.4855f, 2.9999f)
                curveTo(12.4855f, 3.5522f, 12.9332f, 3.9999f, 13.4855f, 3.9999f)
                lineTo(15.4999f, 3.99988f)
                curveTo(16.8806f, 3.9999f, 17.9999f, 5.1192f, 17.9999f, 6.4999f)
                lineTo(17.9999f, 17.4999f)
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
                moveTo(10.2928f, 15.2929f)
                curveTo(9.9022f, 15.6834f, 9.9022f, 16.3166f, 10.2928f, 16.7071f)
                curveTo(10.6833f, 17.0977f, 11.3164f, 17.0977f, 11.707f, 16.7071f)
                lineTo(15.707f, 12.7071f)
                curveTo(16.0975f, 12.3166f, 16.0975f, 11.6834f, 15.707f, 11.2929f)
                lineTo(11.707f, 7.29289f)
                curveTo(11.3164f, 6.9024f, 10.6833f, 6.9024f, 10.2928f, 7.2929f)
                curveTo(9.9022f, 7.6834f, 9.9022f, 8.3166f, 10.2928f, 8.7071f)
                lineTo(12.5857f, 11f)
                horizontalLineTo(4.99988f)
                curveTo(4.4476f, 11f, 3.9999f, 11.4477f, 3.9999f, 12f)
                curveTo(3.9999f, 12.5523f, 4.4476f, 13f, 4.9999f, 13f)
                horizontalLineTo(12.5857f)
                lineTo(10.2928f, 15.2929f)
                close()
            }
        }.build()
        return arrowRightToBracket!!
    }

private var arrowRightToBracket: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ArrowRightToBracket,
                contentDescription = ""
            )
        }
    }
}