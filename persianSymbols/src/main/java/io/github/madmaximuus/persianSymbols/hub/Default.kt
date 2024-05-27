package io.github.madmaximuus.persianSymbols.hub

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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.0f, 3.0f)
                curveTo(15.0f, 4.3062f, 14.1652f, 5.4175f, 13.0f, 5.8293f)
                verticalLineTo(7.6f)
                curveTo(14.3691f, 7.8779f, 15.535f, 8.7152f, 16.2489f, 9.863f)
                lineTo(18.0082f, 9.2765f)
                curveTo(18.1225f, 7.724f, 19.4183f, 6.5f, 21.0f, 6.5f)
                curveTo(22.6569f, 6.5f, 24.0f, 7.8432f, 24.0f, 9.5f)
                curveTo(24.0f, 11.1569f, 22.6569f, 12.5f, 21.0f, 12.5f)
                curveTo(19.9784f, 12.5f, 19.076f, 11.9893f, 18.5343f, 11.2093f)
                lineTo(16.9426f, 11.7399f)
                curveTo(16.9804f, 11.9877f, 17.0f, 12.2416f, 17.0f, 12.5f)
                curveTo(17.0f, 13.7753f, 16.5225f, 14.9391f, 15.7366f, 15.8224f)
                lineTo(17.0633f, 17.1491f)
                curveTo(17.358f, 17.0523f, 17.6729f, 17.0f, 18.0f, 17.0f)
                curveTo(19.6569f, 17.0f, 21.0f, 18.3431f, 21.0f, 20.0f)
                curveTo(21.0f, 21.6569f, 19.6569f, 23.0f, 18.0f, 23.0f)
                curveTo(16.3431f, 23.0f, 15.0f, 21.6569f, 15.0f, 20.0f)
                curveTo(15.0f, 19.4056f, 15.1729f, 18.8515f, 15.4711f, 18.3854f)
                lineTo(14.1169f, 17.0311f)
                curveTo(13.474f, 17.3319f, 12.7566f, 17.5f, 12.0f, 17.5f)
                curveTo(11.2434f, 17.5f, 10.526f, 17.3319f, 9.8831f, 17.0311f)
                lineTo(8.5289f, 18.3854f)
                curveTo(8.8271f, 18.8515f, 9.0f, 19.4056f, 9.0f, 20.0f)
                curveTo(9.0f, 21.6569f, 7.6568f, 23.0f, 6.0f, 23.0f)
                curveTo(4.3432f, 23.0f, 3.0f, 21.6569f, 3.0f, 20.0f)
                curveTo(3.0f, 18.3431f, 4.3432f, 17.0f, 6.0f, 17.0f)
                curveTo(6.3271f, 17.0f, 6.642f, 17.0523f, 6.9367f, 17.1491f)
                lineTo(8.2634f, 15.8224f)
                curveTo(7.4775f, 14.9391f, 7.0f, 13.7753f, 7.0f, 12.5f)
                curveTo(7.0f, 12.2416f, 7.0196f, 11.9877f, 7.0574f, 11.7399f)
                lineTo(5.4657f, 11.2093f)
                curveTo(4.924f, 11.9893f, 4.0216f, 12.5f, 3.0f, 12.5f)
                curveTo(1.3432f, 12.5f, 0.0f, 11.1569f, 0.0f, 9.5f)
                curveTo(0.0f, 7.8432f, 1.3432f, 6.5f, 3.0f, 6.5f)
                curveTo(4.5817f, 6.5f, 5.8775f, 7.724f, 5.9918f, 9.2765f)
                lineTo(7.7511f, 9.863f)
                curveTo(8.465f, 8.7152f, 9.6309f, 7.8779f, 11.0f, 7.6f)
                verticalLineTo(5.8293f)
                curveTo(9.8348f, 5.4175f, 9.0f, 4.3062f, 9.0f, 3.0f)
                curveTo(9.0f, 1.3432f, 10.3431f, 0.0f, 12.0f, 0.0f)
                curveTo(13.6569f, 0.0f, 15.0f, 1.3432f, 15.0f, 3.0f)
                close()
                moveTo(11.0f, 3.0f)
                curveTo(11.0f, 2.4477f, 11.4477f, 2.0f, 12.0f, 2.0f)
                curveTo(12.5523f, 2.0f, 13.0f, 2.4477f, 13.0f, 3.0f)
                curveTo(13.0f, 3.5523f, 12.5523f, 4.0f, 12.0f, 4.0f)
                curveTo(11.4477f, 4.0f, 11.0f, 3.5523f, 11.0f, 3.0f)
                close()
                moveTo(12.0f, 9.5f)
                curveTo(10.3431f, 9.5f, 9.0f, 10.8431f, 9.0f, 12.5f)
                curveTo(9.0f, 14.1569f, 10.3431f, 15.5f, 12.0f, 15.5f)
                curveTo(13.6569f, 15.5f, 15.0f, 14.1569f, 15.0f, 12.5f)
                curveTo(15.0f, 10.8431f, 13.6569f, 9.5f, 12.0f, 9.5f)
                close()
                moveTo(18.0f, 19.0f)
                curveTo(17.4477f, 19.0f, 17.0f, 19.4477f, 17.0f, 20.0f)
                curveTo(17.0f, 20.5523f, 17.4477f, 21.0f, 18.0f, 21.0f)
                curveTo(18.5523f, 21.0f, 19.0f, 20.5523f, 19.0f, 20.0f)
                curveTo(19.0f, 19.4477f, 18.5523f, 19.0f, 18.0f, 19.0f)
                close()
                moveTo(20.0f, 9.5f)
                curveTo(20.0f, 8.9477f, 20.4477f, 8.5f, 21.0f, 8.5f)
                curveTo(21.5523f, 8.5f, 22.0f, 8.9477f, 22.0f, 9.5f)
                curveTo(22.0f, 10.0523f, 21.5523f, 10.5f, 21.0f, 10.5f)
                curveTo(20.4477f, 10.5f, 20.0f, 10.0523f, 20.0f, 9.5f)
                close()
                moveTo(6.0f, 19.0f)
                curveTo(5.4477f, 19.0f, 5.0f, 19.4477f, 5.0f, 20.0f)
                curveTo(5.0f, 20.5523f, 5.4477f, 21.0f, 6.0f, 21.0f)
                curveTo(6.5523f, 21.0f, 7.0f, 20.5523f, 7.0f, 20.0f)
                curveTo(7.0f, 19.4477f, 6.5523f, 19.0f, 6.0f, 19.0f)
                close()
                moveTo(2.0f, 9.5f)
                curveTo(2.0f, 8.9477f, 2.4477f, 8.5f, 3.0f, 8.5f)
                curveTo(3.5523f, 8.5f, 4.0f, 8.9477f, 4.0f, 9.5f)
                curveTo(4.0f, 10.0523f, 3.5523f, 10.5f, 3.0f, 10.5f)
                curveTo(2.4477f, 10.5f, 2.0f, 10.0523f, 2.0f, 9.5f)
                close()
            }
        }.build()
        return hub!!
    }

private var hub: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Hub,
                contentDescription = ""
            )
        }
    }
}