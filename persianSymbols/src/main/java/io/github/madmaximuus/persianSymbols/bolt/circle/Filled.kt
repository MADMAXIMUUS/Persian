package io.github.madmaximuus.persianSymbols.bolt.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BoltCircle: ImageVector
    get() {
        if (boltCircle != null) {
            return boltCircle!!
        }
        boltCircle = Builder(
            name = "bolt-circle-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(12.862f, 6.517f)
                lineTo(8.705f, 13.069f)
                curveTo(8.616f, 13.209f, 8.716f, 13.392f, 8.882f, 13.392f)
                horizontalLineTo(11.057f)
                curveTo(11.185f, 13.392f, 11.283f, 13.505f, 11.265f, 13.632f)
                lineTo(10.725f, 17.332f)
                curveTo(10.693f, 17.556f, 10.988f, 17.666f, 11.11f, 17.475f)
                lineTo(15.294f, 10.915f)
                curveTo(15.383f, 10.775f, 15.283f, 10.592f, 15.117f, 10.592f)
                horizontalLineTo(12.941f)
                curveTo(12.814f, 10.592f, 12.716f, 10.479f, 12.733f, 10.353f)
                lineTo(13.247f, 6.659f)
                curveTo(13.278f, 6.435f, 12.983f, 6.327f, 12.862f, 6.517f)
                close()
            }
        }.build()
        return boltCircle!!
    }

private var boltCircle: ImageVector? = null