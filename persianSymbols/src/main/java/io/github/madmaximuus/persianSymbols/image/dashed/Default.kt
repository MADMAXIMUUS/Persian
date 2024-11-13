package io.github.madmaximuus.persianSymbols.image.dashed

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ImageDashed: ImageVector
    get() {
        if (imageDashed != null) {
            return imageDashed!!
        }
        imageDashed = Builder(
            name = "image-dashed-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.999f, 7.5f)
                curveTo(2.999f, 5.015f, 5.014f, 3f, 7.499f, 3f)
                horizontalLineTo(10f)
                curveTo(10.552f, 3f, 11f, 3.448f, 11f, 4f)
                curveTo(11f, 4.552f, 10.552f, 5f, 10f, 5f)
                horizontalLineTo(7.499f)
                curveTo(6.118f, 5f, 4.999f, 6.119f, 4.999f, 7.5f)
                verticalLineTo(10f)
                curveTo(4.999f, 10.552f, 4.551f, 11f, 3.999f, 11f)
                curveTo(3.447f, 11f, 2.999f, 10.552f, 2.999f, 10f)
                verticalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 4f)
                curveTo(13f, 3.448f, 13.448f, 3f, 14f, 3f)
                horizontalLineTo(16.499f)
                curveTo(18.984f, 3f, 20.999f, 5.015f, 20.999f, 7.5f)
                verticalLineTo(10f)
                curveTo(20.999f, 10.552f, 20.551f, 11f, 19.999f, 11f)
                curveTo(19.447f, 11f, 18.999f, 10.552f, 18.999f, 10f)
                verticalLineTo(7.5f)
                curveTo(18.999f, 6.119f, 17.88f, 5f, 16.499f, 5f)
                horizontalLineTo(14f)
                curveTo(13.448f, 5f, 13f, 4.552f, 13f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 13f)
                curveTo(4.552f, 13f, 5f, 13.448f, 5f, 14f)
                lineTo(5f, 16.5f)
                curveTo(4.999f, 17.88f, 6.119f, 19f, 7.5f, 19f)
                horizontalLineTo(10f)
                curveTo(10.552f, 19f, 11f, 19.448f, 11f, 20f)
                curveTo(11f, 20.552f, 10.552f, 21f, 10f, 21f)
                horizontalLineTo(7.5f)
                curveTo(5.014f, 21f, 2.999f, 18.985f, 3f, 16.499f)
                lineTo(3f, 14f)
                curveTo(3f, 13.448f, 3.448f, 13f, 4f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.999f, 13f)
                curveTo(20.551f, 13f, 20.999f, 13.448f, 20.999f, 14f)
                verticalLineTo(16.5f)
                curveTo(20.999f, 18.985f, 18.984f, 21f, 16.499f, 21f)
                horizontalLineTo(14f)
                curveTo(13.448f, 21f, 13f, 20.552f, 13f, 20f)
                curveTo(13f, 19.448f, 13.448f, 19f, 14f, 19f)
                horizontalLineTo(16.499f)
                curveTo(17.88f, 19f, 18.999f, 17.881f, 18.999f, 16.5f)
                verticalLineTo(14f)
                curveTo(18.999f, 13.448f, 19.447f, 13f, 19.999f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.353f, 17f)
                horizontalLineTo(6.777f)
                curveTo(6.452f, 17f, 6.263f, 16.632f, 6.452f, 16.368f)
                lineTo(8.724f, 13.186f)
                curveTo(8.868f, 12.984f, 9.159f, 12.961f, 9.334f, 13.138f)
                lineTo(11.582f, 15.411f)
                curveTo(11.782f, 15.613f, 12.122f, 15.548f, 12.234f, 15.287f)
                lineTo(14.16f, 10.793f)
                curveTo(14.294f, 10.48f, 14.733f, 10.467f, 14.886f, 10.771f)
                lineTo(17.711f, 16.421f)
                curveTo(17.844f, 16.687f, 17.65f, 17f, 17.353f, 17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.75f, 9f)
                curveTo(8.44f, 9f, 9f, 8.44f, 9f, 7.75f)
                curveTo(9f, 7.06f, 8.44f, 6.5f, 7.75f, 6.5f)
                curveTo(7.06f, 6.5f, 6.5f, 7.06f, 6.5f, 7.75f)
                curveTo(6.5f, 8.44f, 7.06f, 9f, 7.75f, 9f)
                close()
            }
        }.build()
        return imageDashed!!
    }

private var imageDashed: ImageVector? = null