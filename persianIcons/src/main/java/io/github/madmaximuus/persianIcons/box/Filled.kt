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

val PersianSymbols.Filled.Box: ImageVector
    get() {
        if (box != null) {
            return box!!
        }
        box = ImageVector.Builder(
            name = "box-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7.4f, 3.00006f)
                horizontalLineTo(16.6f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 7.40006f)
                verticalLineTo(16.59996f)
                arcTo(
                    4.4f,
                    4.4f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    16.6f,
                    20.99996f
                )
                horizontalLineTo(7.4f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.59996f)
                verticalLineTo(7.40006f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.4f, 3.00006f)
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
                imageVector = PersianSymbols.Filled.Box,
                contentDescription = ""
            )
        }
    }
}