package io.github.madmaximuus.persianSymbols.tag.two

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

val PersianSymbols.Filled.Tag2: ImageVector
    get() {
        if (tag2 != null) {
            return tag2!!
        }
        tag2 = Builder(
            name = "tag-2-filled",
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
                moveTo(13.4151f, 4.0f)
                horizontalLineTo(2.763f)
                curveTo(2.0757f, 4.0f, 1.7083f, 4.8095f, 2.1609f, 5.3268f)
                lineTo(7.5391f, 11.4732f)
                curveTo(7.803f, 11.7748f, 7.803f, 12.2252f, 7.5391f, 12.5268f)
                lineTo(2.1609f, 18.6732f)
                curveTo(1.7083f, 19.1905f, 2.0757f, 20.0f, 2.763f, 20.0f)
                horizontalLineTo(13.4151f)
                curveTo(13.9571f, 20.0f, 14.4759f, 19.78f, 14.8527f, 19.3904f)
                lineTo(21.4621f, 12.5561f)
                curveTo(21.7621f, 12.246f, 21.7621f, 11.754f, 21.4621f, 11.4439f)
                lineTo(14.8527f, 4.6096f)
                curveTo(14.4759f, 4.22f, 13.9571f, 4.0f, 13.4151f, 4.0f)
                close()
            }
        }.build()
        return tag2!!
    }

private var tag2: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Tag2,
                contentDescription = ""
            )
        }
    }
}