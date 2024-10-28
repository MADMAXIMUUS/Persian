package io.github.madmaximuus.persian.select

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.InputColors
import io.github.madmaximuus.persian.input.InputsDefaults
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.menu.DropdownMenuItemScope
import io.github.madmaximuus.persian.menu.MenuColors
import io.github.madmaximuus.persian.menu.MenuDefaults
import io.github.madmaximuus.persianSymbols.chevronDown.base.ChevronDown
import io.github.madmaximuus.persianSymbols.chevronUp.base.ChevronUp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

/**
 * A composable function that creates a dropdown selection menu.
 *
 * @param selected The currently selected item in the dropdown.
 * @param modifier The [Modifier] to be applied to this composable.
 * @param expanded Whether the dropdown menu is currently expanded.
 * @param onExpandedChange A callback to be invoked when the expanded state changes.
 * @param enabled Whether the dropdown is enabled or disabled.
 * @param placeholder An optional placeholder text to be shown when no item is selected.
 * @param isError Whether the input is in an error state.
 * @param isValid Whether the input is in a valid state.
 * @param leadingIcon An optional leading icon to be shown in the input field.
 * @param inputColors The colors to be used for the input field.
 * @param menuColors The colors to be used for the dropdown menu.
 * @param menuItems A composable lambda that defines the items to be displayed in the dropdown menu.
 */
@Composable
fun Select(
    selected: String,
    modifier: Modifier = Modifier,
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    placeholder: String? = null,
    isError: Boolean = false,
    isValid: Boolean = false,
    leadingIcon: Painter? = null,
    inputColors: InputColors = InputsDefaults.outlineColors(),
    menuColors: MenuColors = MenuDefaults.colors(),
    menuItems: @Composable (DropdownMenuItemScope.() -> Unit)
) {
    ExposedDropdownMenuBox(
        modifier = modifier,
        expanded = expanded,
        onExpandedChange = onExpandedChange
    ) {
        OutlineInput(
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor(MenuAnchorType.PrimaryNotEditable, enabled),
            value = selected,
            leadingIcon = leadingIcon,
            placeholder = placeholder,
            onValueChange = {},
            readOnly = true,
            isError = isError,
            isValid = isValid,
            enabled = enabled,
            colors = inputColors,
            trailingIcon = if (expanded) rememberVectorPainter(image = PersianSymbols.Default.ChevronUp)
            else rememberVectorPainter(image = PersianSymbols.Default.ChevronDown),
        )
        ExposedDropdownMenu(
            modifier = Modifier
                .exposedDropdownSize()
                .background(menuColors.containerColor, PersianTheme.shapes.shape16),
            expanded = expanded,
            onDismissRequest = { onExpandedChange(false) },
            content = menuItems
        )
    }
}