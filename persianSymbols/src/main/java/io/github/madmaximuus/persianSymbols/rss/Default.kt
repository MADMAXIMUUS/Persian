package io.github.madmaximuus.persianSymbols.rss

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

val PersianSymbols.Default.Rss: ImageVector
    get() {
        if (rss != null) {
            return rss!!
        }
        rss = Builder(
            name = "rss-default",
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
                moveTo(5.076f, 6.035f)
                curveTo(5.3809f, 6.0118f, 5.6891f, 6.0f, 6.0002f, 6.0f)
                curveTo(12.6276f, 6.0f, 18.0002f, 11.3726f, 18.0002f, 18.0f)
                curveTo(18.0002f, 18.3111f, 17.9884f, 18.6193f, 17.9652f, 18.9241f)
                curveTo(17.9233f, 19.4748f, 18.3358f, 19.9552f, 18.8865f, 19.9971f)
                curveTo(19.4371f, 20.039f, 19.9175f, 19.6265f, 19.9594f, 19.0759f)
                curveTo(19.9865f, 18.7206f, 20.0002f, 18.3618f, 20.0002f, 18.0f)
                curveTo(20.0002f, 10.268f, 13.7322f, 4.0f, 6.0002f, 4.0f)
                curveTo(5.6384f, 4.0f, 5.2796f, 4.0138f, 4.9243f, 4.0408f)
                curveTo(4.3737f, 4.0827f, 3.9612f, 4.563f, 4.0031f, 5.1137f)
                curveTo(4.045f, 5.6644f, 4.5254f, 6.0769f, 5.076f, 6.035f)
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
                moveTo(6.0002f, 10.0f)
                curveTo(5.699f, 10.0f, 5.402f, 10.0166f, 5.1101f, 10.0489f)
                curveTo(4.5611f, 10.1096f, 4.0669f, 9.7137f, 4.0062f, 9.1648f)
                curveTo(3.9456f, 8.6159f, 4.3414f, 8.1217f, 4.8903f, 8.061f)
                curveTo(5.2551f, 8.0207f, 5.6254f, 8.0f, 6.0002f, 8.0f)
                curveTo(11.523f, 8.0f, 16.0002f, 12.4772f, 16.0002f, 18.0f)
                curveTo(16.0002f, 18.3748f, 15.9795f, 18.7451f, 15.9392f, 19.1099f)
                curveTo(15.8785f, 19.6588f, 15.3843f, 20.0546f, 14.8354f, 19.9939f)
                curveTo(14.2865f, 19.9333f, 13.8906f, 19.4391f, 13.9513f, 18.8901f)
                curveTo(13.9836f, 18.5982f, 14.0002f, 18.3012f, 14.0002f, 18.0f)
                curveTo(14.0002f, 13.5817f, 10.4185f, 10.0f, 6.0002f, 10.0f)
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
                moveTo(5.1991f, 14.08f)
                curveTo(5.4571f, 14.0277f, 5.7249f, 14.0f, 6.0002f, 14.0f)
                curveTo(8.2093f, 14.0f, 10.0002f, 15.7909f, 10.0002f, 18.0f)
                curveTo(10.0002f, 18.2753f, 9.9725f, 18.5431f, 9.9202f, 18.8011f)
                curveTo(9.8103f, 19.3423f, 10.16f, 19.8701f, 10.7012f, 19.98f)
                curveTo(11.2425f, 20.0899f, 11.7703f, 19.7402f, 11.8802f, 19.1989f)
                curveTo(11.959f, 18.8107f, 12.0002f, 18.4097f, 12.0002f, 18.0f)
                curveTo(12.0002f, 14.6863f, 9.3139f, 12.0f, 6.0002f, 12.0f)
                curveTo(5.5905f, 12.0f, 5.1895f, 12.0412f, 4.8013f, 12.12f)
                curveTo(4.26f, 12.2299f, 3.9103f, 12.7577f, 4.0202f, 13.299f)
                curveTo(4.1301f, 13.8402f, 4.6579f, 14.1899f, 5.1991f, 14.08f)
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
                moveTo(6.0002f, 19.9999f)
                curveTo(7.1048f, 19.9999f, 8.0002f, 19.1044f, 8.0002f, 17.9999f)
                curveTo(8.0002f, 16.8953f, 7.1048f, 15.9999f, 6.0002f, 15.9999f)
                curveTo(4.8956f, 15.9999f, 4.0002f, 16.8953f, 4.0002f, 17.9999f)
                curveTo(4.0002f, 19.1044f, 4.8956f, 19.9999f, 6.0002f, 19.9999f)
                close()
            }
        }.build()
        return rss!!
    }

private var rss: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Rss,
                contentDescription = ""
            )
        }
    }
}