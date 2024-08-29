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