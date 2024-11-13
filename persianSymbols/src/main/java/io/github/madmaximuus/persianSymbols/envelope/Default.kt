package io.github.madmaximuus.persianSymbols.envelope

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Envelope: ImageVector
    get() {
        if (envelope != null) {
            return envelope!!
        }
        envelope = Builder(
            name = "envelope-default",
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
                horizontalLineTo(17.5f)
                curveTo(19.985f, 20f, 22f, 17.985f, 22f, 15.5f)
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
                moveTo(4.24f, 7.43f)
                curveTo(4.086f, 7.754f, 4f, 8.117f, 4f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4f, 16.881f, 5.119f, 18f, 6.5f, 18f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 18f, 20f, 16.881f, 20f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(20f, 8.117f, 19.914f, 7.754f, 19.76f, 7.43f)
                lineTo(13.8f, 11.9f)
                curveTo(12.733f, 12.7f, 11.267f, 12.7f, 10.2f, 11.9f)
                lineTo(4.24f, 7.43f)
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
        }.build()
        return envelope!!
    }

private var envelope: ImageVector? = null