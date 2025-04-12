package io.github.madmaximuus.persianSymbols.phone.badge.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PhoneBadgePlus: ImageVector
    get() {
        if (phoneBadgePlus != null) {
            return phoneBadgePlus!!
        }
        phoneBadgePlus = ImageVector.Builder(
            name = "phone-badge-plus-filled",
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
                moveTo(6f, 15.5f)
                curveTo(6.414f, 15.5f, 6.75f, 15.836f, 6.75f, 16.25f)
                verticalLineTo(17.25f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 17.25f, 8.5f, 17.586f, 8.5f, 18f)
                curveTo(8.5f, 18.414f, 8.164f, 18.75f, 7.75f, 18.75f)
                horizontalLineTo(6.75f)
                verticalLineTo(19.75f)
                curveTo(6.75f, 20.164f, 6.414f, 20.5f, 6f, 20.5f)
                curveTo(5.586f, 20.5f, 5.25f, 20.164f, 5.25f, 19.75f)
                verticalLineTo(18.75f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 18.75f, 3.5f, 18.414f, 3.5f, 18f)
                curveTo(3.5f, 17.586f, 3.836f, 17.25f, 4.25f, 17.25f)
                horizontalLineTo(5.25f)
                verticalLineTo(16.25f)
                curveTo(5.25f, 15.836f, 5.586f, 15.5f, 6f, 15.5f)
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

        return phoneBadgePlus!!
    }

private var phoneBadgePlus: ImageVector? = null