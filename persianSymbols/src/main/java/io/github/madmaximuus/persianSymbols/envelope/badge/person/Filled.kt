package io.github.madmaximuus.persianSymbols.envelope.badge.person

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.EnvelopeBadgePerson: ImageVector
    get() {
        if (envelopeBadgePerson != null) {
            return envelopeBadgePerson!!
        }
        envelopeBadgePerson = ImageVector.Builder(
            name = "envelope-badge-person-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 8.4f)
                curveTo(2f, 7.456f, 2.297f, 6.581f, 2.804f, 5.864f)
                lineTo(8.968f, 12.029f)
                lineTo(2.827f, 18.169f)
                curveTo(2.307f, 17.446f, 2f, 16.559f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.898f, 19.22f)
                curveTo(4.608f, 19.712f, 5.471f, 20f, 6.4f, 20f)
                horizontalLineTo(12.875f)
                curveTo(12.633f, 19.38f, 12.5f, 18.706f, 12.5f, 18f)
                curveTo(12.5f, 16.257f, 13.311f, 14.703f, 14.577f, 13.695f)
                lineTo(13.971f, 13.089f)
                lineTo(13.591f, 13.47f)
                curveTo(12.712f, 14.348f, 11.288f, 14.348f, 10.409f, 13.47f)
                lineTo(10.029f, 13.089f)
                lineTo(3.898f, 19.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.4f)
                verticalLineTo(14.225f)
                curveTo(20.997f, 13.163f, 19.576f, 12.5f, 18f, 12.5f)
                curveTo(17.261f, 12.5f, 16.557f, 12.646f, 15.913f, 12.91f)
                lineTo(15.032f, 12.029f)
                lineTo(21.196f, 5.864f)
                curveTo(21.703f, 6.581f, 22f, 7.456f, 22f, 8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.864f, 4.804f)
                curveTo(4.581f, 4.297f, 5.456f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(18.544f, 4f, 19.419f, 4.297f, 20.136f, 4.804f)
                lineTo(12.53f, 12.409f)
                curveTo(12.237f, 12.702f, 11.762f, 12.702f, 11.47f, 12.409f)
                lineTo(3.864f, 4.804f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 18.5f)
                curveTo(18.828f, 18.5f, 19.5f, 17.828f, 19.5f, 17f)
                curveTo(19.5f, 16.172f, 18.828f, 15.5f, 18f, 15.5f)
                curveTo(17.172f, 15.5f, 16.5f, 16.172f, 16.5f, 17f)
                curveTo(16.5f, 17.828f, 17.172f, 18.5f, 18f, 18.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 18.58f, 14.902f, 19.125f, 15.168f, 19.597f)
                curveTo(17.049f, 18.801f, 18.951f, 18.801f, 20.831f, 19.597f)
                curveTo(21.098f, 19.125f, 21.25f, 18.58f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
                moveTo(18f, 21.25f)
                lineTo(17.98f, 21.25f)
                horizontalLineTo(18.02f)
                lineTo(18f, 21.25f)
                close()
            }
        }.build()

        return envelopeBadgePerson!!
    }

private var envelopeBadgePerson: ImageVector? = null