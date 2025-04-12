package io.github.madmaximuus.persianSymbols.mic.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MicSlash: ImageVector
    get() {
        if (micSlash != null) {
            return micSlash!!
        }
        micSlash = Builder(
            name = "mic-slash-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.316f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.097f, 21.317f, 22.097f, 21.707f, 21.707f)
                curveTo(22.098f, 21.316f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
                moveTo(8f, 5f)
                curveTo(8f, 3.343f, 9.343f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(14.657f, 2f, 16f, 3.343f, 16f, 5f)
                verticalLineTo(11f)
                curveTo(16f, 11.707f, 15.755f, 12.358f, 15.346f, 12.871f)
                lineTo(13.904f, 11.429f)
                curveTo(13.965f, 11.299f, 14f, 11.153f, 14f, 11f)
                verticalLineTo(5f)
                curveTo(14f, 4.448f, 13.552f, 4f, 13f, 4f)
                horizontalLineTo(11f)
                curveTo(10.448f, 4f, 10f, 4.448f, 10f, 5f)
                verticalLineTo(7.525f)
                lineTo(8f, 5.525f)
                verticalLineTo(5f)
                close()
                moveTo(8f, 10.475f)
                lineTo(11.525f, 14f)
                horizontalLineTo(11f)
                curveTo(9.343f, 14f, 8f, 12.657f, 8f, 11f)
                verticalLineTo(10.475f)
                close()
                moveTo(14.5f, 16.975f)
                lineTo(12.525f, 15f)
                horizontalLineTo(12f)
                horizontalLineTo(10f)
                curveTo(8.343f, 15f, 7f, 13.657f, 7f, 12f)
                curveTo(7f, 11.448f, 6.552f, 11f, 6f, 11f)
                curveTo(5.448f, 11f, 5f, 11.448f, 5f, 12f)
                curveTo(5f, 14.761f, 7.239f, 17f, 10f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                curveTo(7.448f, 20f, 7f, 20.448f, 7f, 21f)
                curveTo(7f, 21.552f, 7.448f, 22f, 8f, 22f)
                horizontalLineTo(12f)
                horizontalLineTo(16f)
                curveTo(16.552f, 22f, 17f, 21.552f, 17f, 21f)
                curveTo(17f, 20.448f, 16.552f, 20f, 16f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                curveTo(14.169f, 17f, 14.336f, 16.992f, 14.5f, 16.975f)
                close()
                moveTo(16.346f, 13.871f)
                lineTo(17.765f, 15.29f)
                curveTo(18.534f, 14.411f, 19f, 13.26f, 19f, 12f)
                curveTo(19f, 11.448f, 18.552f, 11f, 18f, 11f)
                curveTo(17.448f, 11f, 17f, 11.448f, 17f, 12f)
                curveTo(17f, 12.707f, 16.755f, 13.358f, 16.346f, 13.871f)
                close()
            }
        }.build()
        return micSlash!!
    }

private var micSlash: ImageVector? = null