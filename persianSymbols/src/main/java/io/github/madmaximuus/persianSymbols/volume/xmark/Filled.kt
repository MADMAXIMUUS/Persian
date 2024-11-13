package io.github.madmaximuus.persianSymbols.volume.xmark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.VolumeXMark: ImageVector
    get() {
        if (volumeXMark != null) {
            return volumeXMark!!
        }
        volumeXMark = Builder(
            name = "volume-xmark-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 8f)
                horizontalLineTo(8.203f)
                curveTo(8.425f, 8f, 8.641f, 7.926f, 8.816f, 7.791f)
                lineTo(13.388f, 4.249f)
                curveTo(14.045f, 3.74f, 15f, 4.208f, 15f, 5.04f)
                verticalLineTo(18.96f)
                curveTo(15f, 19.792f, 14.045f, 20.26f, 13.388f, 19.751f)
                lineTo(8.816f, 16.209f)
                curveTo(8.641f, 16.074f, 8.425f, 16f, 8.203f, 16f)
                horizontalLineTo(4f)
                curveTo(2.895f, 16f, 2f, 15.104f, 2f, 14f)
                verticalLineTo(10f)
                curveTo(2f, 8.895f, 2.895f, 8f, 4f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.271f, 14.42f)
                curveTo(15.977f, 14.129f, 15.976f, 13.655f, 16.269f, 13.362f)
                lineTo(17.635f, 11.994f)
                lineTo(16.269f, 10.626f)
                curveTo(15.976f, 10.333f, 15.977f, 9.859f, 16.271f, 9.568f)
                curveTo(16.566f, 9.276f, 17.042f, 9.277f, 17.334f, 9.571f)
                lineTo(18.695f, 10.933f)
                lineTo(20.056f, 9.57f)
                curveTo(20.349f, 9.277f, 20.825f, 9.276f, 21.119f, 9.568f)
                curveTo(21.413f, 9.859f, 21.414f, 10.333f, 21.122f, 10.626f)
                lineTo(19.755f, 11.994f)
                lineTo(21.122f, 13.362f)
                curveTo(21.414f, 13.655f, 21.413f, 14.129f, 21.119f, 14.421f)
                curveTo(20.825f, 14.712f, 20.349f, 14.711f, 20.056f, 14.418f)
                lineTo(18.695f, 13.055f)
                lineTo(17.334f, 14.418f)
                curveTo(17.042f, 14.711f, 16.566f, 14.712f, 16.271f, 14.42f)
                close()
            }
        }.build()
        return volumeXMark!!
    }

private var volumeXMark: ImageVector? = null