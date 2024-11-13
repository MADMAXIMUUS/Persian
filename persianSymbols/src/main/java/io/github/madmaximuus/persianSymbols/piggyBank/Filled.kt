package io.github.madmaximuus.persianSymbols.piggyBank

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PiggyBank: ImageVector
    get() {
        if (piggyBank != null) {
            return piggyBank!!
        }
        piggyBank = Builder(
            name = "piggy-bank-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 9.763f)
                curveTo(2f, 4.818f, 5.704f, 3.957f, 7.556f, 4.144f)
                lineTo(12.627f, 4.144f)
                curveTo(12.933f, 4.144f, 13.219f, 4f, 13.425f, 3.774f)
                curveTo(15.585f, 1.387f, 18.085f, 1.923f, 17.556f, 2.459f)
                curveTo(17.24f, 2.778f, 17.093f, 4.059f, 17.034f, 4.776f)
                curveTo(17.008f, 5.086f, 17.14f, 5.386f, 17.378f, 5.586f)
                lineTo(20.054f, 7.842f)
                curveTo(20.234f, 7.994f, 20.463f, 8.077f, 20.698f, 8.077f)
                horizontalLineTo(21f)
                curveTo(21.552f, 8.077f, 22f, 8.525f, 22f, 9.077f)
                verticalLineTo(13.022f)
                curveTo(22f, 13.429f, 21.753f, 13.796f, 21.375f, 13.949f)
                lineTo(19.753f, 14.605f)
                curveTo(19.424f, 14.738f, 19.191f, 15.036f, 19.135f, 15.386f)
                curveTo(18.828f, 17.309f, 18.493f, 18.576f, 17.803f, 20.371f)
                curveTo(17.656f, 20.752f, 17.288f, 21f, 16.879f, 21f)
                horizontalLineTo(14.111f)
                curveTo(13.559f, 21f, 13.128f, 20.551f, 13.077f, 20.001f)
                curveTo(12.973f, 18.894f, 12.557f, 17.629f, 10.889f, 17.629f)
                curveTo(9.221f, 17.629f, 8.805f, 18.894f, 8.701f, 20.001f)
                curveTo(8.65f, 20.551f, 8.219f, 21f, 7.667f, 21f)
                horizontalLineTo(5.316f)
                curveTo(4.98f, 21f, 4.664f, 20.832f, 4.488f, 20.545f)
                curveTo(2.507f, 17.323f, 2f, 14.056f, 2f, 9.763f)
                close()
                moveTo(8.25f, 8f)
                curveTo(8.25f, 7.586f, 8.586f, 7.25f, 9f, 7.25f)
                horizontalLineTo(12f)
                curveTo(12.414f, 7.25f, 12.75f, 7.586f, 12.75f, 8f)
                curveTo(12.75f, 8.414f, 12.414f, 8.75f, 12f, 8.75f)
                horizontalLineTo(9f)
                curveTo(8.586f, 8.75f, 8.25f, 8.414f, 8.25f, 8f)
                close()
                moveTo(16.25f, 11.5f)
                curveTo(16.94f, 11.5f, 17.5f, 10.94f, 17.5f, 10.25f)
                curveTo(17.5f, 9.56f, 16.94f, 9f, 16.25f, 9f)
                curveTo(15.56f, 9f, 15f, 9.56f, 15f, 10.25f)
                curveTo(15f, 10.94f, 15.56f, 11.5f, 16.25f, 11.5f)
                close()
            }
        }.build()
        return piggyBank!!
    }

private var piggyBank: ImageVector? = null