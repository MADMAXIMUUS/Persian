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
                moveTo(16.764f, 19.524f)
                curveTo(17.9f, 19.524f, 18.939f, 18.882f, 19.447f, 17.866f)
                lineTo(21.683f, 13.394f)
                curveTo(21.892f, 12.977f, 22f, 12.518f, 22f, 12.052f)
                verticalLineTo(10.524f)
                curveTo(22f, 8.867f, 20.657f, 7.524f, 19f, 7.524f)
                horizontalLineTo(14.181f)
                lineTo(14.73f, 4.228f)
                curveTo(14.97f, 2.788f, 13.222f, 1.888f, 12.19f, 2.92f)
                lineTo(7.586f, 7.524f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 7.524f, 2f, 8.643f, 2f, 10.024f)
                verticalLineTo(17.024f)
                curveTo(2f, 18.405f, 3.119f, 19.524f, 4.5f, 19.524f)
                horizontalLineTo(16.764f)
                close()
                moveTo(12.208f, 7.195f)
                lineTo(12.501f, 5.438f)
                lineTo(8.75f, 9.188f)
                verticalLineTo(17.524f)
                horizontalLineTo(16.764f)
                curveTo(17.143f, 17.524f, 17.489f, 17.31f, 17.658f, 16.971f)
                lineTo(19.894f, 12.499f)
                curveTo(19.964f, 12.36f, 20f, 12.207f, 20f, 12.052f)
                verticalLineTo(10.524f)
                curveTo(20f, 9.972f, 19.552f, 9.524f, 19f, 9.524f)
                horizontalLineTo(14.181f)
                curveTo(12.945f, 9.524f, 12.005f, 8.414f, 12.208f, 7.195f)
                close()
                moveTo(7.25f, 17.524f)
                verticalLineTo(9.524f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 9.524f, 4f, 9.748f, 4f, 10.024f)
                verticalLineTo(17.024f)
                curveTo(4f, 17.3f, 4.224f, 17.524f, 4.5f, 17.524f)
                horizontalLineTo(7.25f)
                close()
            }
        }.build()
        return thumbUp!!
    }

private var thumbUp: ImageVector? = null