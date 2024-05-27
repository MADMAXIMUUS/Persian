package io.github.madmaximuus.persianSymbols.globe

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

val PersianSymbols.Default.Globe: ImageVector
    get() {
        if (globe != null) {
            return globe!!
        }
        globe = Builder(
            name = "globe-default",
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
                moveTo(12.003f, 22.0f)
                curveTo(17.5245f, 21.9984f, 22.0f, 17.5218f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5225f, 6.4766f, 21.9994f, 11.999f, 22.0f)
                moveTo(4.252f, 10.0f)
                curveTo(4.0875f, 10.6392f, 4.0f, 11.3094f, 4.0f, 12.0f)
                curveTo(4.0f, 12.6906f, 4.0875f, 13.3608f, 4.252f, 14.0f)
                horizontalLineTo(7.192f)
                curveTo(7.0697f, 13.3515f, 7.0f, 12.6822f, 7.0f, 12.0f)
                curveTo(7.0f, 11.3178f, 7.0697f, 10.6485f, 7.192f, 10.0f)
                horizontalLineTo(4.252f)
                close()
                moveTo(5.0703f, 16.0f)
                horizontalLineTo(7.7434f)
                curveTo(7.9962f, 16.7002f, 8.2961f, 17.3597f, 8.6151f, 17.9657f)
                curveTo(8.9346f, 18.5729f, 9.2779f, 19.1351f, 9.6208f, 19.6403f)
                curveTo(7.6862f, 19.0385f, 6.0665f, 17.7222f, 5.0703f, 16.0f)
                close()
                moveTo(14.3792f, 19.6403f)
                curveTo(14.7221f, 19.1351f, 15.0654f, 18.5729f, 15.3849f, 17.9657f)
                curveTo(15.7039f, 17.3597f, 16.0038f, 16.7002f, 16.2566f, 16.0f)
                horizontalLineTo(18.9297f)
                curveTo(17.9335f, 17.7222f, 16.3138f, 19.0385f, 14.3792f, 19.6403f)
                close()
                moveTo(16.808f, 14.0f)
                horizontalLineTo(19.748f)
                curveTo(19.9125f, 13.3608f, 20.0f, 12.6906f, 20.0f, 12.0f)
                curveTo(20.0f, 11.3094f, 19.9125f, 10.6392f, 19.748f, 10.0f)
                horizontalLineTo(16.808f)
                curveTo(16.9303f, 10.6485f, 17.0f, 11.3178f, 17.0f, 12.0f)
                curveTo(17.0f, 12.6822f, 16.9303f, 13.3515f, 16.808f, 14.0f)
                close()
                moveTo(14.7654f, 10.0f)
                curveTo(14.9144f, 10.654f, 15.0f, 11.3248f, 15.0f, 12.0f)
                curveTo(15.0f, 12.6752f, 14.9144f, 13.346f, 14.7654f, 14.0f)
                horizontalLineTo(9.2346f)
                curveTo(9.0856f, 13.346f, 9.0f, 12.6752f, 9.0f, 12.0f)
                curveTo(9.0f, 11.3248f, 9.0856f, 10.654f, 9.2346f, 10.0f)
                horizontalLineTo(14.7654f)
                close()
                moveTo(16.2566f, 8.0f)
                horizontalLineTo(18.9297f)
                curveTo(17.9335f, 6.2779f, 16.3138f, 4.9615f, 14.3792f, 4.3597f)
                curveTo(14.7221f, 4.8649f, 15.0654f, 5.4271f, 15.3849f, 6.0343f)
                curveTo(15.7039f, 6.6403f, 16.0038f, 7.2998f, 16.2566f, 8.0f)
                close()
                moveTo(12.0f, 4.5033f)
                curveTo(12.5098f, 5.1347f, 13.0959f, 5.9793f, 13.6151f, 6.9658f)
                curveTo(13.7902f, 7.2985f, 13.956f, 7.6441f, 14.1079f, 8.0f)
                horizontalLineTo(9.8921f)
                curveTo(10.044f, 7.6441f, 10.2098f, 7.2985f, 10.3849f, 6.9658f)
                curveTo(10.9041f, 5.9793f, 11.4902f, 5.1347f, 12.0f, 4.5033f)
                close()
                moveTo(14.1079f, 16.0f)
                curveTo(13.956f, 16.3559f, 13.7902f, 16.7015f, 13.6151f, 17.0343f)
                curveTo(13.0959f, 18.0207f, 12.5098f, 18.8653f, 12.0f, 19.4967f)
                curveTo(11.4902f, 18.8653f, 10.9041f, 18.0207f, 10.3849f, 17.0343f)
                curveTo(10.2098f, 16.7015f, 10.044f, 16.3559f, 9.8921f, 16.0f)
                horizontalLineTo(14.1079f)
                close()
                moveTo(5.0703f, 8.0f)
                curveTo(6.0665f, 6.2779f, 7.6862f, 4.9615f, 9.6208f, 4.3597f)
                curveTo(9.2779f, 4.8649f, 8.9346f, 5.4271f, 8.6151f, 6.0343f)
                curveTo(8.2961f, 6.6403f, 7.9962f, 7.2998f, 7.7434f, 8.0f)
                horizontalLineTo(5.0703f)
                close()
            }
        }.build()
        return globe!!
    }

private var globe: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Globe,
                contentDescription = ""
            )
        }
    }
}