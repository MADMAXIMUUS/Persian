package io.github.madmaximuus.persianSymbols.faxmachine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Faxmashine: ImageVector
    get() {
        if (faxmashine != null) {
            return faxmashine!!
        }
        faxmashine = ImageVector.Builder(
            name = "faxmashine-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                curveTo(18.105f, 2f, 19f, 2.895f, 19f, 4f)
                horizontalLineTo(5f)
                curveTo(5f, 2.895f, 5.895f, 2f, 7f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.2f, 5f)
                horizontalLineTo(18.8f)
                curveTo(20.567f, 5f, 22f, 6.433f, 22f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(22f, 17.143f, 21.173f, 18.292f, 20f, 18.767f)
                verticalLineTo(16f)
                curveTo(20f, 14.343f, 18.657f, 13f, 17f, 13f)
                horizontalLineTo(7f)
                curveTo(5.343f, 13f, 4f, 14.343f, 4f, 16f)
                verticalLineTo(18.767f)
                curveTo(2.827f, 18.293f, 2f, 17.143f, 2f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(2f, 6.433f, 3.433f, 5f, 5.2f, 5f)
                close()
                moveTo(5.6f, 7f)
                curveTo(5.269f, 7f, 5f, 7.269f, 5f, 7.6f)
                verticalLineTo(8.4f)
                curveTo(5f, 8.731f, 5.269f, 9f, 5.6f, 9f)
                horizontalLineTo(6.4f)
                curveTo(6.731f, 9f, 7f, 8.731f, 7f, 8.4f)
                verticalLineTo(7.6f)
                curveTo(7f, 7.269f, 6.731f, 7f, 6.4f, 7f)
                horizontalLineTo(5.6f)
                close()
                moveTo(5.6f, 10f)
                curveTo(5.269f, 10f, 5f, 10.269f, 5f, 10.6f)
                verticalLineTo(11.4f)
                curveTo(5f, 11.731f, 5.269f, 12f, 5.6f, 12f)
                horizontalLineTo(6.4f)
                curveTo(6.731f, 12f, 7f, 11.731f, 7f, 11.4f)
                verticalLineTo(10.6f)
                curveTo(7f, 10.269f, 6.731f, 10f, 6.4f, 10f)
                horizontalLineTo(5.6f)
                close()
                moveTo(8.6f, 10f)
                curveTo(8.269f, 10f, 8f, 10.269f, 8f, 10.6f)
                verticalLineTo(11.4f)
                curveTo(8f, 11.731f, 8.269f, 12f, 8.6f, 12f)
                horizontalLineTo(9.4f)
                curveTo(9.731f, 12f, 10f, 11.731f, 10f, 11.4f)
                verticalLineTo(10.6f)
                curveTo(10f, 10.269f, 9.731f, 10f, 9.4f, 10f)
                horizontalLineTo(8.6f)
                close()
                moveTo(11f, 10.6f)
                curveTo(11f, 10.269f, 11.269f, 10f, 11.6f, 10f)
                horizontalLineTo(12.4f)
                curveTo(12.731f, 10f, 13f, 10.269f, 13f, 10.6f)
                verticalLineTo(11.4f)
                curveTo(13f, 11.731f, 12.731f, 12f, 12.4f, 12f)
                horizontalLineTo(11.6f)
                curveTo(11.269f, 12f, 11f, 11.731f, 11f, 11.4f)
                verticalLineTo(10.6f)
                close()
                moveTo(14.6f, 10f)
                curveTo(14.269f, 10f, 14f, 10.269f, 14f, 10.6f)
                verticalLineTo(11.4f)
                curveTo(14f, 11.731f, 14.269f, 12f, 14.6f, 12f)
                horizontalLineTo(15.4f)
                curveTo(15.731f, 12f, 16f, 11.731f, 16f, 11.4f)
                verticalLineTo(10.6f)
                curveTo(16f, 10.269f, 15.731f, 10f, 15.4f, 10f)
                horizontalLineTo(14.6f)
                close()
                moveTo(17f, 10.6f)
                curveTo(17f, 10.269f, 17.269f, 10f, 17.6f, 10f)
                horizontalLineTo(18.4f)
                curveTo(18.731f, 10f, 19f, 10.269f, 19f, 10.6f)
                verticalLineTo(11.4f)
                curveTo(19f, 11.731f, 18.731f, 12f, 18.4f, 12f)
                horizontalLineTo(17.6f)
                curveTo(17.269f, 12f, 17f, 11.731f, 17f, 11.4f)
                verticalLineTo(10.6f)
                close()
                moveTo(8f, 7.6f)
                curveTo(8f, 7.269f, 8.269f, 7f, 8.6f, 7f)
                horizontalLineTo(9.4f)
                curveTo(9.731f, 7f, 10f, 7.269f, 10f, 7.6f)
                verticalLineTo(8.4f)
                curveTo(10f, 8.731f, 9.731f, 9f, 9.4f, 9f)
                horizontalLineTo(8.6f)
                curveTo(8.269f, 9f, 8f, 8.731f, 8f, 8.4f)
                verticalLineTo(7.6f)
                close()
                moveTo(11.6f, 7f)
                curveTo(11.269f, 7f, 11f, 7.269f, 11f, 7.6f)
                verticalLineTo(8.4f)
                curveTo(11f, 8.731f, 11.269f, 9f, 11.6f, 9f)
                horizontalLineTo(12.4f)
                curveTo(12.731f, 9f, 13f, 8.731f, 13f, 8.4f)
                verticalLineTo(7.6f)
                curveTo(13f, 7.269f, 12.731f, 7f, 12.4f, 7f)
                horizontalLineTo(11.6f)
                close()
                moveTo(14f, 7.6f)
                curveTo(14f, 7.269f, 14.269f, 7f, 14.6f, 7f)
                horizontalLineTo(15.4f)
                curveTo(15.731f, 7f, 16f, 7.269f, 16f, 7.6f)
                verticalLineTo(8.4f)
                curveTo(16f, 8.731f, 15.731f, 9f, 15.4f, 9f)
                horizontalLineTo(14.6f)
                curveTo(14.269f, 9f, 14f, 8.731f, 14f, 8.4f)
                verticalLineTo(7.6f)
                close()
                moveTo(17.6f, 7f)
                curveTo(17.269f, 7f, 17f, 7.269f, 17f, 7.6f)
                verticalLineTo(8.4f)
                curveTo(17f, 8.731f, 17.269f, 9f, 17.6f, 9f)
                horizontalLineTo(18.4f)
                curveTo(18.731f, 9f, 19f, 8.731f, 19f, 8.4f)
                verticalLineTo(7.6f)
                curveTo(19f, 7.269f, 18.731f, 7f, 18.4f, 7f)
                horizontalLineTo(17.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 17f)
                curveTo(8.224f, 17f, 8f, 17.224f, 8f, 17.5f)
                verticalLineTo(18.5f)
                curveTo(8f, 18.776f, 8.224f, 19f, 8.5f, 19f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 19f, 16f, 18.776f, 16f, 18.5f)
                verticalLineTo(17.5f)
                curveTo(16f, 17.224f, 15.776f, 17f, 15.5f, 17f)
                horizontalLineTo(8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 16.5f)
                curveTo(5f, 15.119f, 6.119f, 14f, 7.5f, 14f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 14f, 19f, 15.119f, 19f, 16.5f)
                verticalLineTo(19.5f)
                curveTo(19f, 20.881f, 17.881f, 22f, 16.5f, 22f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 22f, 5f, 20.881f, 5f, 19.5f)
                verticalLineTo(16.5f)
                close()
                moveTo(7.5f, 16f)
                curveTo(7.224f, 16f, 7f, 16.224f, 7f, 16.5f)
                verticalLineTo(19.5f)
                curveTo(7f, 19.776f, 7.224f, 20f, 7.5f, 20f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 20f, 17f, 19.776f, 17f, 19.5f)
                verticalLineTo(16.5f)
                curveTo(17f, 16.224f, 16.776f, 16f, 16.5f, 16f)
                horizontalLineTo(7.5f)
                close()
            }
        }.build()

        return faxmashine!!
    }

private var faxmashine: ImageVector? = null