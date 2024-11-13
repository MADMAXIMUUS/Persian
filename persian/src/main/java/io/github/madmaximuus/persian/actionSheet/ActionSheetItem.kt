package io.github.madmaximuus.persian.actionSheet

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.actionSheet.utils.AnimatedTransitionDialogHelper
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.text.Text

/**
 * The scope of Item in this [ActionSheet].
 *
 * @property animatedTransitionDialogHelper the [AnimatedTransitionDialogHelper] for launch dismiss animation.
 * @property colors the colors used for text and leading icon.
 * @property sizes the sizes used for text and leading icon.
 */
interface ActionSheetItemScope : ColumnScope {
    val animatedTransitionDialogHelper: AnimatedTransitionDialogHelper
    val colors: ActionSheetItemColors
    val sizes: ActionSheetItemSizes
}

/**
 * The wrapper class for scope of action in this [ActionSheet].
 *
 * @param scope the column scope used in action.
 * @param animatedTransitionDialogHelper the [AnimatedTransitionDialogHelper] for launch dismiss animation.
 * @param colors the colors used for title and subtitle.
 * @param sizes the sizes used for title and subtitle.
 */
internal class ActionSheetItemScopeWrapper(
    val scope: ColumnScope,
    override val animatedTransitionDialogHelper: AnimatedTransitionDialogHelper,
    override val colors: ActionSheetItemColors,
    override val sizes: ActionSheetItemSizes,
) : ActionSheetItemScope, ColumnScope by scope

/**
 * The extension function for [ActionSheetItemScope] that represent action in this [ActionSheet].
 *
 * @param text text that will be displayed in the action.
 * @param leadingIcon icon that will be displayed in the action.
 * @param enabled controls the enabled state of this action. When `false`, this component will not
 * respond to user input, and it will appear visually disabled.
 * @param destructive controls the destructive state of this action. When `true`, this component will change the color of text and icon.
 * @param onClick called when this action is clicked
 */
@Composable
fun ActionSheetItemScope.Action(
    text: String,
    leadingIcon: Painter? = null,
    enabled: Boolean = true,
    destructive: Boolean = false,
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
            .clickable(
                enabled = enabled,
                onClick = {
                    onClick()
                    this@Action.animatedTransitionDialogHelper.triggerAnimatedDismiss()
                },
                role = Role.Button,
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple(
                    color = this@Action.colors.textColor(
                        enabled = enabled,
                        destructive = destructive
                    )
                )
            )
            .padding(
                horizontal = PersianTheme.spacing.size16,
            ),
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12),
        verticalAlignment = Alignment.CenterVertically
    ) {
        leadingIcon?.let {
            Icon(
                painter = it,
                sizes = this@Action.sizes.iconSize,
                tint = this@Action.colors.iconColor(enabled, destructive)
            )
        }
        Text(
            text = text,
            style = this@Action.sizes.textStyle,
            color = this@Action.colors.textColor(enabled = enabled, destructive = destructive),
        )
    }
}
