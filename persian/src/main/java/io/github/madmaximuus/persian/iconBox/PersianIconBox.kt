package io.github.madmaximuus.persian.iconBox

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.icons

object PersianIconBox {

    @Composable
    fun Primary(
        icon: Painter,
        size: IconBoxSize = PersianIconBoxSize.large(),
        colors: IconBoxColors = PersianIconBoxColors.primary(),
        enabled: Boolean = true,
        isError: Boolean = false,
        contentDescription: String = ""
    ) {
        val tint = colors.iconColor(enabled = enabled, isError = isError).value
        Icon(
            modifier = Modifier
                .size(size.width),
            painter = icon,
            contentDescription = contentDescription,
            tint = tint
        )
    }

}


@Preview
@Composable
fun IconBoxPreview() {
    PersianTheme {
        Surface {
            PersianIconBox.Primary(
                icon = MaterialTheme.icons.error,
                size = PersianIconBoxSize.large(),
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun IconBoxDarkPreview() {
    PersianTheme {
        Surface {
            PersianIconBox.Primary(
                icon = MaterialTheme.icons.ballot
            )
        }
    }
}