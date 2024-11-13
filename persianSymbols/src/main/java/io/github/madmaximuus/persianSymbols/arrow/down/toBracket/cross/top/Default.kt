package io.github.madmaximuus.persianSymbols.arrow.down.toBracket.cross.top

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowDownToBracketCrossTop: ImageVector
    get() {
        if (arrowDownToBracketCrossTop != null) {
            return arrowDownToBracketCrossTop!!
        }
        arrowDownToBracketCrossTop = Builder(
            name = "arrow-down-to-bracket-cross-top-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.47f, 4.409f)
                curveTo(17.177f, 4.116f, 16.702f, 4.116f, 16.409f, 4.409f)
                curveTo(16.116f, 4.702f, 16.116f, 5.177f, 16.409f, 5.47f)
                lineTo(16.939f, 6f)
                lineTo(16.409f, 6.53f)
                curveTo(16.116f, 6.823f, 16.116f, 7.298f, 16.409f, 7.591f)
                curveTo(16.702f, 7.884f, 17.177f, 7.884f, 17.47f, 7.591f)
                lineTo(18f, 7.061f)
                lineTo(18.53f, 7.591f)
                curveTo(18.823f, 7.884f, 19.298f, 7.884f, 19.591f, 7.591f)
                curveTo(19.884f, 7.298f, 19.884f, 6.823f, 19.591f, 6.53f)
                lineTo(19.061f, 6f)
                lineTo(19.591f, 5.47f)
                curveTo(19.884f, 5.177f, 19.884f, 4.702f, 19.591f, 4.409f)
                curveTo(19.298f, 4.116f, 18.823f, 4.116f, 18.53f, 4.409f)
                lineTo(18f, 4.939f)
                lineTo(17.47f, 4.409f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 6f)
                curveTo(13.25f, 3.377f, 15.377f, 1.25f, 18f, 1.25f)
                curveTo(20.623f, 1.25f, 22.75f, 3.377f, 22.75f, 6f)
                curveTo(22.75f, 8.623f, 20.623f, 10.75f, 18f, 10.75f)
                curveTo(15.377f, 10.75f, 13.25f, 8.623f, 13.25f, 6f)
                close()
                moveTo(18f, 2.75f)
                curveTo(16.205f, 2.75f, 14.75f, 4.205f, 14.75f, 6f)
                curveTo(14.75f, 7.795f, 16.205f, 9.25f, 18f, 9.25f)
                curveTo(19.795f, 9.25f, 21.25f, 7.795f, 21.25f, 6f)
                curveTo(21.25f, 4.205f, 19.795f, 2.75f, 18f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 4f)
                curveTo(12.114f, 4f, 12.222f, 4.019f, 12.323f, 4.053f)
                curveTo(12.114f, 4.664f, 12f, 5.318f, 12f, 6f)
                curveTo(12f, 7.227f, 12.368f, 8.369f, 13.001f, 9.319f)
                verticalLineTo(12.586f)
                lineTo(14.625f, 10.962f)
                curveTo(15.212f, 11.361f, 15.873f, 11.66f, 16.583f, 11.832f)
                lineTo(12.708f, 15.707f)
                curveTo(12.318f, 16.098f, 11.684f, 16.098f, 11.294f, 15.707f)
                lineTo(7.294f, 11.707f)
                curveTo(6.903f, 11.317f, 6.903f, 10.683f, 7.294f, 10.293f)
                curveTo(7.684f, 9.902f, 8.317f, 9.902f, 8.708f, 10.293f)
                lineTo(11.001f, 12.586f)
                verticalLineTo(5f)
                curveTo(11.001f, 4.448f, 11.449f, 4f, 12.001f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 15f)
                curveTo(4f, 14.448f, 3.552f, 14f, 3f, 14f)
                curveTo(2.448f, 14f, 2f, 14.448f, 2f, 15f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 20f, 22f, 18.03f, 22f, 15.6f)
                verticalLineTo(15f)
                curveTo(22f, 14.448f, 21.552f, 14f, 21f, 14f)
                curveTo(20.448f, 14f, 20f, 14.448f, 20f, 15f)
                verticalLineTo(15.6f)
                curveTo(20f, 16.926f, 18.925f, 18f, 17.6f, 18f)
                horizontalLineTo(6.4f)
                curveTo(5.074f, 18f, 4f, 16.926f, 4f, 15.6f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        return arrowDownToBracketCrossTop!!
    }

private var arrowDownToBracketCrossTop: ImageVector? = null
