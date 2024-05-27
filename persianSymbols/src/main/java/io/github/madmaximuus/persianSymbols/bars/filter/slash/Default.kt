package io.github.madmaximuus.persianSymbols.bars.filter.slash

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

val PersianSymbols.Default.BarsFilterSlash: ImageVector
    get() {
        if (barsFilterSlash != null) {
            return barsFilterSlash!!
        }
        barsFilterSlash = Builder(
            name = "bars-filter-slash-default",
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
                moveTo(3.7071f, 2.2929f)
                curveTo(3.3166f, 1.9024f, 2.6834f, 1.9024f, 2.2929f, 2.2929f)
                curveTo(1.9024f, 2.6834f, 1.9024f, 3.3166f, 2.2929f, 3.7071f)
                lineTo(20.2929f, 21.7071f)
                curveTo(20.6834f, 22.0976f, 21.3166f, 22.0976f, 21.7071f, 21.7071f)
                curveTo(22.0976f, 21.3166f, 22.0976f, 20.6834f, 21.7071f, 20.2929f)
                lineTo(3.7071f, 2.2929f)
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
                moveTo(4.0f, 8.0f)
                curveTo(4.0f, 7.5944f, 4.2414f, 7.2453f, 4.5884f, 7.0884f)
                lineTo(6.5f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 9.0f, 4.0f, 8.5523f, 4.0f, 8.0f)
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
                moveTo(9.5f, 7.0f)
                lineTo(11.5f, 9.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 9.0f, 20.0f, 8.5523f, 20.0f, 8.0f)
                curveTo(20.0f, 7.4477f, 19.5523f, 7.0f, 19.0f, 7.0f)
                horizontalLineTo(9.5f)
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
                moveTo(7.9999f, 10.9999f)
                horizontalLineTo(8.4999f)
                lineTo(10.4999f, 12.9999f)
                horizontalLineTo(7.9999f)
                curveTo(7.4476f, 12.9999f, 6.9999f, 12.5522f, 6.9999f, 11.9999f)
                curveTo(6.9999f, 11.4476f, 7.4476f, 10.9999f, 7.9999f, 10.9999f)
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
                moveTo(13.4999f, 10.9999f)
                lineTo(15.4999f, 12.9999f)
                horizontalLineTo(15.9999f)
                curveTo(16.5522f, 12.9999f, 16.9999f, 12.5522f, 16.9999f, 11.9999f)
                curveTo(16.9999f, 11.4476f, 16.5522f, 10.9999f, 15.9999f, 10.9999f)
                horizontalLineTo(13.4999f)
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
                moveTo(13.9115f, 16.4115f)
                lineTo(12.4998f, 14.9998f)
                horizontalLineTo(11.0f)
                curveTo(10.4477f, 14.9998f, 10.0f, 15.4475f, 10.0f, 15.9998f)
                curveTo(10.0f, 16.552f, 10.4477f, 16.9998f, 11.0f, 16.9998f)
                horizontalLineTo(13.0f)
                curveTo(13.4055f, 16.9998f, 13.7546f, 16.7584f, 13.9115f, 16.4115f)
                close()
            }
        }.build()
        return barsFilterSlash!!
    }

private var barsFilterSlash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BarsFilterSlash,
                contentDescription = ""
            )
        }
    }
}