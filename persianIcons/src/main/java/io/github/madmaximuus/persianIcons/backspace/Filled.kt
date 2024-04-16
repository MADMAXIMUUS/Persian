package io.github.madmaximuus.persianIcons.backspace

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
fun backspaceFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "backspace-filled",
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
                moveTo(17.6f, 4f)
                curveTo(20.03f, 4f, 22f, 5.9699f, 22f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22f, 18.0301f, 20.03f, 20f, 17.6f, 20f)
                horizontalLineTo(9.37767f)
                curveTo(8.9267f, 20f, 8.4996f, 19.7971f, 8.2148f, 19.4474f)
                lineTo(2.78955f, 12.7884f)
                curveTo(2.3322f, 12.227f, 2.3411f, 11.419f, 2.8109f, 10.8679f)
                lineTo(8.21578f, 4.52695f)
                curveTo(8.5008f, 4.1926f, 8.918f, 4f, 9.3574f, 4f)
                horizontalLineTo(17.6f)
                close()
                moveTo(12.2071f, 8.29289f)
                curveTo(11.8166f, 7.9024f, 11.1834f, 7.9024f, 10.7929f, 8.2929f)
                curveTo(10.4023f, 8.6834f, 10.4023f, 9.3166f, 10.7929f, 9.7071f)
                lineTo(13.0858f, 12f)
                lineTo(10.7929f, 14.2929f)
                curveTo(10.4023f, 14.6834f, 10.4023f, 15.3166f, 10.7929f, 15.7071f)
                curveTo(11.1834f, 16.0976f, 11.8166f, 16.0976f, 12.2071f, 15.7071f)
                lineTo(14.5f, 13.4142f)
                lineTo(16.7929f, 15.7071f)
                curveTo(17.1834f, 16.0976f, 17.8166f, 16.0976f, 18.2071f, 15.7071f)
                curveTo(18.5976f, 15.3166f, 18.5976f, 14.6834f, 18.2071f, 14.2929f)
                lineTo(15.9142f, 12f)
                lineTo(18.2071f, 9.70711f)
                curveTo(18.5976f, 9.3166f, 18.5976f, 8.6834f, 18.2071f, 8.2929f)
                curveTo(17.8166f, 7.9024f, 17.1834f, 7.9024f, 16.7929f, 8.2929f)
                lineTo(14.5f, 10.5858f)
                lineTo(12.2071f, 8.29289f)
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
                imageVector = backspaceFilled(),
                contentDescription = ""
            )
        }
    }
}