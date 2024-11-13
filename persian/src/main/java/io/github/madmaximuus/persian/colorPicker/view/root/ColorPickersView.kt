package io.github.madmaximuus.persian.colorPicker.view.root

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.grid.GridView
import io.github.madmaximuus.persian.colorPicker.view.sliders.SlidersView
import io.github.madmaximuus.persian.colorPicker.view.spectrum.HueSliderView
import io.github.madmaximuus.persian.colorPicker.view.spectrum.SaturationValueView
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerDisplayMode
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.foundation.PersianSubcomposeLayout
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Provide a base layout for various color picker views.
 *
 * It uses a [PersianSubcomposeLayout] to manage the layout of the main content and dependent content.
 * The main content is always a [GridView], while the dependent content varies based on the [state].
 *
 * @param modifier The modifier to be applied to the layout.
 * @param state The state of the color picker.
 * @param colors The colors used by these views.
 */
@Composable
fun ColorPickersView(
    modifier: Modifier,
    state: ColorPickerState,
    colors: ColorPickerViewColors
) {
    PersianSubcomposeLayout(
        modifier = modifier,
        mainContent = {
            GridView(state, colors)
        },
        dependentContent = {
            Box(
                modifier = Modifier
                    .size(it),
                contentAlignment = Alignment.Center
            ) {
                when (state.mode) {
                    ColorPickerDisplayMode.GRID -> {
                        GridView(state, colors)
                    }

                    ColorPickerDisplayMode.SPECTRUM -> {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            SaturationValueView(
                                state = state,
                                colors = colors
                            )
                            HueSliderView(
                                state = state,
                                colors = colors
                            )
                        }
                    }

                    ColorPickerDisplayMode.SLIDERS -> {
                        SlidersView(state, colors)
                    }
                }
            }
        }
    )
}