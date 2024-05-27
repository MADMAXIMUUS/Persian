package io.github.madmaximuus.persianSymbols.tag.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Tag: ImageVector
    get() {
        if (tag != null) {
            return tag!!
        }
        tag = Builder(
            name = "tag-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Round,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0001f, 8.5f)
                lineTo(3.0001f, 15.5f)
                curveTo(3.0001f, 17.433f, 4.5671f, 19.0f, 6.5001f, 19.0f)
                lineTo(14.547f, 19.0f)
                curveTo(14.8349f, 19.0f, 15.1089f, 18.8759f, 15.2988f, 18.6593f)
                lineTo(20.4347f, 12.8028f)
                curveTo(20.76f, 12.4318f, 20.7662f, 11.8791f, 20.4493f, 11.501f)
                lineTo(15.2998f, 5.3576f)
                curveTo(15.1098f, 5.1309f, 14.8292f, 5.0f, 14.5334f, 5.0f)
                lineTo(6.5001f, 5.0f)
                curveTo(4.5671f, 5.0f, 3.0001f, 6.567f, 3.0001f, 8.5f)
                close()
            }
        }.build()
        return tag!!
    }

private var tag: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Tag,
                contentDescription = ""
            )
        }
    }
}