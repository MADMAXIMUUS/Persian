package io.github.madmaximuus.persianSymbols.building.columns

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.32f, 2.234f)
                curveTo(11.743f, 1.999f, 12.257f, 1.999f, 12.68f, 2.234f)
                lineTo(20.136f, 6.376f)
                curveTo(21.399f, 7.078f, 20.901f, 9f, 19.456f, 9f)
                horizontalLineTo(4.544f)
                curveTo(3.099f, 9f, 2.601f, 7.078f, 3.864f, 6.376f)
                lineTo(11.32f, 2.234f)
                close()
                moveTo(17.141f, 7f)
                lineTo(12f, 4.144f)
                lineTo(6.859f, 7f)
                horizontalLineTo(17.141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 21f)
                curveTo(2f, 20.448f, 2.448f, 20f, 3f, 20f)
                horizontalLineTo(21f)
                curveTo(21.552f, 20f, 22f, 20.448f, 22f, 21f)
                curveTo(22f, 21.552f, 21.552f, 22f, 21f, 22f)
                horizontalLineTo(3f)
                curveTo(2.448f, 22f, 2f, 21.552f, 2f, 21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 17f)
                curveTo(4.448f, 17f, 4f, 17.448f, 4f, 18f)
                curveTo(4f, 18.552f, 4.448f, 19f, 5f, 19f)
                horizontalLineTo(19f)
                curveTo(19.552f, 19f, 20f, 18.552f, 20f, 18f)
                curveTo(20f, 17.448f, 19.552f, 17f, 19f, 17f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 10f)
                curveTo(6.552f, 10f, 7f, 10.448f, 7f, 11f)
                verticalLineTo(15f)
                curveTo(7f, 15.552f, 6.552f, 16f, 6f, 16f)
                curveTo(5.448f, 16f, 5f, 15.552f, 5f, 15f)
                verticalLineTo(11f)
                curveTo(5f, 10.448f, 5.448f, 10f, 6f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 11f)
                curveTo(11f, 10.448f, 10.552f, 10f, 10f, 10f)
                curveTo(9.448f, 10f, 9f, 10.448f, 9f, 11f)
                verticalLineTo(15f)
                curveTo(9f, 15.552f, 9.448f, 16f, 10f, 16f)
                curveTo(10.552f, 16f, 11f, 15.552f, 11f, 15f)
                verticalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 10f)
                curveTo(14.552f, 10f, 15f, 10.448f, 15f, 11f)
                verticalLineTo(15f)
                curveTo(15f, 15.552f, 14.552f, 16f, 14f, 16f)
                curveTo(13.448f, 16f, 13f, 15.552f, 13f, 15f)
                verticalLineTo(11f)
                curveTo(13f, 10.448f, 13.448f, 10f, 14f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 11f)
                curveTo(19f, 10.448f, 18.552f, 10f, 18f, 10f)
                curveTo(17.448f, 10f, 17f, 10.448f, 17f, 11f)
                verticalLineTo(15f)
                curveTo(17f, 15.552f, 17.448f, 16f, 18f, 16f)
                curveTo(18.552f, 16f, 19f, 15.552f, 19f, 15f)
                verticalLineTo(11f)
                close()
            }
        }.build()
        return buildingColumns!!
    }

private var buildingColumns: ImageVector? = null