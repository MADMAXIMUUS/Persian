package io.github.madmaximuus.persianSymbols.check.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CheckCircle: ImageVector
    get() {
        if (checkCircle != null) {
            return checkCircle!!
        }
        checkCircle = ImageVector.Builder(
            name = "check-circle-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.027f, 9.093f)
                curveTo(17.322f, 9.384f, 17.322f, 9.857f, 17.027f, 10.149f)
                lineTo(11.111f, 16.011f)
                curveTo(10.95f, 16.171f, 10.733f, 16.243f, 10.521f, 16.228f)
                curveTo(10.31f, 16.244f, 10.092f, 16.172f, 9.93f, 16.011f)
                lineTo(6.972f, 13.08f)
                curveTo(6.678f, 12.788f, 6.678f, 12.316f, 6.972f, 12.024f)
                curveTo(7.266f, 11.733f, 7.743f, 11.733f, 8.037f, 12.024f)
                lineTo(10.521f, 14.485f)
                lineTo(15.962f, 9.093f)
                curveTo(16.256f, 8.801f, 16.733f, 8.801f, 17.027f, 9.093f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
            }
        }.build()
        return checkCircle!!
    }

private var checkCircle: ImageVector? = null
