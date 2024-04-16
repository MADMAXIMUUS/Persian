package io.github.madmaximuus.persianIcons.backspace

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
fun backspaceDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "backspace-default",
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
                moveTo(12.2071f, 8.29289f)
                curveTo(11.8166f, 7.9024f, 11.1834f, 7.9024f, 10.7929f, 8.2929f)
                curveTo(10.4024f, 8.6834f, 10.4024f, 9.3166f, 10.7929f, 9.7071f)
                lineTo(13.0858f, 12f)
                lineTo(10.7929f, 14.2929f)
                curveTo(10.4024f, 14.6834f, 10.4024f, 15.3166f, 10.7929f, 15.7071f)
                curveTo(11.1834f, 16.0976f, 11.8166f, 16.0976f, 12.2071f, 15.7071f)
                lineTo(14.5f, 13.4142f)
                lineTo(16.7929f, 15.7071f)
                curveTo(17.1834f, 16.0976f, 17.8166f, 16.0976f, 18.2071f, 15.7071f)
                curveTo(18.5977f, 15.3166f, 18.5977f, 14.6834f, 18.2071f, 14.2929f)
                lineTo(15.9142f, 12f)
                lineTo(18.2071f, 9.70711f)
                curveTo(18.5977f, 9.3166f, 18.5977f, 8.6834f, 18.2071f, 8.2929f)
                curveTo(17.8166f, 7.9024f, 17.1834f, 7.9024f, 16.7929f, 8.2929f)
                lineTo(14.5f, 10.5858f)
                lineTo(12.2071f, 8.29289f)
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.45313f, 4f)
                curveTo(8.8772f, 4f, 8.3292f, 4.2483f, 7.9494f, 4.6813f)
                lineTo(2.8135f, 10.5379f)
                curveTo(2.1629f, 11.2797f, 2.1506f, 12.3852f, 2.7844f, 13.1413f)
                lineTo(7.93389f, 19.2848f)
                curveTo(8.3139f, 19.7381f, 8.8751f, 20f, 9.4667f, 20f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 20f, 22f, 17.9853f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.0147f, 19.9853f, 4f, 17.5f, 4f)
                horizontalLineTo(9.45313f)
                close()
                moveTo(9.45313f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 6f, 20f, 7.1193f, 20f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20f, 16.8807f, 18.8807f, 18f, 17.5f, 18f)
                lineTo(9.46666f, 18f)
                lineTo(4.3172f, 11.8566f)
                lineTo(9.45313f, 6f)
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
                imageVector = backspaceDefault(),
                contentDescription = ""
            )
        }
    }
}