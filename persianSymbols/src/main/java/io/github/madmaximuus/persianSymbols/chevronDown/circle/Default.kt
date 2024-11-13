package io.github.madmaximuus.persianSymbols.chevronDown.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronDownCircle: ImageVector
    get() {
        if (chevronDownCircle != null) {
            return chevronDownCircle!!
        }
        chevronDownCircle = Builder(
            name = "chevron-down-circle-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.136f, 10.303f)
                curveTo(8.429f, 10.01f, 8.904f, 10.01f, 9.197f, 10.303f)
                lineTo(12f, 13.106f)
                lineTo(14.803f, 10.303f)
                curveTo(15.096f, 10.01f, 15.571f, 10.01f, 15.864f, 10.303f)
                curveTo(16.156f, 10.596f, 16.156f, 11.071f, 15.864f, 11.364f)
                lineTo(12.532f, 14.695f)
                lineTo(12.53f, 14.697f)
                curveTo(12.524f, 14.703f, 12.517f, 14.71f, 12.51f, 14.716f)
                curveTo(12.254f, 14.955f, 11.871f, 14.98f, 11.587f, 14.793f)
                curveTo(11.546f, 14.766f, 11.506f, 14.734f, 11.47f, 14.697f)
                lineTo(8.136f, 11.364f)
                curveTo(7.843f, 11.071f, 7.843f, 10.596f, 8.136f, 10.303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
            }
        }.build()
        return chevronDownCircle!!
    }

private var chevronDownCircle: ImageVector? = null