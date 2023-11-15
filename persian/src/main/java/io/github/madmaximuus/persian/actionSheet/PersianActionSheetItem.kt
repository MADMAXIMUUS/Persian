package io.github.madmaximuus.persian.actionSheet

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.PersianIconBox

data class ActionSheetItem(
    val text: String,
    val leadingIcon: Painter? = null,
    val enabled: Boolean = true,
    val negative: Boolean = false,
    val onClick: (AnimatedTransitionDialogHelper) -> Unit
)

@Deprecated("Replace with PersianActionSheetItem()", level = DeprecationLevel.WARNING)
object PersianActionItem {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        actionSheetItem: ActionSheetItem,
        animatedTransitionDialogHelper: AnimatedTransitionDialogHelper,
        itemColors: ActionSheetItemColors
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .clickable(
                    enabled = actionSheetItem.enabled,
                    onClick = {
                        actionSheetItem.onClick(animatedTransitionDialogHelper)
                    },
                    role = Role.Button
                )
                .padding(
                    start = MaterialTheme.spacing.medium,
                    top = MaterialTheme.spacing.medium,
                    bottom = MaterialTheme.spacing.medium,
                    end = 0.dp
                ),
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
        ) {
            val textColor = itemColors
                .textColor(
                    enabled = actionSheetItem.enabled,
                    isError = actionSheetItem.negative
                ).value
            actionSheetItem.leadingIcon?.let {
                PersianIconBox.Primary(
                    icon = it,
                    enabled = actionSheetItem.enabled,
                    isError = actionSheetItem.negative,
                    colors = itemColors.iconColors
                )
            }
            Text(
                modifier = Modifier.height(24.dp),
                text = actionSheetItem.text,
                style = MaterialTheme.typography.titleMedium,
                color = textColor
            )
        }
    }
}

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
            .clickable(
                enabled = actionSheetItem.enabled,
                onClick = {
                    actionSheetItem.onClick(animatedTransitionDialogHelper)
                },
                role = Role.Button
            )
            .padding(
                start = MaterialTheme.spacing.medium,
                top = MaterialTheme.spacing.medium,
                bottom = MaterialTheme.spacing.medium,
                end = 0.dp
            ),
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
    ) {
        val textColor = itemColors
            .textColor(enabled = actionSheetItem.enabled, isError = actionSheetItem.negative).value
        actionSheetItem.leadingIcon?.let {
            PersianIconBox.Primary(
                icon = it,
                enabled = actionSheetItem.enabled,
                isError = actionSheetItem.negative,
                colors = itemColors.iconColors
            )
        }
        Text(
            modifier = Modifier.height(24.dp),
            text = actionSheetItem.text,
            style = MaterialTheme.typography.titleMedium,
            color = textColor
        )
    }
}