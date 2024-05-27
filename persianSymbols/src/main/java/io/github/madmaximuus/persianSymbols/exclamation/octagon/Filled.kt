package io.github.madmaximuus.persianSymbols.exclamation.octagon

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

val PersianSymbols.Filled.ExclamationOctagon: ImageVector
    get() {
        if (exclamationOctagon != null) {
            return exclamationOctagon!!
        }
        exclamationOctagon = Builder(
            name = "exclamation-octagon-filled",
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
                moveTo(12.0f, 7.5f)
                curveTo(12.5523f, 7.5f, 13.0f, 7.9477f, 13.0f, 8.5f)
                verticalLineTo(12.5f)
                curveTo(13.0f, 13.0523f, 12.5523f, 13.5f, 12.0f, 13.5f)
                curveTo(11.4477f, 13.5f, 11.0f, 13.0523f, 11.0f, 12.5f)
                verticalLineTo(8.5f)
                curveTo(11.0f, 7.9477f, 11.4477f, 7.5f, 12.0f, 7.5f)
                close()
                moveTo(11.0f, 15.5f)
                curveTo(11.0f, 16.0523f, 11.4477f, 16.5f, 12.0f, 16.5f)
                curveTo(12.5523f, 16.5f, 13.0f, 16.0523f, 13.0f, 15.5f)
                curveTo(13.0f, 14.9477f, 12.5523f, 14.5f, 12.0f, 14.5f)
                curveTo(11.4477f, 14.5f, 11.0f, 14.9477f, 11.0f, 15.5f)
                close()
            }
        }.build()
        return exclamationOctagon!!
    }

private var exclamationOctagon: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.ExclamationOctagon,
                contentDescription = ""
            )
        }
    }
}