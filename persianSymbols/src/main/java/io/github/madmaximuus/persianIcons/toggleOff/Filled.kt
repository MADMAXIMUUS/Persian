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

val PersianSymbols.Filled.ToggleOff: ImageVector
    get() {
        if (toggleOff != null) {
            return toggleOff!!
        }
        toggleOff = ImageVector.Builder(
            name = "toggle-off-filled",
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6f)
                curveTo(4.6863f, 6f, 2f, 8.6863f, 2f, 12f)
                curveTo(2f, 15.3137f, 4.6863f, 18f, 8f, 18f)
                horizontalLineTo(16f)
                curveTo(19.3137f, 18f, 22f, 15.3137f, 22f, 12f)
                curveTo(22f, 8.6863f, 19.3137f, 6f, 16f, 6f)
                horizontalLineTo(8f)
                close()
                moveTo(7.99987f, 8.99989f)
                curveTo(6.343f, 8.9999f, 4.9999f, 10.343f, 4.9999f, 11.9999f)
                curveTo(4.9999f, 13.6567f, 6.343f, 14.9999f, 7.9999f, 14.9999f)
                curveTo(9.6567f, 14.9999f, 10.9999f, 13.6567f, 10.9999f, 11.9999f)
                curveTo(10.9999f, 10.343f, 9.6567f, 8.9999f, 7.9999f, 8.9999f)
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
                imageVector = PersianSymbols.Filled.ToggleOff,
                contentDescription = ""
            )
        }
    }
}
