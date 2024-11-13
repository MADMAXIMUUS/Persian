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
                moveTo(16.764f, 3.476f)
                curveTo(17.9f, 3.476f, 18.939f, 4.118f, 19.447f, 5.134f)
                lineTo(21.683f, 9.606f)
                curveTo(21.892f, 10.023f, 22f, 10.482f, 22f, 10.948f)
                verticalLineTo(12.476f)
                curveTo(22f, 14.133f, 20.657f, 15.476f, 19f, 15.476f)
                horizontalLineTo(14.181f)
                lineTo(14.73f, 18.772f)
                curveTo(14.97f, 20.212f, 13.222f, 21.111f, 12.19f, 20.08f)
                lineTo(7.586f, 15.476f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 15.476f, 2f, 14.356f, 2f, 12.976f)
                verticalLineTo(5.976f)
                curveTo(2f, 4.595f, 3.119f, 3.476f, 4.5f, 3.476f)
                horizontalLineTo(16.764f)
                close()
                moveTo(12.208f, 15.804f)
                lineTo(12.501f, 17.562f)
                lineTo(8.75f, 13.811f)
                verticalLineTo(5.476f)
                horizontalLineTo(16.764f)
                curveTo(17.143f, 5.476f, 17.489f, 5.69f, 17.658f, 6.029f)
                lineTo(19.894f, 10.501f)
                curveTo(19.964f, 10.639f, 20f, 10.793f, 20f, 10.948f)
                verticalLineTo(12.476f)
                curveTo(20f, 13.028f, 19.552f, 13.476f, 19f, 13.476f)
                horizontalLineTo(14.181f)
                curveTo(12.945f, 13.476f, 12.005f, 14.585f, 12.208f, 15.804f)
                close()
                moveTo(7.25f, 5.476f)
                verticalLineTo(13.476f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 13.476f, 4f, 13.252f, 4f, 12.976f)
                verticalLineTo(5.976f)
                curveTo(4f, 5.7f, 4.224f, 5.476f, 4.5f, 5.476f)
                horizontalLineTo(7.25f)
                close()
            }
        }.build()
        return thumbDown!!
    }

private var thumbDown: ImageVector? = null