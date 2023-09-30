package io.github.madmaximuus.persian.snackbar

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.buttons.PersianButton
import io.github.madmaximuus.persian.buttons.PersianButtonSizes
import io.github.madmaximuus.persian.foundation.PersianComponentStyle
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.iconButtons.PersianIconButton

object PersianSnackbarRight {

    @Composable
    fun Close(
        icon: Painter = MaterialTheme.icons.close,
        onClick: () -> Unit
    ) {
        PersianIconButton.Primary(
            icon = icon,
            style = PersianComponentStyle.STANDARD,
            onClick = onClick
        )
    }

    @Composable
    fun Action(
        text: String,
        onClick: () -> Unit
    ) {
        PersianButton.Tertiary(
            text = text,
            size = PersianButtonSizes.small(),
            onClick = onClick
        )
    }

}