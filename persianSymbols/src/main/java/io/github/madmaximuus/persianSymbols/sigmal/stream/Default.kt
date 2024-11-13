package io.github.madmaximuus.persianSymbols.sigmal.stream

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.SignalStream: ImageVector
    get() {
        if (signalStream != null) {
            return signalStream!!
        }
        signalStream = Builder(
            name = "signal-stream-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4f)
                curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
                curveTo(4f, 14.207f, 4.892f, 16.203f, 6.337f, 17.651f)
                curveTo(6.728f, 18.042f, 6.727f, 18.675f, 6.336f, 19.065f)
                curveTo(5.945f, 19.455f, 5.312f, 19.455f, 4.922f, 19.064f)
                curveTo(3.117f, 17.256f, 2f, 14.757f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 14.757f, 20.882f, 17.256f, 19.078f, 19.064f)
                curveTo(18.688f, 19.455f, 18.055f, 19.455f, 17.664f, 19.065f)
                curveTo(17.273f, 18.675f, 17.272f, 18.042f, 17.663f, 17.651f)
                curveTo(19.108f, 16.203f, 20f, 14.207f, 20f, 12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8f)
                curveTo(9.791f, 8f, 8f, 9.791f, 8f, 12f)
                curveTo(8f, 13.108f, 8.449f, 14.109f, 9.178f, 14.835f)
                curveTo(9.569f, 15.224f, 9.57f, 15.857f, 9.181f, 16.249f)
                curveTo(8.791f, 16.64f, 8.158f, 16.641f, 7.766f, 16.252f)
                curveTo(6.676f, 15.166f, 6f, 13.661f, 6f, 12f)
                curveTo(6f, 8.686f, 8.686f, 6f, 12f, 6f)
                curveTo(15.314f, 6f, 18f, 8.686f, 18f, 12f)
                curveTo(18f, 13.661f, 17.324f, 15.166f, 16.233f, 16.252f)
                curveTo(15.842f, 16.641f, 15.209f, 16.64f, 14.819f, 16.249f)
                curveTo(14.43f, 15.857f, 14.431f, 15.224f, 14.822f, 14.835f)
                curveTo(15.551f, 14.109f, 16f, 13.108f, 16f, 12f)
                curveTo(16f, 9.791f, 14.209f, 8f, 12f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14f)
                curveTo(13.105f, 14f, 14f, 13.105f, 14f, 12f)
                curveTo(14f, 10.895f, 13.105f, 10f, 12f, 10f)
                curveTo(10.895f, 10f, 10f, 10.895f, 10f, 12f)
                curveTo(10f, 13.105f, 10.895f, 14f, 12f, 14f)
                close()
            }
        }.build()
        return signalStream!!
    }

private var signalStream: ImageVector? = null