package io.github.madmaximuus.persianSymbols.password.rectangle

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

val PersianSymbols.Default.PasswordRectangle: ImageVector
    get() {
        if (passwordRectangle != null) {
            return passwordRectangle!!
        }
        passwordRectangle = Builder(
            name = "password-rectangle-default",
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
                moveTo(6.166f, 10.2224f)
                curveTo(6.0129f, 9.9927f, 5.7025f, 9.9305f, 5.4727f, 10.0837f)
                curveTo(5.2429f, 10.2369f, 5.1808f, 10.5473f, 5.334f, 10.7771f)
                lineTo(5.8161f, 11.5004f)
                horizontalLineTo(5.0f)
                curveTo(4.7239f, 11.5004f, 4.5f, 11.7243f, 4.5f, 12.0004f)
                curveTo(4.5f, 12.2766f, 4.7239f, 12.5004f, 5.0f, 12.5004f)
                horizontalLineTo(5.8156f)
                lineTo(5.334f, 13.2231f)
                curveTo(5.1808f, 13.4529f, 5.2429f, 13.7633f, 5.4727f, 13.9165f)
                curveTo(5.7025f, 14.0696f, 6.0129f, 14.0075f, 6.166f, 13.7777f)
                lineTo(6.75f, 12.9016f)
                lineTo(7.334f, 13.7777f)
                curveTo(7.4871f, 14.0075f, 7.7975f, 14.0696f, 8.0273f, 13.9165f)
                curveTo(8.2571f, 13.7633f, 8.3192f, 13.4529f, 8.166f, 13.2231f)
                lineTo(7.6844f, 12.5004f)
                horizontalLineTo(8.5f)
                curveTo(8.7761f, 12.5004f, 9.0f, 12.2766f, 9.0f, 12.0004f)
                curveTo(9.0f, 11.7243f, 8.7761f, 11.5004f, 8.5f, 11.5004f)
                horizontalLineTo(7.6839f)
                lineTo(8.166f, 10.7771f)
                curveTo(8.3192f, 10.5473f, 8.2571f, 10.2369f, 8.0273f, 10.0837f)
                curveTo(7.7975f, 9.9305f, 7.4871f, 9.9927f, 7.334f, 10.2224f)
                lineTo(6.75f, 11.0986f)
                lineTo(6.166f, 10.2224f)
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
                moveTo(10.7227f, 10.0837f)
                curveTo(10.9525f, 9.9305f, 11.2629f, 9.9927f, 11.4161f, 10.2224f)
                lineTo(12.0f, 11.0986f)
                lineTo(12.5839f, 10.2224f)
                curveTo(12.7371f, 9.9927f, 13.0475f, 9.9305f, 13.2773f, 10.0837f)
                curveTo(13.5071f, 10.2369f, 13.5692f, 10.5473f, 13.4161f, 10.7771f)
                lineTo(12.9339f, 11.5004f)
                horizontalLineTo(13.75f)
                curveTo(14.0261f, 11.5004f, 14.25f, 11.7243f, 14.25f, 12.0004f)
                curveTo(14.25f, 12.2766f, 14.0261f, 12.5004f, 13.75f, 12.5004f)
                horizontalLineTo(12.9344f)
                lineTo(13.4161f, 13.2231f)
                curveTo(13.5692f, 13.4529f, 13.5071f, 13.7633f, 13.2773f, 13.9165f)
                curveTo(13.0475f, 14.0696f, 12.7371f, 14.0075f, 12.5839f, 13.7777f)
                lineTo(12.0f, 12.9016f)
                lineTo(11.4161f, 13.7777f)
                curveTo(11.2629f, 14.0075f, 10.9525f, 14.0696f, 10.7227f, 13.9165f)
                curveTo(10.4929f, 13.7633f, 10.4308f, 13.4529f, 10.5839f, 13.2231f)
                lineTo(11.0656f, 12.5004f)
                horizontalLineTo(10.25f)
                curveTo(9.9739f, 12.5004f, 9.75f, 12.2766f, 9.75f, 12.0004f)
                curveTo(9.75f, 11.7243f, 9.9739f, 11.5004f, 10.25f, 11.5004f)
                horizontalLineTo(11.0661f)
                lineTo(10.5839f, 10.7771f)
                curveTo(10.4308f, 10.5473f, 10.4929f, 10.2369f, 10.7227f, 10.0837f)
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
                moveTo(16.6661f, 10.2224f)
                curveTo(16.5129f, 9.9927f, 16.2025f, 9.9305f, 15.9727f, 10.0837f)
                curveTo(15.7429f, 10.2369f, 15.6808f, 10.5473f, 15.8339f, 10.7771f)
                lineTo(16.3161f, 11.5004f)
                horizontalLineTo(15.5f)
                curveTo(15.2239f, 11.5004f, 15.0f, 11.7243f, 15.0f, 12.0004f)
                curveTo(15.0f, 12.2766f, 15.2239f, 12.5004f, 15.5f, 12.5004f)
                horizontalLineTo(16.3156f)
                lineTo(15.8339f, 13.2231f)
                curveTo(15.6808f, 13.4529f, 15.7429f, 13.7633f, 15.9727f, 13.9165f)
                curveTo(16.2025f, 14.0696f, 16.5129f, 14.0075f, 16.6661f, 13.7777f)
                lineTo(17.25f, 12.9016f)
                lineTo(17.8339f, 13.7777f)
                curveTo(17.9871f, 14.0075f, 18.2975f, 14.0696f, 18.5273f, 13.9165f)
                curveTo(18.7571f, 13.7633f, 18.8192f, 13.4529f, 18.6661f, 13.2231f)
                lineTo(18.1844f, 12.5004f)
                horizontalLineTo(19.0f)
                curveTo(19.2761f, 12.5004f, 19.5f, 12.2766f, 19.5f, 12.0004f)
                curveTo(19.5f, 11.7243f, 19.2761f, 11.5004f, 19.0f, 11.5004f)
                horizontalLineTo(18.1839f)
                lineTo(18.6661f, 10.7771f)
                curveTo(18.8192f, 10.5473f, 18.7571f, 10.2369f, 18.5273f, 10.0837f)
                curveTo(18.2975f, 9.9305f, 17.9871f, 9.9927f, 17.8339f, 10.2224f)
                lineTo(17.25f, 11.0986f)
                lineTo(16.6661f, 10.2224f)
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
                moveTo(2.0f, 8.4f)
                curveTo(2.0f, 5.97f, 3.9699f, 4.0f, 6.4f, 4.0f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 4.0f, 22.0f, 5.97f, 22.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22.0f, 18.0301f, 20.0301f, 20.0f, 17.6f, 20.0f)
                horizontalLineTo(6.4f)
                curveTo(3.9699f, 20.0f, 2.0f, 18.0301f, 2.0f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(6.4f, 6.0f)
                horizontalLineTo(17.6f)
                curveTo(18.9255f, 6.0f, 20.0f, 7.0745f, 20.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(20.0f, 16.9255f, 18.9255f, 18.0f, 17.6f, 18.0f)
                horizontalLineTo(6.4f)
                curveTo(5.0745f, 18.0f, 4.0f, 16.9255f, 4.0f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(4.0f, 7.0745f, 5.0745f, 6.0f, 6.4f, 6.0f)
                close()
            }
        }.build()
        return passwordRectangle!!
    }

private var passwordRectangle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.PasswordRectangle,
                contentDescription = ""
            )
        }
    }
}