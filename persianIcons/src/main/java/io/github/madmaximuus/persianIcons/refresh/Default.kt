package io.github.madmaximuus.persianIcons.refresh

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
fun refreshDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "refresh-default",
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
                moveTo(4.46399f, 11.9999f)
                curveTo(4.464f, 7.5816f, 8.0457f, 3.9999f, 12.464f, 3.9999f)
                curveTo(14.9894f, 3.9999f, 17.2427f, 5.1699f, 18.7096f, 6.9999f)
                horizontalLineTo(15.5358f)
                curveTo(14.9835f, 6.9999f, 14.5358f, 7.4476f, 14.5358f, 7.9999f)
                curveTo(14.5358f, 8.5522f, 14.9835f, 8.9999f, 15.5358f, 8.9999f)
                horizontalLineTo(20.3642f)
                curveTo(20.5663f, 9.0352f, 20.7811f, 9.0089f, 20.9792f, 8.911f)
                curveTo(21.3387f, 8.7331f, 21.5441f, 8.3681f, 21.5358f, 7.9919f)
                verticalLineTo(2.99988f)
                curveTo(21.5358f, 2.4476f, 21.0881f, 1.9999f, 20.5358f, 1.9999f)
                curveTo(19.9835f, 1.9999f, 19.5358f, 2.4476f, 19.5358f, 2.9999f)
                verticalLineTo(4.92975f)
                curveTo(17.7267f, 3.1202f, 15.2266f, 1.9999f, 12.464f, 1.9999f)
                curveTo(6.9411f, 1.9999f, 2.464f, 6.477f, 2.464f, 11.9999f)
                curveTo(2.464f, 17.5227f, 6.9411f, 21.9999f, 12.464f, 21.9999f)
                curveTo(16.3983f, 21.9999f, 19.8001f, 19.7277f, 21.4321f, 16.4285f)
                curveTo(21.677f, 15.9335f, 21.4742f, 15.3337f, 20.9792f, 15.0888f)
                curveTo(20.4841f, 14.8439f, 19.8843f, 15.0467f, 19.6395f, 15.5417f)
                curveTo(18.3317f, 18.1854f, 15.6088f, 19.9999f, 12.464f, 19.9999f)
                curveTo(8.0457f, 19.9999f, 4.464f, 16.4182f, 4.464f, 11.9999f)
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
                imageVector = refreshDefault(),
                contentDescription = ""
            )
        }
    }
}