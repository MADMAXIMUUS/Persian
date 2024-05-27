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

val PersianSymbols.Default.File: ImageVector
    get() {
        if (file != null) {
            return file!!
        }
        file = Builder(
            name = "file-default",
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
                moveTo(8.5f, 2.0f)
                curveTo(6.0147f, 2.0f, 4.0f, 4.0147f, 4.0f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(4.0f, 19.9853f, 6.0147f, 22.0f, 8.5f, 22.0f)
                horizontalLineTo(15.5f)
                curveTo(17.9853f, 22.0f, 20.0f, 19.9853f, 20.0f, 17.5f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 7.7348f, 19.8946f, 7.4804f, 19.7071f, 7.2929f)
                lineTo(14.7071f, 2.2929f)
                curveTo(14.5196f, 2.1054f, 14.2652f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(8.5f)
                close()
                moveTo(6.0f, 6.5f)
                curveTo(6.0f, 5.1193f, 7.1193f, 4.0f, 8.5f, 4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 9.1046f, 12.8954f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.5f)
                curveTo(18.0f, 18.8807f, 16.8807f, 20.0f, 15.5f, 20.0f)
                horizontalLineTo(8.5f)
                curveTo(7.1193f, 20.0f, 6.0f, 18.8807f, 6.0f, 17.5f)
                verticalLineTo(6.5f)
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
                imageVector = PersianSymbols.Default.File,
                contentDescription = ""
            )
        }
    }
}