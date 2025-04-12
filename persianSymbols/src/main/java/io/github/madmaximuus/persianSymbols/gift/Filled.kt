package io.github.madmaximuus.persianSymbols.gift

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Gift: ImageVector
    get() {
        if (gift != null) {
            return gift!!
        }
        gift = ImageVector.Builder(
            name = "gift-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.5f, 4f)
                curveTo(17.328f, 4f, 18f, 4.672f, 18f, 5.5f)
                curveTo(18f, 6.328f, 17.328f, 7f, 16.5f, 7f)
                horizontalLineTo(13.294f)
                curveTo(13.318f, 6.951f, 13.344f, 6.902f, 13.372f, 6.851f)
                curveTo(13.628f, 6.377f, 13.995f, 5.884f, 14.417f, 5.434f)
                curveTo(14.839f, 4.984f, 15.291f, 4.604f, 15.7f, 4.344f)
                curveTo(16.14f, 4.065f, 16.412f, 4f, 16.5f, 4f)
                close()
                moveTo(20f, 5.5f)
                curveTo(20f, 6.037f, 19.879f, 6.545f, 19.663f, 7f)
                horizontalLineTo(20.5f)
                curveTo(21.328f, 7f, 22f, 7.672f, 22f, 8.5f)
                verticalLineTo(9.5f)
                curveTo(22f, 10.328f, 21.328f, 11f, 20.5f, 11f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 11f, 2f, 10.328f, 2f, 9.5f)
                verticalLineTo(8.5f)
                curveTo(2f, 7.672f, 2.672f, 7f, 3.5f, 7f)
                horizontalLineTo(4.337f)
                curveTo(4.121f, 6.545f, 4f, 6.037f, 4f, 5.5f)
                curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
                curveTo(8.162f, 2f, 8.828f, 2.31f, 9.372f, 2.656f)
                curveTo(9.947f, 3.021f, 10.526f, 3.516f, 11.042f, 4.066f)
                curveTo(11.387f, 4.435f, 11.715f, 4.839f, 12f, 5.262f)
                curveTo(12.285f, 4.839f, 12.613f, 4.435f, 12.958f, 4.066f)
                curveTo(13.474f, 3.516f, 14.053f, 3.021f, 14.628f, 2.656f)
                curveTo(15.172f, 2.31f, 15.838f, 2f, 16.5f, 2f)
                curveTo(18.433f, 2f, 20f, 3.567f, 20f, 5.5f)
                close()
                moveTo(10.706f, 7f)
                curveTo(10.682f, 6.951f, 10.656f, 6.902f, 10.628f, 6.851f)
                curveTo(10.372f, 6.377f, 10.005f, 5.884f, 9.583f, 5.434f)
                curveTo(9.161f, 4.984f, 8.709f, 4.604f, 8.3f, 4.344f)
                curveTo(7.86f, 4.065f, 7.588f, 4f, 7.5f, 4f)
                curveTo(6.672f, 4f, 6f, 4.672f, 6f, 5.5f)
                curveTo(6f, 6.328f, 6.672f, 7f, 7.5f, 7f)
                horizontalLineTo(10.706f)
                close()
                moveTo(4f, 12.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(22f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22f, 4f, 20.03f, 4f, 17.6f)
                verticalLineTo(12.5f)
                close()
                moveTo(15.6f, 22f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(20f)
                verticalLineTo(17.6f)
                curveTo(20f, 20.03f, 18.03f, 22f, 15.6f, 22f)
                close()
            }
        }.build()

        return gift!!
    }

private var gift: ImageVector? = null
