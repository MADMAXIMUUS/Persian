package io.github.madmaximuus.persianSymbols.check.badge

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CheckBadge: ImageVector
    get() {
        if (checkBadge != null) {
            return checkBadge!!
        }
        checkBadge = Builder(
            name = "check-badge-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.78f, 10.28f)
                curveTo(16.073f, 9.987f, 16.073f, 9.512f, 15.78f, 9.22f)
                curveTo(15.487f, 8.927f, 15.012f, 8.927f, 14.72f, 9.22f)
                lineTo(10.75f, 13.189f)
                lineTo(9.28f, 11.72f)
                curveTo(8.987f, 11.427f, 8.513f, 11.427f, 8.22f, 11.72f)
                curveTo(7.927f, 12.012f, 7.927f, 12.487f, 8.22f, 12.78f)
                lineTo(10.22f, 14.78f)
                curveTo(10.512f, 15.073f, 10.987f, 15.073f, 11.28f, 14.78f)
                lineTo(15.78f, 10.28f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.888f, 3.65f)
                curveTo(12.891f, 2.501f, 11.108f, 2.501f, 10.112f, 3.65f)
                lineTo(9.709f, 4.114f)
                curveTo(9.588f, 4.254f, 9.399f, 4.315f, 9.218f, 4.273f)
                lineTo(8.62f, 4.135f)
                curveTo(7.138f, 3.791f, 5.696f, 4.839f, 5.564f, 6.354f)
                lineTo(5.511f, 6.967f)
                curveTo(5.495f, 7.151f, 5.379f, 7.312f, 5.208f, 7.384f)
                lineTo(4.642f, 7.624f)
                curveTo(3.242f, 8.217f, 2.691f, 9.912f, 3.475f, 11.215f)
                lineTo(3.792f, 11.742f)
                curveTo(3.888f, 11.9f, 3.888f, 12.099f, 3.792f, 12.257f)
                lineTo(3.475f, 12.784f)
                curveTo(2.691f, 14.087f, 3.242f, 15.783f, 4.642f, 16.376f)
                lineTo(5.208f, 16.615f)
                curveTo(5.379f, 16.687f, 5.495f, 16.848f, 5.511f, 17.032f)
                lineTo(5.564f, 17.645f)
                curveTo(5.696f, 19.16f, 7.138f, 20.208f, 8.62f, 19.865f)
                lineTo(9.218f, 19.726f)
                curveTo(9.399f, 19.684f, 9.588f, 19.745f, 9.709f, 19.885f)
                lineTo(10.112f, 20.349f)
                curveTo(11.108f, 21.498f, 12.891f, 21.498f, 13.888f, 20.349f)
                lineTo(14.291f, 19.885f)
                curveTo(14.412f, 19.745f, 14.601f, 19.684f, 14.781f, 19.726f)
                lineTo(15.38f, 19.865f)
                curveTo(16.862f, 20.208f, 18.304f, 19.16f, 18.435f, 17.645f)
                lineTo(18.488f, 17.032f)
                curveTo(18.504f, 16.848f, 18.621f, 16.687f, 18.792f, 16.615f)
                lineTo(19.357f, 16.376f)
                curveTo(20.758f, 15.783f, 21.309f, 14.087f, 20.524f, 12.784f)
                lineTo(20.208f, 12.257f)
                curveTo(20.112f, 12.099f, 20.112f, 11.9f, 20.208f, 11.742f)
                lineTo(20.524f, 11.215f)
                curveTo(21.309f, 9.912f, 20.758f, 8.217f, 19.357f, 7.624f)
                lineTo(18.792f, 7.384f)
                curveTo(18.621f, 7.312f, 18.504f, 7.151f, 18.488f, 6.967f)
                lineTo(18.435f, 6.354f)
                curveTo(18.304f, 4.839f, 16.862f, 3.791f, 15.38f, 4.135f)
                lineTo(14.781f, 4.273f)
                curveTo(14.601f, 4.315f, 14.412f, 4.254f, 14.291f, 4.114f)
                lineTo(13.888f, 3.65f)
                close()
                moveTo(11.622f, 4.961f)
                curveTo(11.822f, 4.731f, 12.178f, 4.731f, 12.378f, 4.961f)
                lineTo(12.78f, 5.425f)
                curveTo(13.387f, 6.124f, 14.331f, 6.431f, 15.233f, 6.222f)
                lineTo(15.832f, 6.083f)
                curveTo(16.128f, 6.014f, 16.417f, 6.224f, 16.443f, 6.527f)
                lineTo(16.496f, 7.139f)
                curveTo(16.576f, 8.062f, 17.159f, 8.865f, 18.012f, 9.226f)
                lineTo(18.578f, 9.465f)
                curveTo(18.858f, 9.584f, 18.968f, 9.923f, 18.811f, 10.184f)
                lineTo(18.494f, 10.71f)
                curveTo(18.016f, 11.503f, 18.016f, 12.496f, 18.494f, 13.289f)
                lineTo(18.811f, 13.816f)
                curveTo(18.968f, 14.076f, 18.858f, 14.415f, 18.578f, 14.534f)
                lineTo(18.012f, 14.774f)
                curveTo(17.159f, 15.134f, 16.576f, 15.937f, 16.496f, 16.86f)
                lineTo(16.443f, 17.472f)
                curveTo(16.417f, 17.775f, 16.128f, 17.985f, 15.832f, 17.916f)
                lineTo(15.233f, 17.777f)
                curveTo(14.331f, 17.568f, 13.387f, 17.875f, 12.78f, 18.574f)
                lineTo(12.378f, 19.038f)
                curveTo(12.178f, 19.268f, 11.822f, 19.268f, 11.622f, 19.038f)
                lineTo(11.219f, 18.574f)
                curveTo(10.613f, 17.875f, 9.669f, 17.568f, 8.767f, 17.777f)
                lineTo(8.168f, 17.916f)
                curveTo(7.872f, 17.985f, 7.583f, 17.775f, 7.557f, 17.472f)
                lineTo(7.504f, 16.86f)
                curveTo(7.424f, 15.937f, 6.841f, 15.134f, 5.988f, 14.774f)
                lineTo(5.422f, 14.534f)
                curveTo(5.142f, 14.415f, 5.032f, 14.076f, 5.189f, 13.816f)
                lineTo(5.506f, 13.289f)
                curveTo(5.983f, 12.496f, 5.983f, 11.503f, 5.506f, 10.71f)
                lineTo(5.189f, 10.184f)
                curveTo(5.032f, 9.923f, 5.142f, 9.584f, 5.422f, 9.465f)
                lineTo(5.988f, 9.226f)
                curveTo(6.841f, 8.865f, 7.424f, 8.062f, 7.504f, 7.139f)
                lineTo(7.557f, 6.527f)
                curveTo(7.583f, 6.224f, 7.872f, 6.014f, 8.168f, 6.083f)
                lineTo(8.767f, 6.222f)
                curveTo(9.669f, 6.431f, 10.613f, 6.124f, 11.219f, 5.425f)
                lineTo(11.622f, 4.961f)
                close()
            }
        }.build()
        return checkBadge!!
    }

private var checkBadge: ImageVector? = null