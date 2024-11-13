package io.github.madmaximuus.persianSymbols.user.box

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserBox: ImageVector
    get() {
        if (userBox != null) {
            return userBox!!
        }
        userBox = Builder(
            name = "user-box-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.4f, 3f)
                curveTo(4.97f, 3f, 3f, 4.97f, 3f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(3f, 17.127f, 3.093f, 17.633f, 3.263f, 18.102f)
                lineTo(3.568f, 17.887f)
                curveTo(5.925f, 16.229f, 8.844f, 15.25f, 12f, 15.25f)
                curveTo(15.156f, 15.25f, 18.075f, 16.229f, 20.432f, 17.887f)
                lineTo(20.737f, 18.102f)
                curveTo(20.907f, 17.633f, 21f, 17.127f, 21f, 16.6f)
                verticalLineTo(7.4f)
                curveTo(21f, 4.97f, 19.03f, 3f, 16.6f, 3f)
                horizontalLineTo(7.4f)
                close()
                moveTo(16.25f, 9.25f)
                curveTo(16.25f, 11.597f, 14.347f, 13.5f, 12f, 13.5f)
                curveTo(9.653f, 13.5f, 7.75f, 11.597f, 7.75f, 9.25f)
                curveTo(7.75f, 6.903f, 9.653f, 5f, 12f, 5f)
                curveTo(14.347f, 5f, 16.25f, 6.903f, 16.25f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.987f, 19.408f)
                lineTo(19.568f, 19.113f)
                curveTo(17.462f, 17.631f, 14.843f, 16.75f, 12f, 16.75f)
                curveTo(9.157f, 16.75f, 6.538f, 17.631f, 4.432f, 19.113f)
                lineTo(4.013f, 19.408f)
                curveTo(4.82f, 20.381f, 6.037f, 21f, 7.4f, 21f)
                horizontalLineTo(16.6f)
                curveTo(17.962f, 21f, 19.18f, 20.381f, 19.987f, 19.408f)
                close()
            }
        }.build()
        return userBox!!
    }

private var userBox: ImageVector? = null