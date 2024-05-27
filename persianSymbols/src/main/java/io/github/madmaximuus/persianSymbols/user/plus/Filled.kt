package io.github.madmaximuus.persianSymbols.user.plus

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

val PersianSymbols.Filled.UserPlus: ImageVector
    get() {
        if (userPlus != null) {
            return userPlus!!
        }
        userPlus = Builder(
            name = "user-plus-filled",
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
                curveTo(14.7615f, 12.5f, 17.0f, 10.2614f, 17.0f, 7.5f)
                curveTo(17.0f, 4.7386f, 14.7615f, 2.5f, 12.0f, 2.5f)
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
                moveTo(5.1787f, 17.3182f)
                curveTo(6.5859f, 15.0276f, 9.1146f, 13.5f, 12.0f, 13.5f)
                curveTo(12.6224f, 13.5f, 13.2283f, 13.5711f, 13.8098f, 13.7056f)
                curveTo(12.6932f, 14.7952f, 12.0f, 16.3166f, 12.0f, 18.0f)
                curveTo(12.0f, 19.3062f, 12.4174f, 20.5149f, 13.1261f, 21.5f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 21.5f, 3.9066f, 19.3887f, 5.1787f, 17.3182f)
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
                curveTo(13.25f, 15.3766f, 15.3767f, 13.25f, 18.0f, 13.25f)
                curveTo(20.6234f, 13.25f, 22.75f, 15.3766f, 22.75f, 18.0f)
                curveTo(22.75f, 20.6234f, 20.6234f, 22.75f, 18.0f, 22.75f)
                curveTo(15.3767f, 22.75f, 13.25f, 20.6234f, 13.25f, 18.0f)
                close()
                moveTo(18.0f, 14.75f)
                curveTo(16.2051f, 14.75f, 14.75f, 16.2051f, 14.75f, 18.0f)
                curveTo(14.75f, 19.7949f, 16.2051f, 21.25f, 18.0f, 21.25f)
                curveTo(19.7949f, 21.25f, 21.25f, 19.7949f, 21.25f, 18.0f)
                curveTo(21.25f, 16.2051f, 19.7949f, 14.75f, 18.0f, 14.75f)
                close()
            }
        }.build()
        return userPlus!!
    }

private var userPlus: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.UserPlus,
                contentDescription = ""
            )
        }
    }
}