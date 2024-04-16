package io.github.madmaximuus.persianIcons.openInFull

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
fun openInFullDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "open-in-full-default",
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
                moveTo(18.0231f, 10.9809f)
                curveTo(18.0252f, 11.5331f, 18.4746f, 11.9792f, 19.0269f, 11.9771f)
                curveTo(19.5792f, 11.975f, 20.0252f, 11.5256f, 20.0231f, 10.9733f)
                lineTo(20.0003f, 4.97331f)
                curveTo(19.9982f, 4.421f, 19.5488f, 3.975f, 18.9965f, 3.9771f)
                lineTo(12.9965f, 3.99991f)
                curveTo(12.4442f, 4.002f, 11.9982f, 4.4514f, 12.0003f, 5.0037f)
                curveTo(12.0024f, 5.556f, 12.4518f, 6.002f, 13.0041f, 5.9999f)
                lineTo(16.5996f, 5.98624f)
                lineTo(5.99988f, 16.5859f)
                verticalLineTo(12.9999f)
                curveTo(5.9999f, 12.4476f, 5.5522f, 11.9999f, 4.9999f, 11.9999f)
                curveTo(4.4476f, 11.9999f, 3.9999f, 12.4476f, 3.9999f, 12.9999f)
                verticalLineTo(18.9999f)
                curveTo(3.9999f, 19.1615f, 4.0382f, 19.3141f, 4.1063f, 19.4492f)
                curveTo(4.1494f, 19.535f, 4.2056f, 19.6158f, 4.275f, 19.6887f)
                curveTo(4.2809f, 19.6949f, 4.2868f, 19.7011f, 4.2929f, 19.7071f)
                curveTo(4.4921f, 19.9064f, 4.7546f, 20.004f, 5.0157f, 19.9999f)
                horizontalLineTo(10.9999f)
                curveTo(11.5522f, 19.9999f, 11.9999f, 19.5522f, 11.9999f, 18.9999f)
                curveTo(11.9999f, 18.4476f, 11.5522f, 17.9999f, 10.9999f, 17.9999f)
                horizontalLineTo(7.41434f)
                lineTo(18.0095f, 7.40474f)
                lineTo(18.0231f, 10.9809f)
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
                imageVector = openInFullDefault(),
                contentDescription = ""
            )
        }
    }
}