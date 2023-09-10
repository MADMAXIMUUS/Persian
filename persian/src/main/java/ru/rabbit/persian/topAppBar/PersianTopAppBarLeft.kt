package ru.rabbit.persian.topAppBar

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import ru.rabbit.persian.avatars.PersianAvatars
import ru.rabbit.persian.avatars.PersianAvatarsSizes
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.foundation.spacing
import ru.rabbit.persian.iconButtons.PersianIconButton
import ru.rabbit.persian.iconButtons.PersianIconButtonColors
import ru.rabbit.persian.iconButtons.PersianIconButtonSizes

object PersianTopAppBarLeft {

    @Composable
    fun Navigation(
        modifier: Modifier = Modifier,
        icon: Painter = MaterialTheme.icons.arrowBack,
        onClick: () -> Unit
    ) {
        val colors = LocalPersianTopAppBarColors.current
        PersianIconButton.Primary(
            modifier = modifier,
            icon = icon,
            style = PersianComponentStyle.STANDARD,
            colors = PersianIconButtonColors.primary(
                style = PersianComponentStyle.STANDARD,
                containerColor = colors.iconColor
            ),
            sizes = PersianIconButtonSizes.medium(),
            onClick = onClick
        )
    }

    @Composable
    fun Close(
        icon: Painter = MaterialTheme.icons.close,
        onClick: () -> Unit
    ) {
        val colors = LocalPersianTopAppBarColors.current
        PersianIconButton.Primary(
            icon = icon,
            style = PersianComponentStyle.STANDARD,
            colors = PersianIconButtonColors.primary(
                style = PersianComponentStyle.STANDARD,
                containerColor = colors.iconColor
            ),
            sizes = PersianIconButtonSizes.medium(),
            onClick = onClick
        )
    }

    @Composable
    fun Avatar(
        image: String,
        onClick: () -> Unit
    ) {
        PersianAvatars.Round(
            modifier = Modifier
                .padding(start = MaterialTheme.spacing.medium),
            imageUrl = image,
            size = PersianAvatarsSizes.medium(),
            onClick = onClick
        )
    }

}