package io.github.madmaximuus.persianSymbols.arrow.left.down.arrowRightUp.fromCenter

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

val PersianSymbols.Default.ArrowLeftDownArrowRightUpFromCenter: ImageVector
    get() {
        if (arrowLeftDownArrowRightUpFromCenter != null) {
            return arrowLeftDownArrowRightUpFromCenter!!
        }
        arrowLeftDownArrowRightUpFromCenter = Builder(
            name = "arrow-left-down-arrow-right-up-from-center-default",
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
                moveTo(19.0051f, 11.9885f)
                curveTo(18.4536f, 11.9906f, 18.0049f, 11.5452f, 18.0028f, 10.9937f)
                lineTo(17.9892f, 7.4228f)
                lineTo(14.2064f, 11.2057f)
                curveTo(13.8164f, 11.5957f, 13.1841f, 11.5957f, 12.7942f, 11.2057f)
                curveTo(12.4042f, 10.8158f, 12.4042f, 10.1835f, 12.7942f, 9.7935f)
                lineTo(16.5814f, 6.0063f)
                lineTo(12.9911f, 6.0199f)
                curveTo(12.4396f, 6.022f, 11.9908f, 5.5766f, 11.9887f, 5.0251f)
                curveTo(11.9867f, 4.4736f, 12.432f, 4.0249f, 12.9835f, 4.0228f)
                lineTo(18.9748f, 4.0f)
                curveTo(19.5263f, 3.9979f, 19.975f, 4.4433f, 19.9771f, 4.9948f)
                lineTo(19.9999f, 10.9862f)
                curveTo(20.002f, 11.5376f, 19.5566f, 11.9864f, 19.0051f, 11.9885f)
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
                moveTo(4.9984f, 12.0113f)
                curveTo(5.5499f, 12.0113f, 5.997f, 12.4584f, 5.997f, 13.0099f)
                verticalLineTo(16.5908f)
                lineTo(9.7868f, 12.8009f)
                curveTo(10.1767f, 12.411f, 10.809f, 12.411f, 11.1989f, 12.8009f)
                curveTo(11.5889f, 13.1909f, 11.5889f, 13.8232f, 11.1989f, 14.2131f)
                lineTo(7.4094f, 18.0027f)
                horizontalLineTo(10.9897f)
                curveTo(11.5412f, 18.0027f, 11.9883f, 18.4498f, 11.9883f, 19.0013f)
                curveTo(11.9883f, 19.5528f, 11.5412f, 19.9999f, 10.9897f, 19.9999f)
                horizontalLineTo(5.014f)
                curveTo(4.7561f, 20.0038f, 4.497f, 19.9085f, 4.299f, 19.714f)
                curveTo(4.2872f, 19.7024f, 4.2757f, 19.6906f, 4.2645f, 19.6784f)
                curveTo(4.2006f, 19.6092f, 4.1482f, 19.5331f, 4.1075f, 19.4527f)
                curveTo(4.0387f, 19.3171f, 3.9999f, 19.1638f, 3.9999f, 19.0013f)
                verticalLineTo(13.0099f)
                curveTo(3.9999f, 12.4584f, 4.4469f, 12.0113f, 4.9984f, 12.0113f)
                close()
            }
        }.build()
        return arrowLeftDownArrowRightUpFromCenter!!
    }

private var arrowLeftDownArrowRightUpFromCenter: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ArrowLeftDownArrowRightUpFromCenter,
                contentDescription = ""
            )
        }
    }
}