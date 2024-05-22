package io.github.madmaximuus.persianIcons.box

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
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
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

val PersianSymbols.Default.Box: ImageVector
    get() {
        if (box != null) {
            return box!!
        }
        box = ImageVector.Builder(
            name = "box-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7.49988f, 3.99994f)
                horizontalLineTo(16.49988f)
                arcTo(
                    3.5f,
                    3.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    19.99988f,
                    7.49994f
                )
                verticalLineTo(16.49984f)
                arcTo(
                    3.5f,
                    3.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    16.49988f,
                    19.99984f
                )
                horizontalLineTo(7.49988f)
                arcTo(
                    3.5f,
                    3.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    3.99988f,
                    16.49984f
                )
                verticalLineTo(7.49994f)
                arcTo(
                    3.5f,
                    3.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    7.49988f,
                    3.99994f
                )
                close()
            }
        }.build()
        return box!!
    }

private var box: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Box,
                contentDescription = ""
            )
        }
    }
}