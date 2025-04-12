package io.github.madmaximuus.persianSymbols.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.User: ImageVector
    get() {
        if (user != null) {
            return user!!
        }
        user = Builder(
            name = "user-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12f)
                curveTo(14.485f, 12f, 16.5f, 9.985f, 16.5f, 7.5f)
                curveTo(16.5f, 5.015f, 14.485f, 3f, 12f, 3f)
                curveTo(9.515f, 3f, 7.5f, 5.015f, 7.5f, 7.5f)
                curveTo(7.5f, 9.985f, 9.515f, 12f, 12f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.178f, 16.818f)
                curveTo(6.585f, 14.528f, 9.113f, 13f, 11.999f, 13f)
                curveTo(14.884f, 13f, 17.413f, 14.528f, 18.82f, 16.818f)
                curveTo(20.092f, 18.889f, 18.029f, 21f, 15.599f, 21f)
                horizontalLineTo(8.399f)
                curveTo(5.969f, 21f, 3.906f, 18.889f, 5.178f, 16.818f)
                close()
            }
        }.build()
        return user!!
    }

private var user: ImageVector? = null