package io.github.madmaximuus.persian.select

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.window.PopupProperties
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.inputs.InputColors
import io.github.madmaximuus.persian.inputs.PersianInput
import io.github.madmaximuus.persian.inputs.PersianInputDefaults
import io.github.madmaximuus.persian.menus.MenuColors
import io.github.madmaximuus.persian.menus.PersianMenuDefaults
import io.github.madmaximuus.persian.menus.PersianMenuItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersianSelect(
    selected: String,
    values: List<SelectActionItem>,
    onSelectedChange: (option: String, index: Int) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    placeholder: String? = null,
    isError: Boolean = false,
    isSuccess: Boolean = false,
    expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
    leadingIcon: Painter? = null,
    inputColors: InputColors = PersianInputDefaults.colors(),
    menuColors: MenuColors = PersianMenuDefaults.colors(),
) {
    ExposedDropdownMenuBox(
        modifier = modifier,
        expanded = expanded.value,
        onExpandedChange = { expanded.value = !expanded.value }
    ) {
        PersianInput(
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor(),
            value = selected,
            leadingIcon = leadingIcon,
            placeholder = placeholder,
            onValueChange = {},
            readOnly = true,
            isError = isError,
            isSuccess = isSuccess,
            enabled = enabled,
            colors = inputColors,
            trailingIcon = if (expanded.value) MaterialTheme.icons.expendLess
            else MaterialTheme.icons.expendMore,
        )
        MaterialTheme(shapes = MaterialTheme.shapes.copy(extraSmall = MaterialTheme.shapes.large)) {
            DropdownMenu(
                modifier = Modifier
                    .exposedDropdownSize()
                    .background(menuColors.backgroundColor, MaterialTheme.shapes.large),
                expanded = expanded.value,
                properties = PopupProperties(clippingEnabled = false),
                onDismissRequest = { expanded.value = false }
            ) {
                values.forEachIndexed { index, item ->
                    when (item) {
                        is SelectActionItem.IconUrl -> {
                            PersianMenuItem(
                                title = item.title,
                                onItemClick = {
                                    onSelectedChange(item.title, index)
                                    expanded.value = !expanded.value
                                },
                                leadingIconUrl = item.iconUrl
                            )
                        }

                        is SelectActionItem.PainterIcon -> {
                            PersianMenuItem(
                                title = item.title,
                                onItemClick = {
                                    onSelectedChange(item.title, index)
                                    expanded.value = !expanded.value
                                },
                                leadingIcon = item.icon
                            )
                        }

                        is SelectActionItem.WithoutIcon -> {
                            PersianMenuItem(
                                title = item.title,
                                onItemClick = {
                                    onSelectedChange(item.title, index)
                                    expanded.value = !expanded.value
                                },
                                leadingIconUrl = null
                            )
                        }
                    }
                }
            }
        }
    }
}

sealed class SelectActionItem {
    data class PainterIcon(
        val title: String,
        val enabled: Boolean = true,
        val icon: Painter
    ) : SelectActionItem()

    data class IconUrl(
        val title: String,
        val enabled: Boolean = true,
        val iconUrl: String
    ) : SelectActionItem()

    data class WithoutIcon(
        val title: String,
        val enabled: Boolean = true,
    ) : SelectActionItem()
}