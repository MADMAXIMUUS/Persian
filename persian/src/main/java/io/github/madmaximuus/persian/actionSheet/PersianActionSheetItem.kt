package io.github.madmaximuus.persian.actionSheet

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.PersianIconBox

/**
 * @property text Text to be displayed in action
 * @property leadingIcon Icon to be displayed in action
 * @property enabled Is the action enabled or not?
 * @property negative Is the action negative or not
 * @property onClick Action that is called when the action is clicked
 */
data class ActionSheetItem(
    val text: String,
    val leadingIcon: Painter? = null,
    val enabled: Boolean = true,
    val negative: Boolean = false,
    val onClick: () -> Unit
)


@Composable
internal fun PersianActionSheetItem(
    modifier: Modifier = Modifier,
    actionSheetItem: ActionSheetItem,
    animatedTransitionDialogHelper: AnimatedTransitionDialogHelper,
    itemColors: ActionSheetItemColors
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(52.dp)
            .clickable(
                enabled = actionSheetItem.enabled,
                onClick = {
                    actionSheetItem.onClick()
                    animatedTransitionDialogHelper.triggerAnimatedDismiss()
                },
                role = Role.Button,
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(
                    color = itemColors.defaultTextColor
                )
            )
            .padding(
                start = MaterialTheme.spacing.medium,
            ),
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small),
        verticalAlignment = Alignment.CenterVertically
    ) {
        actionSheetItem.leadingIcon?.let {
            CompositionLocalProvider(
                LocalContentColor provides itemColors.iconColor(
                    actionSheetItem.enabled,
                    actionSheetItem.negative
                )
            ) {
                PersianIconBox(icon = it)
            }
        }
        val padding = if (actionSheetItem.leadingIcon == null) MaterialTheme.spacing.small
        else 0.dp
        Text(
            modifier = Modifier.padding(start = padding),
            text = actionSheetItem.text,
            style = MaterialTheme.typography.titleMedium,
            color = itemColors
                .textColor(
                    enabled = actionSheetItem.enabled,
                    isError = actionSheetItem.negative
                ),
        )
    }
}