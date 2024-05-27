package io.github.madmaximuus.persianSymbols.pin

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

val PersianSymbols.Filled.Pin: ImageVector
    get() {
        if (pin != null) {
            return pin!!
        }
        pin = Builder(
            name = "pin-filled",
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
                moveTo(8.0f, 6.0f)
                curveTo(8.0f, 3.7909f, 9.7909f, 2.0f, 12.0f, 2.0f)
                curveTo(14.2091f, 2.0f, 16.0f, 3.7909f, 16.0f, 6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 12.0f, 18.0f, 12.4477f, 18.0f, 13.0f)
                curveTo(18.0f, 13.5523f, 17.5523f, 14.0f, 17.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                verticalLineTo(20.3636f)
                lineTo(12.1707f, 21.7207f)
                curveTo(12.0927f, 21.8484f, 11.9073f, 21.8484f, 11.8293f, 21.7207f)
                lineTo(11.0f, 20.3636f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 14.0f, 6.0f, 13.5523f, 6.0f, 13.0f)
                curveTo(6.0f, 12.4477f, 6.4477f, 12.0f, 7.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                close()
            }
        }.build()
        return pin!!
    }

private var pin: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Pin,
                contentDescription = ""
            )
        }
    }
}