package io.github.madmaximuus.persianSymbols.phone.arrow.down.left

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PhoneArrowDownLeft: ImageVector
    get() {
        if (phoneArrowDownLeft != null) {
            return phoneArrowDownLeft!!
        }
        phoneArrowDownLeft = ImageVector.Builder(
            name = "phone-arrow-down-left-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.314f, 3.888f)
                curveTo(7.536f, 2.721f, 5.886f, 2.558f, 4.894f, 3.549f)
                curveTo(3.139f, 5.305f, 2.264f, 8.02f, 3.427f, 10.458f)
                curveTo(5.514f, 14.83f, 9.17f, 18.486f, 13.542f, 20.573f)
                curveTo(15.98f, 21.736f, 18.695f, 20.861f, 20.451f, 19.106f)
                curveTo(21.442f, 18.114f, 21.279f, 16.464f, 20.112f, 15.686f)
                lineTo(18.296f, 14.475f)
                curveTo(17.209f, 13.751f, 15.763f, 13.894f, 14.84f, 14.817f)
                curveTo(14.624f, 15.033f, 14.369f, 15.055f, 14.206f, 14.98f)
                curveTo(11.988f, 13.961f, 10.039f, 12.012f, 9.02f, 9.794f)
                curveTo(8.945f, 9.631f, 8.968f, 9.376f, 9.183f, 9.16f)
                curveTo(10.106f, 8.237f, 10.249f, 6.791f, 9.525f, 5.705f)
                lineTo(8.314f, 3.888f)
                close()
                moveTo(6.308f, 4.964f)
                curveTo(6.407f, 4.865f, 6.572f, 4.881f, 6.65f, 4.998f)
                lineTo(7.861f, 6.814f)
                curveTo(8.056f, 7.107f, 8.018f, 7.497f, 7.769f, 7.746f)
                curveTo(7.053f, 8.462f, 6.728f, 9.595f, 7.203f, 10.629f)
                curveTo(8.421f, 13.282f, 10.718f, 15.579f, 13.371f, 16.798f)
                curveTo(14.405f, 17.272f, 15.538f, 16.947f, 16.254f, 16.231f)
                curveTo(16.503f, 15.982f, 16.893f, 15.944f, 17.186f, 16.139f)
                lineTo(19.003f, 17.35f)
                curveTo(19.119f, 17.428f, 19.135f, 17.593f, 19.036f, 17.692f)
                curveTo(17.718f, 19.01f, 15.889f, 19.476f, 14.404f, 18.768f)
                curveTo(10.445f, 16.878f, 7.122f, 13.555f, 5.232f, 9.596f)
                curveTo(4.524f, 8.111f, 4.99f, 6.282f, 6.308f, 4.964f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 12f)
                curveTo(19.552f, 12f, 20f, 11.552f, 20f, 11f)
                curveTo(20f, 10.448f, 19.552f, 10f, 19f, 10f)
                horizontalLineTo(15.414f)
                lineTo(20.707f, 4.707f)
                curveTo(21.097f, 4.317f, 21.097f, 3.683f, 20.707f, 3.293f)
                curveTo(20.316f, 2.902f, 19.683f, 2.902f, 19.292f, 3.293f)
                lineTo(14f, 8.586f)
                verticalLineTo(5f)
                curveTo(14f, 4.448f, 13.552f, 4f, 13f, 4f)
                curveTo(12.448f, 4f, 12f, 4.448f, 12f, 5f)
                verticalLineTo(11f)
                curveTo(12f, 11.552f, 12.448f, 12f, 13f, 12f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return phoneArrowDownLeft!!
    }

private var phoneArrowDownLeft: ImageVector? = null