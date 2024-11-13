package io.github.madmaximuus.persianSymbols.sigmal.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.SignalExclamation: ImageVector
    get() {
        if (signalExclamation != null) {
            return signalExclamation!!
        }
        signalExclamation = Builder(
            name = "signal-exclamation-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 3f)
                curveTo(21f, 2.448f, 20.552f, 2f, 20f, 2f)
                curveTo(19.448f, 2f, 19f, 2.448f, 19f, 3f)
                verticalLineTo(12.083f)
                curveTo(19.718f, 12.203f, 20.393f, 12.451f, 21f, 12.803f)
                verticalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 7f)
                verticalLineTo(12.083f)
                curveTo(16.282f, 12.203f, 15.607f, 12.451f, 15f, 12.803f)
                verticalLineTo(7f)
                curveTo(15f, 6.448f, 15.448f, 6f, 16f, 6f)
                curveTo(16.552f, 6f, 17f, 6.448f, 17f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 11f)
                verticalLineTo(14.682f)
                curveTo(12.368f, 15.632f, 12f, 16.773f, 12f, 18f)
                curveTo(12f, 19.204f, 12.354f, 20.325f, 12.965f, 21.264f)
                curveTo(12.849f, 21.688f, 12.461f, 22f, 12f, 22f)
                curveTo(11.448f, 22f, 11f, 21.552f, 11f, 21f)
                verticalLineTo(11f)
                curveTo(11f, 10.448f, 11.448f, 10f, 12f, 10f)
                curveTo(12.552f, 10f, 13f, 10.448f, 13f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 14f)
                curveTo(8.552f, 14f, 9f, 14.448f, 9f, 15f)
                verticalLineTo(21f)
                curveTo(9f, 21.552f, 8.552f, 22f, 8f, 22f)
                curveTo(7.448f, 22f, 7f, 21.552f, 7f, 21f)
                verticalLineTo(15f)
                curveTo(7f, 14.448f, 7.448f, 14f, 8f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 18f)
                curveTo(4.552f, 18f, 5f, 18.448f, 5f, 19f)
                verticalLineTo(21f)
                curveTo(5f, 21.552f, 4.552f, 22f, 4f, 22f)
                curveTo(3.448f, 22f, 3f, 21.552f, 3f, 21f)
                verticalLineTo(19f)
                curveTo(3f, 18.448f, 3.448f, 18f, 4f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.75f, 16.25f)
                curveTo(18.75f, 15.836f, 18.414f, 15.5f, 18f, 15.5f)
                curveTo(17.586f, 15.5f, 17.25f, 15.836f, 17.25f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(17.25f, 18.164f, 17.586f, 18.5f, 18f, 18.5f)
                curveTo(18.414f, 18.5f, 18.75f, 18.164f, 18.75f, 17.75f)
                verticalLineTo(16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 20.5f)
                curveTo(18.414f, 20.5f, 18.75f, 20.164f, 18.75f, 19.75f)
                curveTo(18.75f, 19.336f, 18.414f, 19f, 18f, 19f)
                curveTo(17.586f, 19f, 17.25f, 19.336f, 17.25f, 19.75f)
                curveTo(17.25f, 20.164f, 17.586f, 20.5f, 18f, 20.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()
        return signalExclamation!!
    }

private var signalExclamation: ImageVector? = null