package io.github.madmaximuus.persianSymbols.camera.rotate

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CameraRotate: ImageVector
    get() {
        if (cameraRotate != null) {
            return cameraRotate!!
        }
        cameraRotate = ImageVector.Builder(
            name = "camera-rotate-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.17f, 5.25f)
                curveTo(3.867f, 5.25f, 2f, 7.117f, 2f, 9.42f)
                verticalLineTo(16.6f)
                curveTo(2f, 19.03f, 3.97f, 21f, 6.4f, 21f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 21f, 22f, 19.03f, 22f, 16.6f)
                verticalLineTo(9.42f)
                curveTo(22f, 7.117f, 20.133f, 5.25f, 17.83f, 5.25f)
                curveTo(16.944f, 5.25f, 16.094f, 4.895f, 15.47f, 4.264f)
                lineTo(14.809f, 3.595f)
                curveTo(14.434f, 3.214f, 13.921f, 3f, 13.386f, 3f)
                horizontalLineTo(10.613f)
                curveTo(10.079f, 3f, 9.566f, 3.214f, 9.19f, 3.595f)
                lineTo(8.529f, 4.264f)
                curveTo(7.906f, 4.895f, 7.056f, 5.25f, 6.17f, 5.25f)
                close()
                moveTo(8.742f, 12.75f)
                curveTo(8.742f, 10.955f, 10.197f, 9.5f, 11.992f, 9.5f)
                curveTo(12.406f, 9.5f, 12.742f, 9.164f, 12.742f, 8.75f)
                curveTo(12.742f, 8.336f, 12.406f, 8f, 11.992f, 8f)
                curveTo(9.369f, 8f, 7.242f, 10.127f, 7.242f, 12.75f)
                curveTo(7.242f, 13.7f, 7.521f, 14.584f, 8.001f, 15.326f)
                horizontalLineTo(7.729f)
                curveTo(7.315f, 15.326f, 6.979f, 15.662f, 6.979f, 16.076f)
                curveTo(6.979f, 16.49f, 7.315f, 16.826f, 7.729f, 16.826f)
                horizontalLineTo(9.729f)
                curveTo(10.143f, 16.826f, 10.479f, 16.49f, 10.479f, 16.076f)
                verticalLineTo(14.076f)
                curveTo(10.479f, 13.662f, 10.143f, 13.326f, 9.729f, 13.326f)
                curveTo(9.346f, 13.326f, 9.03f, 13.613f, 8.984f, 13.983f)
                curveTo(8.828f, 13.603f, 8.742f, 13.187f, 8.742f, 12.75f)
                close()
                moveTo(16.271f, 10.196f)
                horizontalLineTo(15.998f)
                curveTo(16.469f, 10.934f, 16.742f, 11.81f, 16.742f, 12.75f)
                curveTo(16.742f, 15.373f, 14.616f, 17.5f, 11.992f, 17.5f)
                curveTo(11.578f, 17.5f, 11.242f, 17.164f, 11.242f, 16.75f)
                curveTo(11.242f, 16.336f, 11.578f, 16f, 11.992f, 16f)
                curveTo(13.787f, 16f, 15.242f, 14.545f, 15.242f, 12.75f)
                curveTo(15.242f, 12.326f, 15.161f, 11.922f, 15.014f, 11.551f)
                curveTo(14.963f, 11.916f, 14.65f, 12.196f, 14.271f, 12.196f)
                curveTo(13.857f, 12.196f, 13.521f, 11.861f, 13.521f, 11.446f)
                verticalLineTo(9.446f)
                curveTo(13.521f, 9.032f, 13.857f, 8.696f, 14.271f, 8.696f)
                horizontalLineTo(16.271f)
                curveTo(16.685f, 8.696f, 17.021f, 9.032f, 17.021f, 9.446f)
                curveTo(17.021f, 9.861f, 16.685f, 10.196f, 16.271f, 10.196f)
                close()
            }
        }.build()

        return cameraRotate!!
    }

private var cameraRotate: ImageVector? = null