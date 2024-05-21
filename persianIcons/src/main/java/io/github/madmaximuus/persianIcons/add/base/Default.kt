package io.github.madmaximuus.persianIcons.add.base

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

val PersianSymbols.Default.Add: ImageVector
    get() {
        if (add != null) {
            return add!!
        }
        add = ImageVector.Builder(
            name = "add-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
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
                moveTo(13f, 4.99988f)
                curveTo(13f, 4.4476f, 12.5523f, 3.9999f, 12f, 3.9999f)
                curveTo(11.4477f, 3.9999f, 11f, 4.4476f, 11f, 4.9999f)
                verticalLineTo(10.9999f)
                horizontalLineTo(5f)
                curveTo(4.4477f, 10.9999f, 4f, 11.4476f, 4f, 11.9999f)
                curveTo(4f, 12.5522f, 4.4477f, 12.9999f, 5f, 12.9999f)
                horizontalLineTo(11f)
                verticalLineTo(18.9999f)
                curveTo(11f, 19.5522f, 11.4477f, 19.9999f, 12f, 19.9999f)
                curveTo(12.5523f, 19.9999f, 13f, 19.5522f, 13f, 18.9999f)
                verticalLineTo(12.9999f)
                horizontalLineTo(19f)
                curveTo(19.5523f, 12.9999f, 20f, 12.5522f, 20f, 11.9999f)
                curveTo(20f, 11.4476f, 19.5523f, 10.9999f, 19f, 10.9999f)
                horizontalLineTo(13f)
                verticalLineTo(4.99988f)
                close()
            }
        }.build()
        return add!!
    }

private var add: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Add,
                contentDescription = ""
            )
        }
    }
}
