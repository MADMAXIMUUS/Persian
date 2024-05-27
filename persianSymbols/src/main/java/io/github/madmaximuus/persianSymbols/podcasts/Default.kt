package io.github.madmaximuus.persianSymbols.podcasts

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

val PersianSymbols.Default.Podcasts: ImageVector
    get() {
        if (podcasts != null) {
            return podcasts!!
        }
        podcasts = Builder(
            name = "podcasts-default",
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
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 14.207f, 19.1076f, 16.2037f, 17.6616f, 17.6521f)
                curveTo(17.2714f, 18.0429f, 17.272f, 18.6761f, 17.6628f, 19.0663f)
                curveTo(18.0537f, 19.4565f, 18.6868f, 19.456f, 19.077f, 19.0651f)
                curveTo(20.8821f, 17.257f, 22.0f, 14.7581f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 14.7581f, 3.1179f, 17.257f, 4.923f, 19.0651f)
                curveTo(5.3132f, 19.456f, 5.9463f, 19.4565f, 6.3372f, 19.0663f)
                curveTo(6.728f, 18.6761f, 6.7286f, 18.0429f, 6.3384f, 17.6521f)
                curveTo(4.8924f, 16.2037f, 4.0f, 14.207f, 4.0f, 12.0f)
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
                moveTo(12.0f, 8.0f)
                curveTo(9.7909f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
                curveTo(8.0f, 13.0905f, 8.4351f, 14.0774f, 9.1434f, 14.8f)
                curveTo(9.53f, 15.1943f, 9.5237f, 15.8275f, 9.1293f, 16.2141f)
                curveTo(8.7349f, 16.6007f, 8.1018f, 16.5944f, 7.7152f, 16.2f)
                curveTo(6.6552f, 15.1188f, 6.0f, 13.6349f, 6.0f, 12.0f)
                curveTo(6.0f, 8.6863f, 8.6863f, 6.0f, 12.0f, 6.0f)
                curveTo(15.3137f, 6.0f, 18.0f, 8.6863f, 18.0f, 12.0f)
                curveTo(18.0f, 13.6349f, 17.3448f, 15.1188f, 16.2848f, 16.2f)
                curveTo(15.8982f, 16.5944f, 15.2651f, 16.6007f, 14.8707f, 16.2141f)
                curveTo(14.4763f, 15.8275f, 14.47f, 15.1943f, 14.8566f, 14.8f)
                curveTo(15.5649f, 14.0774f, 16.0f, 13.0905f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
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
                moveTo(13.0f, 13.7324f)
                curveTo(13.5978f, 13.3866f, 14.0f, 12.7403f, 14.0f, 12.0f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 10.8954f, 10.0f, 12.0f)
                curveTo(10.0f, 12.7403f, 10.4022f, 13.3866f, 11.0f, 13.7324f)
                verticalLineTo(21.0f)
                curveTo(11.0f, 21.5523f, 11.4477f, 22.0f, 12.0f, 22.0f)
                curveTo(12.5523f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                verticalLineTo(13.7324f)
                close()
            }
        }.build()
        return podcasts!!
    }

private var podcasts: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Podcasts,
                contentDescription = ""
            )
        }
    }
}