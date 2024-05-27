package io.github.madmaximuus.persianSymbols.tag.slash

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

val PersianSymbols.Filled.TagSlash: ImageVector
    get() {
        if (tagSlash != null) {
            return tagSlash!!
        }
        tagSlash = Builder(
            name = "tag-slash-filled",
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
                moveTo(3.7071f, 2.2929f)
                curveTo(3.3166f, 1.9024f, 2.6834f, 1.9024f, 2.2929f, 2.2929f)
                curveTo(1.9024f, 2.6834f, 1.9024f, 3.3166f, 2.2929f, 3.7071f)
                lineTo(20.2929f, 21.7071f)
                curveTo(20.6834f, 22.0976f, 21.3166f, 22.0976f, 21.7071f, 21.7071f)
                curveTo(22.0976f, 21.3166f, 22.0976f, 20.6834f, 21.7071f, 20.2929f)
                lineTo(3.7071f, 2.2929f)
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
                moveTo(2.0f, 8.4f)
                curveTo(2.0f, 7.3123f, 2.3947f, 6.3167f, 3.0487f, 5.5487f)
                lineTo(16.3312f, 18.8312f)
                lineTo(15.9339f, 19.2974f)
                curveTo(15.5539f, 19.7432f, 14.9976f, 20.0f, 14.4118f, 20.0f)
                lineTo(6.4f, 20.0f)
                curveTo(3.9699f, 20.0f, 2.0f, 18.0301f, 2.0f, 15.6f)
                verticalLineTo(8.4f)
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
                moveTo(6.5f, 4.0f)
                lineTo(18.632f, 16.132f)
                lineTo(21.1891f, 13.1321f)
                curveTo(21.6588f, 12.581f, 21.6678f, 11.773f, 21.2104f, 11.2116f)
                lineTo(15.9353f, 4.7368f)
                curveTo(15.5555f, 4.2706f, 14.986f, 4.0f, 14.3847f, 4.0f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return tagSlash!!
    }

private var tagSlash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.TagSlash,
                contentDescription = ""
            )
        }
    }
}