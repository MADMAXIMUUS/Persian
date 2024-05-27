package io.github.madmaximuus.persianSymbols.building.columns

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

val PersianSymbols.Default.BuildingColumns: ImageVector
    get() {
        if (buildingColumns != null) {
            return buildingColumns!!
        }
        buildingColumns = Builder(
            name = "building-columns-default",
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
                moveTo(11.3201f, 2.2338f)
                curveTo(11.7429f, 1.9989f, 12.2571f, 1.9989f, 12.6799f, 2.2338f)
                lineTo(20.1362f, 6.3762f)
                curveTo(21.3991f, 7.0778f, 20.901f, 9.0f, 19.4564f, 9.0f)
                horizontalLineTo(4.5437f)
                curveTo(3.099f, 9.0f, 2.6009f, 7.0778f, 3.8637f, 6.3762f)
                lineTo(11.3201f, 2.2338f)
                close()
                moveTo(17.1409f, 7.0f)
                lineTo(12.0f, 4.144f)
                lineTo(6.8591f, 7.0f)
                horizontalLineTo(17.1409f)
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
                moveTo(2.0f, 21.0f)
                curveTo(2.0f, 20.4478f, 2.4477f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 20.0f, 22.0f, 20.4478f, 22.0f, 21.0f)
                curveTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 22.0f, 2.0f, 21.5523f, 2.0f, 21.0f)
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
                moveTo(5.0f, 17.0f)
                curveTo(4.4477f, 17.0f, 4.0f, 17.4477f, 4.0f, 18.0f)
                curveTo(4.0f, 18.5523f, 4.4477f, 19.0f, 5.0f, 19.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 19.0f, 20.0f, 18.5523f, 20.0f, 18.0f)
                curveTo(20.0f, 17.4477f, 19.5523f, 17.0f, 19.0f, 17.0f)
                horizontalLineTo(5.0f)
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
                moveTo(6.0f, 10.0f)
                curveTo(6.5523f, 10.0f, 7.0f, 10.4477f, 7.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(7.0f, 15.5523f, 6.5523f, 16.0f, 6.0f, 16.0f)
                curveTo(5.4477f, 16.0f, 5.0f, 15.5523f, 5.0f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 10.4477f, 5.4477f, 10.0f, 6.0f, 10.0f)
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
                moveTo(11.0f, 11.0f)
                curveTo(11.0f, 10.4477f, 10.5523f, 10.0f, 10.0f, 10.0f)
                curveTo(9.4477f, 10.0f, 9.0f, 10.4477f, 9.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 15.5523f, 9.4477f, 16.0f, 10.0f, 16.0f)
                curveTo(10.5523f, 16.0f, 11.0f, 15.5523f, 11.0f, 15.0f)
                verticalLineTo(11.0f)
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
                moveTo(14.0f, 10.0f)
                curveTo(14.5523f, 10.0f, 15.0f, 10.4477f, 15.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 15.5523f, 14.5523f, 16.0f, 14.0f, 16.0f)
                curveTo(13.4477f, 16.0f, 13.0f, 15.5523f, 13.0f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(13.0f, 10.4477f, 13.4477f, 10.0f, 14.0f, 10.0f)
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
                moveTo(19.0f, 11.0f)
                curveTo(19.0f, 10.4477f, 18.5523f, 10.0f, 18.0f, 10.0f)
                curveTo(17.4477f, 10.0f, 17.0f, 10.4477f, 17.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 15.5523f, 17.4477f, 16.0f, 18.0f, 16.0f)
                curveTo(18.5523f, 16.0f, 19.0f, 15.5523f, 19.0f, 15.0f)
                verticalLineTo(11.0f)
                close()
            }
        }.build()
        return buildingColumns!!
    }

private var buildingColumns: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BuildingColumns,
                contentDescription = ""
            )
        }
    }
}