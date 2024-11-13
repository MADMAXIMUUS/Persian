package io.github.madmaximuus.persianSymbols.tag

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Tag: ImageVector
    get() {
        if (tag != null) {
            return tag!!
        }
        tag = Builder(
            name = "tag-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(3f, 8.5f)
                lineTo(3f, 15.5f)
                curveTo(3f, 17.433f, 4.567f, 19f, 6.5f, 19f)
                lineTo(14.547f, 19f)
                curveTo(14.835f, 19f, 15.109f, 18.876f, 15.299f, 18.659f)
                lineTo(20.435f, 12.803f)
                curveTo(20.76f, 12.432f, 20.766f, 11.879f, 20.449f, 11.501f)
                lineTo(15.3f, 5.358f)
                curveTo(15.11f, 5.131f, 14.829f, 5f, 14.533f, 5f)
                lineTo(6.5f, 5f)
                curveTo(4.567f, 5f, 3f, 6.567f, 3f, 8.5f)
                close()
            }
        }.build()
        return tag!!
    }

private var tag: ImageVector? = null