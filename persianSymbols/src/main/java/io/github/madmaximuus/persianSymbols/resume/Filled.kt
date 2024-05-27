package io.github.madmaximuus.persianSymbols.resume

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

val PersianSymbols.Filled.Resume: ImageVector
    get() {
        if (resume != null) {
            return resume!!
        }
        resume = Builder(
            name = "resume-filled",
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
                moveTo(8.0f, 7.0f)
                curveTo(8.0f, 6.4477f, 7.5523f, 6.0f, 7.0f, 6.0f)
                curveTo(6.4477f, 6.0f, 6.0f, 6.4477f, 6.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(6.0f, 17.5523f, 6.4477f, 18.0f, 7.0f, 18.0f)
                curveTo(7.5523f, 18.0f, 8.0f, 17.5523f, 8.0f, 17.0f)
                lineTo(8.0f, 7.0f)
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
                moveTo(12.5547f, 7.0365f)
                lineTo(18.7519f, 11.1679f)
                curveTo(19.3457f, 11.5638f, 19.3457f, 12.4362f, 18.7519f, 12.8321f)
                lineTo(12.5547f, 16.9635f)
                curveTo(11.8901f, 17.4066f, 11.0f, 16.9302f, 11.0f, 16.1315f)
                verticalLineTo(7.8685f)
                curveTo(11.0f, 7.0698f, 11.8901f, 6.5934f, 12.5547f, 7.0365f)
                close()
            }
        }.build()
        return resume!!
    }

private var resume: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Resume,
                contentDescription = ""
            )
        }
    }
}