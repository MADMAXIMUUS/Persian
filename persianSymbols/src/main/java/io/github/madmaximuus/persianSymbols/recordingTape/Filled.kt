package io.github.madmaximuus.persianSymbols.recordingTape

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.RecordingTape: ImageVector
    get() {
        if (recordingTape != null) {
            return recordingTape!!
        }
        recordingTape = ImageVector.Builder(
            name = "recording-tape-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.4f)
                curveTo(2f, 5.97f, 3.97f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 4f, 22f, 5.97f, 22f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22f, 17.316f, 21.017f, 18.803f, 19.584f, 19.528f)
                lineTo(16.9f, 15.95f)
                curveTo(16.569f, 15.509f, 16.051f, 15.25f, 15.5f, 15.25f)
                horizontalLineTo(8.5f)
                curveTo(7.949f, 15.25f, 7.431f, 15.509f, 7.1f, 15.95f)
                lineTo(4.416f, 19.528f)
                curveTo(2.983f, 18.803f, 2f, 17.316f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(8f, 11.75f)
                curveTo(8.414f, 11.75f, 8.75f, 11.414f, 8.75f, 11f)
                curveTo(8.75f, 10.586f, 8.414f, 10.25f, 8f, 10.25f)
                curveTo(7.586f, 10.25f, 7.25f, 10.586f, 7.25f, 11f)
                curveTo(7.25f, 11.414f, 7.586f, 11.75f, 8f, 11.75f)
                close()
                moveTo(16.75f, 11f)
                curveTo(16.75f, 11.414f, 16.414f, 11.75f, 16f, 11.75f)
                curveTo(15.586f, 11.75f, 15.25f, 11.414f, 15.25f, 11f)
                curveTo(15.25f, 10.586f, 15.586f, 10.25f, 16f, 10.25f)
                curveTo(16.414f, 10.25f, 16.75f, 10.586f, 16.75f, 11f)
                close()
                moveTo(10.1f, 10.25f)
                horizontalLineTo(13.88f)
                curveTo(13.7f, 10.8f, 13.7f, 11.2f, 13.88f, 11.75f)
                horizontalLineTo(10.1f)
                curveTo(10.3f, 11.2f, 10.3f, 10.8f, 10.1f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.7f, 16.85f)
                lineTo(18.046f, 19.978f)
                curveTo(17.899f, 19.992f, 17.75f, 20f, 17.6f, 20f)
                horizontalLineTo(6.4f)
                curveTo(6.249f, 20f, 6.101f, 19.992f, 5.954f, 19.978f)
                lineTo(8.3f, 16.85f)
                curveTo(8.347f, 16.787f, 8.421f, 16.75f, 8.5f, 16.75f)
                horizontalLineTo(15.5f)
                curveTo(15.579f, 16.75f, 15.653f, 16.787f, 15.7f, 16.85f)
                close()
            }
        }.build()

        return recordingTape!!
    }

private var recordingTape: ImageVector? = null