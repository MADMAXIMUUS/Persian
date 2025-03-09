package io.github.madmaximuus.persian.alert

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import io.github.madmaximuus.persian.button.Button
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonSizes

/**
 * Interface representing a scope that provides action-specific properties.
 *
 * @property colors the colors used for button in this action.
 * @property sizes the sizes used for button in this action.
 */
interface ActionScope : RowScope {
    val colors: ButtonColors
    val sizes: ButtonSizes
}

/**
 * The wrapper class for scope of action in this [Alert].
 *
 * @param scope the row scope used in [Alert].
 * @param colors the colors used for button in this action.
 * @param sizes the sizes used for button in this action.
 */
internal class ActionScopeWrapper(
    val scope: RowScope,
    override val colors: ButtonColors,
    override val sizes: ButtonSizes
) : ActionScope, RowScope by scope

/**
 * The extension function for [ActionScope] that represent actions in this [Alert].
 *
 * @param title text that will be displayed in the action.
 * @param onClick called when this action is clicked
 */
@Composable
fun ActionScope.Action(
    title: String,
    onClick: () -> Unit
) {
    Button(
        text = title,
        colors = colors,
        onClick = onClick,
        sizes = sizes
    )
}