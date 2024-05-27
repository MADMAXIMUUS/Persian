package io.github.madmaximuus.persianSymbols.plus.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Plus: ImageVector
    get() {
        if (plus != null) {
            return plus!!
        }
        plus = ImageVector.Builder(
            name = "add-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 4.9999f)
                curveTo(13.0f, 4.4476f, 12.5523f, 3.9999f, 12.0f, 3.9999f)
                curveTo(11.4477f, 3.9999f, 11.0f, 4.4476f, 11.0f, 4.9999f)
                verticalLineTo(10.9999f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 10.9999f, 4.0f, 11.4476f, 4.0f, 11.9999f)
                curveTo(4.0f, 12.5522f, 4.4477f, 12.9999f, 5.0f, 12.9999f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.9999f)
                curveTo(11.0f, 19.5522f, 11.4477f, 19.9999f, 12.0f, 19.9999f)
                curveTo(12.5523f, 19.9999f, 13.0f, 19.5522f, 13.0f, 18.9999f)
                verticalLineTo(12.9999f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 12.9999f, 20.0f, 12.5522f, 20.0f, 11.9999f)
                curveTo(20.0f, 11.4476f, 19.5523f, 10.9999f, 19.0f, 10.9999f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.9999f)
                close()
            }
        }.build()
        return plus!!
    }

private var plus: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Plus,
                contentDescription = ""
            )
        }
    }
}
