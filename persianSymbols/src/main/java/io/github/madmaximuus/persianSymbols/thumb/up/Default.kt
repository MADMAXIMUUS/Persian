package io.github.madmaximuus.persianSymbols.thumb.up

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ThumbUp: ImageVector
    get() {
        if (thumbUp != null) {
            return thumbUp!!
        }
        thumbUp = Builder(
            name = "thumb-up-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.764f, 20.524f)
                curveTo(17.9f, 20.524f, 18.939f, 19.882f, 19.447f, 18.866f)
                lineTo(21.683f, 14.394f)
                curveTo(21.892f, 13.977f, 22f, 13.518f, 22f, 13.052f)
                verticalLineTo(11.524f)
                curveTo(22f, 9.867f, 20.657f, 8.524f, 19f, 8.524f)
                horizontalLineTo(14.181f)
                lineTo(14.73f, 5.228f)
                curveTo(14.97f, 3.788f, 13.222f, 2.889f, 12.19f, 3.92f)
                lineTo(7.586f, 8.524f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 8.524f, 2f, 9.644f, 2f, 11.024f)
                verticalLineTo(18.024f)
                curveTo(2f, 19.405f, 3.119f, 20.524f, 4.5f, 20.524f)
                horizontalLineTo(16.764f)
                close()
                moveTo(12.208f, 8.195f)
                lineTo(12.501f, 6.438f)
                lineTo(8.75f, 10.189f)
                verticalLineTo(18.524f)
                horizontalLineTo(16.764f)
                curveTo(17.143f, 18.524f, 17.489f, 18.31f, 17.658f, 17.972f)
                lineTo(19.894f, 13.499f)
                curveTo(19.964f, 13.361f, 20f, 13.207f, 20f, 13.052f)
                verticalLineTo(11.524f)
                curveTo(20f, 10.972f, 19.552f, 10.524f, 19f, 10.524f)
                horizontalLineTo(14.181f)
                curveTo(12.945f, 10.524f, 12.005f, 9.415f, 12.208f, 8.195f)
                close()
                moveTo(7.25f, 18.524f)
                verticalLineTo(10.524f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 10.524f, 4f, 10.748f, 4f, 11.024f)
                verticalLineTo(18.024f)
                curveTo(4f, 18.3f, 4.224f, 18.524f, 4.5f, 18.524f)
                horizontalLineTo(7.25f)
                close()
            }
        }.build()
        return thumbUp!!
    }

private var thumbUp: ImageVector? = null