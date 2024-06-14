package io.github.madmaximuus.persian.topAppBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.text.Text

sealed class PersianTopAppBarMiddle {

    data class Title(
        val text: String
    ) : PersianTopAppBarMiddle()

    data class Icon(
        val icon: Painter
    ) : PersianTopAppBarMiddle()

}

@Composable
internal fun PersianTopAppBarMiddleTitle(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle = PersianTheme.typography.titleLarge
) {
    val colors = LocalPersianTopAppBarColors.current
    Text(
        modifier = modifier,
        text = text,
        style = textStyle,
        maxLines = 1,
        color = colors.contentColor
    )
}

@Composable
internal fun PersianTopAppBarMiddleIcon(
    icon: Painter,
    modifier: Modifier = Modifier
) {
    val colors = LocalPersianTopAppBarColors.current
    CompositionLocalProvider(
        LocalContentColor provides colors.contentColor
    ) {
        Icon(
            modifier = modifier,
            painter = icon
        )
    }
}