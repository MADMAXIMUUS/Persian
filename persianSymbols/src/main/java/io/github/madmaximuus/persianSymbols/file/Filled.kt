package io.github.madmaximuus.persianSymbols.file

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.File: ImageVector
    get() {
        if (file != null) {
            return file!!
        }
        file = Builder(
            name = "file-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.5f, 22.0f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 22.0f, 4.0f, 20.433f, 4.0f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(4.0f, 3.567f, 5.567f, 2.0f, 7.5f, 2.0f)
                horizontalLineTo(14.2857f)
                lineTo(20.0f, 7.5556f)
                verticalLineTo(18.5f)
                curveTo(20.0f, 20.433f, 18.433f, 22.0f, 16.5f, 22.0f)
                close()
                moveTo(12.0f, 4.5f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 9.1046f, 12.8954f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(17.5f)
                curveTo(17.7761f, 10.0f, 18.0f, 9.7761f, 18.0f, 9.5f)
                verticalLineTo(9.1429f)
                lineTo(12.8571f, 4.0f)
                horizontalLineTo(12.5f)
                curveTo(12.2239f, 4.0f, 12.0f, 4.2239f, 12.0f, 4.5f)
                close()
            }
        }.build()
        return file!!
    }

private var file: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.File,
                contentDescription = ""
            )
        }
    }
}