package io.github.madmaximuus.persianSymbols.fire

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Fire: ImageVector
    get() {
        if (fire != null) {
            return fire!!
        }
        fire = ImageVector.Builder(
            name = "fire-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.929f, 20.695f)
                curveTo(7.017f, 20.18f, 4f, 16.882f, 4f, 12.89f)
                curveTo(4f, 9.17f, 5.176f, 5.996f, 10.035f, 3.296f)
                curveTo(10.399f, 3.094f, 10.857f, 3.473f, 10.857f, 3.89f)
                curveTo(10.857f, 5.754f, 12.392f, 7.265f, 14.286f, 7.265f)
                curveTo(15.023f, 7.265f, 15.706f, 7.036f, 16.265f, 6.646f)
                curveTo(16.453f, 6.515f, 16.705f, 6.495f, 16.887f, 6.634f)
                curveTo(18.781f, 8.076f, 20f, 10.352f, 20f, 12.89f)
                curveTo(20f, 16.882f, 16.983f, 20.18f, 13.071f, 20.695f)
                curveTo(14.62f, 20.234f, 15.75f, 18.799f, 15.75f, 17.1f)
                curveTo(15.75f, 16.489f, 15.484f, 15.862f, 15.185f, 15.33f)
                curveTo(14.874f, 14.778f, 14.47f, 14.231f, 14.081f, 13.754f)
                curveTo(13.689f, 13.275f, 13.3f, 12.853f, 13.009f, 12.55f)
                curveTo(12.864f, 12.399f, 12.742f, 12.277f, 12.656f, 12.192f)
                curveTo(12.613f, 12.149f, 12.579f, 12.116f, 12.555f, 12.093f)
                lineTo(12.527f, 12.066f)
                lineTo(12.519f, 12.059f)
                lineTo(12.516f, 12.056f)
                curveTo(12.516f, 12.056f, 12.516f, 12.056f, 12f, 12.6f)
                lineTo(12.516f, 12.056f)
                curveTo(12.227f, 11.782f, 11.773f, 11.782f, 11.484f, 12.056f)
                lineTo(12f, 12.6f)
                curveTo(11.484f, 12.056f, 11.484f, 12.056f, 11.484f, 12.056f)
                lineTo(11.481f, 12.059f)
                lineTo(11.473f, 12.066f)
                lineTo(11.445f, 12.093f)
                curveTo(11.421f, 12.116f, 11.387f, 12.149f, 11.344f, 12.192f)
                curveTo(11.258f, 12.277f, 11.136f, 12.399f, 10.991f, 12.55f)
                curveTo(10.7f, 12.853f, 10.311f, 13.275f, 9.919f, 13.754f)
                curveTo(9.53f, 14.231f, 9.126f, 14.778f, 8.815f, 15.33f)
                curveTo(8.516f, 15.862f, 8.25f, 16.489f, 8.25f, 17.1f)
                curveTo(8.25f, 18.799f, 9.38f, 20.234f, 10.929f, 20.695f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.081f, 14.703f)
                curveTo(11.409f, 14.302f, 11.738f, 13.941f, 12f, 13.665f)
                curveTo(12.262f, 13.941f, 12.591f, 14.302f, 12.919f, 14.703f)
                curveTo(13.28f, 15.145f, 13.626f, 15.619f, 13.878f, 16.066f)
                curveTo(14.141f, 16.534f, 14.25f, 16.883f, 14.25f, 17.1f)
                curveTo(14.25f, 18.343f, 13.243f, 19.35f, 12f, 19.35f)
                curveTo(10.757f, 19.35f, 9.75f, 18.343f, 9.75f, 17.1f)
                curveTo(9.75f, 16.883f, 9.859f, 16.534f, 10.122f, 16.066f)
                curveTo(10.374f, 15.619f, 10.72f, 15.145f, 11.081f, 14.703f)
                close()
            }
        }.build()

        return fire!!
    }

private var fire: ImageVector? = null