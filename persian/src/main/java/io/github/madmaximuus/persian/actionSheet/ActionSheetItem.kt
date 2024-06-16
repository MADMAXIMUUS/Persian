package io.github.madmaximuus.persian.actionSheet

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.text.Text

@Stable
class ActionSheetItemScope(private val animatedTransitionDialogHelper: AnimatedTransitionDialogHelper) {

    /**
     * @property text Text to be displayed in action
     * @property leadingIcon Icon to be displayed in action
     * @property enabled Is the action enabled or not?
     * @property negative Is the action negative or not
     * @property onClick Action that is called when the action is clicked
     */
    @Composable
    fun ActionItem(
        text: String,
        leadingIcon: Painter? = null,
        enabled: Boolean = true,
        negative: Boolean = false,
        onClick: () -> Unit,
        itemColors: ActionSheetItemColors = ActionSheetDefaults.itemColors()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
                .clickable(
                    enabled = enabled,
                    onClick = {
                        onClick()
                        animatedTransitionDialogHelper.triggerAnimatedDismiss()
                    },
                    role = Role.Button,
                    interactionSource = remember { MutableInteractionSource() },
                    indication = rememberRipple(
                        color = itemColors.defaultTextColor
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
                    tint = itemColors.iconColor(enabled, negative)
                )
            }
            Text(
                text = text,
                style = PersianTheme.typography.bodyLarge,
                color = itemColors.textColor(enabled = enabled, isError = negative),
            )
        }
    }
}