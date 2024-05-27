package io.github.madmaximuus.persianSymbols.toggle.on

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

val PersianSymbols.Default.ToggleOn: ImageVector
    get() {
        if (toggleOn != null) {
            return toggleOn!!
        }
        toggleOn = ImageVector.Builder(
            name = "toggle-on-default",
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
                moveTo(15.9999f, 8.9999f)
                curveTo(14.343f, 8.9999f, 12.9999f, 10.343f, 12.9999f, 11.9999f)
                curveTo(12.9999f, 13.6567f, 14.343f, 14.9999f, 15.9999f, 14.9999f)
                curveTo(17.6567f, 14.9999f, 18.9999f, 13.6567f, 18.9999f, 11.9999f)
                curveTo(18.9999f, 10.343f, 17.6567f, 8.9999f, 15.9999f, 8.9999f)
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
        return toggleOn!!
    }

private var toggleOn: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ToggleOn,
                contentDescription = ""
            )
        }
    }
}