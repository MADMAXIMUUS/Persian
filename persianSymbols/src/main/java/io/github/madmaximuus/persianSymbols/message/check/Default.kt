package io.github.madmaximuus.persianSymbols.message.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MessageCheck: ImageVector
    get() {
        if (messageCheck != null) {
            return messageCheck!!
        }
        messageCheck = ImageVector.Builder(
            name = "message-check-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(21f)
                curveTo(2f, 21.332f, 2.165f, 21.642f, 2.439f, 21.828f)
                curveTo(2.714f, 22.014f, 3.063f, 22.052f, 3.371f, 21.928f)
                lineTo(7.746f, 20.179f)
                curveTo(8.041f, 20.061f, 8.356f, 20f, 8.674f, 20f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 20f, 22f, 17.985f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 6f, 20f, 7.119f, 20f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
                horizontalLineTo(8.674f)
                curveTo(8.102f, 18f, 7.534f, 18.109f, 7.003f, 18.322f)
                lineTo(4f, 19.523f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()

        return messageCheck!!
    }

private var messageCheck: ImageVector? = null