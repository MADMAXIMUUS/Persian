package io.github.madmaximuus.persianSymbols.keyboard.ellipsis

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.KeyboardEllipsis: ImageVector
    get() {
        if (keyboardEllipsis != null) {
            return keyboardEllipsis!!
        }
        keyboardEllipsis = ImageVector.Builder(
            name = "keyboard-ellipsis-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(12.875f)
                curveTo(12.633f, 19.38f, 12.5f, 18.706f, 12.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 6f, 20f, 7.119f, 20f, 8.5f)
                verticalLineTo(12.875f)
                curveTo(20.765f, 13.174f, 21.446f, 13.638f, 22f, 14.225f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.875f, 16f)
                curveTo(13.174f, 15.235f, 13.638f, 14.554f, 14.225f, 14f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 14f, 8f, 14.224f, 8f, 14.5f)
                verticalLineTo(15.5f)
                curveTo(8f, 15.776f, 8.224f, 16f, 8.5f, 16f)
                horizontalLineTo(12.875f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 12.5f)
                curveTo(18.331f, 12.5f, 18.656f, 12.529f, 18.971f, 12.585f)
                curveTo(18.99f, 12.527f, 19f, 12.465f, 19f, 12.4f)
                verticalLineTo(11.6f)
                curveTo(19f, 11.269f, 18.731f, 11f, 18.4f, 11f)
                horizontalLineTo(17.6f)
                curveTo(17.269f, 11f, 17f, 11.269f, 17f, 11.6f)
                verticalLineTo(12.4f)
                curveTo(17f, 12.465f, 17.01f, 12.527f, 17.029f, 12.585f)
                curveTo(17.344f, 12.529f, 17.669f, 12.5f, 18f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 8.6f)
                curveTo(5f, 8.269f, 5.269f, 8f, 5.6f, 8f)
                horizontalLineTo(6.4f)
                curveTo(6.731f, 8f, 7f, 8.269f, 7f, 8.6f)
                verticalLineTo(9.4f)
                curveTo(7f, 9.731f, 6.731f, 10f, 6.4f, 10f)
                horizontalLineTo(5.6f)
                curveTo(5.269f, 10f, 5f, 9.731f, 5f, 9.4f)
                verticalLineTo(8.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.6f, 11f)
                curveTo(5.269f, 11f, 5f, 11.269f, 5f, 11.6f)
                verticalLineTo(12.4f)
                curveTo(5f, 12.731f, 5.269f, 13f, 5.6f, 13f)
                horizontalLineTo(6.4f)
                curveTo(6.731f, 13f, 7f, 12.731f, 7f, 12.4f)
                verticalLineTo(11.6f)
                curveTo(7f, 11.269f, 6.731f, 11f, 6.4f, 11f)
                horizontalLineTo(5.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 14.6f)
                curveTo(5f, 14.269f, 5.269f, 14f, 5.6f, 14f)
                horizontalLineTo(6.4f)
                curveTo(6.731f, 14f, 7f, 14.269f, 7f, 14.6f)
                verticalLineTo(15.4f)
                curveTo(7f, 15.731f, 6.731f, 16f, 6.4f, 16f)
                horizontalLineTo(5.6f)
                curveTo(5.269f, 16f, 5f, 15.731f, 5f, 15.4f)
                verticalLineTo(14.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.6f, 11f)
                curveTo(8.269f, 11f, 8f, 11.269f, 8f, 11.6f)
                verticalLineTo(12.4f)
                curveTo(8f, 12.731f, 8.269f, 13f, 8.6f, 13f)
                horizontalLineTo(9.4f)
                curveTo(9.731f, 13f, 10f, 12.731f, 10f, 12.4f)
                verticalLineTo(11.6f)
                curveTo(10f, 11.269f, 9.731f, 11f, 9.4f, 11f)
                horizontalLineTo(8.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 11.6f)
                curveTo(11f, 11.269f, 11.269f, 11f, 11.6f, 11f)
                horizontalLineTo(12.4f)
                curveTo(12.731f, 11f, 13f, 11.269f, 13f, 11.6f)
                verticalLineTo(12.4f)
                curveTo(13f, 12.731f, 12.731f, 13f, 12.4f, 13f)
                horizontalLineTo(11.6f)
                curveTo(11.269f, 13f, 11f, 12.731f, 11f, 12.4f)
                verticalLineTo(11.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.6f, 11f)
                curveTo(14.269f, 11f, 14f, 11.269f, 14f, 11.6f)
                verticalLineTo(12.4f)
                curveTo(14f, 12.731f, 14.269f, 13f, 14.6f, 13f)
                horizontalLineTo(15.4f)
                curveTo(15.731f, 13f, 16f, 12.731f, 16f, 12.4f)
                verticalLineTo(11.6f)
                curveTo(16f, 11.269f, 15.731f, 11f, 15.4f, 11f)
                horizontalLineTo(14.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.6f, 8f)
                curveTo(8.269f, 8f, 8f, 8.269f, 8f, 8.6f)
                verticalLineTo(9.4f)
                curveTo(8f, 9.731f, 8.269f, 10f, 8.6f, 10f)
                horizontalLineTo(9.4f)
                curveTo(9.731f, 10f, 10f, 9.731f, 10f, 9.4f)
                verticalLineTo(8.6f)
                curveTo(10f, 8.269f, 9.731f, 8f, 9.4f, 8f)
                horizontalLineTo(8.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 8.6f)
                curveTo(11f, 8.269f, 11.269f, 8f, 11.6f, 8f)
                horizontalLineTo(12.4f)
                curveTo(12.731f, 8f, 13f, 8.269f, 13f, 8.6f)
                verticalLineTo(9.4f)
                curveTo(13f, 9.731f, 12.731f, 10f, 12.4f, 10f)
                horizontalLineTo(11.6f)
                curveTo(11.269f, 10f, 11f, 9.731f, 11f, 9.4f)
                verticalLineTo(8.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.6f, 8f)
                curveTo(14.269f, 8f, 14f, 8.269f, 14f, 8.6f)
                verticalLineTo(9.4f)
                curveTo(14f, 9.731f, 14.269f, 10f, 14.6f, 10f)
                horizontalLineTo(15.4f)
                curveTo(15.731f, 10f, 16f, 9.731f, 16f, 9.4f)
                verticalLineTo(8.6f)
                curveTo(16f, 8.269f, 15.731f, 8f, 15.4f, 8f)
                horizontalLineTo(14.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 8.6f)
                curveTo(17f, 8.269f, 17.269f, 8f, 17.6f, 8f)
                horizontalLineTo(18.4f)
                curveTo(18.731f, 8f, 19f, 8.269f, 19f, 8.6f)
                verticalLineTo(9.4f)
                curveTo(19f, 9.731f, 18.731f, 10f, 18.4f, 10f)
                horizontalLineTo(17.6f)
                curveTo(17.269f, 10f, 17f, 9.731f, 17f, 9.4f)
                verticalLineTo(8.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.882f, 18f)
                curveTo(16.882f, 18.414f, 16.546f, 18.75f, 16.132f, 18.75f)
                curveTo(15.718f, 18.75f, 15.382f, 18.414f, 15.382f, 18f)
                curveTo(15.382f, 17.586f, 15.718f, 17.25f, 16.132f, 17.25f)
                curveTo(16.546f, 17.25f, 16.882f, 17.586f, 16.882f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 18.75f)
                curveTo(18.414f, 18.75f, 18.75f, 18.414f, 18.75f, 18f)
                curveTo(18.75f, 17.586f, 18.414f, 17.25f, 18f, 17.25f)
                curveTo(17.586f, 17.25f, 17.25f, 17.586f, 17.25f, 18f)
                curveTo(17.25f, 18.414f, 17.586f, 18.75f, 18f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.618f, 18f)
                curveTo(20.618f, 18.414f, 20.282f, 18.75f, 19.868f, 18.75f)
                curveTo(19.454f, 18.75f, 19.118f, 18.414f, 19.118f, 18f)
                curveTo(19.118f, 17.586f, 19.454f, 17.25f, 19.868f, 17.25f)
                curveTo(20.282f, 17.25f, 20.618f, 17.586f, 20.618f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()

        return keyboardEllipsis!!
    }

private var keyboardEllipsis: ImageVector? = null
