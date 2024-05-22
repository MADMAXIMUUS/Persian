package io.github.madmaximuus.persianIcons.xMark.circle

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

public val PersianSymbols.Default.XMarkCircle: ImageVector
    get() {
        if (xMarkCircle != null) {
            return xMarkCircle!!
        }
        xMarkCircle = ImageVector.Builder(
            name = "xMark-circle-default",
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
                moveTo(9.70698f, 8.29289f)
                curveTo(9.3165f, 7.9024f, 8.6833f, 7.9024f, 8.2928f, 8.2929f)
                curveTo(7.9023f, 8.6834f, 7.9023f, 9.3166f, 8.2928f, 9.7071f)
                lineTo(10.5857f, 12f)
                lineTo(8.29277f, 14.2929f)
                curveTo(7.9023f, 14.6834f, 7.9023f, 15.3166f, 8.2928f, 15.7071f)
                curveTo(8.6833f, 16.0976f, 9.3165f, 16.0976f, 9.707f, 15.7071f)
                lineTo(11.9999f, 13.4142f)
                lineTo(14.2928f, 15.7071f)
                curveTo(14.6833f, 16.0976f, 15.3165f, 16.0976f, 15.707f, 15.7071f)
                curveTo(16.0975f, 15.3166f, 16.0975f, 14.6834f, 15.707f, 14.2929f)
                lineTo(13.4141f, 12f)
                lineTo(15.707f, 9.70711f)
                curveTo(16.0975f, 9.3166f, 16.0975f, 8.6834f, 15.707f, 8.2929f)
                curveTo(15.3165f, 7.9024f, 14.6833f, 7.9024f, 14.2928f, 8.2929f)
                lineTo(11.9999f, 10.5858f)
                lineTo(9.70698f, 8.29289f)
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
                moveTo(11.9999f, 2f)
                curveTo(6.477f, 2f, 1.9999f, 6.4771f, 1.9999f, 12f)
                curveTo(1.9999f, 17.5228f, 6.477f, 22f, 11.9999f, 22f)
                curveTo(17.5227f, 22f, 21.9999f, 17.5228f, 21.9999f, 12f)
                curveTo(21.9999f, 6.4771f, 17.5227f, 2f, 11.9999f, 2f)
                close()
                moveTo(3.99988f, 12f)
                curveTo(3.9999f, 7.5817f, 7.5816f, 4f, 11.9999f, 4f)
                curveTo(16.4182f, 4f, 19.9999f, 7.5817f, 19.9999f, 12f)
                curveTo(19.9999f, 16.4183f, 16.4182f, 20f, 11.9999f, 20f)
                curveTo(7.5816f, 20f, 3.9999f, 16.4183f, 3.9999f, 12f)
                close()
            }
        }.build()
        return xMarkCircle!!
    }

private var xMarkCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.XMarkCircle,
                contentDescription = ""
            )
        }
    }
}