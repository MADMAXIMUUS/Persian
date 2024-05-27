package io.github.madmaximuus.persianSymbols.exclamation.base

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

val PersianSymbols.Default.Exclamation: ImageVector
    get() {
        if (exclamation != null) {
            return exclamation!!
        }
        exclamation = Builder(
            name = "exclamation-default",
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
                moveTo(13.0f, 5.0f)
                curveTo(13.0f, 4.4477f, 12.5523f, 4.0f, 12.0f, 4.0f)
                curveTo(11.4477f, 4.0f, 11.0f, 4.4477f, 11.0f, 5.0f)
                lineTo(11.0f, 15.0f)
                curveTo(11.0f, 15.5523f, 11.4477f, 16.0f, 12.0f, 16.0f)
                curveTo(12.5523f, 16.0f, 13.0f, 15.5523f, 13.0f, 15.0f)
                lineTo(13.0f, 5.0f)
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
                moveTo(12.0f, 21.0f)
                curveTo(13.1046f, 21.0f, 14.0f, 20.1046f, 14.0f, 19.0f)
                curveTo(14.0f, 17.8954f, 13.1046f, 17.0f, 12.0f, 17.0f)
                curveTo(10.8954f, 17.0f, 10.0f, 17.8954f, 10.0f, 19.0f)
                curveTo(10.0f, 20.1046f, 10.8954f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }.build()
        return exclamation!!
    }

private var exclamation: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Exclamation,
                contentDescription = ""
            )
        }
    }
}