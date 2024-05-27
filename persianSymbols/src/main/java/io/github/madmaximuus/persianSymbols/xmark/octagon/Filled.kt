package io.github.madmaximuus.persianSymbols.xmark.octagon

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
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.XMarkOctagon: ImageVector
    get() {
        if (xmarkOctagon != null) {
            return xmarkOctagon!!
        }
        xmarkOctagon = Builder(
            name = "xmark-octagon-filled",
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
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 8.384f)
                verticalLineTo(15.616f)
                curveTo(2.0f, 16.1465f, 2.2107f, 16.6552f, 2.5858f, 17.0302f)
                lineTo(6.9698f, 21.4142f)
                curveTo(7.3448f, 21.7893f, 7.8535f, 22.0f, 8.384f, 22.0f)
                horizontalLineTo(15.616f)
                curveTo(16.1465f, 22.0f, 16.6552f, 21.7893f, 17.0302f, 21.4142f)
                lineTo(21.4142f, 17.0302f)
                curveTo(21.7893f, 16.6552f, 22.0f, 16.1465f, 22.0f, 15.616f)
                verticalLineTo(8.384f)
                curveTo(22.0f, 7.8535f, 21.7893f, 7.3448f, 21.4142f, 6.9698f)
                lineTo(17.0302f, 2.5858f)
                curveTo(16.6552f, 2.2107f, 16.1465f, 2.0f, 15.616f, 2.0f)
                horizontalLineTo(8.384f)
                curveTo(7.8535f, 2.0f, 7.3448f, 2.2107f, 6.9698f, 2.5858f)
                lineTo(2.5858f, 6.9698f)
                curveTo(2.2107f, 7.3448f, 2.0f, 7.8535f, 2.0f, 8.384f)
                close()
                moveTo(8.7071f, 7.2929f)
                curveTo(8.3166f, 6.9024f, 7.6834f, 6.9024f, 7.2929f, 7.2929f)
                curveTo(6.9024f, 7.6834f, 6.9024f, 8.3166f, 7.2929f, 8.7071f)
                lineTo(10.5858f, 12.0f)
                lineTo(7.2929f, 15.2929f)
                curveTo(6.9024f, 15.6834f, 6.9024f, 16.3166f, 7.2929f, 16.7071f)
                curveTo(7.6834f, 17.0976f, 8.3166f, 17.0976f, 8.7071f, 16.7071f)
                lineTo(12.0f, 13.4142f)
                lineTo(15.2929f, 16.7071f)
                curveTo(15.6834f, 17.0976f, 16.3166f, 17.0976f, 16.7071f, 16.7071f)
                curveTo(17.0976f, 16.3166f, 17.0976f, 15.6834f, 16.7071f, 15.2929f)
                lineTo(13.4142f, 12.0f)
                lineTo(16.7071f, 8.7071f)
                curveTo(17.0976f, 8.3166f, 17.0976f, 7.6834f, 16.7071f, 7.2929f)
                curveTo(16.3166f, 6.9024f, 15.6834f, 6.9024f, 15.2929f, 7.2929f)
                lineTo(12.0f, 10.5858f)
                lineTo(8.7071f, 7.2929f)
                close()
            }
        }.build()
        return xmarkOctagon!!
    }

private var xmarkOctagon: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.XMarkOctagon,
                contentDescription = ""
            )
        }
    }
}