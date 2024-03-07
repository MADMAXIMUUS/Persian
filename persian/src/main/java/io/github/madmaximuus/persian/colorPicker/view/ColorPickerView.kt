package io.github.madmaximuus.persian.colorPicker.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.colorPicker.view.inputs.HexInput
import io.github.madmaximuus.persian.colorPicker.view.inputs.HsvInput
import io.github.madmaximuus.persian.colorPicker.view.inputs.RgbInput
import io.github.madmaximuus.persian.colorPicker.view.panels.AlphaBar
import io.github.madmaximuus.persian.colorPicker.view.panels.HueBar
import io.github.madmaximuus.persian.colorPicker.view.saturation.SatValPanel
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerDisplayMode
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.foundation.spacing

@Composable
internal fun ColorPickerView(
    state: ColorPickerState,
    colors: ColorPickerViewColors
) {
    Column(
        modifier = Modifier
            .padding(MaterialTheme.spacing.medium)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
    ) {
        SatValPanel(
            hsvColor = state.color,
            setSatVal = state::updateSatVal,
            colors = colors
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraSmall)
        ) {
            HueBar(
                value = state.color.first,
                setColor = state::updateColor,
                colors = colors
            )
            AlphaBar(
                color = state.color,
                alpha = state.alpha,
                setAlpha = state::updateAlpha,
                colors = colors
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraSmall)
        ) {
            when (state.mode) {
                ColorPickerDisplayMode.HEX -> {
                    HexInput(
                        modifier = Modifier.weight(0.7f),
                        value = state.getHexColor()
                    )
                    Spacer(modifier = Modifier.weight(0.5f))
                }

                ColorPickerDisplayMode.RGB -> {
                    RgbInput(
                        modifier = Modifier.weight(3f),
                        value = state.getRGBColor()
                    )
                    Spacer(modifier = Modifier.weight(0.5f))
                }

                ColorPickerDisplayMode.HSV -> {
                    HsvInput(
                        modifier = Modifier.weight(3f),
                        value = state.color
                    )
                }
            }
            Column {
                Text(
                    modifier = Modifier
                        .clip(MaterialTheme.shapes.extraSmall)
                        .clickable {
                            state.setRGB()
                        }
                        .padding(
                            vertical = MaterialTheme.spacing.extraSmall,
                            horizontal = MaterialTheme.spacing.small
                        ),
                    text = "RGB",
                    style = MaterialTheme.typography.bodyLarge,
                    color = if (state.mode == ColorPickerDisplayMode.RGB)
                        colors.colorModeTitleSelectedColor
                    else colors.colorModeTitleColor
                )
                Text(
                    modifier = Modifier
                        .clip(MaterialTheme.shapes.extraSmall)
                        .clickable {
                            state.setHEX()
                        }
                        .padding(
                            vertical = MaterialTheme.spacing.extraSmall,
                            horizontal = MaterialTheme.spacing.small
                        ),
                    text = "HEX",
                    style = MaterialTheme.typography.bodyLarge,
                    color = if (state.mode == ColorPickerDisplayMode.HEX)
                        colors.colorModeTitleSelectedColor
                    else colors.colorModeTitleColor
                )
                Text(
                    modifier = Modifier
                        .clip(MaterialTheme.shapes.extraSmall)
                        .clickable {
                            state.setHSV()
                        }
                        .padding(
                            vertical = MaterialTheme.spacing.extraSmall,
                            horizontal = MaterialTheme.spacing.small
                        ),
                    text = "HSV",
                    style = MaterialTheme.typography.bodyLarge,
                    color = if (state.mode == ColorPickerDisplayMode.HSV)
                        colors.colorModeTitleSelectedColor
                    else colors.colorModeTitleColor
                )
            }
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(
                        Color.hsv(
                            hue = state.color.first,
                            saturation = state.color.second,
                            value = state.color.third,
                            alpha = state.alpha
                        ),
                        MaterialTheme.shapes.extraSmall
                    )
            )
        }
    }
}