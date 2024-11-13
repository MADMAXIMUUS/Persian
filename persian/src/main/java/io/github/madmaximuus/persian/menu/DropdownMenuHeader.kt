package io.github.madmaximuus.persian.menu

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton

/**
 * Interface representing the scope for a dropdown menu header item.
 *
 * This interface extends [RowScope] and provides a specific scope for defining the layout and behavior
 * of a header item within a dropdown menu.
 */
interface DropdownMenuHeaderItemScope : RowScope

/**
 * Wrapper class for [DropdownMenuHeaderItemScope].
 *
 * This class encapsulates a [RowScope] instance and provides implementations for the properties and methods
 * defined in [DropdownMenuHeaderItemScope]. It allows for the creation of a dropdown menu header item scope
 * by delegating to an underlying [RowScope].
 *
 * @param scope The underlying [RowScope] instance.
 */
class DropdownMenuHeaderItemScopeWrapper(
    val scope: RowScope
) : DropdownMenuHeaderItemScope, RowScope by scope

/**
 * Interface representing the scope for a dropdown menu header.
 *
 * This interface extends [ColumnScope] and provides a specific scope for defining the layout and behavior
 * of a header within a dropdown menu.
 */
interface DropdownMenuHeaderScope : ColumnScope

/**
 * Wrapper class for [DropdownMenuHeaderScope].
 *
 * This class encapsulates a [ColumnScope] instance and provides implementations for the properties and methods
 * defined in [DropdownMenuHeaderScope]. It allows for the creation of a dropdown menu header scope
 * by delegating to an underlying [ColumnScope].
 *
 * @param scope The underlying [ColumnScope] instance.
 */
class DropdownMenuHeaderScopeWrapper(
    val scope: ColumnScope
) : DropdownMenuHeaderScope, ColumnScope by scope

/**
 * Composable function to create a button within the dropdown menu header item scope.
 *
 * This function provides a way to add a button with an icon to the dropdown menu header item.
 *
 * @param modifier The modifier to be applied to the button.
 * @param icon The icon to be displayed on the button.
 * @param onClick The callback to be invoked when the button is clicked.
 */
@Composable
fun DropdownMenuHeaderItemScope.Button(
    modifier: Modifier = Modifier,
    icon: Painter,
    onClick: () -> Unit
) {
    TertiaryIconButton(
        modifier = modifier,
        onClick = onClick,
        sizes = IconButtonDefaults.mediumSizes(),
        icon = icon
    )
}

/**
 * Composable function to create a header within the dropdown menu header scope.
 *
 * This function provides a way to define the layout and content of a header within a dropdown menu.
 * It allows for the inclusion of multiple items within the header by using a lambda function.
 *
 * @param modifier The modifier to be applied to the header.
 * @param items A composable lambda function that defines the content of the header.
 */
@Composable
fun DropdownMenuHeaderScope.Header(
    modifier: Modifier = Modifier,
    items: @Composable DropdownMenuHeaderItemScope.() -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            val scope = remember { DropdownMenuHeaderItemScopeWrapper(this) }
            scope.items()
        }
    }
}

