package ru.rabbit.persian.topAppBar

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle

object PersianTopAppBarMiddle {

    @Composable
    fun Title(
        modifier: Modifier = Modifier,
        text: String,
        textStyle: TextStyle = MaterialTheme.typography.titleLarge
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
    fun Icon24(
        icon: Painter,
        modifier: Modifier = Modifier
    ) {
        val colors = LocalPersianTopAppBarColors.current
        Icon(
            modifier = modifier,
            painter = icon,
            contentDescription = "",
            tint = colors.contentColor
        )

    }
}