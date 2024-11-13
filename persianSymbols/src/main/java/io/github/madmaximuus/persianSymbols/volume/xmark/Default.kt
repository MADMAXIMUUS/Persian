package io.github.madmaximuus.persianSymbols.volume.xmark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.VolumeXMark: ImageVector
    get() {
        if (volumeXMark != null) {
            return volumeXMark!!
        }
        volumeXMark = Builder(
            name = "volume-xmark-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 6.414f)
                curveTo(15f, 4.632f, 12.846f, 3.74f, 11.586f, 5f)
                lineTo(8.586f, 8f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 8f, 2f, 9.119f, 2f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(2f, 14.881f, 3.119f, 16f, 4.5f, 16f)
                horizontalLineTo(8.586f)
                lineTo(11.586f, 19f)
                curveTo(12.846f, 20.26f, 15f, 19.368f, 15f, 17.586f)
                verticalLineTo(6.414f)
                close()
                moveTo(10f, 9.414f)
                lineTo(13f, 6.414f)
                lineTo(13f, 17.586f)
                lineTo(10f, 14.586f)
                curveTo(9.625f, 14.211f, 9.116f, 14f, 8.586f, 14f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 14f, 4f, 13.776f, 4f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(4f, 10.224f, 4.224f, 10f, 4.5f, 10f)
                horizontalLineTo(8.586f)
                curveTo(9.116f, 10f, 9.625f, 9.789f, 10f, 9.414f)
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