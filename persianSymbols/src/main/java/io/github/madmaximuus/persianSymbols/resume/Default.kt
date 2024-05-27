package io.github.madmaximuus.persianSymbols.resume

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
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Resume: ImageVector
    get() {
        if (resume != null) {
            return resume!!
        }
        resume = Builder(
            name = "resume-default",
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
                pathFillType = EvenOdd
            ) {
                moveTo(12.53f, 6.8639f)
                curveTo(11.471f, 6.1075f, 10.0f, 6.8645f, 10.0f, 8.1659f)
                verticalLineTo(15.8341f)
                curveTo(10.0f, 17.1354f, 11.471f, 17.8924f, 12.53f, 17.136f)
                lineTo(17.8977f, 13.3019f)
                curveTo(18.7911f, 12.6638f, 18.7911f, 11.3361f, 17.8977f, 10.698f)
                lineTo(12.53f, 6.8639f)
                close()
                moveTo(16.2795f, 12.0f)
                lineTo(12.0f, 15.0568f)
                verticalLineTo(8.9431f)
                lineTo(16.2795f, 12.0f)
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
                imageVector = PersianSymbols.Default.Resume,
                contentDescription = ""
            )
        }
    }
}