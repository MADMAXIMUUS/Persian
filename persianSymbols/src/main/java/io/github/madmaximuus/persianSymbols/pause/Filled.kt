package io.github.madmaximuus.persianSymbols.pause

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Pause: ImageVector
    get() {
        if (pause != null) {
            return pause!!
        }
        pause = Builder(
            name = "pause-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 18f)
                verticalLineTo(5.996f)
                curveTo(10f, 5.444f, 9.552f, 4.996f, 9f, 4.996f)
                horizontalLineTo(7.99f)
                curveTo(7.437f, 4.996f, 6.99f, 5.444f, 6.99f, 5.996f)
                verticalLineTo(18f)
                curveTo(6.99f, 18.552f, 7.437f, 19f, 7.99f, 19f)
                horizontalLineTo(9f)
                curveTo(9.552f, 19f, 10f, 18.552f, 10f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 18f)
                verticalLineTo(5.996f)
                curveTo(14f, 5.444f, 14.448f, 4.996f, 15f, 4.996f)
                horizontalLineTo(15.96f)
                curveTo(16.512f, 4.996f, 16.96f, 5.444f, 16.96f, 5.996f)
                verticalLineTo(18f)
                curveTo(16.96f, 18.552f, 16.512f, 19f, 15.96f, 19f)
                horizontalLineTo(15f)
                curveTo(14.448f, 19f, 14f, 18.552f, 14f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 18f)
                verticalLineTo(5.996f)
                curveTo(10f, 5.444f, 9.552f, 4.996f, 9f, 4.996f)
                horizontalLineTo(7.99f)
                curveTo(7.437f, 4.996f, 6.99f, 5.444f, 6.99f, 5.996f)
                verticalLineTo(18f)
                curveTo(6.99f, 18.552f, 7.437f, 19f, 7.99f, 19f)
                horizontalLineTo(9f)
                curveTo(9.552f, 19f, 10f, 18.552f, 10f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18f)
                verticalLineTo(5.996f)
                curveTo(14f, 5.444f, 14.448f, 4.996f, 15f, 4.996f)
                horizontalLineTo(15.96f)
                curveTo(16.512f, 4.996f, 16.96f, 5.444f, 16.96f, 5.996f)
                verticalLineTo(18f)
                curveTo(16.96f, 18.552f, 16.512f, 19f, 15.96f, 19f)
                horizontalLineTo(15f)
                curveTo(14.448f, 19f, 14f, 18.552f, 14f, 18f)
                close()
            }
        }.build()
        return pause!!
    }

private var pause: ImageVector? = null