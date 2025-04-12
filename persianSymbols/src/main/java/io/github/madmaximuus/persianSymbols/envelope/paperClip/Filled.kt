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
                moveTo(2.804f, 5.864f)
                curveTo(2.297f, 6.581f, 2f, 7.456f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 16.559f, 2.307f, 17.446f, 2.827f, 18.169f)
                lineTo(8.968f, 12.029f)
                lineTo(2.804f, 5.864f)
                close()
                moveTo(6.4f, 20f)
                curveTo(5.471f, 20f, 4.608f, 19.712f, 3.898f, 19.22f)
                lineTo(10.029f, 13.089f)
                lineTo(10.409f, 13.47f)
                curveTo(11.288f, 14.348f, 12.712f, 14.348f, 13.591f, 13.47f)
                lineTo(13.971f, 13.089f)
                lineTo(16.11f, 15.228f)
                verticalLineTo(18.778f)
                lineTo(16.11f, 18.818f)
                curveTo(16.109f, 19.044f, 16.108f, 19.498f, 16.225f, 20f)
                horizontalLineTo(6.4f)
                close()
                moveTo(22f, 14.033f)
                verticalLineTo(8.4f)
                curveTo(22f, 7.456f, 21.703f, 6.581f, 21.196f, 5.864f)
                lineTo(15.032f, 12.029f)
                lineTo(16.297f, 13.293f)
                curveTo(16.457f, 12.883f, 16.714f, 12.544f, 17.038f, 12.287f)
                curveTo(17.552f, 11.88f, 18.144f, 11.75f, 18.572f, 11.75f)
                curveTo(19.003f, 11.75f, 19.601f, 11.877f, 20.118f, 12.291f)
                curveTo(20.503f, 12.598f, 20.785f, 13.019f, 20.928f, 13.53f)
                curveTo(20.951f, 13.528f, 20.973f, 13.528f, 20.996f, 13.528f)
                curveTo(21.407f, 13.528f, 21.772f, 13.726f, 22f, 14.033f)
                close()
                moveTo(3.864f, 4.804f)
                lineTo(11.47f, 12.409f)
                curveTo(11.762f, 12.702f, 12.237f, 12.702f, 12.53f, 12.409f)
                lineTo(20.136f, 4.804f)
                curveTo(19.419f, 4.297f, 18.544f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                curveTo(5.456f, 4f, 4.581f, 4.297f, 3.864f, 4.804f)
                close()
                moveTo(17.504f, 12.875f)
                curveTo(17.861f, 12.592f, 18.28f, 12.5f, 18.572f, 12.5f)
                curveTo(18.872f, 12.5f, 19.293f, 12.591f, 19.65f, 12.876f)
                curveTo(20.028f, 13.179f, 20.284f, 13.661f, 20.284f, 14.333f)
                verticalLineTo(18.778f)
                curveTo(20.284f, 18.784f, 20.285f, 18.793f, 20.285f, 18.806f)
                curveTo(20.288f, 18.907f, 20.298f, 19.205f, 20.206f, 19.469f)
                curveTo(20.149f, 19.634f, 20.045f, 19.819f, 19.856f, 19.96f)
                curveTo(19.665f, 20.103f, 19.432f, 20.167f, 19.178f, 20.167f)
                curveTo(18.929f, 20.167f, 18.704f, 20.096f, 18.522f, 19.954f)
                curveTo(18.345f, 19.818f, 18.242f, 19.642f, 18.182f, 19.487f)
                curveTo(18.072f, 19.204f, 18.072f, 18.902f, 18.072f, 18.789f)
                curveTo(18.072f, 18.785f, 18.072f, 18.781f, 18.072f, 18.778f)
                verticalLineTo(14.778f)
                curveTo(18.072f, 14.502f, 18.296f, 14.278f, 18.572f, 14.278f)
                curveTo(18.848f, 14.278f, 19.072f, 14.502f, 19.072f, 14.778f)
                verticalLineTo(18.778f)
                curveTo(19.072f, 18.833f, 19.072f, 18.894f, 19.079f, 18.96f)
                curveTo(19.086f, 19.028f, 19.098f, 19.084f, 19.114f, 19.124f)
                curveTo(19.122f, 19.146f, 19.13f, 19.157f, 19.133f, 19.162f)
                curveTo(19.14f, 19.164f, 19.154f, 19.167f, 19.178f, 19.167f)
                curveTo(19.22f, 19.167f, 19.243f, 19.162f, 19.255f, 19.159f)
                curveTo(19.256f, 19.155f, 19.259f, 19.149f, 19.261f, 19.142f)
                curveTo(19.273f, 19.108f, 19.282f, 19.058f, 19.285f, 18.988f)
                curveTo(19.287f, 18.937f, 19.286f, 18.903f, 19.285f, 18.863f)
                curveTo(19.285f, 18.839f, 19.284f, 18.812f, 19.284f, 18.778f)
                verticalLineTo(14.333f)
                curveTo(19.284f, 13.939f, 19.147f, 13.755f, 19.025f, 13.657f)
                curveTo(18.882f, 13.543f, 18.697f, 13.5f, 18.572f, 13.5f)
                curveTo(18.46f, 13.5f, 18.273f, 13.541f, 18.125f, 13.659f)
                curveTo(17.999f, 13.758f, 17.86f, 13.944f, 17.86f, 14.333f)
                verticalLineTo(18.778f)
                curveTo(17.86f, 19.125f, 17.867f, 19.568f, 18.038f, 19.922f)
                curveTo(18.117f, 20.087f, 18.228f, 20.222f, 18.388f, 20.32f)
                curveTo(18.549f, 20.419f, 18.796f, 20.5f, 19.178f, 20.5f)
                curveTo(19.548f, 20.5f, 19.787f, 20.411f, 19.948f, 20.302f)
                curveTo(20.112f, 20.191f, 20.229f, 20.035f, 20.314f, 19.849f)
                curveTo(20.492f, 19.458f, 20.496f, 19.003f, 20.496f, 18.778f)
                verticalLineTo(14.778f)
                lineTo(20.996f, 14.778f)
                lineTo(21.496f, 14.778f)
                verticalLineTo(18.778f)
                curveTo(21.496f, 18.781f, 21.496f, 18.785f, 21.496f, 18.789f)
                curveTo(21.496f, 19.019f, 21.497f, 19.663f, 21.224f, 20.263f)
                curveTo(21.082f, 20.576f, 20.858f, 20.893f, 20.51f, 21.129f)
                curveTo(20.16f, 21.367f, 19.718f, 21.5f, 19.178f, 21.5f)
                curveTo(18.652f, 21.5f, 18.216f, 21.387f, 17.866f, 21.173f)
                curveTo(17.515f, 20.959f, 17.285f, 20.663f, 17.137f, 20.356f)
                curveTo(16.86f, 19.78f, 16.86f, 19.128f, 16.86f, 18.801f)
                curveTo(16.86f, 18.793f, 16.86f, 18.785f, 16.86f, 18.778f)
                verticalLineTo(14.333f)
                curveTo(16.86f, 13.656f, 17.125f, 13.175f, 17.504f, 12.875f)
                close()
                moveTo(20.996f, 14.778f)
                lineTo(21.496f, 14.778f)
                curveTo(21.496f, 14.502f, 21.272f, 14.278f, 20.996f, 14.278f)
                curveTo(20.72f, 14.278f, 20.496f, 14.502f, 20.496f, 14.778f)
                lineTo(20.996f, 14.778f)
                close()
                moveTo(19.251f, 19.165f)
                curveTo(19.251f, 19.165f, 19.251f, 19.165f, 19.251f, 19.164f)
                lineTo(19.251f, 19.165f)
                close()
            }
        }.build()
        return envelopePaperClip!!
    }

private var envelopePaperClip: ImageVector? = null