package io.github.madmaximuus.persianSymbols.envelope.paperClip

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.EnvelopePaperClip: ImageVector
    get() {
        if (envelopePaperClip != null) {
            return envelopePaperClip!!
        }
        envelopePaperClip = Builder(
            name = "envelope-paper-clip-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.4f)
                curveTo(2f, 7.812f, 2.115f, 7.251f, 2.325f, 6.738f)
                curveTo(2.362f, 6.772f, 2.402f, 6.803f, 2.445f, 6.832f)
                lineTo(10.336f, 12.092f)
                curveTo(11.344f, 12.764f, 12.656f, 12.764f, 13.664f, 12.092f)
                lineTo(21.555f, 6.832f)
                curveTo(21.598f, 6.803f, 21.638f, 6.772f, 21.675f, 6.738f)
                curveTo(21.885f, 7.251f, 22f, 7.812f, 22f, 8.4f)
                verticalLineTo(13.663f)
                curveTo(21.761f, 13.448f, 21.452f, 13.308f, 21.112f, 13.282f)
                curveTo(20.943f, 12.803f, 20.655f, 12.4f, 20.274f, 12.095f)
                curveTo(19.704f, 11.639f, 19.047f, 11.5f, 18.572f, 11.5f)
                curveTo(18.099f, 11.5f, 17.449f, 11.643f, 16.883f, 12.091f)
                curveTo(16.251f, 12.592f, 15.86f, 13.369f, 15.86f, 14.333f)
                verticalLineTo(18.778f)
                lineTo(15.86f, 18.821f)
                curveTo(15.859f, 19.039f, 15.858f, 19.49f, 15.969f, 20f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(3.555f, 5.168f)
                curveTo(3.527f, 5.15f, 3.499f, 5.133f, 3.47f, 5.117f)
                curveTo(4.248f, 4.422f, 5.275f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(18.725f, 4f, 19.752f, 4.422f, 20.53f, 5.117f)
                curveTo(20.501f, 5.133f, 20.473f, 5.15f, 20.445f, 5.168f)
                lineTo(12.555f, 10.428f)
                curveTo(12.219f, 10.652f, 11.781f, 10.652f, 11.445f, 10.428f)
                lineTo(3.555f, 5.168f)
                close()
                moveTo(19.251f, 19.165f)
                lineTo(19.251f, 19.164f)
                lineTo(19.251f, 19.165f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.572f, 12.5f)
                curveTo(18.28f, 12.5f, 17.861f, 12.592f, 17.504f, 12.875f)
                curveTo(17.125f, 13.175f, 16.86f, 13.656f, 16.86f, 14.333f)
                verticalLineTo(18.778f)
                lineTo(16.86f, 18.801f)
                curveTo(16.86f, 19.128f, 16.86f, 19.78f, 17.137f, 20.356f)
                curveTo(17.285f, 20.663f, 17.515f, 20.959f, 17.866f, 21.173f)
                curveTo(18.216f, 21.387f, 18.652f, 21.5f, 19.178f, 21.5f)
                curveTo(19.718f, 21.5f, 20.16f, 21.367f, 20.51f, 21.129f)
                curveTo(20.858f, 20.893f, 21.082f, 20.576f, 21.224f, 20.263f)
                curveTo(21.497f, 19.663f, 21.496f, 19.019f, 21.496f, 18.789f)
                lineTo(21.496f, 18.778f)
                verticalLineTo(14.778f)
                curveTo(21.496f, 14.502f, 21.272f, 14.278f, 20.996f, 14.278f)
                curveTo(20.72f, 14.278f, 20.496f, 14.502f, 20.496f, 14.778f)
                verticalLineTo(18.778f)
                curveTo(20.496f, 19.003f, 20.492f, 19.458f, 20.314f, 19.849f)
                curveTo(20.229f, 20.035f, 20.112f, 20.191f, 19.948f, 20.302f)
                curveTo(19.787f, 20.411f, 19.548f, 20.5f, 19.178f, 20.5f)
                curveTo(18.796f, 20.5f, 18.549f, 20.419f, 18.388f, 20.32f)
                curveTo(18.228f, 20.222f, 18.117f, 20.087f, 18.038f, 19.922f)
                curveTo(17.867f, 19.568f, 17.86f, 19.125f, 17.86f, 18.778f)
                verticalLineTo(14.333f)
                curveTo(17.86f, 13.944f, 17.999f, 13.758f, 18.125f, 13.659f)
                curveTo(18.273f, 13.541f, 18.46f, 13.5f, 18.572f, 13.5f)
                curveTo(18.697f, 13.5f, 18.882f, 13.543f, 19.025f, 13.657f)
                curveTo(19.147f, 13.755f, 19.284f, 13.939f, 19.284f, 14.333f)
                verticalLineTo(18.778f)
                curveTo(19.284f, 18.812f, 19.285f, 18.839f, 19.285f, 18.863f)
                curveTo(19.286f, 18.903f, 19.287f, 18.937f, 19.285f, 18.988f)
                curveTo(19.282f, 19.058f, 19.273f, 19.108f, 19.261f, 19.142f)
                curveTo(19.259f, 19.149f, 19.256f, 19.155f, 19.255f, 19.159f)
                curveTo(19.243f, 19.162f, 19.22f, 19.167f, 19.178f, 19.167f)
                curveTo(19.154f, 19.167f, 19.14f, 19.164f, 19.133f, 19.162f)
                curveTo(19.13f, 19.157f, 19.122f, 19.146f, 19.114f, 19.124f)
                curveTo(19.098f, 19.084f, 19.086f, 19.028f, 19.079f, 18.96f)
                curveTo(19.072f, 18.894f, 19.072f, 18.833f, 19.072f, 18.778f)
                verticalLineTo(14.778f)
                curveTo(19.072f, 14.502f, 18.848f, 14.278f, 18.572f, 14.278f)
                curveTo(18.296f, 14.278f, 18.072f, 14.502f, 18.072f, 14.778f)
                verticalLineTo(18.778f)
                lineTo(18.072f, 18.789f)
                curveTo(18.072f, 18.902f, 18.072f, 19.204f, 18.182f, 19.487f)
                curveTo(18.242f, 19.642f, 18.345f, 19.818f, 18.522f, 19.954f)
                curveTo(18.704f, 20.096f, 18.929f, 20.167f, 19.178f, 20.167f)
                curveTo(19.432f, 20.167f, 19.665f, 20.103f, 19.856f, 19.96f)
                curveTo(20.045f, 19.819f, 20.149f, 19.634f, 20.206f, 19.469f)
                curveTo(20.298f, 19.205f, 20.288f, 18.907f, 20.285f, 18.806f)
                curveTo(20.285f, 18.793f, 20.284f, 18.784f, 20.284f, 18.778f)
                verticalLineTo(14.333f)
                curveTo(20.284f, 13.661f, 20.028f, 13.179f, 19.65f, 12.876f)
                curveTo(19.293f, 12.591f, 18.872f, 12.5f, 18.572f, 12.5f)
                close()
            }
        }.build()
        return envelopePaperClip!!
    }

private var envelopePaperClip: ImageVector? = null