package io.github.madmaximuus.persianSymbols.podcasts

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Podcasts: ImageVector
    get() {
        if (podcasts != null) {
            return podcasts!!
        }
        podcasts = Builder(
            name = "podcasts-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 14.207f, 19.108f, 16.204f, 17.662f, 17.652f)
                curveTo(17.271f, 18.043f, 17.272f, 18.676f, 17.663f, 19.066f)
                curveTo(18.054f, 19.456f, 18.687f, 19.456f, 19.077f, 19.065f)
                curveTo(20.882f, 17.257f, 22f, 14.758f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 14.758f, 3.118f, 17.257f, 4.923f, 19.065f)
                curveTo(5.313f, 19.456f, 5.946f, 19.456f, 6.337f, 19.066f)
                curveTo(6.728f, 18.676f, 6.729f, 18.043f, 6.338f, 17.652f)
                curveTo(4.892f, 16.204f, 4f, 14.207f, 4f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8f)
                curveTo(9.791f, 8f, 8f, 9.791f, 8f, 12f)
                curveTo(8f, 13.09f, 8.435f, 14.077f, 9.143f, 14.8f)
                curveTo(9.53f, 15.194f, 9.524f, 15.828f, 9.129f, 16.214f)
                curveTo(8.735f, 16.601f, 8.102f, 16.594f, 7.715f, 16.2f)
                curveTo(6.655f, 15.119f, 6f, 13.635f, 6f, 12f)
                curveTo(6f, 8.686f, 8.686f, 6f, 12f, 6f)
                curveTo(15.314f, 6f, 18f, 8.686f, 18f, 12f)
                curveTo(18f, 13.635f, 17.345f, 15.119f, 16.285f, 16.2f)
                curveTo(15.898f, 16.594f, 15.265f, 16.601f, 14.871f, 16.214f)
                curveTo(14.476f, 15.828f, 14.47f, 15.194f, 14.857f, 14.8f)
                curveTo(15.565f, 14.077f, 16f, 13.09f, 16f, 12f)
                curveTo(16f, 9.791f, 14.209f, 8f, 12f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 13.732f)
                curveTo(13.598f, 13.387f, 14f, 12.74f, 14f, 12f)
                curveTo(14f, 10.895f, 13.105f, 10f, 12f, 10f)
                curveTo(10.895f, 10f, 10f, 10.895f, 10f, 12f)
                curveTo(10f, 12.74f, 10.402f, 13.387f, 11f, 13.732f)
                verticalLineTo(21f)
                curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
                curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
                verticalLineTo(13.732f)
                close()
            }
        }.build()
        return podcasts!!
    }

private var podcasts: ImageVector? = null