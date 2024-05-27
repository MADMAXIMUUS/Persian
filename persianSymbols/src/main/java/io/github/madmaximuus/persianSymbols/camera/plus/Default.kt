package io.github.madmaximuus.persianSymbols.camera.plus

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

val PersianSymbols.Default.CameraPlus: ImageVector
    get() {
        if (cameraPlus != null) {
            return cameraPlus!!
        }
        cameraPlus = Builder(
            name = "camera-plus-default",
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
                moveTo(10.4142f, 2.0f)
                curveTo(9.8838f, 2.0f, 9.3751f, 2.2107f, 9.0f, 2.5858f)
                lineTo(8.318f, 3.2678f)
                curveTo(7.8492f, 3.7366f, 7.2133f, 4.0f, 6.5503f, 4.0f)
                horizontalLineTo(6.5f)
                curveTo(4.0147f, 4.0f, 2.0f, 6.0147f, 2.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 17.9853f, 4.0147f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(12.3414f)
                curveTo(12.1203f, 19.3744f, 12.0f, 18.7013f, 12.0f, 18.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 18.0f, 4.0f, 16.8807f, 4.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4.0f, 7.1193f, 5.1193f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(6.5503f)
                curveTo(7.7437f, 6.0f, 8.8883f, 5.5259f, 9.7322f, 4.682f)
                lineTo(10.4142f, 4.0f)
                lineTo(13.5858f, 4.0f)
                lineTo(14.2678f, 4.682f)
                curveTo(15.1117f, 5.5259f, 16.2563f, 6.0f, 17.4497f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 6.0f, 20.0f, 7.1193f, 20.0f, 8.5f)
                verticalLineTo(12.3414f)
                curveTo(20.7452f, 12.6048f, 21.4229f, 13.0113f, 22.0f, 13.5278f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 6.0147f, 19.9853f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(17.4497f)
                curveTo(16.7867f, 4.0f, 16.1508f, 3.7366f, 15.682f, 3.2678f)
                lineTo(15.0f, 2.5858f)
                curveTo(14.6249f, 2.2107f, 14.1162f, 2.0f, 13.5858f, 2.0f)
                horizontalLineTo(10.4142f)
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
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.0277f, 16.9998f, 12.0554f, 16.9993f, 12.0831f)
                curveTo(16.2294f, 12.2123f, 15.5093f, 12.4882f, 14.8686f, 12.881f)
                curveTo(14.954f, 12.6024f, 15.0f, 12.3066f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                curveTo(12.3066f, 15.0f, 12.6024f, 14.954f, 12.881f, 14.8686f)
                curveTo(12.4882f, 15.5093f, 12.2123f, 16.2294f, 12.0831f, 16.9993f)
                curveTo(12.0554f, 16.9998f, 12.0277f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2386f, 17.0f, 7.0f, 14.7614f, 7.0f, 12.0f)
                curveTo(7.0f, 9.2386f, 9.2386f, 7.0f, 12.0f, 7.0f)
                curveTo(14.7614f, 7.0f, 17.0f, 9.2386f, 17.0f, 12.0f)
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
                moveTo(18.0f, 15.5f)
                curveTo(18.4142f, 15.5f, 18.75f, 15.8358f, 18.75f, 16.25f)
                verticalLineTo(17.25f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 17.25f, 20.5f, 17.5858f, 20.5f, 18.0f)
                curveTo(20.5f, 18.4142f, 20.1642f, 18.75f, 19.75f, 18.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(19.75f)
                curveTo(18.75f, 20.1642f, 18.4142f, 20.5f, 18.0f, 20.5f)
                curveTo(17.5858f, 20.5f, 17.25f, 20.1642f, 17.25f, 19.75f)
                verticalLineTo(18.75f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 18.75f, 15.5f, 18.4142f, 15.5f, 18.0f)
                curveTo(15.5f, 17.5858f, 15.8358f, 17.25f, 16.25f, 17.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.25f)
                curveTo(17.25f, 15.8358f, 17.5858f, 15.5f, 18.0f, 15.5f)
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
        return cameraPlus!!
    }

private var cameraPlus: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CameraPlus,
                contentDescription = ""
            )
        }
    }
}