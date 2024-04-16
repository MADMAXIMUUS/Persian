package io.github.madmaximuus.persianIcons.sync

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun syncDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "sync-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12f, 6f)
                curveTo(8.6863f, 6f, 6f, 8.6863f, 6f, 12f)
                curveTo(6f, 13.2457f, 6.3793f, 14.4029f, 7.0297f, 15.3624f)
                verticalLineTo(14.0465f)
                curveTo(7.0297f, 13.4942f, 7.4774f, 13.0465f, 8.0297f, 13.0465f)
                curveTo(8.582f, 13.0465f, 9.0297f, 13.4942f, 9.0297f, 14.0465f)
                verticalLineTo(17.7845f)
                curveTo(9.0297f, 18.3368f, 8.582f, 18.7845f, 8.0297f, 18.7845f)
                horizontalLineTo(4.04456f)
                curveTo(3.4923f, 18.7845f, 3.0446f, 18.3368f, 3.0446f, 17.7845f)
                curveTo(3.0446f, 17.2323f, 3.4923f, 16.7845f, 4.0446f, 16.7845f)
                horizontalLineTo(5.58803f)
                curveTo(4.5911f, 15.4506f, 4f, 13.7944f, 4f, 12f)
                curveTo(4f, 7.5817f, 7.5817f, 4f, 12f, 4f)
                curveTo(12.5523f, 4f, 13f, 4.4477f, 13f, 5f)
                curveTo(13f, 5.5523f, 12.5523f, 6f, 12f, 6f)
                close()
            }
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(18.4466f, 7.26215f)
                horizontalLineTo(19.9691f)
                curveTo(20.5213f, 7.2622f, 20.9691f, 6.8144f, 20.9691f, 6.2622f)
                curveTo(20.9691f, 5.7099f, 20.5213f, 5.2622f, 19.9691f, 5.2622f)
                horizontalLineTo(16.0018f)
                curveTo(15.4495f, 5.2622f, 15.0018f, 5.7099f, 15.0018f, 6.2622f)
                verticalLineTo(9.97534f)
                curveTo(15.0018f, 10.5276f, 15.4495f, 10.9753f, 16.0018f, 10.9753f)
                curveTo(16.5541f, 10.9753f, 17.0018f, 10.5276f, 17.0018f, 9.9753f)
                verticalLineTo(8.68463f)
                curveTo(17.633f, 9.6348f, 18f, 10.7746f, 18f, 12f)
                curveTo(18f, 15.3137f, 15.3137f, 18f, 12f, 18f)
                curveTo(11.4477f, 18f, 11f, 18.4477f, 11f, 19f)
                curveTo(11f, 19.5523f, 11.4477f, 20f, 12f, 20f)
                curveTo(16.4183f, 20f, 20f, 16.4183f, 20f, 12f)
                curveTo(20f, 10.2265f, 19.4225f, 8.588f, 18.4466f, 7.2622f)
                close()
            }
        }.build()
    }
}

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = syncDefault(),
                contentDescription = ""
            )
        }
    }
}