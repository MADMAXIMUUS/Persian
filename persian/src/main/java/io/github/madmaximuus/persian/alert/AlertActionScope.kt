package io.github.madmaximuus.persian.alert

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.button.TertiaryButton

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