package io.github.madmaximuus.persianSymbols.newLabel.rectangle

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

val PersianSymbols.Filled.NewRectangle: ImageVector
    get() {
        if (newRectangle != null) {
            return newRectangle!!
        }
        newRectangle = Builder(
            name = "new-rectangle-filled",
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
                moveTo(6.4f, 4.0f)
                curveTo(3.9699f, 4.0f, 2.0f, 5.97f, 2.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2.0f, 18.0301f, 3.9699f, 20.0f, 6.4f, 20.0f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 20.0f, 22.0f, 18.0301f, 22.0f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(22.0f, 5.97f, 20.0301f, 4.0f, 17.6f, 4.0f)
                horizontalLineTo(6.4f)
                close()
                moveTo(8.9108f, 10.1446f)
                curveTo(8.9108f, 9.9267f, 8.7342f, 9.75f, 8.5162f, 9.75f)
                curveTo(8.2983f, 9.75f, 8.1216f, 9.9267f, 8.1216f, 10.1446f)
                verticalLineTo(12.8265f)
                curveTo(8.1216f, 12.8714f, 8.0631f, 12.8886f, 8.0388f, 12.8508f)
                lineTo(6.1784f, 9.9567f)
                curveTo(6.0956f, 9.8279f, 5.953f, 9.75f, 5.7999f, 9.75f)
                horizontalLineTo(5.7f)
                curveTo(5.4515f, 9.75f, 5.25f, 9.9515f, 5.25f, 10.2f)
                verticalLineTo(13.8522f)
                curveTo(5.25f, 14.0719f, 5.4281f, 14.25f, 5.6478f, 14.25f)
                curveTo(5.8675f, 14.25f, 6.0456f, 14.0719f, 6.0456f, 13.8522f)
                verticalLineTo(11.1798f)
                curveTo(6.0456f, 11.1349f, 6.1042f, 11.1177f, 6.1284f, 11.1555f)
                lineTo(7.9825f, 14.0431f)
                curveTo(8.0652f, 14.1721f, 8.2079f, 14.25f, 8.3611f, 14.25f)
                horizontalLineTo(8.4608f)
                curveTo(8.7094f, 14.25f, 8.9108f, 14.0485f, 8.9108f, 13.8f)
                verticalLineTo(10.1446f)
                close()
                moveTo(14.8582f, 12.9371f)
                curveTo(14.8461f, 12.9829f, 14.7805f, 12.9814f, 14.7706f, 12.935f)
                lineTo(14.155f, 10.0511f)
                curveTo(14.1175f, 9.8755f, 13.9624f, 9.75f, 13.7829f, 9.75f)
                curveTo(13.5372f, 9.75f, 13.356f, 9.9793f, 13.4127f, 10.2184f)
                lineTo(14.2875f, 13.9039f)
                curveTo(14.3357f, 14.1068f, 14.5169f, 14.25f, 14.7253f, 14.25f)
                horizontalLineTo(14.7994f)
                curveTo(15.0023f, 14.25f, 15.1801f, 14.1142f, 15.2335f, 13.9185f)
                lineTo(15.9979f, 11.1175f)
                curveTo(16.01f, 11.0731f, 16.0731f, 11.0734f, 16.0848f, 11.1179f)
                lineTo(16.8202f, 13.9145f)
                curveTo(16.8722f, 14.1122f, 17.051f, 14.25f, 17.2554f, 14.25f)
                horizontalLineTo(17.3262f)
                curveTo(17.5347f, 14.25f, 17.7159f, 14.1068f, 17.764f, 13.9039f)
                lineTo(18.6385f, 10.2197f)
                curveTo(18.6954f, 9.98f, 18.5136f, 9.75f, 18.2673f, 9.75f)
                curveTo(18.0868f, 9.75f, 17.931f, 9.8764f, 17.8939f, 10.053f)
                lineTo(17.2879f, 12.9331f)
                curveTo(17.2781f, 12.9795f, 17.2123f, 12.9811f, 17.2003f, 12.9352f)
                lineTo(16.4512f, 10.0737f)
                curveTo(16.4013f, 9.883f, 16.229f, 9.75f, 16.0318f, 9.75f)
                curveTo(15.8349f, 9.75f, 15.6628f, 9.8827f, 15.6126f, 10.0731f)
                lineTo(14.8582f, 12.9371f)
                close()
                moveTo(12.6006f, 10.3681f)
                curveTo(12.7713f, 10.3681f, 12.9097f, 10.2298f, 12.9097f, 10.0591f)
                curveTo(12.9097f, 9.8884f, 12.7713f, 9.75f, 12.6006f, 9.75f)
                horizontalLineTo(10.3549f)
                curveTo(10.1064f, 9.75f, 9.9049f, 9.9515f, 9.9049f, 10.2f)
                verticalLineTo(13.8f)
                curveTo(9.9049f, 14.0485f, 10.1064f, 14.25f, 10.3549f, 14.25f)
                horizontalLineTo(12.618f)
                curveTo(12.7878f, 14.25f, 12.9255f, 14.1123f, 12.9255f, 13.9425f)
                curveTo(12.9255f, 13.7726f, 12.7878f, 13.635f, 12.618f, 13.635f)
                horizontalLineTo(10.7005f)
                verticalLineTo(12.2349f)
                horizontalLineTo(12.3025f)
                curveTo(12.4698f, 12.2349f, 12.6054f, 12.0993f, 12.6054f, 11.932f)
                curveTo(12.6054f, 11.7647f, 12.4698f, 11.6291f, 12.3025f, 11.6291f)
                horizontalLineTo(10.7005f)
                verticalLineTo(10.3681f)
                horizontalLineTo(12.6006f)
                close()
            }
        }.build()
        return newRectangle!!
    }

private var newRectangle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.NewRectangle,
                contentDescription = ""
            )
        }
    }
}