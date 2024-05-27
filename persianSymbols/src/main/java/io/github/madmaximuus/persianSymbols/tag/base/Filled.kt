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
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Tag: ImageVector
    get() {
        if (tag != null) {
            return tag!!
        }
        tag = Builder(
            name = "tag-filled",
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
                moveTo(2.0f, 8.4f)
                lineTo(2.0f, 15.6f)
                curveTo(2.0f, 18.0301f, 3.9699f, 20.0f, 6.4f, 20.0f)
                lineTo(14.6426f, 20.0f)
                curveTo(15.082f, 20.0f, 15.4992f, 19.8074f, 15.7842f, 19.473f)
                lineTo(21.1891f, 13.1321f)
                curveTo(21.6588f, 12.581f, 21.6678f, 11.773f, 21.2104f, 11.2116f)
                lineTo(15.7852f, 4.5526f)
                curveTo(15.5004f, 4.2029f, 15.0733f, 4.0f, 14.6223f, 4.0f)
                lineTo(6.4f, 4.0f)
                curveTo(3.9699f, 4.0f, 2.0f, 5.97f, 2.0f, 8.4f)
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
                imageVector = PersianSymbols.Filled.Tag,
                contentDescription = ""
            )
        }
    }
}