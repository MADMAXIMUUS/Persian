package io.github.madmaximuus.persianSymbols.envelope.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EnvelopePen: ImageVector
    get() {
        if (envelopePen != null) {
            return envelopePen!!
        }
        envelopePen = Builder(
            name = "envelope-pen-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.114f, 5.536f)
                curveTo(2.42f, 6.328f, 2f, 7.365f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(11.677f)
                lineTo(12.077f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4f, 8.117f, 4.086f, 7.754f, 4.24f, 7.43f)
                lineTo(10.2f, 11.9f)
                curveTo(11.267f, 12.7f, 12.733f, 12.7f, 13.8f, 11.9f)
                lineTo(19.76f, 7.43f)
                curveTo(19.914f, 7.754f, 20f, 8.117f, 20f, 8.5f)
                verticalLineTo(11.826f)
                curveTo(20.284f, 11.958f, 20.55f, 12.141f, 20.785f, 12.375f)
                lineTo(22f, 13.591f)
                verticalLineTo(8.5f)
                curveTo(22f, 7.365f, 21.58f, 6.328f, 20.886f, 5.536f)
                curveTo(20.861f, 5.489f, 20.833f, 5.444f, 20.8f, 5.4f)
                curveTo(20.708f, 5.277f, 20.592f, 5.181f, 20.464f, 5.114f)
                curveTo(19.672f, 4.42f, 18.635f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                curveTo(5.365f, 4f, 4.328f, 4.42f, 3.536f, 5.114f)
                curveTo(3.408f, 5.181f, 3.293f, 5.277f, 3.2f, 5.4f)
                curveTo(3.167f, 5.444f, 3.139f, 5.489f, 3.114f, 5.536f)
                close()
                moveTo(18.201f, 6.1f)
                curveTo(17.978f, 6.035f, 17.743f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                curveTo(6.257f, 6f, 6.022f, 6.035f, 5.799f, 6.1f)
                lineTo(11.4f, 10.3f)
                curveTo(11.756f, 10.567f, 12.244f, 10.567f, 12.6f, 10.3f)
                lineTo(18.201f, 6.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.603f, 13.083f)
                curveTo(18.286f, 12.399f, 19.394f, 12.399f, 20.078f, 13.083f)
                lineTo(21.492f, 14.497f)
                curveTo(22.175f, 15.18f, 22.175f, 16.288f, 21.492f, 16.972f)
                lineTo(17.463f, 21f)
                curveTo(17.219f, 21.244f, 16.908f, 21.411f, 16.569f, 21.479f)
                lineTo(14.066f, 21.979f)
                curveTo(13.191f, 22.154f, 12.42f, 21.383f, 12.595f, 20.508f)
                lineTo(13.096f, 18.005f)
                curveTo(13.163f, 17.667f, 13.33f, 17.355f, 13.574f, 17.111f)
                lineTo(17.603f, 13.083f)
                close()
                moveTo(14.635f, 18.172f)
                lineTo(17.194f, 15.613f)
                lineTo(18.962f, 17.381f)
                lineTo(16.403f, 19.94f)
                curveTo(16.368f, 19.974f, 16.323f, 19.998f, 16.275f, 20.008f)
                lineTo(14.139f, 20.435f)
                lineTo(14.566f, 18.299f)
                curveTo(14.576f, 18.251f, 14.6f, 18.207f, 14.635f, 18.172f)
                close()
            }
        }.build()
        return envelopePen!!
    }

private var envelopePen: ImageVector? = null