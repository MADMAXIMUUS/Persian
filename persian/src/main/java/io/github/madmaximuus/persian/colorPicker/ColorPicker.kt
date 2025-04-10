package io.github.madmaximuus.persian.colorPicker

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerView
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.modalPage.ModalPage
import io.github.madmaximuus.persian.modalPage.rememberPageState
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import io.github.madmaximuus.persian.text.Text

/**
 * A color picker dialog is useful for selecting and customizing colors, providing users with
 * a convenient interface to choose from a wide range of color options. It offers a straightforward
 * and intuitive method for color selection, making it an effective tool for enhancing design
 * and user experience.
 *
 * @param state The state of the color picker, which contains information about the selected color
 * and other configurations.
 * @param title Title that will be display at top of the picker
 * @param colors The colors used for the color picker and the modal page.
 * @param onDismissRequest A callback function that is invoked when the user requests to dismiss
 * the dialog.
 */
@Composable
fun ColorPicker(
    state: ColorPickerState,
    title: String = stringResource(R.string.select_color),
    colors: ColorPickerColors = ColorPickerDefaults.colors(),
    onDismissRequest: () -> Unit
) {
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val maxModifier =
        if (widthSizeClass != WindowWidthSizeClass.COMPACT && heightSizeClass != WindowHeightSizeClass.COMPACT)
            Modifier.widthIn(max = 400.dp) else Modifier

    val insets =
        if (heightSizeClass == WindowHeightSizeClass.COMPACT)
            WindowInsets.safeContent.only(WindowInsetsSides.Horizontal)
        else WindowInsets(0, 0, 0, 0)

    ModalPage(
        pageState = rememberPageState(dragAnchors = setOf(DragAnchor.Fraction(0.7f))),
        contentWindowInsets = insets,
        onDismissRequest = onDismissRequest,
    ) {
        Column {
            Text(
                modifier = maxModifier
                    .fillMaxWidth()
                    .padding(top = PersianTheme.spacing.size20)
                    .padding(bottom = PersianTheme.spacing.size12),
                text = title,
                textAlign = TextAlign.Center,
                style = PersianTheme.typography.titleMedium,
                color = colors.titleColors
            )
            ColorPickerView(
                modifier = maxModifier.padding(bottom = PersianTheme.spacing.size16),
                state = state,
                colors = colors.colorPickerViewColors
            )
        }
    }
}