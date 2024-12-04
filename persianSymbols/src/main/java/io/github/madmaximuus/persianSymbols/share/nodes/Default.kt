package io.github.madmaximuus.persianSymbols.share.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ShareNodes: ImageVector
    get() {
        if (shareNodes != null) {
            return shareNodes!!
        }
        shareNodes = Builder(
            name = "share-nodes-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 2f)
                curveTo(16.343f, 2f, 15f, 3.343f, 15f, 5f)
                curveTo(15f, 5.145f, 15.01f, 5.287f, 15.03f, 5.427f)
                lineTo(8.037f, 9.798f)
                curveTo(7.502f, 9.303f, 6.786f, 9f, 6f, 9f)
                curveTo(4.343f, 9f, 3f, 10.343f, 3f, 12f)
                curveTo(3f, 13.657f, 4.343f, 15f, 6f, 15f)
                curveTo(6.786f, 15f, 7.502f, 14.697f, 8.037f, 14.202f)
                lineTo(15.03f, 18.573f)
                curveTo(15.01f, 18.712f, 15f, 18.855f, 15f, 19f)
                curveTo(15f, 20.657f, 16.343f, 22f, 18f, 22f)
                curveTo(19.657f, 22f, 21f, 20.657f, 21f, 19f)
                curveTo(21f, 17.343f, 19.657f, 16f, 18f, 16f)
                curveTo(17.214f, 16f, 16.498f, 16.303f, 15.963f, 16.798f)
                lineTo(8.97f, 12.427f)
                curveTo(8.99f, 12.288f, 9f, 12.145f, 9f, 12f)
                curveTo(9f, 11.855f, 8.99f, 11.712f, 8.97f, 11.573f)
                lineTo(15.963f, 7.202f)
                curveTo(16.498f, 7.697f, 17.214f, 8f, 18f, 8f)
                curveTo(19.657f, 8f, 21f, 6.657f, 21f, 5f)
                curveTo(21f, 3.343f, 19.657f, 2f, 18f, 2f)
                close()
                moveTo(17f, 5f)
                curveTo(17f, 4.448f, 17.448f, 4f, 18f, 4f)
                curveTo(18.552f, 4f, 19f, 4.448f, 19f, 5f)
                curveTo(19f, 5.552f, 18.552f, 6f, 18f, 6f)
                curveTo(17.448f, 6f, 17f, 5.552f, 17f, 5f)
                close()
                moveTo(6f, 11f)
                curveTo(5.448f, 11f, 5f, 11.448f, 5f, 12f)
                curveTo(5f, 12.552f, 5.448f, 13f, 6f, 13f)
                curveTo(6.552f, 13f, 7f, 12.552f, 7f, 12f)
                curveTo(7f, 11.448f, 6.552f, 11f, 6f, 11f)
                close()
                moveTo(18f, 18f)
                curveTo(17.448f, 18f, 17f, 18.448f, 17f, 19f)
                curveTo(17f, 19.552f, 17.448f, 20f, 18f, 20f)
                curveTo(18.552f, 20f, 19f, 19.552f, 19f, 19f)
                curveTo(19f, 18.448f, 18.552f, 18f, 18f, 18f)
                close()
            }
        }.build()
        return shareNodes!!
    }

private var shareNodes: ImageVector? = null