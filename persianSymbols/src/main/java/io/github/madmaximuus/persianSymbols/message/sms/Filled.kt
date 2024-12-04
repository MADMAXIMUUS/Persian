package io.github.madmaximuus.persianSymbols.message.sms

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessageSms: ImageVector
    get() {
        if (messageSms != null) {
            return messageSms!!
        }
        messageSms = Builder(
            name = "message-sms-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 4f, 22f, 6.017f, 22f, 8.506f)
                verticalLineTo(15.878f)
                curveTo(22f, 18.367f, 20.03f, 20.384f, 17.6f, 20.384f)
                horizontalLineTo(8.166f)
                curveTo(7.762f, 20.384f, 7.361f, 20.456f, 6.981f, 20.596f)
                lineTo(3.339f, 21.939f)
                curveTo(2.687f, 22.179f, 2f, 21.684f, 2f, 20.975f)
                verticalLineTo(8.506f)
                curveTo(2f, 6.017f, 3.97f, 4f, 6.4f, 4f)
                close()
                moveTo(17.01f, 10.75f)
                curveTo(17.01f, 10.474f, 17.234f, 10.25f, 17.51f, 10.25f)
                curveTo(17.719f, 10.25f, 17.9f, 10.379f, 17.975f, 10.564f)
                curveTo(18.129f, 10.948f, 18.566f, 11.135f, 18.95f, 10.981f)
                curveTo(19.334f, 10.826f, 19.521f, 10.389f, 19.367f, 10.005f)
                curveTo(19.072f, 9.271f, 18.353f, 8.75f, 17.51f, 8.75f)
                curveTo(16.405f, 8.75f, 15.51f, 9.645f, 15.51f, 10.75f)
                curveTo(15.51f, 11.855f, 16.405f, 12.75f, 17.51f, 12.75f)
                curveTo(17.786f, 12.75f, 18.01f, 12.974f, 18.01f, 13.25f)
                curveTo(18.01f, 13.526f, 17.786f, 13.75f, 17.51f, 13.75f)
                curveTo(17.303f, 13.75f, 17.124f, 13.624f, 17.048f, 13.442f)
                curveTo(16.889f, 13.06f, 16.449f, 12.879f, 16.067f, 13.039f)
                curveTo(15.685f, 13.198f, 15.504f, 13.637f, 15.664f, 14.02f)
                curveTo(15.965f, 14.741f, 16.677f, 15.25f, 17.51f, 15.25f)
                curveTo(18.615f, 15.25f, 19.51f, 14.355f, 19.51f, 13.25f)
                curveTo(19.51f, 12.146f, 18.615f, 11.25f, 17.51f, 11.25f)
                curveTo(17.234f, 11.25f, 17.01f, 11.026f, 17.01f, 10.75f)
                close()
                moveTo(9.475f, 15.23f)
                curveTo(9.878f, 15.325f, 10.282f, 15.075f, 10.377f, 14.672f)
                lineTo(10.824f, 12.773f)
                lineTo(11.271f, 14.672f)
                curveTo(11.351f, 15.011f, 11.653f, 15.25f, 12.001f, 15.25f)
                curveTo(12.349f, 15.25f, 12.652f, 15.01f, 12.731f, 14.672f)
                lineTo(13.177f, 12.776f)
                lineTo(13.623f, 14.672f)
                curveTo(13.717f, 15.075f, 14.121f, 15.325f, 14.524f, 15.23f)
                curveTo(14.928f, 15.135f, 15.178f, 14.731f, 15.083f, 14.328f)
                lineTo(13.906f, 9.328f)
                curveTo(13.826f, 8.989f, 13.524f, 8.75f, 13.176f, 8.75f)
                curveTo(12.828f, 8.75f, 12.526f, 8.99f, 12.446f, 9.328f)
                lineTo(12f, 11.226f)
                lineTo(11.553f, 9.328f)
                curveTo(11.474f, 8.989f, 11.171f, 8.75f, 10.823f, 8.75f)
                curveTo(10.475f, 8.75f, 10.173f, 8.989f, 10.093f, 9.328f)
                lineTo(8.917f, 14.328f)
                curveTo(8.822f, 14.731f, 9.072f, 15.135f, 9.475f, 15.23f)
                close()
                moveTo(5.99f, 10.75f)
                curveTo(5.99f, 10.474f, 6.214f, 10.25f, 6.49f, 10.25f)
                curveTo(6.699f, 10.25f, 6.88f, 10.379f, 6.954f, 10.564f)
                curveTo(7.109f, 10.948f, 7.545f, 11.135f, 7.93f, 10.981f)
                curveTo(8.314f, 10.826f, 8.501f, 10.389f, 8.346f, 10.005f)
                curveTo(8.052f, 9.271f, 7.333f, 8.75f, 6.49f, 8.75f)
                curveTo(5.385f, 8.75f, 4.49f, 9.645f, 4.49f, 10.75f)
                curveTo(4.49f, 11.855f, 5.385f, 12.75f, 6.49f, 12.75f)
                curveTo(6.766f, 12.75f, 6.99f, 12.974f, 6.99f, 13.25f)
                curveTo(6.99f, 13.526f, 6.766f, 13.75f, 6.49f, 13.75f)
                curveTo(6.283f, 13.75f, 6.104f, 13.624f, 6.028f, 13.442f)
                curveTo(5.869f, 13.06f, 5.429f, 12.879f, 5.047f, 13.039f)
                curveTo(4.665f, 13.198f, 4.484f, 13.637f, 4.644f, 14.02f)
                curveTo(4.945f, 14.741f, 5.657f, 15.25f, 6.49f, 15.25f)
                curveTo(7.595f, 15.25f, 8.49f, 14.355f, 8.49f, 13.25f)
                curveTo(8.49f, 12.146f, 7.595f, 11.25f, 6.49f, 11.25f)
                curveTo(6.214f, 11.25f, 5.99f, 11.026f, 5.99f, 10.75f)
                close()
            }
        }.build()
        return messageSms!!
    }

private var messageSms: ImageVector? = null