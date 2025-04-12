package io.github.madmaximuus.persianSymbols.fire

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Fire: ImageVector
    get() {
        if (fire != null) {
            return fire!!
        }
        fire = ImageVector.Builder(
            name = "fire-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.113f, 4.333f)
                curveTo(12.249f, 3.949f, 12.138f, 3.52f, 11.832f, 3.25f)
                curveTo(11.526f, 2.981f, 11.087f, 2.923f, 10.723f, 3.106f)
                curveTo(8.111f, 4.411f, 6.401f, 5.891f, 5.357f, 7.592f)
                curveTo(4.312f, 9.298f, 4f, 11.125f, 4f, 13f)
                curveTo(4f, 17.418f, 7.582f, 21f, 12f, 21f)
                curveTo(16.418f, 21f, 20f, 17.418f, 20f, 13f)
                curveTo(20f, 10.313f, 18.674f, 7.919f, 16.641f, 6.468f)
                curveTo(16.266f, 6.155f, 15.708f, 6.155f, 15.333f, 6.491f)
                curveTo(14.979f, 6.808f, 14.513f, 7f, 14f, 7f)
                curveTo(12.895f, 7f, 12f, 6.105f, 12f, 5f)
                curveTo(12f, 4.763f, 12.04f, 4.539f, 12.113f, 4.333f)
                close()
                moveTo(14f, 9f)
                curveTo(14.714f, 9f, 15.386f, 8.812f, 15.967f, 8.484f)
                curveTo(17.213f, 9.586f, 18f, 11.206f, 18f, 13f)
                curveTo(18f, 14.928f, 17.09f, 16.644f, 15.677f, 17.742f)
                curveTo(15.725f, 17.502f, 15.75f, 17.254f, 15.75f, 17f)
                curveTo(15.75f, 16.389f, 15.484f, 15.762f, 15.185f, 15.23f)
                curveTo(14.874f, 14.678f, 14.47f, 14.13f, 14.081f, 13.654f)
                curveTo(13.689f, 13.175f, 13.3f, 12.752f, 13.009f, 12.45f)
                curveTo(12.864f, 12.299f, 12.742f, 12.177f, 12.656f, 12.092f)
                curveTo(12.613f, 12.049f, 12.579f, 12.016f, 12.555f, 11.993f)
                lineTo(12.527f, 11.966f)
                lineTo(12.519f, 11.959f)
                lineTo(12.516f, 11.956f)
                curveTo(12.516f, 11.956f, 12.516f, 11.956f, 12f, 12.5f)
                lineTo(12.516f, 11.956f)
                curveTo(12.227f, 11.682f, 11.773f, 11.682f, 11.484f, 11.956f)
                lineTo(12f, 12.5f)
                curveTo(11.484f, 11.956f, 11.484f, 11.956f, 11.484f, 11.956f)
                lineTo(11.481f, 11.959f)
                lineTo(11.473f, 11.966f)
                lineTo(11.445f, 11.993f)
                curveTo(11.421f, 12.016f, 11.387f, 12.049f, 11.344f, 12.092f)
                curveTo(11.258f, 12.177f, 11.136f, 12.299f, 10.991f, 12.45f)
                curveTo(10.7f, 12.752f, 10.311f, 13.175f, 9.919f, 13.654f)
                curveTo(9.53f, 14.13f, 9.126f, 14.678f, 8.815f, 15.23f)
                curveTo(8.516f, 15.762f, 8.25f, 16.389f, 8.25f, 17f)
                curveTo(8.25f, 17.254f, 8.275f, 17.502f, 8.323f, 17.742f)
                curveTo(6.91f, 16.644f, 6f, 14.928f, 6f, 13f)
                curveTo(6f, 11.349f, 6.273f, 9.925f, 7.063f, 8.638f)
                curveTo(7.665f, 7.655f, 8.605f, 6.692f, 10.072f, 5.761f)
                curveTo(10.428f, 7.606f, 12.051f, 9f, 14f, 9f)
                close()
                moveTo(13.253f, 18.869f)
                curveTo(12.849f, 18.955f, 12.43f, 19f, 12f, 19f)
                curveTo(11.57f, 19f, 11.151f, 18.955f, 10.747f, 18.869f)
                curveTo(10.146f, 18.465f, 9.75f, 17.779f, 9.75f, 17f)
                curveTo(9.75f, 16.783f, 9.859f, 16.433f, 10.122f, 15.966f)
                curveTo(10.374f, 15.518f, 10.72f, 15.045f, 11.081f, 14.603f)
                curveTo(11.409f, 14.202f, 11.738f, 13.84f, 12f, 13.565f)
                curveTo(12.262f, 13.84f, 12.591f, 14.202f, 12.919f, 14.603f)
                curveTo(13.28f, 15.045f, 13.626f, 15.518f, 13.878f, 15.966f)
                curveTo(14.141f, 16.433f, 14.25f, 16.783f, 14.25f, 17f)
                curveTo(14.25f, 17.779f, 13.854f, 18.465f, 13.253f, 18.869f)
                close()
            }
        }.build()

        return fire!!
    }

private var fire: ImageVector? = null