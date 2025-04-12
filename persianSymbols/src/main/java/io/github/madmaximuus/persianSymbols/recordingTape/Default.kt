package io.github.madmaximuus.persianSymbols.recordingTape

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.RecordingTape: ImageVector
    get() {
        if (recordingTape != null) {
            return recordingTape!!
        }
        recordingTape = ImageVector.Builder(
            name = "recording-tape-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 8.75f)
                horizontalLineTo(8f)
                curveTo(6.757f, 8.75f, 5.75f, 9.757f, 5.75f, 11f)
                curveTo(5.75f, 12.243f, 6.757f, 13.25f, 8f, 13.25f)
                horizontalLineTo(16f)
                curveTo(17.243f, 13.25f, 18.25f, 12.243f, 18.25f, 11f)
                curveTo(18.25f, 9.757f, 17.243f, 8.75f, 16f, 8.75f)
                close()
                moveTo(7.25f, 11f)
                curveTo(7.25f, 10.586f, 7.586f, 10.25f, 8f, 10.25f)
                curveTo(8.414f, 10.25f, 8.75f, 10.586f, 8.75f, 11f)
                curveTo(8.75f, 11.414f, 8.414f, 11.75f, 8f, 11.75f)
                curveTo(7.586f, 11.75f, 7.25f, 11.414f, 7.25f, 11f)
                close()
                moveTo(10.122f, 10.25f)
                curveTo(10.205f, 10.485f, 10.25f, 10.737f, 10.25f, 11f)
                curveTo(10.25f, 11.263f, 10.205f, 11.515f, 10.122f, 11.75f)
                horizontalLineTo(13.878f)
                curveTo(13.795f, 11.515f, 13.75f, 11.263f, 13.75f, 11f)
                curveTo(13.75f, 10.737f, 13.795f, 10.485f, 13.878f, 10.25f)
                horizontalLineTo(10.122f)
                close()
                moveTo(16f, 10.25f)
                curveTo(15.586f, 10.25f, 15.25f, 10.586f, 15.25f, 11f)
                curveTo(15.25f, 11.414f, 15.586f, 11.75f, 16f, 11.75f)
                curveTo(16.414f, 11.75f, 16.75f, 11.414f, 16.75f, 11f)
                curveTo(16.75f, 10.586f, 16.414f, 10.25f, 16f, 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 4f, 22f, 6.015f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 17.985f, 19.985f, 20f, 17.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 6f)
                curveTo(5.119f, 6f, 4f, 7.119f, 4f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4f, 16.647f, 4.773f, 17.614f, 5.827f, 17.908f)
                lineTo(7.079f, 16.029f)
                curveTo(7.404f, 15.542f, 7.95f, 15.25f, 8.535f, 15.25f)
                horizontalLineTo(15.465f)
                curveTo(16.05f, 15.25f, 16.596f, 15.542f, 16.921f, 16.029f)
                lineTo(18.174f, 17.908f)
                curveTo(19.228f, 17.613f, 20f, 16.647f, 20f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(20f, 7.119f, 18.881f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                close()
                moveTo(16.433f, 18f)
                lineTo(15.673f, 16.861f)
                curveTo(15.627f, 16.792f, 15.549f, 16.75f, 15.465f, 16.75f)
                horizontalLineTo(8.535f)
                curveTo(8.452f, 16.75f, 8.374f, 16.792f, 8.327f, 16.861f)
                lineTo(7.568f, 18f)
                horizontalLineTo(16.433f)
                close()
            }
        }.build()

        return recordingTape!!
    }

private var recordingTape: ImageVector? = null