package io.github.madmaximuus.persianSymbols.message.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessagePen: ImageVector
    get() {
        if (messagePen != null) {
            return messagePen!!
        }
        messagePen = ImageVector.Builder(
            name = "message-pen-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.6f, 3f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 3f, 2f, 5.017f, 2f, 7.506f)
                verticalLineTo(19.975f)
                curveTo(2f, 20.684f, 2.687f, 21.179f, 3.339f, 20.939f)
                lineTo(6.981f, 19.596f)
                curveTo(7.361f, 19.456f, 7.762f, 19.384f, 8.166f, 19.384f)
                horizontalLineTo(12.833f)
                lineTo(13.359f, 18.107f)
                curveTo(13.485f, 17.801f, 13.67f, 17.524f, 13.903f, 17.291f)
                lineTo(18.358f, 12.836f)
                curveTo(19.139f, 12.055f, 20.405f, 12.055f, 21.186f, 12.836f)
                lineTo(22f, 13.649f)
                verticalLineTo(7.506f)
                curveTo(22f, 5.017f, 20.03f, 3f, 17.6f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.888f, 13.366f)
                curveTo(19.376f, 12.878f, 20.168f, 12.878f, 20.656f, 13.366f)
                lineTo(21.717f, 14.427f)
                curveTo(22.205f, 14.915f, 22.205f, 15.706f, 21.717f, 16.194f)
                lineTo(17.262f, 20.649f)
                curveTo(17.098f, 20.813f, 16.904f, 20.942f, 16.691f, 21.03f)
                lineTo(14.314f, 22.009f)
                curveTo(13.533f, 22.33f, 12.753f, 21.549f, 13.074f, 20.768f)
                lineTo(14.053f, 18.392f)
                curveTo(14.141f, 18.178f, 14.27f, 17.984f, 14.434f, 17.821f)
                lineTo(18.888f, 13.366f)
                close()
                moveTo(19.772f, 14.604f)
                lineTo(19.255f, 15.12f)
                lineTo(19.962f, 15.827f)
                lineTo(20.479f, 15.311f)
                lineTo(19.772f, 14.604f)
                close()
                moveTo(15.494f, 18.882f)
                lineTo(18.485f, 15.891f)
                lineTo(19.192f, 16.598f)
                lineTo(16.201f, 19.589f)
                curveTo(16.178f, 19.612f, 16.15f, 19.631f, 16.12f, 19.643f)
                lineTo(14.964f, 20.119f)
                lineTo(15.44f, 18.963f)
                curveTo(15.452f, 18.933f, 15.471f, 18.905f, 15.494f, 18.882f)
                close()
            }
        }.build()

        return messagePen!!
    }

private var messagePen: ImageVector? = null