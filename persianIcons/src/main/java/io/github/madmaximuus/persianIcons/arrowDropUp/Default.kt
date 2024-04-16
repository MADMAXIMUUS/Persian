package io.github.madmaximuus.persianIcons.arrowDropUp

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
fun arrowDropUpDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "arrow-drop-up-default",
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
                moveTo(9.30466f, 13.0909f)
                curveTo(9.0231f, 13.0909f, 8.8928f, 12.7021f, 9.1056f, 12.4971f)
                lineTo(11.801f, 9.90072f)
                curveTo(11.9152f, 9.7907f, 12.0848f, 9.7907f, 12.199f, 9.9007f)
                lineTo(14.8944f, 12.4971f)
                curveTo(15.1072f, 12.7021f, 14.9769f, 13.0909f, 14.6953f, 13.0909f)
                lineTo(9.30466f, 13.0909f)
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
                imageVector = arrowDropUpDefault(),
                contentDescription = ""
            )
        }
    }
}