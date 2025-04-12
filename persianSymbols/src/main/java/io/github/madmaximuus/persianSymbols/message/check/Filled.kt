package io.github.madmaximuus.persianSymbols.message.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessageCheck: ImageVector
    get() {
        if (messageCheck != null) {
            return messageCheck!!
        }
        messageCheck = ImageVector.Builder(
            name = "message-check-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 4f, 22f, 6.017f, 22f, 8.506f)
                verticalLineTo(15.878f)
                curveTo(22f, 18.367f, 20.03f, 20.384f, 17.6f, 20.384f)
                horizontalLineTo(8.166f)
                curveTo(7.762f, 20.384f, 7.361f, 20.456f, 6.981f, 20.596f)
                lineTo(3.339f, 21.939f)
                curveTo(2.687f, 22.179f, 2f, 21.684f, 2f, 20.975f)
                verticalLineTo(8.506f)
                curveTo(2f, 6.017f, 3.97f, 4f, 6.4f, 4f)
                close()
                moveTo(17.027f, 8.468f)
                curveTo(17.322f, 8.759f, 17.322f, 9.232f, 17.027f, 9.523f)
                lineTo(11.111f, 15.386f)
                curveTo(10.95f, 15.546f, 10.733f, 15.618f, 10.521f, 15.602f)
                curveTo(10.31f, 15.619f, 10.092f, 15.547f, 9.93f, 15.386f)
                lineTo(6.972f, 12.455f)
                curveTo(6.678f, 12.163f, 6.678f, 11.691f, 6.972f, 11.399f)
                curveTo(7.266f, 11.107f, 7.743f, 11.107f, 8.037f, 11.399f)
                lineTo(10.521f, 13.86f)
                lineTo(15.962f, 8.468f)
                curveTo(16.256f, 8.176f, 16.733f, 8.176f, 17.027f, 8.468f)
                close()
            }
        }.build()

        return messageCheck!!
    }

private var messageCheck: ImageVector? = null