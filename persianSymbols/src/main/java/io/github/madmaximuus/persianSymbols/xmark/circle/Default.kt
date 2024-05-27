package io.github.madmaximuus.persianSymbols.xmark.circle

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

val PersianSymbols.Default.XMarkCircle: ImageVector
    get() {
        if (xMarkCircle != null) {
            return xMarkCircle!!
        }
        xMarkCircle = ImageVector.Builder(
            name = "xmark-circle-default",
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
                moveTo(9.707f, 8.2929f)
                curveTo(9.3165f, 7.9024f, 8.6833f, 7.9024f, 8.2928f, 8.2929f)
                curveTo(7.9022f, 8.6834f, 7.9022f, 9.3166f, 8.2928f, 9.7071f)
                lineTo(10.5857f, 12.0f)
                lineTo(8.2928f, 14.2929f)
                curveTo(7.9022f, 14.6834f, 7.9022f, 15.3166f, 8.2928f, 15.7071f)
                curveTo(8.6833f, 16.0976f, 9.3165f, 16.0976f, 9.707f, 15.7071f)
                lineTo(11.9999f, 13.4142f)
                lineTo(14.2928f, 15.7071f)
                curveTo(14.6833f, 16.0976f, 15.3165f, 16.0976f, 15.707f, 15.7071f)
                curveTo(16.0975f, 15.3166f, 16.0975f, 14.6834f, 15.707f, 14.2929f)
                lineTo(13.4141f, 12.0f)
                lineTo(15.707f, 9.7071f)
                curveTo(16.0975f, 9.3166f, 16.0975f, 8.6834f, 15.707f, 8.2929f)
                curveTo(15.3165f, 7.9024f, 14.6833f, 7.9024f, 14.2928f, 8.2929f)
                lineTo(11.9999f, 10.5858f)
                lineTo(9.707f, 8.2929f)
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
                moveTo(11.9999f, 2.0f)
                curveTo(6.477f, 2.0f, 1.9999f, 6.4771f, 1.9999f, 12.0f)
                curveTo(1.9999f, 17.5228f, 6.477f, 22.0f, 11.9999f, 22.0f)
                curveTo(17.5227f, 22.0f, 21.9999f, 17.5228f, 21.9999f, 12.0f)
                curveTo(21.9999f, 6.4771f, 17.5227f, 2.0f, 11.9999f, 2.0f)
                close()
                moveTo(3.9999f, 12.0f)
                curveTo(3.9999f, 7.5817f, 7.5816f, 4.0f, 11.9999f, 4.0f)
                curveTo(16.4182f, 4.0f, 19.9999f, 7.5817f, 19.9999f, 12.0f)
                curveTo(19.9999f, 16.4183f, 16.4182f, 20.0f, 11.9999f, 20.0f)
                curveTo(7.5816f, 20.0f, 3.9999f, 16.4183f, 3.9999f, 12.0f)
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