package io.github.madmaximuus.persianSymbols.user.box.dashed

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserBoxDashed: ImageVector
    get() {
        if (userBoxDashed != null) {
            return userBoxDashed!!
        }
        userBoxDashed = Builder(
            name = "user-box-dashed-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 3f)
                curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
                verticalLineTo(9f)
                curveTo(3f, 9.552f, 3.448f, 10f, 4f, 10f)
                curveTo(4.552f, 10f, 5f, 9.552f, 5f, 9f)
                verticalLineTo(7.5f)
                curveTo(5f, 6.119f, 6.119f, 5f, 7.5f, 5f)
                horizontalLineTo(9f)
                curveTo(9.552f, 5f, 10f, 4.552f, 10f, 4f)
                curveTo(10f, 3.448f, 9.552f, 3f, 9f, 3f)
                horizontalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 3f)
                curveTo(14.448f, 3f, 14f, 3.448f, 14f, 4f)
                curveTo(14f, 4.552f, 14.448f, 5f, 15f, 5f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 5f, 19f, 6.119f, 19f, 7.5f)
                verticalLineTo(9f)
                curveTo(19f, 9.552f, 19.448f, 10f, 20f, 10f)
                curveTo(20.552f, 10f, 21f, 9.552f, 21f, 9f)
                verticalLineTo(7.5f)
                curveTo(21f, 5.015f, 18.985f, 3f, 16.5f, 3f)
                horizontalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 15f)
                curveTo(5f, 14.448f, 4.552f, 14f, 4f, 14f)
                curveTo(3.448f, 14f, 3f, 14.448f, 3f, 15f)
                verticalLineTo(16.5f)
                curveTo(3f, 18.985f, 5.015f, 21f, 7.5f, 21f)
                horizontalLineTo(9f)
                curveTo(9.552f, 21f, 10f, 20.552f, 10f, 20f)
                curveTo(10f, 19.448f, 9.552f, 19f, 9f, 19f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 19f, 5f, 17.881f, 5f, 16.5f)
                verticalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 15f)
                curveTo(21f, 14.448f, 20.552f, 14f, 20f, 14f)
                curveTo(19.448f, 14f, 19f, 14.448f, 19f, 15f)
                verticalLineTo(16.5f)
                curveTo(19f, 17.881f, 17.881f, 19f, 16.5f, 19f)
                horizontalLineTo(15f)
                curveTo(14.448f, 19f, 14f, 19.448f, 14f, 20f)
                curveTo(14f, 20.552f, 14.448f, 21f, 15f, 21f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 21f, 21f, 18.985f, 21f, 16.5f)
                verticalLineTo(15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.25f, 9.5f)
                curveTo(9.25f, 7.981f, 10.481f, 6.75f, 12f, 6.75f)
                curveTo(13.519f, 6.75f, 14.75f, 7.981f, 14.75f, 9.5f)
                curveTo(14.75f, 11.019f, 13.519f, 12.25f, 12f, 12.25f)
                curveTo(10.481f, 12.25f, 9.25f, 11.019f, 9.25f, 9.5f)
                close()
                moveTo(12f, 8.25f)
                curveTo(11.31f, 8.25f, 10.75f, 8.81f, 10.75f, 9.5f)
                curveTo(10.75f, 10.19f, 11.31f, 10.75f, 12f, 10.75f)
                curveTo(12.69f, 10.75f, 13.25f, 10.19f, 13.25f, 9.5f)
                curveTo(13.25f, 8.81f, 12.69f, 8.25f, 12f, 8.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.531f, 15.22f)
                curveTo(8.223f, 13.697f, 10.04f, 12.75f, 12f, 12.75f)
                curveTo(13.96f, 12.75f, 15.777f, 13.697f, 16.469f, 15.22f)
                curveTo(16.719f, 15.768f, 16.579f, 16.32f, 16.252f, 16.696f)
                curveTo(15.944f, 17.051f, 15.478f, 17.25f, 15f, 17.25f)
                horizontalLineTo(9f)
                curveTo(8.522f, 17.25f, 8.056f, 17.051f, 7.748f, 16.696f)
                curveTo(7.421f, 16.32f, 7.281f, 15.768f, 7.531f, 15.22f)
                close()
                moveTo(8.945f, 15.743f)
                curveTo(8.961f, 15.747f, 8.98f, 15.75f, 9f, 15.75f)
                horizontalLineTo(15f)
                curveTo(15.02f, 15.75f, 15.039f, 15.747f, 15.056f, 15.743f)
                curveTo(14.63f, 14.944f, 13.493f, 14.25f, 12f, 14.25f)
                curveTo(10.507f, 14.25f, 9.37f, 14.944f, 8.945f, 15.743f)
                close()
            }
        }.build()
        return userBoxDashed!!
    }

private var userBoxDashed: ImageVector? = null