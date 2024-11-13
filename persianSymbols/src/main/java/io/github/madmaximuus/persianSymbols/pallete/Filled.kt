package io.github.madmaximuus.persianSymbols.pallete

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Palette: ImageVector
    get() {
        if (palette != null) {
            return palette!!
        }
        palette = Builder(
            name = "palette-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(4f, 2f, 2f, 8.667f, 2f, 12f)
                curveTo(2f, 15.333f, 4f, 22f, 12f, 22f)
                curveTo(17.753f, 22f, 15.907f, 19.872f, 14.557f, 18.315f)
                curveTo(14.081f, 17.767f, 13.667f, 17.289f, 13.667f, 17f)
                curveTo(13.667f, 15.12f, 15.613f, 14.928f, 17.625f, 14.729f)
                curveTo(19.775f, 14.516f, 22f, 14.296f, 22f, 12f)
                curveTo(22f, 8.667f, 20f, 2f, 12f, 2f)
                close()
                moveTo(15f, 6.75f)
                curveTo(15f, 7.44f, 14.44f, 8f, 13.75f, 8f)
                curveTo(13.06f, 8f, 12.5f, 7.44f, 12.5f, 6.75f)
                curveTo(12.5f, 6.06f, 13.06f, 5.5f, 13.75f, 5.5f)
                curveTo(14.44f, 5.5f, 15f, 6.06f, 15f, 6.75f)
                close()
                moveTo(8.75f, 9f)
                curveTo(9.44f, 9f, 10f, 8.44f, 10f, 7.75f)
                curveTo(10f, 7.06f, 9.44f, 6.5f, 8.75f, 6.5f)
                curveTo(8.06f, 6.5f, 7.5f, 7.06f, 7.5f, 7.75f)
                curveTo(7.5f, 8.44f, 8.06f, 9f, 8.75f, 9f)
                close()
                moveTo(8f, 12.75f)
                curveTo(8f, 13.44f, 7.44f, 14f, 6.75f, 14f)
                curveTo(6.06f, 14f, 5.5f, 13.44f, 5.5f, 12.75f)
                curveTo(5.5f, 12.06f, 6.06f, 11.5f, 6.75f, 11.5f)
                curveTo(7.44f, 11.5f, 8f, 12.06f, 8f, 12.75f)
                close()
                moveTo(16.75f, 11.5f)
                curveTo(17.44f, 11.5f, 18f, 10.94f, 18f, 10.25f)
                curveTo(18f, 9.56f, 17.44f, 9f, 16.75f, 9f)
                curveTo(16.06f, 9f, 15.5f, 9.56f, 15.5f, 10.25f)
                curveTo(15.5f, 10.94f, 16.06f, 11.5f, 16.75f, 11.5f)
                close()
            }
        }.build()
        return palette!!
    }

private var palette: ImageVector? = null