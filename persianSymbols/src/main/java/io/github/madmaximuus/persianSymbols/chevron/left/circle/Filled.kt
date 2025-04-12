package io.github.madmaximuus.persianSymbols.chevron.left.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ChevronLeftCircle: ImageVector
    get() {
        if (chevronLeftCircle != null) {
            return chevronLeftCircle!!
        }
        chevronLeftCircle = ImageVector.Builder(
            name = "chevron-left-circle-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(13.697f, 8.136f)
                curveTo(13.99f, 8.429f, 13.99f, 8.904f, 13.697f, 9.197f)
                lineTo(10.894f, 12f)
                lineTo(13.697f, 14.803f)
                curveTo(13.99f, 15.096f, 13.99f, 15.571f, 13.697f, 15.864f)
                curveTo(13.404f, 16.156f, 12.929f, 16.156f, 12.636f, 15.864f)
                lineTo(9.305f, 12.532f)
                lineTo(9.303f, 12.53f)
                curveTo(9.296f, 12.524f, 9.29f, 12.517f, 9.284f, 12.51f)
                curveTo(9.045f, 12.254f, 9.02f, 11.871f, 9.207f, 11.587f)
                curveTo(9.234f, 11.546f, 9.266f, 11.506f, 9.303f, 11.47f)
                lineTo(12.636f, 8.136f)
                curveTo(12.929f, 7.843f, 13.404f, 7.843f, 13.697f, 8.136f)
                close()
            }
        }.build()

        return chevronLeftCircle!!
    }

private var chevronLeftCircle: ImageVector? = null