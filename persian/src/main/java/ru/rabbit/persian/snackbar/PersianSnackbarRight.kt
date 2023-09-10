package ru.rabbit.persian.snackbar

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import ru.rabbit.persian.buttons.PersianButton
import ru.rabbit.persian.buttons.PersianButtonSizes
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.iconButtons.PersianIconButton

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
        PersianButton.Primary(
            text = text,
            style = PersianComponentStyle.STANDARD,
            size = PersianButtonSizes.small(),
            onClick = onClick
        )
    }

}