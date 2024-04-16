package io.github.madmaximuus.persianIcons.shoppingCart

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
fun shoppingCartFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "shopping-cart-filled",
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
                moveTo(3.237f, 2.72217f)
                curveTo(2.6847f, 2.7222f, 2.237f, 3.1699f, 2.237f, 3.7222f)
                curveTo(2.237f, 4.2744f, 2.6847f, 4.7222f, 3.237f, 4.7222f)
                horizontalLineTo(3.95822f)
                lineTo(6.82095f, 12.4406f)
                lineTo(5.50167f, 15.243f)
                curveTo(5.0333f, 16.2379f, 5.7592f, 17.3819f, 6.8588f, 17.3819f)
                horizontalLineTo(18.3505f)
                curveTo(18.9028f, 17.3819f, 19.3505f, 16.9342f, 19.3505f, 16.3819f)
                curveTo(19.3505f, 15.8297f, 18.9028f, 15.3819f, 18.3505f, 15.3819f)
                horizontalLineTo(7.64682f)
                lineTo(8.52215f, 13.5226f)
                horizontalLineTo(18.6616f)
                curveTo(19.6173f, 13.5226f, 20.4395f, 12.8464f, 20.6239f, 11.9086f)
                lineTo(21.7439f, 6.21559f)
                curveTo(21.8654f, 5.5977f, 21.3924f, 5.0226f, 20.7627f, 5.0226f)
                horizontalLineTo(6.20277f)
                lineTo(5.8334f, 4.02668f)
                curveTo(5.5426f, 3.2425f, 4.7946f, 2.7222f, 3.9582f, 2.7222f)
                horizontalLineTo(3.237f)
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
                moveTo(9.26862f, 19.7778f)
                curveTo(9.2686f, 20.6062f, 8.597f, 21.2778f, 7.7686f, 21.2778f)
                curveTo(6.9402f, 21.2778f, 6.2686f, 20.6062f, 6.2686f, 19.7778f)
                curveTo(6.2686f, 18.9493f, 6.9402f, 18.2778f, 7.7686f, 18.2778f)
                curveTo(8.597f, 18.2778f, 9.2686f, 18.9493f, 9.2686f, 19.7778f)
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
                moveTo(17.4666f, 21.2779f)
                curveTo(18.295f, 21.2779f, 18.9666f, 20.6063f, 18.9666f, 19.7779f)
                curveTo(18.9666f, 18.9495f, 18.295f, 18.2779f, 17.4666f, 18.2779f)
                curveTo(16.6381f, 18.2779f, 15.9666f, 18.9495f, 15.9666f, 19.7779f)
                curveTo(15.9666f, 20.6063f, 16.6381f, 21.2779f, 17.4666f, 21.2779f)
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
                imageVector = shoppingCartFilled(),
                contentDescription = ""
            )
        }
    }
}