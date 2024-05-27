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

val PersianSymbols.Default.TagSlash: ImageVector
    get() {
        if (tagSlash != null) {
            return tagSlash!!
        }
        tagSlash = Builder(
            name = "tag-slash-default",
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
                moveTo(2.0001f, 8.5f)
                curveTo(2.0001f, 7.3846f, 2.4058f, 6.3641f, 3.0778f, 5.5778f)
                lineTo(4.4999f, 6.9999f)
                curveTo(4.186f, 7.4178f, 4.0001f, 7.9372f, 4.0001f, 8.5f)
                lineTo(4.0001f, 15.5f)
                curveTo(4.0001f, 16.8807f, 5.1193f, 18.0f, 6.5001f, 18.0f)
                horizontalLineTo(14.547f)
                lineTo(14.9922f, 17.4922f)
                lineTo(16.4095f, 18.9095f)
                lineTo(16.0507f, 19.3187f)
                curveTo(15.6709f, 19.7517f, 15.1229f, 20.0f, 14.547f, 20.0f)
                horizontalLineTo(6.5001f)
                curveTo(4.0148f, 20.0f, 2.0001f, 17.9853f, 2.0001f, 15.5f)
                verticalLineTo(8.5f)
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
                lineTo(8.5f, 6.0f)
                lineTo(14.5334f, 6.0f)
                lineTo(19.6829f, 12.1434f)
                lineTo(17.3283f, 14.8283f)
                lineTo(18.7456f, 16.2456f)
                lineTo(21.1866f, 13.4621f)
                curveTo(21.8371f, 12.7203f, 21.8495f, 11.6148f, 21.2157f, 10.8587f)
                lineTo(16.0662f, 4.7152f)
                curveTo(15.6862f, 4.2619f, 15.125f, 4.0f, 14.5334f, 4.0f)
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
                imageVector = PersianSymbols.Default.TagSlash,
                contentDescription = ""
            )
        }
    }
}