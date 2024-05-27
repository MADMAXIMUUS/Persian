package io.github.madmaximuus.persianSymbols.backward.base

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

val PersianSymbols.Filled.Backward: ImageVector
    get() {
        if (backward != null) {
            return backward!!
        }
        backward = Builder(
            name = "backward-filled",
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
                moveTo(10.931f, 6.6456f)
                lineTo(3.483f, 11.1439f)
                curveTo(2.839f, 11.5329f, 2.839f, 12.4669f, 3.483f, 12.8559f)
                lineTo(10.931f, 17.3543f)
                curveTo(11.5975f, 17.7568f, 12.448f, 17.2769f, 12.448f, 16.4983f)
                verticalLineTo(13.1038f)
                lineTo(19.4855f, 17.3543f)
                curveTo(20.152f, 17.7568f, 21.0025f, 17.2769f, 21.0025f, 16.4983f)
                verticalLineTo(7.5016f)
                curveTo(21.0025f, 6.723f, 20.152f, 6.243f, 19.4855f, 6.6456f)
                lineTo(12.448f, 10.8961f)
                verticalLineTo(7.5016f)
                curveTo(12.448f, 6.723f, 11.5975f, 6.243f, 10.931f, 6.6456f)
                close()
            }
        }.build()
        return backward!!
    }

private var backward: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Backward,
                contentDescription = ""
            )
        }
    }
}