package io.github.madmaximuus.persianSymbols.pallete

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Palette: ImageVector
    get() {
        if (palette != null) {
            return palette!!
        }
        palette = Builder(
            name = "palette-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 6.75f)
                curveTo(15f, 7.44f, 14.44f, 8f, 13.75f, 8f)
                curveTo(13.06f, 8f, 12.5f, 7.44f, 12.5f, 6.75f)
                curveTo(12.5f, 6.06f, 13.06f, 5.5f, 13.75f, 5.5f)
                curveTo(14.44f, 5.5f, 15f, 6.06f, 15f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.75f, 9f)
                curveTo(9.44f, 9f, 10f, 8.44f, 10f, 7.75f)
                curveTo(10f, 7.06f, 9.44f, 6.5f, 8.75f, 6.5f)
                curveTo(8.06f, 6.5f, 7.5f, 7.06f, 7.5f, 7.75f)
                curveTo(7.5f, 8.44f, 8.06f, 9f, 8.75f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 12.75f)
                curveTo(8f, 13.44f, 7.44f, 14f, 6.75f, 14f)
                curveTo(6.06f, 14f, 5.5f, 13.44f, 5.5f, 12.75f)
                curveTo(5.5f, 12.06f, 6.06f, 11.5f, 6.75f, 11.5f)
                curveTo(7.44f, 11.5f, 8f, 12.06f, 8f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.75f, 11.5f)
                curveTo(17.44f, 11.5f, 18f, 10.94f, 18f, 10.25f)
                curveTo(18f, 9.56f, 17.44f, 9f, 16.75f, 9f)
                curveTo(16.06f, 9f, 15.5f, 9.56f, 15.5f, 10.25f)
                curveTo(15.5f, 10.94f, 16.06f, 11.5f, 16.75f, 11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.988f, 5.791f)
                curveTo(5.524f, 3.658f, 8.074f, 2f, 12f, 2f)
                curveTo(15.926f, 2f, 18.476f, 3.658f, 20.011f, 5.791f)
                curveTo(21.51f, 7.872f, 22f, 10.34f, 22f, 12f)
                curveTo(22f, 12.662f, 21.842f, 13.254f, 21.51f, 13.753f)
                curveTo(21.181f, 14.247f, 20.729f, 14.576f, 20.259f, 14.801f)
                curveTo(19.37f, 15.226f, 18.249f, 15.343f, 17.35f, 15.432f)
                lineTo(17.235f, 15.444f)
                curveTo(16.289f, 15.538f, 15.558f, 15.611f, 15.034f, 15.815f)
                curveTo(14.786f, 15.911f, 14.667f, 16.009f, 14.608f, 16.084f)
                curveTo(14.571f, 16.131f, 14.526f, 16.208f, 14.508f, 16.358f)
                curveTo(14.516f, 16.37f, 14.526f, 16.384f, 14.536f, 16.399f)
                curveTo(14.641f, 16.545f, 14.796f, 16.728f, 15.006f, 16.97f)
                lineTo(15.08f, 17.056f)
                curveTo(15.452f, 17.483f, 15.971f, 18.08f, 16.269f, 18.678f)
                curveTo(16.433f, 19.006f, 16.59f, 19.442f, 16.547f, 19.927f)
                curveTo(16.5f, 20.466f, 16.221f, 20.92f, 15.779f, 21.244f)
                curveTo(15.374f, 21.541f, 14.849f, 21.72f, 14.259f, 21.83f)
                curveTo(13.657f, 21.944f, 12.911f, 22f, 12f, 22f)
                curveTo(8.074f, 22f, 5.524f, 20.342f, 3.988f, 18.209f)
                curveTo(2.49f, 16.128f, 2f, 13.66f, 2f, 12f)
                curveTo(2f, 10.34f, 2.49f, 7.872f, 3.988f, 5.791f)
                close()
                moveTo(5.612f, 6.959f)
                curveTo(4.41f, 8.628f, 4f, 10.66f, 4f, 12f)
                curveTo(4f, 13.34f, 4.41f, 15.372f, 5.612f, 17.041f)
                curveTo(6.776f, 18.658f, 8.726f, 20f, 12f, 20f)
                curveTo(12.839f, 20f, 13.452f, 19.947f, 13.889f, 19.865f)
                curveTo(14.231f, 19.801f, 14.425f, 19.726f, 14.526f, 19.673f)
                curveTo(14.515f, 19.646f, 14.501f, 19.613f, 14.481f, 19.572f)
                curveTo(14.3f, 19.211f, 13.933f, 18.787f, 13.494f, 18.28f)
                curveTo(13.298f, 18.053f, 13.078f, 17.798f, 12.909f, 17.562f)
                curveTo(12.823f, 17.442f, 12.731f, 17.301f, 12.658f, 17.147f)
                curveTo(12.59f, 17.005f, 12.5f, 16.776f, 12.5f, 16.5f)
                curveTo(12.5f, 15.872f, 12.673f, 15.309f, 13.036f, 14.848f)
                curveTo(13.387f, 14.401f, 13.855f, 14.128f, 14.309f, 13.951f)
                curveTo(15.101f, 13.643f, 16.099f, 13.545f, 16.933f, 13.464f)
                curveTo(17.007f, 13.457f, 17.079f, 13.45f, 17.15f, 13.443f)
                curveTo(18.126f, 13.345f, 18.88f, 13.243f, 19.397f, 12.996f)
                curveTo(19.631f, 12.884f, 19.765f, 12.765f, 19.846f, 12.644f)
                curveTo(19.923f, 12.527f, 20f, 12.338f, 20f, 12f)
                curveTo(20f, 10.66f, 19.59f, 8.628f, 18.389f, 6.959f)
                curveTo(17.224f, 5.342f, 15.274f, 4f, 12f, 4f)
                curveTo(8.726f, 4f, 6.776f, 5.342f, 5.612f, 6.959f)
                close()
                moveTo(14.462f, 16.284f)
                curveTo(14.46f, 16.279f, 14.461f, 16.28f, 14.463f, 16.286f)
                lineTo(14.462f, 16.284f)
                close()
            }
        }.build()
        return palette!!
    }

private var palette: ImageVector? = null