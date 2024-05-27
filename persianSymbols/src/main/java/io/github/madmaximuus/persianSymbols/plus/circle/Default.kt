package io.github.madmaximuus.persianSymbols.plus.circle

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

val PersianSymbols.Default.PlusCircle: ImageVector
    get() {
        if (plusCircle != null) {
            return plusCircle!!
        }
        plusCircle = ImageVector.Builder(
            name = "add-circle-default",
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
                moveTo(12.0f, 7.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                verticalLineTo(10.9999f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 10.9999f, 17.0f, 11.4476f, 17.0f, 11.9999f)
                curveTo(17.0f, 12.5522f, 16.5523f, 12.9999f, 16.0f, 12.9999f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                curveTo(13.0f, 16.5523f, 12.5523f, 17.0f, 12.0f, 17.0f)
                curveTo(11.4477f, 17.0f, 11.0f, 16.5523f, 11.0f, 16.0f)
                verticalLineTo(12.9999f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 12.9999f, 7.0f, 12.5522f, 7.0f, 11.9999f)
                curveTo(7.0f, 11.4476f, 7.4477f, 10.9999f, 8.0f, 10.9999f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                curveTo(11.0f, 7.4477f, 11.4477f, 7.0f, 12.0f, 7.0f)
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
                moveTo(11.9999f, 1.9999f)
                curveTo(6.477f, 1.9999f, 1.9999f, 6.477f, 1.9999f, 11.9999f)
                curveTo(1.9999f, 17.5227f, 6.477f, 21.9999f, 11.9999f, 21.9999f)
                curveTo(17.5227f, 21.9999f, 21.9999f, 17.5227f, 21.9999f, 11.9999f)
                curveTo(21.9999f, 6.477f, 17.5227f, 1.9999f, 11.9999f, 1.9999f)
                close()
                moveTo(3.9999f, 11.9999f)
                curveTo(3.9999f, 7.5816f, 7.5816f, 3.9999f, 11.9999f, 3.9999f)
                curveTo(16.4182f, 3.9999f, 19.9999f, 7.5816f, 19.9999f, 11.9999f)
                curveTo(19.9999f, 16.4182f, 16.4182f, 19.9999f, 11.9999f, 19.9999f)
                curveTo(7.5816f, 19.9999f, 3.9999f, 16.4182f, 3.9999f, 11.9999f)
                close()
            }
        }.build()
        return plusCircle!!
    }

private var plusCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.PlusCircle,
                contentDescription = ""
            )
        }
    }
}