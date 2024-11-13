package io.github.madmaximuus.persianSymbols.heart

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Heart: ImageVector
    get() {
        if (heart != null) {
            return heart!!
        }
        heart = ImageVector.Builder(
            name = "heart-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.008f, 3.984f)
                curveTo(14.462f, 2.166f, 17.942f, 2.366f, 20.167f, 4.59f)
                curveTo(22.586f, 7.01f, 22.611f, 10.916f, 20.247f, 13.37f)
                curveTo(20.215f, 13.415f, 20.179f, 13.457f, 20.139f, 13.497f)
                lineTo(12.684f, 20.953f)
                curveTo(12.496f, 21.14f, 12.242f, 21.246f, 11.977f, 21.246f)
                curveTo(11.711f, 21.246f, 11.457f, 21.14f, 11.269f, 20.953f)
                lineTo(3.845f, 13.529f)
                curveTo(3.769f, 13.452f, 3.706f, 13.365f, 3.659f, 13.271f)
                curveTo(1.387f, 10.812f, 1.448f, 6.975f, 3.837f, 4.586f)
                curveTo(6.065f, 2.359f, 9.554f, 2.167f, 12.008f, 3.984f)
                close()
                moveTo(5.471f, 12.326f)
                curveTo(5.423f, 12.234f, 5.36f, 12.148f, 5.284f, 12.074f)
                lineTo(5.248f, 12.038f)
                curveTo(3.582f, 10.373f, 3.583f, 7.67f, 5.252f, 6.001f)
                curveTo(6.918f, 4.335f, 9.632f, 4.34f, 11.301f, 6.008f)
                curveTo(11.691f, 6.399f, 12.324f, 6.399f, 12.715f, 6.008f)
                curveTo(14.384f, 4.339f, 17.087f, 4.339f, 18.752f, 6.005f)
                curveTo(20.418f, 7.67f, 20.417f, 10.373f, 18.748f, 12.042f)
                lineTo(18.722f, 12.068f)
                curveTo(18.682f, 12.108f, 18.645f, 12.151f, 18.612f, 12.196f)
                lineTo(11.977f, 18.832f)
                lineTo(5.471f, 12.326f)
                close()
            }
        }.build()
        return heart!!
    }

private var heart: ImageVector? = null