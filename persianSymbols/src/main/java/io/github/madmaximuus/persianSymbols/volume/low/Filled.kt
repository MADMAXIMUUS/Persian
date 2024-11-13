package io.github.madmaximuus.persianSymbols.volume.low

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.VolumeLow: ImageVector
    get() {
        if (volumeLow != null) {
            return volumeLow!!
        }
        volumeLow = Builder(
            name = "volume-low-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 8f)
                horizontalLineTo(8.203f)
                curveTo(8.425f, 8f, 8.641f, 7.926f, 8.816f, 7.791f)
                lineTo(13.388f, 4.249f)
                curveTo(14.045f, 3.74f, 15f, 4.208f, 15f, 5.04f)
                verticalLineTo(18.96f)
                curveTo(15f, 19.792f, 14.045f, 20.26f, 13.388f, 19.751f)
                lineTo(8.816f, 16.209f)
                curveTo(8.641f, 16.074f, 8.425f, 16f, 8.203f, 16f)
                horizontalLineTo(4f)
                curveTo(2.895f, 16f, 2f, 15.104f, 2f, 14f)
                verticalLineTo(10f)
                curveTo(2f, 8.895f, 2.895f, 8f, 4f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.672f, 16.149f)
                curveTo(16.367f, 16.339f, 16f, 16.1f, 16f, 15.741f)
                verticalLineTo(8.258f)
                curveTo(16f, 7.899f, 16.367f, 7.661f, 16.672f, 7.85f)
                curveTo(18.071f, 8.72f, 19f, 10.254f, 19f, 12f)
                curveTo(19f, 13.746f, 18.071f, 15.279f, 16.672f, 16.149f)
                close()
            }
        }.build()
        return volumeLow!!
    }

private var volumeLow: ImageVector? = null