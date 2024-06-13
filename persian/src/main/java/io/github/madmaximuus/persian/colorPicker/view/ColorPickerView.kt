package io.github.madmaximuus.persian.colorPicker.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.colorPicker.view.inputs.HexInput
import io.github.madmaximuus.persian.colorPicker.view.inputs.HsvInput
import io.github.madmaximuus.persian.colorPicker.view.inputs.RgbInput
import io.github.madmaximuus.persian.colorPicker.view.panels.AlphaBarCompact
import io.github.madmaximuus.persian.colorPicker.view.panels.AlphaBarMedium
import io.github.madmaximuus.persian.colorPicker.view.panels.HueBarCompact
import io.github.madmaximuus.persian.colorPicker.view.panels.HueBarMedium
import io.github.madmaximuus.persian.colorPicker.view.saturation.SatValPanel
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerDisplayMode
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Composable
internal fun ColorPickerView(
    state: ColorPickerState,
    colors: ColorPickerViewColors
) {
    val windowWidthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    Column(
        modifier = Modifier
            .padding(PersianTheme.spacing.size12)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        if (windowWidthSizeClass == WindowWidthSizeClass.COMPACT) {
            SatValPanel(
                hsvColor = state.color,
                setSatVal = state::updateSatVal,
                colors = colors
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
            ) {
                HueBarCompact(
                    value = state.color.first,
                    setColor = state::updateColor,
                    colors = colors
                )
                AlphaBarCompact(
                    color = state.color,
                    alpha = state.alpha,
                    setAlpha = state::updateAlpha,
                    colors = colors
                )
            }
        } else {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
            ) {
                SatValPanel(
                    hsvColor = state.color,
                    setSatVal = state::updateSatVal,
                    colors = colors
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                ) {
                    HueBarMedium(
                        value = state.color.first,
                        setColor = state::updateColor,
                        colors = colors
                    )
                    AlphaBarMedium(
                        color = state.color,
                        alpha = state.alpha,
                        setAlpha = state::updateAlpha,
                        colors = colors
                    )
                }
                if (windowHeightSizeClass == WindowHeightSizeClass.COMPACT) {
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .background(
                                Color.hsv(
                                    hue = state.color.first,
                                    saturation = state.color.second,
                                    value = state.color.third,
                                    alpha = state.alpha
                                ),
                                PersianTheme.shapes.shape4
                            )
                    )
                }
            }
        }
        if (windowHeightSizeClass != WindowHeightSizeClass.COMPACT) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
            ) {
                when (state.mode) {
                    ColorPickerDisplayMode.HEX -> {
                        HexInput(
                            modifier = Modifier.weight(0.7f),
                            value = state.getHexColor()
                        )
                    }

                    ColorPickerDisplayMode.RGB -> {
                        RgbInput(
                            modifier = Modifier.weight(3f),
                            value = state.getRGBColor()
                        )
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
                            .clip(PersianTheme.shapes.shape4)
                            .clickable {
                                state.setRGB()
                            }
                            .padding(
                                vertical = PersianTheme.spacing.size4,
                                horizontal = PersianTheme.spacing.size8
                            ),
                        text = "RGB",
                        style = PersianTheme.typography.bodyLarge,
                        color = if (state.mode == ColorPickerDisplayMode.RGB)
                            colors.colorModeTitleSelectedColor
                        else colors.colorModeTitleColor
                    )
                    Text(
                        modifier = Modifier
                            .clip(PersianTheme.shapes.shape4)
                            .clickable {
                                state.setHEX()
                            }
                            .padding(
                                vertical = PersianTheme.spacing.size4,
                                horizontal = PersianTheme.spacing.size8
                            ),
                        text = "HEX",
                        style = MaterialTheme.typography.bodyLarge,
                        color = if (state.mode == ColorPickerDisplayMode.HEX)
                            colors.colorModeTitleSelectedColor
                        else colors.colorModeTitleColor
                    )
                    Text(
                        modifier = Modifier
                            .clip(PersianTheme.shapes.shape4)
                            .clickable {
                                state.setHSV()
                            }
                            .padding(
                                vertical = PersianTheme.spacing.size4,
                                horizontal = PersianTheme.spacing.size8
                            ),
                        text = "HSV",
                        style = MaterialTheme.typography.bodyLarge,
                        color = if (state.mode == ColorPickerDisplayMode.HSV)
                            colors.colorModeTitleSelectedColor
                        else colors.colorModeTitleColor
                    )
                }
                if (windowWidthSizeClass == WindowWidthSizeClass.COMPACT) {
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
                                PersianTheme.shapes.shape4
                            )
                    )
                } else {
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .background(
                                Color.hsv(
                                    hue = state.color.first,
                                    saturation = state.color.second,
                                    value = state.color.third,
                                    alpha = state.alpha
                                ),
                                PersianTheme.shapes.shape4
                            )
                    )
                }
            }
        }
    }
}