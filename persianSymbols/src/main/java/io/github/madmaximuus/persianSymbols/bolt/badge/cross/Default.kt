package io.github.madmaximuus.persianSymbols.bolt.badge.cross

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BoltBadgeCross: ImageVector
    get() {
        if (boltBadgeCross != null) {
            return boltBadgeCross!!
        }
        boltBadgeCross = ImageVector.Builder(
            name = "bolt-badge-cross-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.317f, 2.073f)
                curveTo(14.759f, 2.235f, 15.028f, 2.684f, 14.963f, 3.15f)
                lineTo(14.149f, 9f)
                horizontalLineTo(17f)
                curveTo(17.365f, 9f, 17.701f, 9.199f, 17.877f, 9.519f)
                curveTo(18.052f, 9.839f, 18.039f, 10.23f, 17.843f, 10.538f)
                lineTo(16.451f, 12.721f)
                curveTo(14.167f, 13.39f, 12.5f, 15.5f, 12.5f, 18f)
                curveTo(12.5f, 18.279f, 12.521f, 18.553f, 12.561f, 18.82f)
                lineTo(10.82f, 21.549f)
                curveTo(10.567f, 21.947f, 10.07f, 22.114f, 9.628f, 21.949f)
                curveTo(9.186f, 21.785f, 8.919f, 21.334f, 8.987f, 20.868f)
                lineTo(9.844f, 15f)
                horizontalLineTo(7f)
                curveTo(6.635f, 15f, 6.299f, 14.801f, 6.124f, 14.482f)
                curveTo(5.948f, 14.162f, 5.96f, 13.772f, 6.156f, 13.464f)
                lineTo(13.128f, 2.476f)
                curveTo(13.38f, 2.079f, 13.875f, 1.911f, 14.317f, 2.073f)
                close()
                moveTo(8.819f, 13f)
                horizontalLineTo(11f)
                curveTo(11.29f, 13f, 11.566f, 13.126f, 11.756f, 13.346f)
                curveTo(11.946f, 13.566f, 12.031f, 13.857f, 11.99f, 14.144f)
                lineTo(11.639f, 16.546f)
                lineTo(15.176f, 11f)
                horizontalLineTo(13f)
                curveTo(12.711f, 11f, 12.436f, 10.875f, 12.246f, 10.656f)
                curveTo(12.056f, 10.438f, 11.97f, 10.149f, 12.009f, 9.862f)
                lineTo(12.347f, 7.441f)
                lineTo(8.819f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.47f, 16.409f)
                curveTo(17.177f, 16.116f, 16.702f, 16.116f, 16.409f, 16.409f)
                curveTo(16.116f, 16.702f, 16.116f, 17.177f, 16.409f, 17.47f)
                lineTo(16.939f, 18f)
                lineTo(16.409f, 18.531f)
                curveTo(16.116f, 18.823f, 16.116f, 19.298f, 16.409f, 19.591f)
                curveTo(16.702f, 19.884f, 17.177f, 19.884f, 17.47f, 19.591f)
                lineTo(18f, 19.061f)
                lineTo(18.53f, 19.591f)
                curveTo(18.823f, 19.884f, 19.298f, 19.884f, 19.591f, 19.591f)
                curveTo(19.884f, 19.298f, 19.884f, 18.823f, 19.591f, 18.53f)
                lineTo(19.061f, 18f)
                lineTo(19.591f, 17.47f)
                curveTo(19.884f, 17.177f, 19.884f, 16.702f, 19.591f, 16.409f)
                curveTo(19.298f, 16.116f, 18.823f, 16.116f, 18.53f, 16.409f)
                lineTo(18f, 16.94f)
                lineTo(17.47f, 16.409f)
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

        return boltBadgeCross!!
    }

private var boltBadgeCross: ImageVector? = null
