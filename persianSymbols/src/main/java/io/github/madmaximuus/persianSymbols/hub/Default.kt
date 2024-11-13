package io.github.madmaximuus.persianSymbols.hub

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Hub: ImageVector
    get() {
        if (hub != null) {
            return hub!!
        }
        hub = Builder(
            name = "hub-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 3f)
                curveTo(15f, 4.306f, 14.165f, 5.417f, 13f, 5.829f)
                verticalLineTo(7.6f)
                curveTo(14.369f, 7.878f, 15.535f, 8.715f, 16.249f, 9.863f)
                lineTo(18.008f, 9.277f)
                curveTo(18.122f, 7.724f, 19.418f, 6.5f, 21f, 6.5f)
                curveTo(22.657f, 6.5f, 24f, 7.843f, 24f, 9.5f)
                curveTo(24f, 11.157f, 22.657f, 12.5f, 21f, 12.5f)
                curveTo(19.978f, 12.5f, 19.076f, 11.989f, 18.534f, 11.209f)
                lineTo(16.943f, 11.74f)
                curveTo(16.98f, 11.988f, 17f, 12.242f, 17f, 12.5f)
                curveTo(17f, 13.775f, 16.522f, 14.939f, 15.737f, 15.822f)
                lineTo(17.063f, 17.149f)
                curveTo(17.358f, 17.052f, 17.673f, 17f, 18f, 17f)
                curveTo(19.657f, 17f, 21f, 18.343f, 21f, 20f)
                curveTo(21f, 21.657f, 19.657f, 23f, 18f, 23f)
                curveTo(16.343f, 23f, 15f, 21.657f, 15f, 20f)
                curveTo(15f, 19.406f, 15.173f, 18.851f, 15.471f, 18.385f)
                lineTo(14.117f, 17.031f)
                curveTo(13.474f, 17.332f, 12.757f, 17.5f, 12f, 17.5f)
                curveTo(11.243f, 17.5f, 10.526f, 17.332f, 9.883f, 17.031f)
                lineTo(8.529f, 18.385f)
                curveTo(8.827f, 18.851f, 9f, 19.406f, 9f, 20f)
                curveTo(9f, 21.657f, 7.657f, 23f, 6f, 23f)
                curveTo(4.343f, 23f, 3f, 21.657f, 3f, 20f)
                curveTo(3f, 18.343f, 4.343f, 17f, 6f, 17f)
                curveTo(6.327f, 17f, 6.642f, 17.052f, 6.937f, 17.149f)
                lineTo(8.263f, 15.822f)
                curveTo(7.477f, 14.939f, 7f, 13.775f, 7f, 12.5f)
                curveTo(7f, 12.242f, 7.02f, 11.988f, 7.057f, 11.74f)
                lineTo(5.466f, 11.209f)
                curveTo(4.924f, 11.989f, 4.022f, 12.5f, 3f, 12.5f)
                curveTo(1.343f, 12.5f, 0f, 11.157f, 0f, 9.5f)
                curveTo(0f, 7.843f, 1.343f, 6.5f, 3f, 6.5f)
                curveTo(4.582f, 6.5f, 5.877f, 7.724f, 5.992f, 9.277f)
                lineTo(7.751f, 9.863f)
                curveTo(8.465f, 8.715f, 9.631f, 7.878f, 11f, 7.6f)
                verticalLineTo(5.829f)
                curveTo(9.835f, 5.417f, 9f, 4.306f, 9f, 3f)
                curveTo(9f, 1.343f, 10.343f, 0f, 12f, 0f)
                curveTo(13.657f, 0f, 15f, 1.343f, 15f, 3f)
                close()
                moveTo(11f, 3f)
                curveTo(11f, 2.448f, 11.448f, 2f, 12f, 2f)
                curveTo(12.552f, 2f, 13f, 2.448f, 13f, 3f)
                curveTo(13f, 3.552f, 12.552f, 4f, 12f, 4f)
                curveTo(11.448f, 4f, 11f, 3.552f, 11f, 3f)
                close()
                moveTo(12f, 9.5f)
                curveTo(10.343f, 9.5f, 9f, 10.843f, 9f, 12.5f)
                curveTo(9f, 14.157f, 10.343f, 15.5f, 12f, 15.5f)
                curveTo(13.657f, 15.5f, 15f, 14.157f, 15f, 12.5f)
                curveTo(15f, 10.843f, 13.657f, 9.5f, 12f, 9.5f)
                close()
                moveTo(18f, 19f)
                curveTo(17.448f, 19f, 17f, 19.448f, 17f, 20f)
                curveTo(17f, 20.552f, 17.448f, 21f, 18f, 21f)
                curveTo(18.552f, 21f, 19f, 20.552f, 19f, 20f)
                curveTo(19f, 19.448f, 18.552f, 19f, 18f, 19f)
                close()
                moveTo(20f, 9.5f)
                curveTo(20f, 8.948f, 20.448f, 8.5f, 21f, 8.5f)
                curveTo(21.552f, 8.5f, 22f, 8.948f, 22f, 9.5f)
                curveTo(22f, 10.052f, 21.552f, 10.5f, 21f, 10.5f)
                curveTo(20.448f, 10.5f, 20f, 10.052f, 20f, 9.5f)
                close()
                moveTo(6f, 19f)
                curveTo(5.448f, 19f, 5f, 19.448f, 5f, 20f)
                curveTo(5f, 20.552f, 5.448f, 21f, 6f, 21f)
                curveTo(6.552f, 21f, 7f, 20.552f, 7f, 20f)
                curveTo(7f, 19.448f, 6.552f, 19f, 6f, 19f)
                close()
                moveTo(2f, 9.5f)
                curveTo(2f, 8.948f, 2.448f, 8.5f, 3f, 8.5f)
                curveTo(3.552f, 8.5f, 4f, 8.948f, 4f, 9.5f)
                curveTo(4f, 10.052f, 3.552f, 10.5f, 3f, 10.5f)
                curveTo(2.448f, 10.5f, 2f, 10.052f, 2f, 9.5f)
                close()
            }
        }.build()
        return hub!!
    }

private var hub: ImageVector? = null