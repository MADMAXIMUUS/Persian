package io.github.madmaximuus.persianSymbols.minus.circle

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

val PersianSymbols.Default.MinusCircle: ImageVector
    get() {
        if (minusCircle != null) {
            return minusCircle!!
        }
        minusCircle = Builder(
            name = "minus-circle-default",
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
                moveTo(7.9999f, 10.9999f)
                curveTo(7.4476f, 10.9999f, 6.9999f, 11.4476f, 6.9999f, 11.9999f)
                curveTo(6.9999f, 12.5522f, 7.4476f, 12.9999f, 7.9999f, 12.9999f)
                horizontalLineTo(15.9999f)
                curveTo(16.5522f, 12.9999f, 16.9999f, 12.5522f, 16.9999f, 11.9999f)
                curveTo(16.9999f, 11.4476f, 16.5522f, 10.9999f, 15.9999f, 10.9999f)
                horizontalLineTo(7.9999f)
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
                moveTo(12.0f, 1.9999f)
                curveTo(6.4771f, 1.9999f, 2.0f, 6.477f, 2.0f, 11.9999f)
                curveTo(2.0f, 17.5227f, 6.4771f, 21.9999f, 12.0f, 21.9999f)
                curveTo(17.5228f, 21.9999f, 22.0f, 17.5227f, 22.0f, 11.9999f)
                curveTo(22.0f, 6.477f, 17.5228f, 1.9999f, 12.0f, 1.9999f)
                close()
                moveTo(4.0f, 11.9999f)
                curveTo(4.0f, 7.5816f, 7.5817f, 3.9999f, 12.0f, 3.9999f)
                curveTo(16.4183f, 3.9999f, 20.0f, 7.5816f, 20.0f, 11.9999f)
                curveTo(20.0f, 16.4182f, 16.4183f, 19.9999f, 12.0f, 19.9999f)
                curveTo(7.5817f, 19.9999f, 4.0f, 16.4182f, 4.0f, 11.9999f)
                close()
            }
        }.build()
        return minusCircle!!
    }

private var minusCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.MinusCircle,
                contentDescription = ""
            )
        }
    }
}