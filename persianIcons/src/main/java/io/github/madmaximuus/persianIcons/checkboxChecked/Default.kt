package io.github.madmaximuus.persianIcons.checkboxChecked

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
fun checkboxDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "checkbox-default",
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
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(17.3033f, 8.46434f)
                curveTo(17.6938f, 8.8549f, 17.6938f, 9.488f, 17.3033f, 9.8786f)
                lineTo(11.6464f, 15.5354f)
                curveTo(11.4374f, 15.7445f, 11.1587f, 15.8416f, 10.885f, 15.8268f)
                curveTo(10.6106f, 15.8423f, 10.331f, 15.7452f, 10.1213f, 15.5355f)
                lineTo(7.29289f, 12.7071f)
                curveTo(6.9024f, 12.3166f, 6.9024f, 11.6834f, 7.2929f, 11.2929f)
                curveTo(7.6834f, 10.9024f, 8.3166f, 10.9024f, 8.7071f, 11.2929f)
                lineTo(10.8838f, 13.4696f)
                lineTo(15.8891f, 8.46434f)
                curveTo(16.2796f, 8.0738f, 16.9128f, 8.0738f, 17.3033f, 8.4643f)
                close()
            }
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
                moveTo(7.49994f, 2.99994f)
                curveTo(5.0147f, 2.9999f, 2.9999f, 5.0147f, 2.9999f, 7.4999f)
                verticalLineTo(16.4999f)
                curveTo(2.9999f, 18.9852f, 5.0147f, 20.9999f, 7.4999f, 20.9999f)
                horizontalLineTo(16.4999f)
                curveTo(18.9852f, 20.9999f, 20.9999f, 18.9852f, 20.9999f, 16.4999f)
                verticalLineTo(7.49994f)
                curveTo(20.9999f, 5.0147f, 18.9852f, 2.9999f, 16.4999f, 2.9999f)
                horizontalLineTo(7.49994f)
                close()
                moveTo(4.99994f, 7.49994f)
                curveTo(4.9999f, 6.1192f, 6.1192f, 4.9999f, 7.4999f, 4.9999f)
                horizontalLineTo(16.4999f)
                curveTo(17.8806f, 4.9999f, 18.9999f, 6.1192f, 18.9999f, 7.4999f)
                verticalLineTo(16.4999f)
                curveTo(18.9999f, 17.8806f, 17.8806f, 18.9999f, 16.4999f, 18.9999f)
                horizontalLineTo(7.49994f)
                curveTo(6.1192f, 18.9999f, 4.9999f, 17.8806f, 4.9999f, 16.4999f)
                verticalLineTo(7.49994f)
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
                imageVector = checkboxDefault(),
                contentDescription = ""
            )
        }
    }
}