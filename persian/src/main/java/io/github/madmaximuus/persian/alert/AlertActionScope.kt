package io.github.madmaximuus.persian.alert

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.buttons.ButtonColors
import io.github.madmaximuus.persian.buttons.ButtonSizes
import io.github.madmaximuus.persian.buttons.TertiaryButton

@Stable
class AlertActionScope(
    val colors: ButtonColors,
    val sizes: ButtonSizes,
    val modifier: Modifier
) {

    @Composable
    fun ActionItem(
        title: String,
        onClick: () -> Unit
    ) {
        TertiaryButton(
            modifier = modifier,
            text = title,
            colors = colors,
            onClick = onClick,
            sizes = sizes
        )
    }
}