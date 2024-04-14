package io.github.madmaximuus.persianIcons.house


import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun houseFilled(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "house-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12f, 3f)
                lineTo(3.00002f, 10.0007f)
                horizontalLineTo(5.00003f)
                verticalLineTo(18.5f)
                curveTo(5f, 19.8807f, 6.1193f, 21f, 7.5f, 21f)
                horizontalLineTo(9.00003f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 21f, 19f, 19.8807f, 19f, 18.5f)
                verticalLineTo(10.0007f)
                horizontalLineTo(21f)
                lineTo(12f, 3f)
                close()
            }
        }.build()
    }
}

@Preview
@Composable
private fun HousePreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = houseFilled(),
                contentDescription = ""
            )
        }
    }
}

