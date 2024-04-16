package io.github.madmaximuus.persianIcons.fullscreen

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
fun fullscreenDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "fullscreen-default",
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
                moveTo(8.00006f, 3.99988f)
                horizontalLineTo(4.99902f)
                curveTo(4.4467f, 3.9999f, 3.999f, 4.4476f, 3.999f, 4.9999f)
                verticalLineTo(8f)
                moveTo(16.0001f, 3.99988f)
                horizontalLineTo(18.999f)
                curveTo(19.5513f, 3.9999f, 19.999f, 4.4476f, 19.999f, 4.9999f)
                verticalLineTo(8f)
                moveTo(3.99902f, 16f)
                verticalLineTo(18.9999f)
                curveTo(3.999f, 19.5522f, 4.4467f, 19.9999f, 4.999f, 19.9999f)
                horizontalLineTo(8.00006f)
                moveTo(16.0001f, 19.9999f)
                horizontalLineTo(18.999f)
                curveTo(19.5513f, 19.9999f, 19.999f, 19.5522f, 19.999f, 18.9999f)
                verticalLineTo(16f)
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
                imageVector = fullscreenDefault(),
                contentDescription = ""
            )
        }
    }
}