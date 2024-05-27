package io.github.madmaximuus.persianSymbols.toggle.off

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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.9999f, 8.9999f)
                curveTo(6.343f, 8.9999f, 4.9999f, 10.343f, 4.9999f, 11.9999f)
                curveTo(4.9999f, 13.6567f, 6.343f, 14.9999f, 7.9999f, 14.9999f)
                curveTo(9.6567f, 14.9999f, 10.9999f, 13.6567f, 10.9999f, 11.9999f)
                curveTo(10.9999f, 10.343f, 9.6567f, 8.9999f, 7.9999f, 8.9999f)
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
                moveTo(8.0f, 5.9999f)
                curveTo(4.6863f, 5.9999f, 2.0f, 8.6862f, 2.0f, 11.9999f)
                curveTo(2.0f, 15.3136f, 4.6863f, 17.9999f, 8.0f, 17.9999f)
                horizontalLineTo(16.0f)
                curveTo(19.3137f, 17.9999f, 22.0f, 15.3136f, 22.0f, 11.9999f)
                curveTo(22.0f, 8.6862f, 19.3137f, 5.9999f, 16.0f, 5.9999f)
                horizontalLineTo(8.0f)
                close()
                moveTo(4.0f, 11.9999f)
                curveTo(4.0f, 9.7908f, 5.7909f, 7.9999f, 8.0f, 7.9999f)
                horizontalLineTo(16.0f)
                curveTo(18.2092f, 7.9999f, 20.0f, 9.7908f, 20.0f, 11.9999f)
                curveTo(20.0f, 14.209f, 18.2092f, 15.9999f, 16.0f, 15.9999f)
                horizontalLineTo(8.0f)
                curveTo(5.7909f, 15.9999f, 4.0f, 14.209f, 4.0f, 11.9999f)
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