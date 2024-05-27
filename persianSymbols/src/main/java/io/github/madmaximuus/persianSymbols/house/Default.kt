package io.github.madmaximuus.persianSymbols.house

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

val PersianSymbols.Default.House: ImageVector
    get() {
        if (house != null) {
            return house!!
        }
        house = ImageVector.Builder(
            name = "home-default",
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
                moveTo(11.386f, 2.2107f)
                curveTo(11.7472f, 1.9298f, 12.2529f, 1.9298f, 12.614f, 2.2107f)
                lineTo(21.614f, 9.2114f)
                curveTo(22.0499f, 9.5505f, 22.1284f, 10.1788f, 21.7893f, 10.6147f)
                curveTo(21.4502f, 11.0506f, 20.8219f, 11.1291f, 20.386f, 10.7901f)
                lineTo(20.0f, 10.4898f)
                verticalLineTo(17.5f)
                curveTo(20.0f, 19.9853f, 17.9853f, 22.0f, 15.5f, 22.0f)
                horizontalLineTo(8.5f)
                curveTo(6.0148f, 22.0f, 4.0f, 19.9853f, 4.0f, 17.5f)
                verticalLineTo(10.4898f)
                lineTo(3.614f, 10.7901f)
                curveTo(3.1781f, 11.1291f, 2.5498f, 11.0506f, 2.2107f, 10.6147f)
                curveTo(1.8716f, 10.1788f, 1.9501f, 9.5505f, 2.386f, 9.2114f)
                lineTo(11.386f, 2.2107f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(15.0f, 20.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 13.8954f, 14.1046f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(11.0f)
                curveTo(9.8954f, 13.0f, 9.0f, 13.8954f, 9.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.5f)
                curveTo(7.1193f, 20.0f, 6.0f, 18.8807f, 6.0f, 17.5f)
                verticalLineTo(8.934f)
                lineTo(12.0f, 4.2669f)
                lineTo(18.0f, 8.9341f)
                verticalLineTo(17.5f)
                curveTo(18.0f, 18.8807f, 16.8807f, 20.0f, 15.5f, 20.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }.build()
        return house!!
    }

private var house: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.House,
                contentDescription = ""
            )
        }
    }
}