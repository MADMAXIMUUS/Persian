package io.github.madmaximuus.persianSymbols.keyboard

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Keyboard: ImageVector
    get() {
        if (keyboard != null) {
            return keyboard!!
        }
        keyboard = Builder(
            name = "keyboard-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.45f, 7.5f)
                curveTo(5.063f, 7.5f, 4.75f, 7.813f, 4.75f, 8.2f)
                verticalLineTo(9.3f)
                curveTo(4.75f, 9.687f, 5.063f, 10f, 5.45f, 10f)
                horizontalLineTo(6.55f)
                curveTo(6.937f, 10f, 7.25f, 9.687f, 7.25f, 9.3f)
                verticalLineTo(8.2f)
                curveTo(7.25f, 7.813f, 6.937f, 7.5f, 6.55f, 7.5f)
                horizontalLineTo(5.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 15.5f)
                curveTo(7.224f, 15.5f, 7f, 15.724f, 7f, 16f)
                verticalLineTo(16.5f)
                curveTo(7f, 16.776f, 7.224f, 17f, 7.5f, 17f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 17f, 17f, 16.776f, 17f, 16.5f)
                verticalLineTo(16f)
                curveTo(17f, 15.724f, 16.776f, 15.5f, 16.5f, 15.5f)
                horizontalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.75f, 11.2f)
                curveTo(4.75f, 10.813f, 5.063f, 10.5f, 5.45f, 10.5f)
                horizontalLineTo(6.55f)
                curveTo(6.937f, 10.5f, 7.25f, 10.813f, 7.25f, 11.2f)
                verticalLineTo(12.3f)
                curveTo(7.25f, 12.687f, 6.937f, 13f, 6.55f, 13f)
                horizontalLineTo(5.45f)
                curveTo(5.063f, 13f, 4.75f, 12.687f, 4.75f, 12.3f)
                verticalLineTo(11.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.45f, 7.5f)
                curveTo(8.063f, 7.5f, 7.75f, 7.813f, 7.75f, 8.2f)
                verticalLineTo(9.3f)
                curveTo(7.75f, 9.687f, 8.063f, 10f, 8.45f, 10f)
                horizontalLineTo(9.55f)
                curveTo(9.937f, 10f, 10.25f, 9.687f, 10.25f, 9.3f)
                verticalLineTo(8.2f)
                curveTo(10.25f, 7.813f, 9.937f, 7.5f, 9.55f, 7.5f)
                horizontalLineTo(8.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.75f, 11.2f)
                curveTo(7.75f, 10.813f, 8.063f, 10.5f, 8.45f, 10.5f)
                horizontalLineTo(9.55f)
                curveTo(9.937f, 10.5f, 10.25f, 10.813f, 10.25f, 11.2f)
                verticalLineTo(12.3f)
                curveTo(10.25f, 12.687f, 9.937f, 13f, 9.55f, 13f)
                horizontalLineTo(8.45f)
                curveTo(8.063f, 13f, 7.75f, 12.687f, 7.75f, 12.3f)
                verticalLineTo(11.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.45f, 7.5f)
                curveTo(11.063f, 7.5f, 10.75f, 7.813f, 10.75f, 8.2f)
                verticalLineTo(9.3f)
                curveTo(10.75f, 9.687f, 11.063f, 10f, 11.45f, 10f)
                horizontalLineTo(12.55f)
                curveTo(12.937f, 10f, 13.25f, 9.687f, 13.25f, 9.3f)
                verticalLineTo(8.2f)
                curveTo(13.25f, 7.813f, 12.937f, 7.5f, 12.55f, 7.5f)
                horizontalLineTo(11.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.75f, 11.2f)
                curveTo(10.75f, 10.813f, 11.063f, 10.5f, 11.45f, 10.5f)
                horizontalLineTo(12.55f)
                curveTo(12.937f, 10.5f, 13.25f, 10.813f, 13.25f, 11.2f)
                verticalLineTo(12.3f)
                curveTo(13.25f, 12.687f, 12.937f, 13f, 12.55f, 13f)
                horizontalLineTo(11.45f)
                curveTo(11.063f, 13f, 10.75f, 12.687f, 10.75f, 12.3f)
                verticalLineTo(11.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.45f, 7.5f)
                curveTo(14.063f, 7.5f, 13.75f, 7.813f, 13.75f, 8.2f)
                verticalLineTo(9.3f)
                curveTo(13.75f, 9.687f, 14.063f, 10f, 14.45f, 10f)
                horizontalLineTo(15.55f)
                curveTo(15.937f, 10f, 16.25f, 9.687f, 16.25f, 9.3f)
                verticalLineTo(8.2f)
                curveTo(16.25f, 7.813f, 15.937f, 7.5f, 15.55f, 7.5f)
                horizontalLineTo(14.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.75f, 11.2f)
                curveTo(13.75f, 10.813f, 14.063f, 10.5f, 14.45f, 10.5f)
                horizontalLineTo(15.55f)
                curveTo(15.937f, 10.5f, 16.25f, 10.813f, 16.25f, 11.2f)
                verticalLineTo(12.3f)
                curveTo(16.25f, 12.687f, 15.937f, 13f, 15.55f, 13f)
                horizontalLineTo(14.45f)
                curveTo(14.063f, 13f, 13.75f, 12.687f, 13.75f, 12.3f)
                verticalLineTo(11.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.45f, 7.5f)
                curveTo(17.063f, 7.5f, 16.75f, 7.813f, 16.75f, 8.2f)
                verticalLineTo(9.3f)
                curveTo(16.75f, 9.687f, 17.063f, 10f, 17.45f, 10f)
                horizontalLineTo(18.55f)
                curveTo(18.937f, 10f, 19.25f, 9.687f, 19.25f, 9.3f)
                verticalLineTo(8.2f)
                curveTo(19.25f, 7.813f, 18.937f, 7.5f, 18.55f, 7.5f)
                horizontalLineTo(17.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.75f, 11.2f)
                curveTo(16.75f, 10.813f, 17.063f, 10.5f, 17.45f, 10.5f)
                horizontalLineTo(18.55f)
                curveTo(18.937f, 10.5f, 19.25f, 10.813f, 19.25f, 11.2f)
                verticalLineTo(12.3f)
                curveTo(19.25f, 12.687f, 18.937f, 13f, 18.55f, 13f)
                horizontalLineTo(17.45f)
                curveTo(17.063f, 13f, 16.75f, 12.687f, 16.75f, 12.3f)
                verticalLineTo(11.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 20f, 22f, 17.985f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 6f, 20f, 7.119f, 20f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()
        return keyboard!!
    }

private var keyboard: ImageVector? = null