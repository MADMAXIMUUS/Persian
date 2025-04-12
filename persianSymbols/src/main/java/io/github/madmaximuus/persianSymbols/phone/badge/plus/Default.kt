package io.github.madmaximuus.persianSymbols.phone.badge.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PhoneBadgePlus: ImageVector
    get() {
        if (phoneBadgePlus != null) {
            return phoneBadgePlus!!
        }
        phoneBadgePlus = ImageVector.Builder(
            name = "phone-badge-plus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.894f, 3.549f)
                curveTo(5.886f, 2.558f, 7.536f, 2.721f, 8.314f, 3.888f)
                lineTo(9.525f, 5.705f)
                curveTo(10.249f, 6.791f, 10.106f, 8.237f, 9.183f, 9.16f)
                curveTo(8.968f, 9.376f, 8.945f, 9.631f, 9.02f, 9.794f)
                curveTo(10.039f, 12.012f, 11.988f, 13.961f, 14.206f, 14.98f)
                curveTo(14.369f, 15.055f, 14.625f, 15.033f, 14.84f, 14.817f)
                curveTo(15.763f, 13.894f, 17.209f, 13.751f, 18.296f, 14.475f)
                lineTo(20.112f, 15.686f)
                curveTo(21.279f, 16.464f, 21.442f, 18.114f, 20.451f, 19.106f)
                curveTo(18.695f, 20.861f, 15.98f, 21.736f, 13.542f, 20.573f)
                curveTo(12.783f, 20.21f, 12.045f, 19.801f, 11.334f, 19.348f)
                curveTo(11.442f, 18.917f, 11.5f, 18.465f, 11.5f, 18f)
                curveTo(11.5f, 17.651f, 11.467f, 17.31f, 11.405f, 16.979f)
                curveTo(12.35f, 17.666f, 13.355f, 18.267f, 14.404f, 18.768f)
                curveTo(15.889f, 19.476f, 17.719f, 19.01f, 19.036f, 17.692f)
                curveTo(19.135f, 17.593f, 19.119f, 17.428f, 19.003f, 17.35f)
                lineTo(17.186f, 16.139f)
                curveTo(16.893f, 15.944f, 16.503f, 15.982f, 16.254f, 16.231f)
                curveTo(15.538f, 16.947f, 14.405f, 17.272f, 13.371f, 16.798f)
                curveTo(12.411f, 16.357f, 11.498f, 15.774f, 10.665f, 15.085f)
                curveTo(10.222f, 14.378f, 9.622f, 13.778f, 8.915f, 13.335f)
                curveTo(8.226f, 12.503f, 7.644f, 11.589f, 7.203f, 10.629f)
                curveTo(6.728f, 9.595f, 7.053f, 8.462f, 7.769f, 7.746f)
                curveTo(8.018f, 7.497f, 8.056f, 7.107f, 7.861f, 6.814f)
                lineTo(6.65f, 4.998f)
                curveTo(6.572f, 4.881f, 6.408f, 4.865f, 6.308f, 4.964f)
                curveTo(4.991f, 6.282f, 4.524f, 8.111f, 5.232f, 9.596f)
                curveTo(5.733f, 10.645f, 6.334f, 11.65f, 7.021f, 12.595f)
                curveTo(6.69f, 12.533f, 6.349f, 12.5f, 6f, 12.5f)
                curveTo(5.535f, 12.5f, 5.083f, 12.558f, 4.652f, 12.666f)
                curveTo(4.199f, 11.955f, 3.79f, 11.217f, 3.427f, 10.458f)
                curveTo(2.264f, 8.02f, 3.139f, 5.305f, 4.894f, 3.549f)
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