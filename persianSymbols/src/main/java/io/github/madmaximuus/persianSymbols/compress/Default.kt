package io.github.madmaximuus.persianSymbols.compress

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
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Compress: ImageVector
    get() {
        if (compress != null) {
            return compress!!
        }
        compress = Builder(
            name = "compress-default",
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
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 4.0f)
                curveTo(9.0f, 3.4477f, 8.5523f, 3.0f, 8.0f, 3.0f)
                curveTo(7.4477f, 3.0f, 7.0f, 3.4477f, 7.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 7.0f, 3.0f, 7.4477f, 3.0f, 8.0f)
                curveTo(3.0f, 8.5523f, 3.4477f, 9.0f, 4.0f, 9.0f)
                horizontalLineTo(7.0f)
                curveTo(8.1046f, 9.0f, 9.0f, 8.1046f, 9.0f, 7.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.999f, 9.0f)
                curveTo(20.5513f, 9.0f, 20.999f, 8.5523f, 20.999f, 8.0f)
                curveTo(20.999f, 7.4477f, 20.5513f, 7.0f, 19.999f, 7.0f)
                horizontalLineTo(16.999f)
                verticalLineTo(4.0f)
                curveTo(16.999f, 3.4477f, 16.5513f, 3.0f, 15.999f, 3.0f)
                curveTo(15.4467f, 3.0f, 14.999f, 3.4477f, 14.999f, 4.0f)
                verticalLineTo(7.0f)
                curveTo(14.999f, 8.1046f, 15.8945f, 9.0f, 16.999f, 9.0f)
                horizontalLineTo(19.999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.9999f, 20.9999f)
                curveTo(15.4476f, 20.9999f, 14.9999f, 20.5522f, 14.9999f, 19.9999f)
                verticalLineTo(16.9999f)
                curveTo(14.9999f, 15.8953f, 15.8953f, 14.9999f, 16.9999f, 14.9999f)
                horizontalLineTo(19.9999f)
                curveTo(20.5522f, 14.9999f, 20.9999f, 15.4476f, 20.9999f, 15.9999f)
                curveTo(20.9999f, 16.5522f, 20.5522f, 16.9999f, 19.9999f, 16.9999f)
                horizontalLineTo(16.9999f)
                verticalLineTo(19.9999f)
                curveTo(16.9999f, 20.5522f, 16.5522f, 20.9999f, 15.9999f, 20.9999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.999f, 14.9999f)
                curveTo(3.4467f, 14.9999f, 2.999f, 15.4476f, 2.999f, 15.9999f)
                curveTo(2.999f, 16.5522f, 3.4467f, 16.9999f, 3.999f, 16.9999f)
                horizontalLineTo(6.999f)
                verticalLineTo(19.9999f)
                curveTo(6.999f, 20.5522f, 7.4467f, 20.9999f, 7.999f, 20.9999f)
                curveTo(8.5513f, 20.9999f, 8.999f, 20.5522f, 8.999f, 19.9999f)
                verticalLineTo(16.9999f)
                curveTo(8.999f, 15.8953f, 8.1036f, 14.9999f, 6.999f, 14.9999f)
                horizontalLineTo(3.999f)
                close()
            }
        }.build()
        return compress!!
    }

private var compress: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Compress,
                contentDescription = ""
            )
        }
    }
}