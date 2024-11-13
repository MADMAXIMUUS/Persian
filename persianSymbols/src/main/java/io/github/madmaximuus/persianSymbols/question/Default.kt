package io.github.madmaximuus.persianSymbols.question

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Question: ImageVector
    get() {
        if (question != null) {
            return question!!
        }
        question = Builder(
            name = "question-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 9f)
                curveTo(7.5f, 6.515f, 9.515f, 4.5f, 12f, 4.5f)
                curveTo(14.485f, 4.5f, 16.5f, 6.515f, 16.5f, 9f)
                curveTo(16.5f, 10.28f, 15.543f, 11.28f, 14.247f, 12.035f)
                curveTo(13.627f, 12.396f, 12.999f, 12.657f, 12.521f, 12.829f)
                curveTo(12.284f, 12.914f, 12.087f, 12.976f, 11.953f, 13.016f)
                curveTo(11.886f, 13.036f, 11.834f, 13.05f, 11.801f, 13.059f)
                lineTo(11.765f, 13.068f)
                lineTo(11.759f, 13.07f)
                lineTo(11.758f, 13.07f)
                curveTo(11.313f, 13.181f, 11f, 13.582f, 11f, 14.041f)
                verticalLineTo(17.027f)
                curveTo(11f, 17.579f, 11.448f, 18.027f, 12f, 18.027f)
                curveTo(12.552f, 18.027f, 13f, 17.579f, 13f, 17.027f)
                verticalLineTo(14.78f)
                curveTo(13.063f, 14.759f, 13.129f, 14.736f, 13.198f, 14.711f)
                curveTo(13.751f, 14.512f, 14.498f, 14.203f, 15.253f, 13.763f)
                curveTo(16.707f, 12.917f, 18.5f, 11.397f, 18.5f, 9f)
                curveTo(18.5f, 5.41f, 15.59f, 2.5f, 12f, 2.5f)
                curveTo(8.41f, 2.5f, 5.5f, 5.41f, 5.5f, 9f)
                curveTo(5.5f, 9.552f, 5.948f, 10f, 6.5f, 10f)
                curveTo(7.052f, 10f, 7.5f, 9.552f, 7.5f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.5f)
                curveTo(12.69f, 21.5f, 13.25f, 20.94f, 13.25f, 20.25f)
                curveTo(13.25f, 19.56f, 12.69f, 19f, 12f, 19f)
                curveTo(11.31f, 19f, 10.75f, 19.56f, 10.75f, 20.25f)
                curveTo(10.75f, 20.94f, 11.31f, 21.5f, 12f, 21.5f)
                close()
            }
        }.build()
        return question!!
    }

private var question: ImageVector? = null