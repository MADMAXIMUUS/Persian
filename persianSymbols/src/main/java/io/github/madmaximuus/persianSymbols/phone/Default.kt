package io.github.madmaximuus.persianSymbols.phone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Phone: ImageVector
    get() {
        if (phone != null) {
            return phone!!
        }
        phone = Builder(
            name = "phone-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.894f, 3.549f)
                curveTo(5.886f, 2.558f, 7.536f, 2.721f, 8.314f, 3.888f)
                lineTo(9.525f, 5.705f)
                curveTo(10.249f, 6.791f, 10.106f, 8.237f, 9.183f, 9.16f)
                curveTo(8.968f, 9.376f, 8.945f, 9.631f, 9.02f, 9.794f)
                curveTo(10.039f, 12.012f, 11.988f, 13.961f, 14.206f, 14.98f)
                curveTo(14.369f, 15.055f, 14.624f, 15.033f, 14.84f, 14.817f)
                curveTo(15.763f, 13.894f, 17.209f, 13.751f, 18.296f, 14.475f)
                lineTo(20.112f, 15.686f)
                curveTo(21.279f, 16.463f, 21.442f, 18.114f, 20.451f, 19.106f)
                curveTo(18.695f, 20.861f, 15.98f, 21.736f, 13.542f, 20.573f)
                curveTo(9.17f, 18.486f, 5.514f, 14.83f, 3.427f, 10.458f)
                curveTo(2.264f, 8.02f, 3.139f, 5.305f, 4.894f, 3.549f)
                close()
                moveTo(6.65f, 4.997f)
                curveTo(6.572f, 4.881f, 6.407f, 4.865f, 6.308f, 4.964f)
                curveTo(4.99f, 6.282f, 4.524f, 8.111f, 5.232f, 9.596f)
                curveTo(7.122f, 13.555f, 10.445f, 16.878f, 14.404f, 18.768f)
                curveTo(15.889f, 19.476f, 17.718f, 19.01f, 19.036f, 17.692f)
                curveTo(19.135f, 17.593f, 19.119f, 17.428f, 19.003f, 17.35f)
                lineTo(17.186f, 16.139f)
                curveTo(16.893f, 15.944f, 16.503f, 15.982f, 16.254f, 16.231f)
                curveTo(15.538f, 16.947f, 14.405f, 17.272f, 13.371f, 16.798f)
                curveTo(10.718f, 15.579f, 8.421f, 13.282f, 7.203f, 10.629f)
                curveTo(6.728f, 9.595f, 7.053f, 8.462f, 7.769f, 7.746f)
                curveTo(8.018f, 7.497f, 8.056f, 7.107f, 7.861f, 6.814f)
                lineTo(6.65f, 4.997f)
                close()
            }
        }.build()
        return phone!!
    }

private var phone: ImageVector? = null