package io.github.madmaximuus.persianIcons.favorite

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun favoriteDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "favorite-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(color),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.0078f, 5.30139f)
                curveTo(9.9512f, 3.2448f, 6.6032f, 3.2347f, 4.5444f, 5.2935f)
                curveTo(2.4856f, 7.3523f, 2.4839f, 10.6886f, 4.5405f, 12.7452f)
                curveTo(4.5552f, 12.7599f, 4.57f, 12.7745f, 4.5848f, 12.789f)
                lineTo(4.55223f, 12.8215f)
                lineTo(11.9766f, 20.2459f)
                lineTo(19.4322f, 12.7903f)
                lineTo(19.4231f, 12.7813f)
                curveTo(19.434f, 12.7706f, 19.4448f, 12.7599f, 19.4556f, 12.7491f)
                curveTo(21.5144f, 10.6903f, 21.5161f, 7.3541f, 19.4595f, 5.2974f)
                curveTo(17.4029f, 3.2408f, 14.0666f, 3.2426f, 12.0078f, 5.3014f)
                close()
            }
        }.build()
    }
}

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = favoriteDefault(),
                contentDescription = ""
            )
        }
    }
}