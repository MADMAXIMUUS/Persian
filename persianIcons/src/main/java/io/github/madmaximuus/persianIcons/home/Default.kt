package io.github.madmaximuus.persianIcons.home

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

val PersianSymbols.Default.Home: ImageVector
    get() {
        if (home != null) {
            return home!!
        }
        home = ImageVector.Builder(
            name = "home-default",
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
                moveTo(11.386f, 2.21068f)
                curveTo(11.7472f, 1.9298f, 12.2529f, 1.9298f, 12.614f, 2.2107f)
                lineTo(21.614f, 9.21141f)
                curveTo(22.0499f, 9.5505f, 22.1284f, 10.1788f, 21.7893f, 10.6147f)
                curveTo(21.4502f, 11.0506f, 20.8219f, 11.1291f, 20.386f, 10.7901f)
                lineTo(20f, 10.4898f)
                verticalLineTo(17.5f)
                curveTo(20f, 19.9853f, 17.9853f, 22f, 15.5f, 22f)
                horizontalLineTo(8.50004f)
                curveTo(6.0148f, 22f, 4f, 19.9853f, 4f, 17.5f)
                verticalLineTo(10.4898f)
                lineTo(3.614f, 10.7901f)
                curveTo(3.1781f, 11.1291f, 2.5498f, 11.0506f, 2.2107f, 10.6147f)
                curveTo(1.8716f, 10.1788f, 1.9501f, 9.5505f, 2.386f, 9.2114f)
                lineTo(11.386f, 2.21068f)
                close()
                moveTo(11f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                close()
                moveTo(15f, 20f)
                verticalLineTo(15f)
                curveTo(15f, 13.8954f, 14.1046f, 13f, 13f, 13f)
                horizontalLineTo(11f)
                curveTo(9.8954f, 13f, 9f, 13.8954f, 9f, 15f)
                verticalLineTo(20f)
                horizontalLineTo(8.50004f)
                curveTo(7.1193f, 20f, 6f, 18.8807f, 6f, 17.5f)
                verticalLineTo(8.93405f)
                lineTo(12f, 4.26691f)
                lineTo(18f, 8.9341f)
                verticalLineTo(17.5f)
                curveTo(18f, 18.8807f, 16.8807f, 20f, 15.5f, 20f)
                horizontalLineTo(15f)
                close()
            }
        }.build()
        return home!!
    }

private var home: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Home,
                contentDescription = ""
            )
        }
    }
}