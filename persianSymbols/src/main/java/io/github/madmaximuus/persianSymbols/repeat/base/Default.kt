package io.github.madmaximuus.persianSymbols.repeat.base

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

val PersianSymbols.Default.Repeat: ImageVector
    get() {
        if (repeat != null) {
            return repeat!!
        }
        repeat = Builder(
            name = "repeat-default",
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
                moveTo(17.1679f, 2.4453f)
                curveTo(17.4743f, 1.9858f, 18.0952f, 1.8616f, 18.5547f, 2.1679f)
                lineTo(20.9306f, 3.7519f)
                curveTo(21.8212f, 4.3456f, 21.8212f, 5.6543f, 20.9306f, 6.2481f)
                lineTo(18.5547f, 7.832f)
                curveTo(18.0952f, 8.1384f, 17.4743f, 8.0142f, 17.1679f, 7.5547f)
                curveTo(16.8616f, 7.0952f, 16.9858f, 6.4743f, 17.4453f, 6.1679f)
                lineTo(17.6972f, 6.0f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 6.0f, 5.0f, 7.1193f, 5.0f, 8.5f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 12.5523f, 4.5523f, 13.0f, 4.0f, 13.0f)
                curveTo(3.4477f, 13.0f, 3.0f, 12.5523f, 3.0f, 12.0f)
                verticalLineTo(8.5f)
                curveTo(3.0f, 6.0147f, 5.0147f, 4.0f, 7.5f, 4.0f)
                horizontalLineTo(17.6972f)
                lineTo(17.4453f, 3.832f)
                curveTo(16.9858f, 3.5257f, 16.8616f, 2.9048f, 17.1679f, 2.4453f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 11.0f)
                curveTo(20.5523f, 11.0f, 21.0f, 11.4477f, 21.0f, 12.0f)
                verticalLineTo(15.5f)
                curveTo(21.0f, 17.9853f, 18.9853f, 20.0f, 16.5f, 20.0f)
                horizontalLineTo(6.3028f)
                lineTo(6.5547f, 20.1679f)
                curveTo(7.0142f, 20.4743f, 7.1384f, 21.0952f, 6.832f, 21.5547f)
                curveTo(6.5257f, 22.0142f, 5.9048f, 22.1384f, 5.4453f, 21.832f)
                lineTo(3.0693f, 20.2481f)
                curveTo(2.1787f, 19.6543f, 2.1787f, 18.3456f, 3.0693f, 17.7519f)
                lineTo(5.4453f, 16.1679f)
                curveTo(5.9048f, 15.8616f, 6.5257f, 15.9858f, 6.832f, 16.4453f)
                curveTo(7.1384f, 16.9048f, 7.0142f, 17.5257f, 6.5547f, 17.832f)
                lineTo(6.3028f, 18.0f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 18.0f, 19.0f, 16.8807f, 19.0f, 15.5f)
                verticalLineTo(12.0f)
                curveTo(19.0f, 11.4477f, 19.4477f, 11.0f, 20.0f, 11.0f)
                close()
            }
        }.build()
        return repeat!!
    }

private var repeat: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Repeat,
                contentDescription = ""
            )
        }
    }
}