package io.github.madmaximuus.persianSymbols.check.badge

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

val PersianSymbols.Default.CheckBadge: ImageVector
    get() {
        if (checkBadge != null) {
            return checkBadge!!
        }
        checkBadge = Builder(
            name = "check-badge-default",
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
                moveTo(16.2071f, 10.7072f)
                curveTo(16.5977f, 10.3166f, 16.5977f, 9.6835f, 16.2071f, 9.2929f)
                curveTo(15.8166f, 8.9024f, 15.1834f, 8.9024f, 14.7929f, 9.2929f)
                lineTo(11.0f, 13.0858f)
                lineTo(9.7071f, 11.793f)
                curveTo(9.3166f, 11.4024f, 8.6834f, 11.4024f, 8.2929f, 11.793f)
                curveTo(7.9024f, 12.1835f, 7.9024f, 12.8166f, 8.2929f, 13.2072f)
                lineTo(10.2929f, 15.2072f)
                curveTo(10.6834f, 15.5977f, 11.3166f, 15.5977f, 11.7071f, 15.2072f)
                lineTo(16.2071f, 10.7072f)
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
                moveTo(13.8883f, 3.6504f)
                curveTo(12.8915f, 2.5016f, 11.1085f, 2.5016f, 10.1118f, 3.6504f)
                lineTo(9.709f, 4.1145f)
                curveTo(9.5877f, 4.2544f, 9.3989f, 4.3157f, 9.2185f, 4.2739f)
                lineTo(8.6198f, 4.1351f)
                curveTo(7.1382f, 3.7917f, 5.6958f, 4.8397f, 5.5646f, 6.3549f)
                lineTo(5.5116f, 6.9671f)
                curveTo(5.4956f, 7.1516f, 5.3789f, 7.3122f, 5.2084f, 7.3844f)
                lineTo(4.6425f, 7.624f)
                curveTo(3.242f, 8.217f, 2.691f, 9.9127f, 3.4755f, 11.2157f)
                lineTo(3.7925f, 11.7422f)
                curveTo(3.888f, 11.9008f, 3.888f, 12.0993f, 3.7925f, 12.258f)
                lineTo(3.4755f, 12.7844f)
                curveTo(2.691f, 14.0874f, 3.242f, 15.7831f, 4.6425f, 16.3761f)
                lineTo(5.2084f, 16.6157f)
                curveTo(5.3789f, 16.6879f, 5.4956f, 16.8485f, 5.5116f, 17.033f)
                lineTo(5.5646f, 17.6452f)
                curveTo(5.6958f, 19.1604f, 7.1382f, 20.2085f, 8.6198f, 19.865f)
                lineTo(9.2185f, 19.7262f)
                curveTo(9.3989f, 19.6844f, 9.5877f, 19.7457f, 9.709f, 19.8856f)
                lineTo(10.1118f, 20.3497f)
                curveTo(11.1085f, 21.4985f, 12.8915f, 21.4985f, 13.8883f, 20.3497f)
                lineTo(14.291f, 19.8856f)
                curveTo(14.4124f, 19.7457f, 14.6012f, 19.6844f, 14.7816f, 19.7262f)
                lineTo(15.3802f, 19.865f)
                curveTo(16.8618f, 20.2085f, 18.3043f, 19.1604f, 18.4355f, 17.6452f)
                lineTo(18.4885f, 17.033f)
                curveTo(18.5045f, 16.8485f, 18.6211f, 16.6879f, 18.7917f, 16.6157f)
                lineTo(19.3575f, 16.3761f)
                curveTo(20.7581f, 15.7831f, 21.3091f, 14.0874f, 20.5246f, 12.7844f)
                lineTo(20.2076f, 12.258f)
                curveTo(20.112f, 12.0993f, 20.112f, 11.9008f, 20.2076f, 11.7422f)
                lineTo(20.5246f, 11.2157f)
                curveTo(21.3091f, 9.9127f, 20.7581f, 8.217f, 19.3575f, 7.624f)
                lineTo(18.7917f, 7.3844f)
                curveTo(18.6211f, 7.3122f, 18.5045f, 7.1516f, 18.4885f, 6.9671f)
                lineTo(18.4355f, 6.3549f)
                curveTo(18.3043f, 4.8397f, 16.8618f, 3.7917f, 15.3802f, 4.1351f)
                lineTo(14.7816f, 4.2739f)
                curveTo(14.6012f, 4.3157f, 14.4124f, 4.2544f, 14.291f, 4.1145f)
                lineTo(13.8883f, 3.6504f)
                close()
                moveTo(11.6224f, 4.9611f)
                curveTo(11.8217f, 4.7314f, 12.1783f, 4.7314f, 12.3777f, 4.9611f)
                lineTo(12.7804f, 5.4253f)
                curveTo(13.3873f, 6.1247f, 14.3311f, 6.4314f, 15.2332f, 6.2222f)
                lineTo(15.8319f, 6.0835f)
                curveTo(16.1282f, 6.0148f, 16.4167f, 6.2244f, 16.4429f, 6.5274f)
                lineTo(16.4959f, 7.1396f)
                curveTo(16.5758f, 8.0622f, 17.1591f, 8.8651f, 18.0119f, 9.2261f)
                lineTo(18.5777f, 9.4657f)
                curveTo(18.8579f, 9.5843f, 18.9681f, 9.9235f, 18.8111f, 10.1841f)
                lineTo(18.4942f, 10.7105f)
                curveTo(18.0165f, 11.5039f, 18.0165f, 12.4963f, 18.4942f, 13.2896f)
                lineTo(18.8111f, 13.816f)
                curveTo(18.9681f, 14.0766f, 18.8579f, 14.4158f, 18.5777f, 14.5344f)
                lineTo(18.0119f, 14.774f)
                curveTo(17.1591f, 15.135f, 16.5758f, 15.9379f, 16.4959f, 16.8605f)
                lineTo(16.4429f, 17.4727f)
                curveTo(16.4167f, 17.7757f, 16.1282f, 17.9853f, 15.8319f, 17.9166f)
                lineTo(15.2332f, 17.7779f)
                curveTo(14.3311f, 17.5687f, 13.3873f, 17.8754f, 12.7804f, 18.5748f)
                lineTo(12.3777f, 19.039f)
                curveTo(12.1783f, 19.2687f, 11.8217f, 19.2687f, 11.6224f, 19.039f)
                lineTo(11.2196f, 18.5748f)
                curveTo(10.6127f, 17.8754f, 9.6689f, 17.5687f, 8.7668f, 17.7779f)
                lineTo(8.1682f, 17.9166f)
                curveTo(7.8719f, 17.9853f, 7.5834f, 17.7757f, 7.5571f, 17.4727f)
                lineTo(7.5041f, 16.8605f)
                curveTo(7.4243f, 15.9379f, 6.8409f, 15.135f, 5.9882f, 14.774f)
                lineTo(5.4223f, 14.5344f)
                curveTo(5.1422f, 14.4158f, 5.032f, 14.0766f, 5.1889f, 13.816f)
                lineTo(5.5059f, 13.2896f)
                curveTo(5.9835f, 12.4963f, 5.9835f, 11.5039f, 5.5059f, 10.7105f)
                lineTo(5.1889f, 10.1841f)
                curveTo(5.032f, 9.9235f, 5.1422f, 9.5843f, 5.4223f, 9.4657f)
                lineTo(5.9882f, 9.2261f)
                curveTo(6.8409f, 8.8651f, 7.4243f, 8.0622f, 7.5041f, 7.1396f)
                lineTo(7.5571f, 6.5274f)
                curveTo(7.5834f, 6.2244f, 7.8719f, 6.0148f, 8.1682f, 6.0835f)
                lineTo(8.7668f, 6.2222f)
                curveTo(9.6689f, 6.4314f, 10.6127f, 6.1247f, 11.2196f, 5.4253f)
                lineTo(11.6224f, 4.9611f)
                close()
            }
        }.build()
        return checkBadge!!
    }

private var checkBadge: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CheckBadge,
                contentDescription = ""
            )
        }
    }
}