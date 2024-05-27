package io.github.madmaximuus.persianSymbols.bell.base

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

val PersianSymbols.Filled.Bell: ImageVector
    get() {
        if (bell != null) {
            return bell!!
        }
        bell = Builder(
            name = "bell-filled",
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
                moveTo(13.0f, 3.0f)
                curveTo(13.0f, 2.4477f, 12.5523f, 2.0f, 12.0f, 2.0f)
                curveTo(11.4477f, 2.0f, 11.0f, 2.4477f, 11.0f, 3.0f)
                verticalLineTo(3.083f)
                curveTo(8.1623f, 3.559f, 6.0f, 6.027f, 6.0f, 9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 17.0f, 4.0f, 17.4477f, 4.0f, 18.0f)
                curveTo(4.0f, 18.5523f, 4.4477f, 19.0f, 5.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                curveTo(19.5523f, 19.0f, 20.0f, 18.5523f, 20.0f, 18.0f)
                curveTo(20.0f, 17.4477f, 19.5523f, 17.0f, 19.0f, 17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 6.027f, 15.8377f, 3.559f, 13.0f, 3.083f)
                verticalLineTo(3.0f)
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
                moveTo(9.9338f, 21.1751f)
                curveTo(10.4718f, 21.6863f, 11.1993f, 22.0f, 12.0f, 22.0f)
                curveTo(12.8007f, 22.0f, 13.5282f, 21.6863f, 14.0662f, 21.1751f)
                curveTo(14.5665f, 20.6997f, 14.1054f, 20.0f, 13.4152f, 20.0f)
                horizontalLineTo(10.5848f)
                curveTo(9.8946f, 20.0f, 9.4335f, 20.6997f, 9.9338f, 21.1751f)
                close()
            }
        }.build()
        return bell!!
    }

private var bell: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Bell,
                contentDescription = ""
            )
        }
    }
}