package io.github.madmaximuus.persianSymbols.dollar.badge

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DollarBadge: ImageVector
    get() {
        if (dollarBadge != null) {
            return dollarBadge!!
        }
        dollarBadge = ImageVector.Builder(
            name = "dollar-badge-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 7.526f)
                curveTo(12.75f, 7.112f, 12.414f, 6.776f, 12f, 6.776f)
                curveTo(11.586f, 6.776f, 11.25f, 7.112f, 11.25f, 7.526f)
                verticalLineTo(7.65f)
                curveTo(10.038f, 7.927f, 9.013f, 8.859f, 9.013f, 10.158f)
                curveTo(9.013f, 11.719f, 10.493f, 12.75f, 12f, 12.75f)
                curveTo(12.964f, 12.75f, 13.487f, 13.368f, 13.487f, 13.842f)
                curveTo(13.487f, 14.315f, 12.965f, 14.932f, 12.004f, 14.934f)
                lineTo(12f, 14.934f)
                lineTo(11.996f, 14.934f)
                curveTo(11.301f, 14.933f, 10.792f, 14.583f, 10.604f, 14.212f)
                curveTo(10.417f, 13.842f, 9.965f, 13.694f, 9.596f, 13.882f)
                curveTo(9.226f, 14.069f, 9.078f, 14.52f, 9.266f, 14.89f)
                curveTo(9.645f, 15.638f, 10.389f, 16.159f, 11.25f, 16.351f)
                verticalLineTo(16.473f)
                curveTo(11.25f, 16.888f, 11.586f, 17.223f, 12f, 17.223f)
                curveTo(12.414f, 17.223f, 12.75f, 16.888f, 12.75f, 16.473f)
                verticalLineTo(16.349f)
                curveTo(13.962f, 16.073f, 14.987f, 15.141f, 14.987f, 13.842f)
                curveTo(14.987f, 12.281f, 13.507f, 11.25f, 12f, 11.25f)
                curveTo(11.036f, 11.25f, 10.513f, 10.631f, 10.513f, 10.158f)
                curveTo(10.513f, 9.685f, 11.033f, 9.069f, 11.993f, 9.066f)
                lineTo(12f, 9.066f)
                lineTo(12.007f, 9.066f)
                curveTo(12.71f, 9.068f, 13.22f, 9.425f, 13.403f, 9.8f)
                curveTo(13.584f, 10.173f, 14.033f, 10.327f, 14.405f, 10.146f)
                curveTo(14.778f, 9.964f, 14.932f, 9.515f, 14.751f, 9.143f)
                curveTo(14.377f, 8.377f, 13.624f, 7.844f, 12.75f, 7.648f)
                verticalLineTo(7.526f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.888f, 3.65f)
                curveTo(12.891f, 2.501f, 11.108f, 2.501f, 10.112f, 3.65f)
                lineTo(9.709f, 4.114f)
                curveTo(9.588f, 4.254f, 9.399f, 4.315f, 9.218f, 4.274f)
                lineTo(8.62f, 4.135f)
                curveTo(7.138f, 3.791f, 5.696f, 4.839f, 5.564f, 6.355f)
                lineTo(5.511f, 6.967f)
                curveTo(5.495f, 7.151f, 5.379f, 7.312f, 5.208f, 7.384f)
                lineTo(4.642f, 7.624f)
                curveTo(3.242f, 8.217f, 2.691f, 9.912f, 3.475f, 11.215f)
                lineTo(3.792f, 11.742f)
                curveTo(3.888f, 11.901f, 3.888f, 12.099f, 3.792f, 12.258f)
                lineTo(3.475f, 12.784f)
                curveTo(2.691f, 14.087f, 3.242f, 15.783f, 4.642f, 16.376f)
                lineTo(5.208f, 16.615f)
                curveTo(5.379f, 16.688f, 5.495f, 16.848f, 5.511f, 17.033f)
                lineTo(5.564f, 17.645f)
                curveTo(5.696f, 19.16f, 7.138f, 20.208f, 8.62f, 19.865f)
                lineTo(9.218f, 19.726f)
                curveTo(9.399f, 19.684f, 9.588f, 19.746f, 9.709f, 19.885f)
                lineTo(10.112f, 20.35f)
                curveTo(11.108f, 21.498f, 12.891f, 21.498f, 13.888f, 20.35f)
                lineTo(14.291f, 19.885f)
                curveTo(14.412f, 19.746f, 14.601f, 19.684f, 14.781f, 19.726f)
                lineTo(15.38f, 19.865f)
                curveTo(16.862f, 20.208f, 18.304f, 19.16f, 18.435f, 17.645f)
                lineTo(18.488f, 17.033f)
                curveTo(18.504f, 16.848f, 18.621f, 16.688f, 18.792f, 16.615f)
                lineTo(19.357f, 16.376f)
                curveTo(20.758f, 15.783f, 21.309f, 14.087f, 20.524f, 12.784f)
                lineTo(20.208f, 12.258f)
                curveTo(20.112f, 12.099f, 20.112f, 11.901f, 20.208f, 11.742f)
                lineTo(20.524f, 11.215f)
                curveTo(21.309f, 9.913f, 20.758f, 8.217f, 19.357f, 7.624f)
                lineTo(18.792f, 7.384f)
                curveTo(18.621f, 7.312f, 18.504f, 7.151f, 18.488f, 6.967f)
                lineTo(18.435f, 6.355f)
                curveTo(18.304f, 4.839f, 16.862f, 3.791f, 15.38f, 4.135f)
                lineTo(14.781f, 4.274f)
                curveTo(14.601f, 4.315f, 14.412f, 4.254f, 14.291f, 4.114f)
                lineTo(13.888f, 3.65f)
                close()
                moveTo(11.622f, 4.961f)
                curveTo(11.822f, 4.731f, 12.178f, 4.731f, 12.378f, 4.961f)
                lineTo(12.78f, 5.425f)
                curveTo(13.387f, 6.124f, 14.331f, 6.431f, 15.233f, 6.222f)
                lineTo(15.832f, 6.083f)
                curveTo(16.128f, 6.015f, 16.417f, 6.224f, 16.443f, 6.527f)
                lineTo(16.496f, 7.139f)
                curveTo(16.576f, 8.062f, 17.159f, 8.865f, 18.012f, 9.226f)
                lineTo(18.578f, 9.465f)
                curveTo(18.858f, 9.584f, 18.968f, 9.923f, 18.811f, 10.184f)
                lineTo(18.494f, 10.71f)
                curveTo(18.016f, 11.504f, 18.016f, 12.496f, 18.494f, 13.289f)
                lineTo(18.811f, 13.816f)
                curveTo(18.968f, 14.076f, 18.858f, 14.415f, 18.578f, 14.534f)
                lineTo(18.012f, 14.774f)
                curveTo(17.159f, 15.135f, 16.576f, 15.938f, 16.496f, 16.86f)
                lineTo(16.443f, 17.472f)
                curveTo(16.417f, 17.775f, 16.128f, 17.985f, 15.832f, 17.916f)
                lineTo(15.233f, 17.778f)
                curveTo(14.331f, 17.569f, 13.387f, 17.875f, 12.78f, 18.575f)
                lineTo(12.378f, 19.039f)
                curveTo(12.178f, 19.268f, 11.822f, 19.268f, 11.622f, 19.039f)
                lineTo(11.219f, 18.575f)
                curveTo(10.613f, 17.875f, 9.669f, 17.569f, 8.767f, 17.778f)
                lineTo(8.168f, 17.916f)
                curveTo(7.872f, 17.985f, 7.583f, 17.775f, 7.557f, 17.472f)
                lineTo(7.504f, 16.86f)
                curveTo(7.424f, 15.938f, 6.841f, 15.135f, 5.988f, 14.774f)
                lineTo(5.422f, 14.534f)
                curveTo(5.142f, 14.415f, 5.032f, 14.076f, 5.189f, 13.816f)
                lineTo(5.506f, 13.289f)
                curveTo(5.983f, 12.496f, 5.983f, 11.504f, 5.506f, 10.71f)
                lineTo(5.189f, 10.184f)
                curveTo(5.032f, 9.923f, 5.142f, 9.584f, 5.422f, 9.465f)
                lineTo(5.988f, 9.226f)
                curveTo(6.841f, 8.865f, 7.424f, 8.062f, 7.504f, 7.139f)
                lineTo(7.557f, 6.527f)
                curveTo(7.583f, 6.224f, 7.872f, 6.015f, 8.168f, 6.083f)
                lineTo(8.767f, 6.222f)
                curveTo(9.669f, 6.431f, 10.613f, 6.124f, 11.219f, 5.425f)
                lineTo(11.622f, 4.961f)
                close()
            }
        }.build()

        return dollarBadge!!
    }

private var dollarBadge: ImageVector? = null
