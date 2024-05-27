package io.github.madmaximuus.persianSymbols.rotate

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Rotate: ImageVector
    get() {
        if (rotate != null) {
            return rotate!!
        }
        rotate = Builder(
            name = "rotate-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
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
                moveTo(12.0f, 6.0f)
                curveTo(8.6863f, 6.0f, 6.0f, 8.6863f, 6.0f, 12.0f)
                curveTo(6.0f, 13.2457f, 6.3793f, 14.4029f, 7.0297f, 15.3624f)
                verticalLineTo(14.0465f)
                curveTo(7.0297f, 13.4942f, 7.4774f, 13.0465f, 8.0297f, 13.0465f)
                curveTo(8.582f, 13.0465f, 9.0297f, 13.4942f, 9.0297f, 14.0465f)
                verticalLineTo(17.7845f)
                curveTo(9.0297f, 18.3368f, 8.582f, 18.7845f, 8.0297f, 18.7845f)
                horizontalLineTo(4.0446f)
                curveTo(3.4923f, 18.7845f, 3.0446f, 18.3368f, 3.0446f, 17.7845f)
                curveTo(3.0446f, 17.2323f, 3.4923f, 16.7845f, 4.0446f, 16.7845f)
                horizontalLineTo(5.588f)
                curveTo(4.5911f, 15.4506f, 4.0f, 13.7944f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(12.5523f, 4.0f, 13.0f, 4.4477f, 13.0f, 5.0f)
                curveTo(13.0f, 5.5523f, 12.5523f, 6.0f, 12.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.4466f, 7.2621f)
                horizontalLineTo(19.9691f)
                curveTo(20.5213f, 7.2621f, 20.9691f, 6.8144f, 20.9691f, 6.2621f)
                curveTo(20.9691f, 5.7099f, 20.5213f, 5.2621f, 19.9691f, 5.2621f)
                horizontalLineTo(16.0018f)
                curveTo(15.4495f, 5.2621f, 15.0018f, 5.7099f, 15.0018f, 6.2621f)
                verticalLineTo(9.9753f)
                curveTo(15.0018f, 10.5276f, 15.4495f, 10.9753f, 16.0018f, 10.9753f)
                curveTo(16.5541f, 10.9753f, 17.0018f, 10.5276f, 17.0018f, 9.9753f)
                verticalLineTo(8.6846f)
                curveTo(17.633f, 9.6348f, 18.0f, 10.7746f, 18.0f, 12.0f)
                curveTo(18.0f, 15.3137f, 15.3137f, 18.0f, 12.0f, 18.0f)
                curveTo(11.4477f, 18.0f, 11.0f, 18.4477f, 11.0f, 19.0f)
                curveTo(11.0f, 19.5523f, 11.4477f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 10.2265f, 19.4225f, 8.588f, 18.4466f, 7.2621f)
                close()
            }
        }.build()
        return rotate!!
    }

private var rotate: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Rotate,
                contentDescription = ""
            )
        }
    }
}