package io.github.madmaximuus.persianSymbols.gear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Gear: ImageVector
    get() {
        if (gear != null) {
            return gear!!
        }
        gear = ImageVector.Builder(
            name = "gear-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 8.25f)
                curveTo(9.929f, 8.25f, 8.25f, 9.929f, 8.25f, 12f)
                curveTo(8.25f, 14.071f, 9.929f, 15.75f, 12f, 15.75f)
                curveTo(14.071f, 15.75f, 15.75f, 14.071f, 15.75f, 12f)
                curveTo(15.75f, 9.929f, 14.071f, 8.25f, 12f, 8.25f)
                close()
                moveTo(9.75f, 12f)
                curveTo(9.75f, 10.757f, 10.757f, 9.75f, 12f, 9.75f)
                curveTo(13.243f, 9.75f, 14.25f, 10.757f, 14.25f, 12f)
                curveTo(14.25f, 13.243f, 13.243f, 14.25f, 12f, 14.25f)
                curveTo(10.757f, 14.25f, 9.75f, 13.243f, 9.75f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 2f)
                curveTo(9.395f, 2f, 8.5f, 2.895f, 8.5f, 4f)
                verticalLineTo(4.804f)
                curveTo(8.159f, 4.971f, 7.831f, 5.16f, 7.519f, 5.372f)
                lineTo(6.822f, 4.969f)
                curveTo(5.865f, 4.417f, 4.642f, 4.744f, 4.09f, 5.701f)
                lineTo(2.59f, 8.299f)
                curveTo(2.037f, 9.256f, 2.365f, 10.479f, 3.322f, 11.031f)
                lineTo(4.02f, 11.434f)
                curveTo(4.007f, 11.621f, 4f, 11.81f, 4f, 12f)
                curveTo(4f, 12.19f, 4.007f, 12.379f, 4.02f, 12.566f)
                lineTo(3.324f, 12.968f)
                curveTo(2.369f, 13.519f, 2.036f, 14.742f, 2.59f, 15.701f)
                lineTo(4.09f, 18.299f)
                curveTo(4.642f, 19.256f, 5.865f, 19.583f, 6.822f, 19.031f)
                lineTo(7.519f, 18.628f)
                curveTo(7.831f, 18.839f, 8.159f, 19.029f, 8.5f, 19.195f)
                verticalLineTo(20f)
                curveTo(8.5f, 21.104f, 9.395f, 22f, 10.5f, 22f)
                horizontalLineTo(13.5f)
                curveTo(14.605f, 22f, 15.5f, 21.104f, 15.5f, 20f)
                verticalLineTo(19.195f)
                curveTo(15.841f, 19.029f, 16.169f, 18.839f, 16.481f, 18.628f)
                lineTo(17.178f, 19.031f)
                curveTo(18.135f, 19.583f, 19.358f, 19.256f, 19.91f, 18.299f)
                lineTo(21.41f, 15.701f)
                curveTo(21.962f, 14.744f, 21.635f, 13.521f, 20.678f, 12.969f)
                lineTo(19.98f, 12.566f)
                curveTo(19.993f, 12.379f, 20f, 12.19f, 20f, 12f)
                curveTo(20f, 11.81f, 19.993f, 11.621f, 19.98f, 11.434f)
                lineTo(20.678f, 11.031f)
                curveTo(21.635f, 10.479f, 21.963f, 9.255f, 21.41f, 8.299f)
                lineTo(19.91f, 5.701f)
                curveTo(19.357f, 4.742f, 18.131f, 4.419f, 17.177f, 4.97f)
                lineTo(16.481f, 5.372f)
                curveTo(16.169f, 5.16f, 15.841f, 4.971f, 15.5f, 4.804f)
                verticalLineTo(4f)
                curveTo(15.5f, 2.895f, 14.605f, 2f, 13.5f, 2f)
                horizontalLineTo(10.5f)
                close()
                moveTo(10.5f, 4f)
                lineTo(13.5f, 4f)
                verticalLineTo(6.148f)
                lineTo(14.143f, 6.394f)
                curveTo(14.74f, 6.622f, 15.293f, 6.944f, 15.782f, 7.341f)
                lineTo(16.316f, 7.776f)
                lineTo(18.177f, 6.702f)
                lineTo(18.179f, 6.702f)
                lineTo(19.678f, 9.299f)
                lineTo(17.818f, 10.373f)
                lineTo(17.926f, 11.052f)
                curveTo(17.975f, 11.36f, 18f, 11.677f, 18f, 12f)
                curveTo(18f, 12.323f, 17.975f, 12.64f, 17.926f, 12.948f)
                lineTo(17.818f, 13.627f)
                lineTo(19.678f, 14.701f)
                lineTo(18.178f, 17.299f)
                lineTo(16.316f, 16.224f)
                lineTo(15.782f, 16.658f)
                curveTo(15.293f, 17.056f, 14.74f, 17.378f, 14.143f, 17.606f)
                lineTo(13.5f, 17.852f)
                verticalLineTo(20f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.852f)
                lineTo(9.857f, 17.606f)
                curveTo(9.26f, 17.378f, 8.707f, 17.056f, 8.218f, 16.658f)
                lineTo(7.684f, 16.224f)
                lineTo(5.822f, 17.299f)
                lineTo(4.322f, 14.702f)
                lineTo(4.323f, 14.7f)
                lineTo(6.182f, 13.627f)
                lineTo(6.074f, 12.948f)
                curveTo(6.025f, 12.64f, 6f, 12.323f, 6f, 12f)
                curveTo(6f, 11.677f, 6.025f, 11.36f, 6.074f, 11.052f)
                lineTo(6.182f, 10.373f)
                lineTo(4.322f, 9.299f)
                lineTo(5.822f, 6.701f)
                lineTo(7.684f, 7.776f)
                lineTo(8.218f, 7.341f)
                curveTo(8.707f, 6.944f, 9.26f, 6.622f, 9.857f, 6.394f)
                lineTo(10.5f, 6.148f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        return gear!!
    }

private var gear: ImageVector? = null