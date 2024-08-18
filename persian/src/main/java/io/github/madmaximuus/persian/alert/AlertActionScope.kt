package io.github.madmaximuus.persian.alert

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.button.TertiaryButton

interface OnlyActionScope : ColumnScope {
    val colors: ButtonColors
    val sizes: ButtonSizes
}

class OnlyActionScopeWrapper(
    val scope: ColumnScope,
    override val colors: ButtonColors,
    override val sizes: ButtonSizes
) : OnlyActionScope, ColumnScope by scope

interface ActionScope : RowScope {
    val colors: ButtonColors
    val sizes: ButtonSizes
}

class ActionScopeWrapper(
    val scope: RowScope,
    override val colors: ButtonColors,
    override val sizes: ButtonSizes
) : ActionScope, RowScope by scope

@Composable
fun OnlyActionScope.Action(
    title: String,
    onClick: () -> Unit
) {
    TertiaryButton(
        modifier = Modifier.fillMaxWidth(),
        text = title,
        colors = colors,
        onClick = onClick,
        sizes = sizes
    )
}

@Composable
fun ActionScope.Action(
    title: String,
    onClick: () -> Unit
) {
    TertiaryButton(
        text = title,
        colors = colors,
        onClick = onClick,
        sizes = sizes
    )
}