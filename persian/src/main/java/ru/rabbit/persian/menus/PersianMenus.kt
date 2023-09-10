package ru.rabbit.persian.menus

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.window.PopupProperties
import kotlinx.coroutines.flow.filter
import ru.rabbit.persian.foundation.PersianTheme

object PersianMenus {

    @Composable
    fun Dropdown(
        anchor: @Composable () -> Unit,
        modifier: Modifier = Modifier,
        expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        onDismissRequest: () -> Unit = {},
        colors: MenuColors = PersianMenuColors.primary(),
        offset: DpOffset = DpOffset.Zero,
        children: @Composable PersianMenuItem.() -> Unit
    ) {
        LaunchedEffect(interactionSource) {
            interactionSource.interactions
                .filter { it is PressInteraction.Press }
                .collect {
                    expanded.value = !expanded.value
                }
        }

        Box {
            anchor()
            MaterialTheme(shapes = MaterialTheme.shapes.copy(extraSmall = MaterialTheme.shapes.large)) {
                DropdownMenu(
                    modifier = modifier
                        .background(colors.backgroundColor, MaterialTheme.shapes.extraLarge),
                    expanded = expanded.value,
                    offset = offset,
                    onDismissRequest = {
                        onDismissRequest()
                        expanded.value = false
                    },
                    properties = PopupProperties(clippingEnabled = false),
                    content = { PersianMenuItem.children() }
                )
            }

        }
    }
}