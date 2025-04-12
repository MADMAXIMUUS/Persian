package io.github.madmaximuus.persianSymbols.thumb.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ThumbDown: ImageVector
    get() {
        if (thumbDown != null) {
            return thumbDown!!
        }
        thumbDown = Builder(
            name = "thumb-down-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.764f, 4.476f)
                curveTo(17.9f, 4.476f, 18.939f, 5.118f, 19.447f, 6.134f)
                lineTo(21.683f, 10.606f)
                curveTo(21.892f, 11.023f, 22f, 11.482f, 22f, 11.948f)
                verticalLineTo(13.476f)
                curveTo(22f, 15.133f, 20.657f, 16.476f, 19f, 16.476f)
                horizontalLineTo(14.181f)
                lineTo(14.73f, 19.772f)
                curveTo(14.97f, 21.212f, 13.222f, 22.111f, 12.19f, 21.08f)
                lineTo(7.586f, 16.476f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 16.476f, 2f, 15.356f, 2f, 13.976f)
                verticalLineTo(6.976f)
                curveTo(2f, 5.595f, 3.119f, 4.476f, 4.5f, 4.476f)
                horizontalLineTo(16.764f)
                close()
                moveTo(12.208f, 16.805f)
                lineTo(12.501f, 18.562f)
                lineTo(8.75f, 14.812f)
                verticalLineTo(6.476f)
                horizontalLineTo(16.764f)
                curveTo(17.143f, 6.476f, 17.489f, 6.69f, 17.658f, 7.029f)
                lineTo(19.894f, 11.501f)
                curveTo(19.964f, 11.64f, 20f, 11.793f, 20f, 11.948f)
                verticalLineTo(13.476f)
                curveTo(20f, 14.028f, 19.552f, 14.476f, 19f, 14.476f)
                horizontalLineTo(14.181f)
                curveTo(12.945f, 14.476f, 12.005f, 15.586f, 12.208f, 16.805f)
                close()
                moveTo(7.25f, 6.476f)
                verticalLineTo(14.476f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 14.476f, 4f, 14.252f, 4f, 13.976f)
                verticalLineTo(6.976f)
                curveTo(4f, 6.7f, 4.224f, 6.476f, 4.5f, 6.476f)
                horizontalLineTo(7.25f)
                close()
            }
        }.build()
        return thumbDown!!
    }

private var thumbDown: ImageVector? = null