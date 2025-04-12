package io.github.madmaximuus.persianSymbols.phone.badge.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PhoneBadgeCheck: ImageVector
    get() {
        if (phoneBadgeCheck != null) {
            return phoneBadgeCheck!!
        }
        phoneBadgeCheck = ImageVector.Builder(
            name = "phone-badge-check-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.21f, 10.267f)
                curveTo(3.573f, 11.084f, 4.019f, 11.899f, 4.535f, 12.697f)
                curveTo(5.001f, 12.569f, 5.493f, 12.5f, 6f, 12.5f)
                curveTo(9.038f, 12.5f, 11.5f, 14.962f, 11.5f, 18f)
                curveTo(11.5f, 18.507f, 11.431f, 18.999f, 11.303f, 19.465f)
                curveTo(12.101f, 19.98f, 12.916f, 20.427f, 13.734f, 20.79f)
                curveTo(16.149f, 21.861f, 18.796f, 20.76f, 20.665f, 18.892f)
                curveTo(21.494f, 18.062f, 21.359f, 16.682f, 20.385f, 16.029f)
                lineTo(18.168f, 14.543f)
                curveTo(17.307f, 13.966f, 16.194f, 13.925f, 15.293f, 14.438f)
                curveTo(14.222f, 15.047f, 12.867f, 14.877f, 11.974f, 14.029f)
                curveTo(11.28f, 13.372f, 10.488f, 12.615f, 9.823f, 11.945f)
                curveTo(8.998f, 11.112f, 8.903f, 9.865f, 9.483f, 8.846f)
                curveTo(10.044f, 7.86f, 10f, 6.642f, 9.368f, 5.7f)
                lineTo(7.971f, 3.615f)
                curveTo(7.318f, 2.641f, 5.938f, 2.506f, 5.108f, 3.335f)
                curveTo(3.24f, 5.204f, 2.139f, 7.851f, 3.21f, 10.267f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.969f, 16.414f)
                curveTo(8.292f, 16.673f, 8.344f, 17.145f, 8.086f, 17.469f)
                lineTo(6.086f, 19.969f)
                curveTo(5.952f, 20.135f, 5.754f, 20.237f, 5.541f, 20.249f)
                curveTo(5.328f, 20.261f, 5.121f, 20.181f, 4.97f, 20.03f)
                lineTo(3.97f, 19.03f)
                curveTo(3.677f, 18.737f, 3.677f, 18.263f, 3.97f, 17.97f)
                curveTo(4.263f, 17.677f, 4.737f, 17.677f, 5.03f, 17.97f)
                lineTo(5.438f, 18.377f)
                lineTo(6.914f, 16.531f)
                curveTo(7.173f, 16.208f, 7.645f, 16.156f, 7.969f, 16.414f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.25f, 18f)
                curveTo(1.25f, 15.377f, 3.377f, 13.25f, 6f, 13.25f)
                curveTo(8.623f, 13.25f, 10.75f, 15.377f, 10.75f, 18f)
                curveTo(10.75f, 20.623f, 8.623f, 22.75f, 6f, 22.75f)
                curveTo(3.377f, 22.75f, 1.25f, 20.623f, 1.25f, 18f)
                close()
                moveTo(6f, 14.75f)
                curveTo(4.205f, 14.75f, 2.75f, 16.205f, 2.75f, 18f)
                curveTo(2.75f, 19.795f, 4.205f, 21.25f, 6f, 21.25f)
                curveTo(7.795f, 21.25f, 9.25f, 19.795f, 9.25f, 18f)
                curveTo(9.25f, 16.205f, 7.795f, 14.75f, 6f, 14.75f)
                close()
            }
        }.build()

        return phoneBadgeCheck!!
    }

private var phoneBadgeCheck: ImageVector? = null