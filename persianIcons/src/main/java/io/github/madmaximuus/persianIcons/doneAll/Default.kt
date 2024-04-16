package io.github.madmaximuus.persianIcons.doneAll

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
fun doneAllDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "done-all-default",
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
                moveTo(17.6924f, 6.67163f)
                curveTo(18.1235f, 7.0168f, 18.1565f, 7.6131f, 17.766f, 8.0036f)
                lineTo(9.38805f, 16.3815f)
                curveTo(9.3387f, 16.4502f, 9.2783f, 16.5141f, 9.2071f, 16.5711f)
                curveTo(9.0054f, 16.7326f, 8.7522f, 16.8105f, 8.4999f, 16.8076f)
                curveTo(8.2477f, 16.8104f, 7.9946f, 16.7326f, 7.7929f, 16.5711f)
                curveTo(7.7216f, 16.514f, 7.6612f, 16.4501f, 7.6117f, 16.3814f)
                lineTo(3.47668f, 12.2463f)
                curveTo(3.0862f, 11.8558f, 3.1191f, 11.2594f, 3.5502f, 10.9142f)
                curveTo(3.9814f, 10.5691f, 4.6475f, 10.6059f, 5.038f, 10.9964f)
                lineTo(8.5f, 14.4584f)
                lineTo(16.2046f, 6.75383f)
                curveTo(16.5951f, 6.3633f, 17.2612f, 6.3265f, 17.6924f, 6.6716f)
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
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20.4498f, 7.42889f)
                curveTo(20.881f, 7.774f, 20.9139f, 8.3704f, 20.5234f, 8.7609f)
                lineTo(12.0381f, 17.2462f)
                curveTo(11.6476f, 17.6367f, 10.9815f, 17.6735f, 10.5503f, 17.3284f)
                curveTo(10.1191f, 16.9833f, 10.0862f, 16.3869f, 10.4767f, 15.9964f)
                lineTo(18.962f, 7.5111f)
                curveTo(19.3525f, 7.1206f, 20.0186f, 7.0838f, 20.4498f, 7.4289f)
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
                imageVector = doneAllDefault(),
                contentDescription = ""
            )
        }
    }
}