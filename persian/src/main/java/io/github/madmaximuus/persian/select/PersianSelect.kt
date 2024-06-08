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
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.window.PopupProperties
import io.github.madmaximuus.persian.foundation.shape
import io.github.madmaximuus.persian.inputs.InputColors
import io.github.madmaximuus.persian.inputs.PersianInputsDefaults
import io.github.madmaximuus.persian.inputs.PersianOutlineInput
import io.github.madmaximuus.persian.menus.MenuColors
import io.github.madmaximuus.persian.menus.PersianMenuDefaults
import io.github.madmaximuus.persian.menus.PersianMenuItem
import io.github.madmaximuus.persianSymbols.chevronDown.base.ChevronDown
import io.github.madmaximuus.persianSymbols.chevronUp.base.ChevronUp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

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
    isValid: Boolean = false,
    expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
    leadingIcon: Painter? = null,
    inputColors: InputColors = PersianInputsDefaults.outlineColors(),
    menuColors: MenuColors = PersianMenuDefaults.colors(),
) {
    ExposedDropdownMenuBox(
        modifier = modifier,
        expanded = expanded.value,
        onExpandedChange = { expanded.value = !expanded.value }
    ) {
        PersianOutlineInput(
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor(),
            value = selected,
            leadingIcon = leadingIcon,
            placeholder = placeholder,
            onValueChange = {},
            readOnly = true,
            isError = isError,
            isValid = isValid,
            enabled = enabled,
            colors = inputColors,
            trailingIcon = if (expanded.value) rememberVectorPainter(image = PersianSymbols.Default.ChevronUp)
            else rememberVectorPainter(image = PersianSymbols.Default.ChevronDown),
        )
        MaterialTheme(shapes = MaterialTheme.shapes.copy(extraSmall = MaterialTheme.shape.shape16)) {
            DropdownMenu(
                modifier = Modifier
                    .exposedDropdownSize()
                    .background(menuColors.backgroundColor, MaterialTheme.shape.shape16),
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