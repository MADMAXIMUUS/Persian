package io.github.madmaximuus.persianSymbols.delete.left

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
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeleteLeft: ImageVector
    get() {
        if (deleteLeft != null) {
            return deleteLeft!!
        }
        deleteLeft = Builder(
            name = "delete-left-default",
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
                moveTo(12.2071f, 8.2929f)
                curveTo(11.8166f, 7.9024f, 11.1834f, 7.9024f, 10.7929f, 8.2929f)
                curveTo(10.4024f, 8.6834f, 10.4024f, 9.3166f, 10.7929f, 9.7071f)
                lineTo(13.0858f, 12.0f)
                lineTo(10.7929f, 14.2929f)
                curveTo(10.4024f, 14.6834f, 10.4024f, 15.3166f, 10.7929f, 15.7071f)
                curveTo(11.1834f, 16.0976f, 11.8166f, 16.0976f, 12.2071f, 15.7071f)
                lineTo(14.5f, 13.4142f)
                lineTo(16.7929f, 15.7071f)
                curveTo(17.1834f, 16.0976f, 17.8166f, 16.0976f, 18.2071f, 15.7071f)
                curveTo(18.5977f, 15.3166f, 18.5977f, 14.6834f, 18.2071f, 14.2929f)
                lineTo(15.9142f, 12.0f)
                lineTo(18.2071f, 9.7071f)
                curveTo(18.5977f, 9.3166f, 18.5977f, 8.6834f, 18.2071f, 8.2929f)
                curveTo(17.8166f, 7.9024f, 17.1834f, 7.9024f, 16.7929f, 8.2929f)
                lineTo(14.5f, 10.5858f)
                lineTo(12.2071f, 8.2929f)
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
                moveTo(9.4531f, 4.0f)
                curveTo(8.8772f, 4.0f, 8.3292f, 4.2483f, 7.9494f, 4.6813f)
                lineTo(2.8135f, 10.5379f)
                curveTo(2.163f, 11.2797f, 2.1506f, 12.3852f, 2.7844f, 13.1413f)
                lineTo(7.9339f, 19.2848f)
                curveTo(8.3139f, 19.7381f, 8.8751f, 20.0f, 9.4667f, 20.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 20.0f, 22.0f, 17.9853f, 22.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 6.0147f, 19.9853f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(9.4531f)
                close()
                moveTo(9.4531f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 6.0f, 20.0f, 7.1193f, 20.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20.0f, 16.8807f, 18.8807f, 18.0f, 17.5f, 18.0f)
                lineTo(9.4667f, 18.0f)
                lineTo(4.3172f, 11.8566f)
                lineTo(9.4531f, 6.0f)
                close()
            }
        }.build()
        return deleteLeft!!
    }

private var deleteLeft: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.DeleteLeft,
                contentDescription = ""
            )
        }
    }
}