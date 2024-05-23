package io.github.madmaximuus.persianIcons.toggleOff

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

val PersianSymbols.Default.ToggleOff: ImageVector
    get() {
        if (toggleOff != null) {
            return toggleOff!!
        }
        toggleOff = ImageVector.Builder(
            name = "toggle-off-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7.99988f, 8.99988f)
                curveTo(6.343f, 8.9999f, 4.9999f, 10.343f, 4.9999f, 11.9999f)
                curveTo(4.9999f, 13.6567f, 6.343f, 14.9999f, 7.9999f, 14.9999f)
                curveTo(9.6567f, 14.9999f, 10.9999f, 13.6567f, 10.9999f, 11.9999f)
                curveTo(10.9999f, 10.343f, 9.6567f, 8.9999f, 7.9999f, 8.9999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.99997f, 5.99994f)
                curveTo(4.6863f, 5.9999f, 2f, 8.6862f, 2f, 11.9999f)
                curveTo(2f, 15.3136f, 4.6863f, 17.9999f, 8f, 17.9999f)
                horizontalLineTo(16f)
                curveTo(19.3137f, 17.9999f, 22f, 15.3136f, 22f, 11.9999f)
                curveTo(22f, 8.6862f, 19.3137f, 5.9999f, 16f, 5.9999f)
                horizontalLineTo(7.99997f)
                close()
                moveTo(4f, 11.9999f)
                curveTo(4f, 9.7908f, 5.7908f, 7.9999f, 8f, 7.9999f)
                horizontalLineTo(16f)
                curveTo(18.2092f, 7.9999f, 20f, 9.7908f, 20f, 11.9999f)
                curveTo(20f, 14.209f, 18.2092f, 15.9999f, 16f, 15.9999f)
                horizontalLineTo(7.99997f)
                curveTo(5.7908f, 15.9999f, 4f, 14.209f, 4f, 11.9999f)
                close()
            }
        }.build()
        return toggleOff!!
    }

private var toggleOff: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ToggleOff,
                contentDescription = ""
            )
        }
    }
}