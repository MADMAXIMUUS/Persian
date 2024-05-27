package io.github.madmaximuus.persianSymbols.user.gear

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

val PersianSymbols.Filled.UserGear: ImageVector
    get() {
        if (userGear != null) {
            return userGear!!
        }
        userGear = Builder(
            name = "user-gear-filled",
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
                moveTo(12.0f, 12.5f)
                curveTo(14.7614f, 12.5f, 17.0f, 10.2614f, 17.0f, 7.5f)
                curveTo(17.0f, 4.7386f, 14.7614f, 2.5f, 12.0f, 2.5f)
                curveTo(9.2386f, 2.5f, 7.0f, 4.7386f, 7.0f, 7.5f)
                curveTo(7.0f, 10.2614f, 9.2386f, 12.5f, 12.0f, 12.5f)
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
                moveTo(5.1786f, 17.3182f)
                curveTo(6.5859f, 15.0276f, 9.1145f, 13.5f, 11.9999f, 13.5f)
                curveTo(12.6224f, 13.5f, 13.2282f, 13.5711f, 13.8097f, 13.7056f)
                curveTo(12.6932f, 14.7952f, 11.9999f, 16.3166f, 11.9999f, 18.0f)
                curveTo(11.9999f, 19.3062f, 12.4173f, 20.5149f, 13.126f, 21.5f)
                horizontalLineTo(8.4f)
                curveTo(5.9699f, 21.5f, 3.9066f, 19.3887f, 5.1786f, 17.3182f)
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
                moveTo(17.9999f, 17.25f)
                curveTo(17.5857f, 17.25f, 17.2499f, 17.5858f, 17.2499f, 18.0f)
                curveTo(17.2499f, 18.4142f, 17.5857f, 18.75f, 17.9999f, 18.75f)
                curveTo(18.4141f, 18.75f, 18.7499f, 18.4142f, 18.7499f, 18.0f)
                curveTo(18.7499f, 17.5858f, 18.4141f, 17.25f, 17.9999f, 17.25f)
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
                moveTo(14.0013f, 18.104f)
                curveTo(14.0004f, 18.0694f, 13.9999f, 18.0348f, 13.9999f, 18.0f)
                curveTo(13.9999f, 17.9652f, 14.0004f, 17.9306f, 14.0013f, 17.896f)
                curveTo(13.6085f, 17.4267f, 13.5291f, 16.7438f, 13.8528f, 16.183f)
                lineTo(14.3528f, 15.317f)
                curveTo(14.6764f, 14.7565f, 15.3072f, 14.4838f, 15.9097f, 14.5889f)
                curveTo(15.9692f, 14.5524f, 16.0296f, 14.5174f, 16.091f, 14.484f)
                curveTo(16.3014f, 13.9098f, 16.8528f, 13.5f, 17.4999f, 13.5f)
                horizontalLineTo(18.4999f)
                curveTo(19.1471f, 13.5f, 19.6985f, 13.9098f, 19.9088f, 14.484f)
                curveTo(19.9703f, 14.5174f, 20.0307f, 14.5524f, 20.0901f, 14.5889f)
                curveTo(20.6927f, 14.4838f, 21.3234f, 14.7565f, 21.6471f, 15.317f)
                lineTo(22.1471f, 16.183f)
                curveTo(22.4708f, 16.7438f, 22.3913f, 17.4267f, 21.9986f, 17.896f)
                curveTo(21.9995f, 17.9306f, 21.9999f, 17.9652f, 21.9999f, 18.0f)
                curveTo(21.9999f, 18.0348f, 21.9995f, 18.0694f, 21.9986f, 18.104f)
                curveTo(22.3913f, 18.5733f, 22.4708f, 19.2562f, 22.147f, 19.817f)
                lineTo(21.647f, 20.683f)
                curveTo(21.3234f, 21.2435f, 20.6927f, 21.5162f, 20.0901f, 21.4111f)
                curveTo(20.0307f, 21.4476f, 19.9703f, 21.4826f, 19.9088f, 21.516f)
                curveTo(19.6985f, 22.0902f, 19.1471f, 22.5f, 18.4999f, 22.5f)
                horizontalLineTo(17.4999f)
                curveTo(16.8528f, 22.5f, 16.3014f, 22.0902f, 16.091f, 21.516f)
                curveTo(16.0296f, 21.4826f, 15.9692f, 21.4476f, 15.9097f, 21.4111f)
                curveTo(15.3072f, 21.5162f, 14.6764f, 21.2435f, 14.3528f, 20.683f)
                lineTo(13.8528f, 19.817f)
                curveTo(13.5291f, 19.2562f, 13.6085f, 18.5733f, 14.0013f, 18.104f)
                close()
                moveTo(15.7499f, 18.0f)
                curveTo(15.7499f, 16.7574f, 16.7573f, 15.75f, 17.9999f, 15.75f)
                curveTo(19.2426f, 15.75f, 20.2499f, 16.7574f, 20.2499f, 18.0f)
                curveTo(20.2499f, 19.2426f, 19.2426f, 20.25f, 17.9999f, 20.25f)
                curveTo(16.7573f, 20.25f, 15.7499f, 19.2426f, 15.7499f, 18.0f)
                close()
            }
        }.build()
        return userGear!!
    }

private var userGear: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.UserGear,
                contentDescription = ""
            )
        }
    }
}