package io.github.madmaximuus.persianSymbols.lock.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.LockSlash: ImageVector
    get() {
        if (lockSlash != null) {
            return lockSlash!!
        }
        lockSlash = ImageVector.Builder(
            name = "lock-slash-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12.5f)
                curveTo(4f, 10.866f, 4.87f, 9.436f, 6.173f, 8.648f)
                lineTo(7.667f, 10.142f)
                curveTo(6.696f, 10.485f, 6f, 11.411f, 6f, 12.5f)
                verticalLineTo(17.5f)
                curveTo(6f, 18.881f, 7.119f, 20f, 8.5f, 20f)
                horizontalLineTo(15.5f)
                curveTo(16.069f, 20f, 16.594f, 19.81f, 17.014f, 19.489f)
                lineTo(18.436f, 20.911f)
                curveTo(17.648f, 21.59f, 16.622f, 22f, 15.5f, 22f)
                horizontalLineTo(8.5f)
                curveTo(6.015f, 22f, 4f, 19.985f, 4f, 17.5f)
                verticalLineTo(12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 12.5f)
                verticalLineTo(15.525f)
                lineTo(20f, 17.525f)
                lineTo(20f, 17.5f)
                verticalLineTo(12.5f)
                curveTo(20f, 10.567f, 18.781f, 8.918f, 17.069f, 8.281f)
                curveTo(17.072f, 8.253f, 17.073f, 8.225f, 17.074f, 8.197f)
                curveTo(17.108f, 7.316f, 17.052f, 5.82f, 16.387f, 4.508f)
                curveTo(16.046f, 3.835f, 15.537f, 3.194f, 14.789f, 2.726f)
                curveTo(14.04f, 2.257f, 13.113f, 2f, 12f, 2f)
                curveTo(10.887f, 2f, 9.96f, 2.257f, 9.211f, 2.726f)
                curveTo(8.463f, 3.194f, 7.954f, 3.835f, 7.613f, 4.508f)
                curveTo(7.541f, 4.651f, 7.476f, 4.796f, 7.417f, 4.942f)
                lineTo(9.028f, 6.553f)
                curveTo(9.101f, 6.159f, 9.218f, 5.766f, 9.397f, 5.412f)
                curveTo(9.605f, 5.002f, 9.887f, 4.662f, 10.273f, 4.421f)
                curveTo(10.656f, 4.181f, 11.202f, 4f, 12f, 4f)
                curveTo(12.798f, 4f, 13.344f, 4.181f, 13.728f, 4.421f)
                curveTo(14.113f, 4.662f, 14.395f, 5.002f, 14.603f, 5.412f)
                curveTo(15.014f, 6.223f, 15.097f, 7.24f, 15.079f, 8f)
                horizontalLineTo(10.475f)
                lineTo(12.475f, 10f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 10f, 18f, 11.119f, 18f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.75f, 15f)
                curveTo(10.75f, 14.52f, 11.021f, 14.102f, 11.418f, 13.893f)
                lineTo(13.107f, 15.582f)
                curveTo(12.898f, 15.979f, 12.48f, 16.25f, 12f, 16.25f)
                curveTo(11.31f, 16.25f, 10.75f, 15.69f, 10.75f, 15f)
                close()
            }
        }.build()

        return lockSlash!!
    }

private var lockSlash: ImageVector? = null