package io.github.madmaximuus.persianSymbols.chevron.up.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronUpCircle: ImageVector
    get() {
        if (chevronUpCircle != null) {
            return chevronUpCircle!!
        }
        chevronUpCircle = Builder(
            name = "chevron-up-circle-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.864f, 13.697f)
                curveTo(15.571f, 13.99f, 15.096f, 13.99f, 14.803f, 13.697f)
                lineTo(12f, 10.894f)
                lineTo(9.197f, 13.697f)
                curveTo(8.904f, 13.99f, 8.429f, 13.99f, 8.136f, 13.697f)
                curveTo(7.843f, 13.404f, 7.843f, 12.929f, 8.136f, 12.636f)
                lineTo(11.468f, 9.305f)
                lineTo(11.47f, 9.303f)
                curveTo(11.476f, 9.296f, 11.483f, 9.29f, 11.49f, 9.284f)
                curveTo(11.746f, 9.045f, 12.129f, 9.02f, 12.413f, 9.207f)
                curveTo(12.454f, 9.234f, 12.494f, 9.266f, 12.53f, 9.303f)
                lineTo(15.864f, 12.636f)
                curveTo(16.156f, 12.929f, 16.156f, 13.404f, 15.864f, 13.697f)
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
        return chevronUpCircle!!
    }

private var chevronUpCircle: ImageVector? = null