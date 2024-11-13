package io.github.madmaximuus.persianSymbols.user.box.dashed

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserBoxDashed: ImageVector
    get() {
        if (userBoxDashed != null) {
            return userBoxDashed!!
        }
        userBoxDashed = Builder(
            name = "user-box-dashed-filled",
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.75f, 9.45f)
                curveTo(14.75f, 10.969f, 13.519f, 12.2f, 12f, 12.2f)
                curveTo(10.481f, 12.2f, 9.25f, 10.969f, 9.25f, 9.45f)
                curveTo(9.25f, 7.931f, 10.481f, 6.7f, 12f, 6.7f)
                curveTo(13.519f, 6.7f, 14.75f, 7.931f, 14.75f, 9.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12.8f)
                curveTo(10.044f, 12.8f, 8.355f, 13.853f, 7.57f, 15.375f)
                curveTo(7.063f, 16.357f, 7.995f, 17.3f, 9.1f, 17.3f)
                horizontalLineTo(14.9f)
                curveTo(16.005f, 17.3f, 16.937f, 16.357f, 16.43f, 15.375f)
                curveTo(15.645f, 13.853f, 13.956f, 12.8f, 12f, 12.8f)
                close()
            }
        }.build()
        return userBoxDashed!!
    }

private var userBoxDashed: ImageVector? = null