package io.github.madmaximuus.persianIcons.upload

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
fun uploadDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "Upload",
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
                moveTo(15.2937f, 9.70113f)
                curveTo(15.6843f, 10.0917f, 16.3174f, 10.0917f, 16.708f, 9.7011f)
                curveTo(17.0985f, 9.3106f, 17.0985f, 8.6774f, 16.708f, 8.2869f)
                lineTo(12.7079f, 4.28691f)
                curveTo(12.3174f, 3.8964f, 11.6842f, 3.8964f, 11.2937f, 4.2869f)
                lineTo(7.29372f, 8.28691f)
                curveTo(6.9032f, 8.6774f, 6.9032f, 9.3106f, 7.2937f, 9.7011f)
                curveTo(7.6842f, 10.0917f, 8.3174f, 10.0917f, 8.7079f, 9.7011f)
                lineTo(11.0008f, 7.40823f)
                verticalLineTo(14.994f)
                curveTo(11.0008f, 15.5463f, 11.4485f, 15.994f, 12.0008f, 15.994f)
                curveTo(12.5531f, 15.994f, 13.0008f, 15.5463f, 13.0008f, 14.994f)
                verticalLineTo(7.40823f)
                lineTo(15.2937f, 9.70113f)
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
                moveTo(5f, 14.994f)
                curveTo(5f, 14.4417f, 4.5523f, 13.994f, 4f, 13.994f)
                curveTo(3.4477f, 13.994f, 3f, 14.4417f, 3f, 14.994f)
                verticalLineTo(15.506f)
                curveTo(3f, 17.9913f, 5.0147f, 20.006f, 7.5f, 20.006f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 20.006f, 21f, 17.9913f, 21f, 15.506f)
                verticalLineTo(14.994f)
                curveTo(21f, 14.4417f, 20.5523f, 13.994f, 20f, 13.994f)
                curveTo(19.4477f, 13.994f, 19f, 14.4417f, 19f, 14.994f)
                verticalLineTo(15.506f)
                curveTo(19f, 16.8867f, 17.8807f, 18.006f, 16.5f, 18.006f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 18.006f, 5f, 16.8867f, 5f, 15.506f)
                verticalLineTo(14.994f)
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
                imageVector = uploadDefault(),
                contentDescription = ""
            )
        }
    }
}