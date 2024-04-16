package io.github.madmaximuus.persianIcons.block

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
fun blockDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "block-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(6.4771f, 2f, 2f, 6.4771f, 2f, 12f)
                curveTo(2f, 17.5228f, 6.4771f, 22f, 12f, 22f)
                curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
                curveTo(22f, 6.4771f, 17.5228f, 2f, 12f, 2f)
                close()
                moveTo(7.09436f, 5.68014f)
                curveTo(8.449f, 4.6271f, 10.1513f, 4f, 12f, 4f)
                curveTo(16.4183f, 4f, 20f, 7.5817f, 20f, 12f)
                curveTo(20f, 13.8487f, 19.3729f, 15.551f, 18.3199f, 16.9056f)
                lineTo(7.09436f, 5.68014f)
                close()
                moveTo(5.68014f, 7.09436f)
                curveTo(4.6271f, 8.449f, 4f, 10.1513f, 4f, 12f)
                curveTo(4f, 16.4183f, 7.5817f, 20f, 12f, 20f)
                curveTo(13.8487f, 20f, 15.551f, 19.3729f, 16.9056f, 18.3199f)
                lineTo(5.68014f, 7.09436f)
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
                imageVector = blockDefault(),
                contentDescription = ""
            )
        }
    }
}