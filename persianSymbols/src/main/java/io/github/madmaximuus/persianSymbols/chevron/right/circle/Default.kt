package io.github.madmaximuus.persianSymbols.chevron.right.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronRightCircle: ImageVector
    get() {
        if (chevronRightCircle != null) {
            return chevronRightCircle!!
        }
        chevronRightCircle = ImageVector.Builder(
            name = "chevron-right-circle-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.303f, 15.864f)
                curveTo(10.01f, 15.571f, 10.01f, 15.096f, 10.303f, 14.803f)
                lineTo(13.106f, 12f)
                lineTo(10.303f, 9.197f)
                curveTo(10.01f, 8.904f, 10.01f, 8.429f, 10.303f, 8.136f)
                curveTo(10.596f, 7.843f, 11.071f, 7.843f, 11.364f, 8.136f)
                lineTo(14.695f, 11.468f)
                lineTo(14.697f, 11.47f)
                curveTo(14.703f, 11.476f, 14.71f, 11.483f, 14.716f, 11.49f)
                curveTo(14.955f, 11.746f, 14.98f, 12.129f, 14.793f, 12.413f)
                curveTo(14.766f, 12.454f, 14.734f, 12.494f, 14.697f, 12.53f)
                lineTo(11.364f, 15.864f)
                curveTo(11.071f, 16.156f, 10.596f, 16.156f, 10.303f, 15.864f)
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

        return chevronRightCircle!!
    }

private var chevronRightCircle: ImageVector? = null