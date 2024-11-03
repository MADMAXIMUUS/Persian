package io.github.madmaximuus.persian.alert

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.button.TertiaryButton

/**
 * Interface representing a scope that provides action-specific properties.
 *
 * @property color the color used for button in this action.
 * @property sizes the sizes used for button in this action.
 */
interface ActionScope : RowScope {
    val color: Color
    val sizes: ButtonSizes
}

/**
 * The wrapper class for scope of action in this [Alert].
 *
 * @param scope the row scope used in [Alert].
 * @param color the color used for button in this action.
 * @param sizes the sizes used for button in this action.
 */
internal class ActionScopeWrapper(
    val scope: RowScope,
    override val color: Color,
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
    TertiaryButton(
        text = title,
        colors = ButtonDefaults.tertiaryColors(
            contentColor = color
        ),
        onClick = onClick,
        sizes = sizes
    )
}