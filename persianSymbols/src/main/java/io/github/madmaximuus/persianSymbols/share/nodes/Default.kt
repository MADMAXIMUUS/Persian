package io.github.madmaximuus.persianSymbols.share.nodes

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.0f, 2.0f)
                curveTo(16.3431f, 2.0f, 15.0f, 3.3431f, 15.0f, 5.0f)
                curveTo(15.0f, 5.1449f, 15.0103f, 5.2875f, 15.0301f, 5.4269f)
                lineTo(8.037f, 9.7976f)
                curveTo(7.5021f, 9.3026f, 6.7864f, 9.0f, 6.0f, 9.0f)
                curveTo(4.3432f, 9.0f, 3.0f, 10.3431f, 3.0f, 12.0f)
                curveTo(3.0f, 13.6569f, 4.3432f, 15.0f, 6.0f, 15.0f)
                curveTo(6.7864f, 15.0f, 7.5021f, 14.6974f, 8.037f, 14.2024f)
                lineTo(15.0301f, 18.5731f)
                curveTo(15.0103f, 18.7125f, 15.0f, 18.8551f, 15.0f, 19.0f)
                curveTo(15.0f, 20.6569f, 16.3431f, 22.0f, 18.0f, 22.0f)
                curveTo(19.6569f, 22.0f, 21.0f, 20.6569f, 21.0f, 19.0f)
                curveTo(21.0f, 17.3431f, 19.6569f, 16.0f, 18.0f, 16.0f)
                curveTo(17.2136f, 16.0f, 16.4979f, 16.3026f, 15.963f, 16.7976f)
                lineTo(8.9699f, 12.4269f)
                curveTo(8.9897f, 12.2875f, 9.0f, 12.1449f, 9.0f, 12.0f)
                curveTo(9.0f, 11.8551f, 8.9897f, 11.7125f, 8.9699f, 11.5731f)
                lineTo(15.963f, 7.2024f)
                curveTo(16.4979f, 7.6975f, 17.2136f, 8.0f, 18.0f, 8.0f)
                curveTo(19.6569f, 8.0f, 21.0f, 6.6568f, 21.0f, 5.0f)
                curveTo(21.0f, 3.3431f, 19.6569f, 2.0f, 18.0f, 2.0f)
                close()
                moveTo(17.0f, 5.0f)
                curveTo(17.0f, 4.4477f, 17.4477f, 4.0f, 18.0f, 4.0f)
                curveTo(18.5523f, 4.0f, 19.0f, 4.4477f, 19.0f, 5.0f)
                curveTo(19.0f, 5.5523f, 18.5523f, 6.0f, 18.0f, 6.0f)
                curveTo(17.4477f, 6.0f, 17.0f, 5.5523f, 17.0f, 5.0f)
                close()
                moveTo(6.0f, 11.0f)
                curveTo(5.4477f, 11.0f, 5.0f, 11.4477f, 5.0f, 12.0f)
                curveTo(5.0f, 12.5523f, 5.4477f, 13.0f, 6.0f, 13.0f)
                curveTo(6.5523f, 13.0f, 7.0f, 12.5523f, 7.0f, 12.0f)
                curveTo(7.0f, 11.4477f, 6.5523f, 11.0f, 6.0f, 11.0f)
                close()
                moveTo(18.0f, 18.0f)
                curveTo(17.4477f, 18.0f, 17.0f, 18.4477f, 17.0f, 19.0f)
                curveTo(17.0f, 19.5523f, 17.4477f, 20.0f, 18.0f, 20.0f)
                curveTo(18.5523f, 20.0f, 19.0f, 19.5523f, 19.0f, 19.0f)
                curveTo(19.0f, 18.4477f, 18.5523f, 18.0f, 18.0f, 18.0f)
                close()
            }
        }.build()
        return shareNodes!!
    }

private var shareNodes: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ShareNodes,
                contentDescription = ""
            )
        }
    }
}