package io.github.madmaximuus.persianSymbols.dollar.rotate

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

val PersianSymbols.Default.DollarRotate: ImageVector
    get() {
        if (dollarRotate != null) {
            return dollarRotate!!
        }
        dollarRotate = Builder(
            name = "dollar-rotate-default",
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
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(14.5254f, 4.0f, 16.7787f, 5.1701f, 18.2456f, 7.0f)
                lineTo(16.5f, 7.0f)
                curveTo(15.9477f, 7.0f, 15.5f, 7.4477f, 15.5f, 8.0f)
                curveTo(15.5f, 8.5523f, 15.9477f, 9.0f, 16.5f, 9.0f)
                lineTo(20.0443f, 9.0f)
                curveTo(20.0582f, 9.0003f, 20.0722f, 9.0003f, 20.0862f, 9.0f)
                horizontalLineTo(20.5f)
                curveTo(21.0523f, 9.0f, 21.5f, 8.5523f, 21.5f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(21.5f, 3.4477f, 21.0523f, 3.0f, 20.5f, 3.0f)
                curveTo(19.9477f, 3.0f, 19.5f, 3.4477f, 19.5f, 4.0f)
                verticalLineTo(5.3857f)
                curveTo(17.6683f, 3.3103f, 14.9877f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
                curveTo(3.5523f, 13.0f, 4.0f, 12.5523f, 4.0f, 12.0f)
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
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 11.4477f, 21.5523f, 11.0f, 21.0f, 11.0f)
                curveTo(20.4477f, 11.0f, 20.0f, 11.4477f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(9.4746f, 20.0f, 7.2214f, 18.83f, 5.7544f, 17.0f)
                horizontalLineTo(7.5f)
                curveTo(8.0523f, 17.0f, 8.5f, 16.5523f, 8.5f, 16.0f)
                curveTo(8.5f, 15.4477f, 8.0523f, 15.0f, 7.5f, 15.0f)
                horizontalLineTo(3.5f)
                curveTo(2.9477f, 15.0f, 2.5f, 15.4477f, 2.5f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(2.5f, 20.5523f, 2.9477f, 21.0f, 3.5f, 21.0f)
                curveTo(4.0523f, 21.0f, 4.5f, 20.5523f, 4.5f, 20.0f)
                verticalLineTo(18.6143f)
                curveTo(6.3316f, 20.6896f, 9.0123f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
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
                moveTo(12.71f, 5.9805f)
                curveTo(12.71f, 5.6898f, 12.4743f, 5.4541f, 12.1836f, 5.4541f)
                curveTo(11.8929f, 5.4541f, 11.6572f, 5.6898f, 11.6572f, 5.9805f)
                verticalLineTo(6.9274f)
                curveTo(11.2375f, 6.9713f, 10.8592f, 7.0749f, 10.5225f, 7.2383f)
                curveTo(10.0622f, 7.4616f, 9.7022f, 7.7783f, 9.4424f, 8.1885f)
                curveTo(9.1872f, 8.5986f, 9.0596f, 9.084f, 9.0596f, 9.6445f)
                curveTo(9.0596f, 10.2142f, 9.1781f, 10.6904f, 9.415f, 11.0732f)
                curveTo(9.6566f, 11.4515f, 9.9938f, 11.7705f, 10.4268f, 12.0303f)
                curveTo(10.8643f, 12.2855f, 11.3747f, 12.5156f, 11.958f, 12.7207f)
                curveTo(12.3636f, 12.862f, 12.6872f, 13.0146f, 12.9287f, 13.1787f)
                curveTo(13.1702f, 13.3382f, 13.3434f, 13.5182f, 13.4482f, 13.7188f)
                curveTo(13.5576f, 13.9147f, 13.6123f, 14.1449f, 13.6123f, 14.4092f)
                curveTo(13.6123f, 14.6826f, 13.5508f, 14.9264f, 13.4277f, 15.1406f)
                curveTo(13.3092f, 15.3503f, 13.1315f, 15.5143f, 12.8945f, 15.6328f)
                curveTo(12.6621f, 15.7467f, 12.375f, 15.8037f, 12.0332f, 15.8037f)
                curveTo(11.8281f, 15.8037f, 11.623f, 15.7741f, 11.418f, 15.7148f)
                curveTo(11.2174f, 15.6556f, 11.0352f, 15.5576f, 10.8711f, 15.4209f)
                curveTo(10.707f, 15.2842f, 10.5771f, 15.0973f, 10.4814f, 14.8604f)
                curveTo(10.4718f, 14.8365f, 10.4626f, 14.812f, 10.454f, 14.7869f)
                curveTo(10.3047f, 14.3551f, 9.9676f, 13.9717f, 9.5107f, 13.9717f)
                curveTo(9.0539f, 13.9717f, 8.6699f, 14.3458f, 8.7558f, 14.7944f)
                curveTo(8.8037f, 15.0441f, 8.8753f, 15.2712f, 8.9707f, 15.4756f)
                curveTo(9.1621f, 15.8812f, 9.4196f, 16.207f, 9.7432f, 16.4531f)
                curveTo(10.0667f, 16.6992f, 10.4268f, 16.877f, 10.8232f, 16.9863f)
                curveTo(11.0596f, 17.0481f, 11.2967f, 17.0917f, 11.5347f, 17.117f)
                curveTo(11.5343f, 17.1247f, 11.5342f, 17.1324f, 11.5342f, 17.1401f)
                verticalLineTo(17.9263f)
                curveTo(11.5342f, 18.2151f, 11.7683f, 18.4492f, 12.0571f, 18.4492f)
                curveTo(12.3459f, 18.4492f, 12.5801f, 18.2151f, 12.5801f, 17.9263f)
                verticalLineTo(17.1401f)
                curveTo(12.5801f, 17.1322f, 12.5799f, 17.1242f, 12.5795f, 17.1163f)
                curveTo(13.0f, 17.0728f, 13.3807f, 16.9771f, 13.7217f, 16.8291f)
                curveTo(14.2093f, 16.6149f, 14.5876f, 16.3027f, 14.8564f, 15.8926f)
                curveTo(15.1299f, 15.4824f, 15.2666f, 14.9834f, 15.2666f, 14.3955f)
                curveTo(15.2666f, 13.8258f, 15.1481f, 13.3542f, 14.9111f, 12.9805f)
                curveTo(14.6787f, 12.6022f, 14.346f, 12.2855f, 13.9131f, 12.0303f)
                curveTo(13.4847f, 11.7705f, 12.9766f, 11.5358f, 12.3887f, 11.3262f)
                curveTo(11.9603f, 11.1667f, 11.623f, 11.0094f, 11.377f, 10.8545f)
                curveTo(11.1354f, 10.695f, 10.9645f, 10.5173f, 10.8643f, 10.3213f)
                curveTo(10.764f, 10.1253f, 10.7139f, 9.8975f, 10.7139f, 9.6377f)
                curveTo(10.7139f, 9.3688f, 10.7617f, 9.1296f, 10.8574f, 8.9199f)
                curveTo(10.9577f, 8.7103f, 11.1126f, 8.5462f, 11.3223f, 8.4277f)
                curveTo(11.5319f, 8.3047f, 11.7985f, 8.2432f, 12.1221f, 8.2432f)
                curveTo(12.3499f, 8.2432f, 12.5527f, 8.2865f, 12.7305f, 8.373f)
                curveTo(12.9128f, 8.4596f, 13.0677f, 8.585f, 13.1953f, 8.749f)
                curveTo(13.3229f, 8.9085f, 13.4186f, 9.1045f, 13.4824f, 9.3369f)
                curveTo(13.6076f, 9.7542f, 13.9381f, 10.1162f, 14.3737f, 10.1162f)
                horizontalLineTo(14.4053f)
                curveTo(14.8583f, 10.1162f, 15.2377f, 9.7456f, 15.1557f, 9.3f)
                curveTo(15.1199f, 9.1051f, 15.0703f, 8.9215f, 15.0068f, 8.749f)
                curveTo(14.8656f, 8.348f, 14.6605f, 8.0107f, 14.3916f, 7.7373f)
                curveTo(14.1227f, 7.4639f, 13.7969f, 7.2565f, 13.4141f, 7.1152f)
                curveTo(13.1954f, 7.0335f, 12.9607f, 6.9755f, 12.71f, 6.941f)
                verticalLineTo(5.9805f)
                close()
            }
        }.build()
        return dollarRotate!!
    }

private var dollarRotate: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.DollarRotate,
                contentDescription = ""
            )
        }
    }
}