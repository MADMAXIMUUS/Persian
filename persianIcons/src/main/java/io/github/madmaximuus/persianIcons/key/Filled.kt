package io.github.madmaximuus.persianIcons.key

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
fun keyFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "key-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = SolidColor(color),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.99805f, 16.0128f)
                curveTo(4.7889f, 16.0128f, 2.9981f, 14.222f, 2.9981f, 12.0128f)
                curveTo(2.9981f, 9.8037f, 4.7889f, 8.0128f, 6.9981f, 8.0128f)
                curveTo(8.4753f, 8.0128f, 9.7655f, 8.8136f, 10.4583f, 10.0049f)
                horizontalLineTo(21f)
                verticalLineTo(12.0128f)
                lineTo(19f, 16f)
                lineTo(17f, 14f)
                lineTo(15f, 16f)
                lineTo(13f, 14f)
                horizontalLineTo(10.4583f)
                curveTo(9.7655f, 15.1912f, 8.4753f, 16.0128f, 6.9981f, 16.0128f)
                close()
                moveTo(7f, 15f)
                curveTo(8.6569f, 15f, 10f, 13.6569f, 10f, 12f)
                curveTo(10f, 10.3431f, 8.6569f, 9f, 7f, 9f)
                curveTo(5.3431f, 9f, 4f, 10.3431f, 4f, 12f)
                curveTo(4f, 13.6569f, 5.3431f, 15f, 7f, 15f)
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
                imageVector = keyFilled(),
                contentDescription = ""
            )
        }
    }
}