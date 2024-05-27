package io.github.madmaximuus.persianSymbols.user.circle

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

val PersianSymbols.Default.UserCircle: ImageVector
    get() {
        if (userCircle != null) {
            return userCircle!!
        }
        userCircle = Builder(
            name = "user-circle-default",
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
                moveTo(12.0f, 5.0f)
                curveTo(9.5147f, 5.0f, 7.5f, 7.0147f, 7.5f, 9.5f)
                curveTo(7.5f, 11.9853f, 9.5147f, 14.0f, 12.0f, 14.0f)
                curveTo(14.4853f, 14.0f, 16.5f, 11.9853f, 16.5f, 9.5f)
                curveTo(16.5f, 7.0147f, 14.4853f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(9.5f, 9.5f)
                curveTo(9.5f, 8.1193f, 10.6193f, 7.0f, 12.0f, 7.0f)
                curveTo(13.3807f, 7.0f, 14.5f, 8.1193f, 14.5f, 9.5f)
                curveTo(14.5f, 10.8807f, 13.3807f, 12.0f, 12.0f, 12.0f)
                curveTo(10.6193f, 12.0f, 9.5f, 10.8807f, 9.5f, 9.5f)
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
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 13.7058f, 4.5339f, 15.2868f, 5.4436f, 16.5852f)
                curveTo(7.3634f, 15.576f, 9.6088f, 15.0f, 12.0f, 15.0f)
                curveTo(14.3911f, 15.0f, 16.6366f, 15.576f, 18.5564f, 16.5852f)
                curveTo(19.4662f, 15.2868f, 20.0f, 13.7058f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(10.0374f, 20.0f, 8.2399f, 19.2933f, 6.8481f, 18.1205f)
                curveTo(8.3719f, 17.4084f, 10.1263f, 17.0f, 12.0f, 17.0f)
                curveTo(13.8737f, 17.0f, 15.6281f, 17.4084f, 17.1519f, 18.1205f)
                curveTo(15.7601f, 19.2933f, 13.9626f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }.build()
        return userCircle!!
    }

private var userCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.UserCircle,
                contentDescription = ""
            )
        }
    }
}