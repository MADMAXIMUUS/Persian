package io.github.madmaximuus.persianIcons.menu

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

val PersianSymbols.Default.Menu: ImageVector
    get() {
        if (menu != null) {
            return menu!!
        }
        menu = ImageVector.Builder(
            name = "menu-default",
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
                moveTo(3.99994f, 5.99988f)
                curveTo(3.4476f, 5.9999f, 2.9999f, 6.4476f, 2.9999f, 6.9999f)
                curveTo(2.9999f, 7.5522f, 3.4476f, 7.9999f, 3.9999f, 7.9999f)
                horizontalLineTo(19.9999f)
                curveTo(20.5522f, 7.9999f, 20.9999f, 7.5522f, 20.9999f, 6.9999f)
                curveTo(20.9999f, 6.4476f, 20.5522f, 5.9999f, 19.9999f, 5.9999f)
                horizontalLineTo(3.99994f)
                close()
            }
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
                moveTo(2.99899f, 12f)
                curveTo(2.999f, 11.4477f, 3.4467f, 11f, 3.999f, 11f)
                horizontalLineTo(19.9989f)
                curveTo(20.5512f, 11f, 20.9989f, 11.4477f, 20.9989f, 12f)
                curveTo(20.9989f, 12.5523f, 20.5512f, 13f, 19.9989f, 13f)
                horizontalLineTo(3.99899f)
                curveTo(3.4467f, 13f, 2.999f, 12.5523f, 2.999f, 12f)
                close()
            }
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
                moveTo(3.00005f, 16.9999f)
                curveTo(3f, 16.4476f, 3.4478f, 15.9999f, 4f, 15.9999f)
                horizontalLineTo(20f)
                curveTo(20.5523f, 15.9999f, 21f, 16.4476f, 21f, 16.9999f)
                curveTo(21f, 17.5522f, 20.5523f, 17.9999f, 20f, 17.9999f)
                horizontalLineTo(4.00005f)
                curveTo(3.4478f, 17.9999f, 3f, 17.5522f, 3f, 16.9999f)
                close()
            }
        }.build()
        return menu!!
    }

private var menu: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Menu,
                contentDescription = ""
            )
        }
    }
}