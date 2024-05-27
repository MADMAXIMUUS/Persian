package io.github.madmaximuus.persianSymbols.paperPlane.check

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PaperPlaneCheck: ImageVector
    get() {
        if (paperPlaneCheck != null) {
            return paperPlaneCheck!!
        }
        paperPlaneCheck = Builder(
            name = "paper-plane-check-filled",
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
                pathFillType = NonZero
            ) {
                moveTo(5.1156f, 3.9521f)
                lineTo(20.9735f, 11.0882f)
                curveTo(21.7203f, 11.4242f, 21.7577f, 12.4483f, 21.0857f, 12.8533f)
                curveTo(20.1841f, 12.3116f, 19.1284f, 12.0001f, 18.0f, 12.0001f)
                curveTo(15.0602f, 12.0001f, 12.6142f, 14.1143f, 12.0997f, 16.9052f)
                lineTo(5.1156f, 20.0481f)
                curveTo(4.1229f, 20.4948f, 3.0f, 19.7687f, 3.0f, 18.6802f)
                verticalLineTo(14.0127f)
                curveTo(3.0f, 13.5063f, 3.3785f, 13.0798f, 3.8813f, 13.0197f)
                lineTo(8.2583f, 12.4965f)
                curveTo(8.8459f, 12.4263f, 8.8459f, 11.5738f, 8.2583f, 11.5036f)
                lineTo(3.8813f, 10.9804f)
                curveTo(3.3785f, 10.9203f, 3.0f, 10.4939f, 3.0f, 9.9875f)
                verticalLineTo(5.32f)
                curveTo(3.0f, 4.2315f, 4.1229f, 3.5054f, 5.1156f, 3.9521f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.9685f, 16.4143f)
                curveTo(20.292f, 16.6731f, 20.3444f, 17.1451f, 20.0857f, 17.4685f)
                lineTo(18.0857f, 19.9685f)
                curveTo(17.9524f, 20.1351f, 17.7545f, 20.2371f, 17.5415f, 20.2489f)
                curveTo(17.3285f, 20.2607f, 17.1205f, 20.1812f, 16.9697f, 20.0303f)
                lineTo(15.9697f, 19.0303f)
                curveTo(15.6768f, 18.7374f, 15.6768f, 18.2626f, 15.9697f, 17.9697f)
                curveTo(16.2626f, 17.6768f, 16.7374f, 17.6768f, 17.0303f, 17.9697f)
                lineTo(17.4378f, 18.3772f)
                lineTo(18.9143f, 16.5315f)
                curveTo(19.1731f, 16.208f, 19.6451f, 16.1556f, 19.9685f, 16.4143f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.25f, 18.0f)
                curveTo(13.25f, 15.3766f, 15.3766f, 13.25f, 18.0f, 13.25f)
                curveTo(20.6234f, 13.25f, 22.75f, 15.3766f, 22.75f, 18.0f)
                curveTo(22.75f, 20.6234f, 20.6234f, 22.75f, 18.0f, 22.75f)
                curveTo(15.3766f, 22.75f, 13.25f, 20.6234f, 13.25f, 18.0f)
                close()
                moveTo(18.0f, 14.75f)
                curveTo(16.2051f, 14.75f, 14.75f, 16.2051f, 14.75f, 18.0f)
                curveTo(14.75f, 19.7949f, 16.2051f, 21.25f, 18.0f, 21.25f)
                curveTo(19.7949f, 21.25f, 21.25f, 19.7949f, 21.25f, 18.0f)
                curveTo(21.25f, 16.2051f, 19.7949f, 14.75f, 18.0f, 14.75f)
                close()
            }
        }.build()
        return paperPlaneCheck!!
    }

private var paperPlaneCheck: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.PaperPlaneCheck,
                contentDescription = ""
            )
        }
    }
}