package io.github.madmaximuus.persianSymbols.lock.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.LockSlash: ImageVector
    get() {
        if (lockSlash != null) {
            return lockSlash!!
        }
        lockSlash = ImageVector.Builder(
            name = "lock-slash-filled",
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
                moveTo(4f, 12.4f)
                curveTo(4f, 10.794f, 4.861f, 9.389f, 6.146f, 8.621f)
                lineTo(11.418f, 13.893f)
                curveTo(11.021f, 14.102f, 10.75f, 14.52f, 10.75f, 15f)
                curveTo(10.75f, 15.69f, 11.31f, 16.25f, 12f, 16.25f)
                curveTo(12.48f, 16.25f, 12.898f, 15.979f, 13.107f, 15.582f)
                lineTo(18.465f, 20.94f)
                curveTo(17.695f, 21.601f, 16.694f, 22f, 15.6f, 22f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22f, 4f, 20.03f, 4f, 17.6f)
                verticalLineTo(12.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 12.4f)
                verticalLineTo(17.525f)
                lineTo(10.475f, 8f)
                horizontalLineTo(15.079f)
                curveTo(15.097f, 7.24f, 15.014f, 6.223f, 14.603f, 5.412f)
                curveTo(14.395f, 5.002f, 14.113f, 4.662f, 13.728f, 4.421f)
                curveTo(13.344f, 4.181f, 12.798f, 4f, 12f, 4f)
                curveTo(11.202f, 4f, 10.656f, 4.181f, 10.273f, 4.421f)
                curveTo(9.887f, 4.662f, 9.605f, 5.002f, 9.397f, 5.412f)
                curveTo(9.218f, 5.766f, 9.101f, 6.159f, 9.028f, 6.553f)
                lineTo(7.417f, 4.942f)
                curveTo(7.476f, 4.796f, 7.541f, 4.651f, 7.613f, 4.508f)
                curveTo(7.954f, 3.835f, 8.463f, 3.194f, 9.211f, 2.726f)
                curveTo(9.96f, 2.257f, 10.887f, 2f, 12f, 2f)
                curveTo(13.113f, 2f, 14.04f, 2.257f, 14.789f, 2.726f)
                curveTo(15.537f, 3.194f, 16.046f, 3.835f, 16.387f, 4.508f)
                curveTo(17.052f, 5.82f, 17.108f, 7.316f, 17.074f, 8.197f)
                curveTo(17.073f, 8.216f, 17.073f, 8.234f, 17.071f, 8.252f)
                curveTo(18.778f, 8.857f, 20f, 10.486f, 20f, 12.4f)
                close()
            }
        }.build()

        return lockSlash!!
    }

private var lockSlash: ImageVector? = null