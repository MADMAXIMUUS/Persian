package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.centered.CenteredSlider
import io.github.madmaximuus.persian.slider.centered.DiscreteCenteredSlider
import io.github.madmaximuus.persian.slider.continuous.DiscreteSlider
import io.github.madmaximuus.persian.slider.continuous.Slider
import io.github.madmaximuus.persian.slider.range.DiscreteRangeSlider
import io.github.madmaximuus.persian.slider.range.RangeSlider
import io.github.madmaximuus.persian.text.Text
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Slider : Screen {

    override val name: String = "Sliders"

    override val navigation: String = "slider"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val (sliderValue, onSliderValueChange) = remember { mutableFloatStateOf(0.0f) }
        val (discreteValue, onDiscreteValueChange) = remember { mutableFloatStateOf(20.0f) }
        val (centeredValue, onCenteredValueChange) = remember { mutableFloatStateOf(0.0f) }
        val (discreteCenteredValue, onDiscreteCenteredValueChange) =
            remember { mutableFloatStateOf(0.0f) }
        val (rangeValue, onRangeValueChange) = remember { mutableStateOf(0f..40f) }
        val (discreteRangeValue, onDiscreteRangeValueChange) = remember { mutableStateOf(0f..40f) }
        val (isValueEnabled, onValueEnabledChange) = remember { mutableStateOf(true) }
        val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .padding(top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size24),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Slider(
                        modifier = Modifier.weight(1f),
                        value = sliderValue,
                        onValueChange = onSliderValueChange,
                        valueRange = 0.0f..40.0f,
                        isValueEnabled = isValueEnabled,
                        enabled = enabled
                    )
                    Text(
                        modifier = Modifier.width(40.dp),
                        text = String.format("%.1f", sliderValue),
                        style = PersianTheme.typography.bodyLarge,
                        color = PersianTheme.colorScheme.onSurface,
                        textAlign = TextAlign.End
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size24),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    DiscreteSlider(
                        modifier = Modifier.weight(1f),
                        value = discreteValue,
                        onValueChange = onDiscreteValueChange,
                        steps = 3,
                        valueRange = 0.0f..40.0f,
                        isValueEnabled = isValueEnabled,
                        enabled = enabled
                    )
                    Text(
                        modifier = Modifier.width(40.dp),
                        text = String.format("%.1f", discreteValue),
                        style = PersianTheme.typography.bodyLarge,
                        color = PersianTheme.colorScheme.onSurface,
                        textAlign = TextAlign.End
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size24),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CenteredSlider(
                        modifier = Modifier.weight(1f),
                        value = centeredValue,
                        onValueChange = onCenteredValueChange,
                        valueRange = -20.0f..20.0f,
                        isValueEnabled = isValueEnabled,
                        enabled = enabled
                    )
                    Text(
                        modifier = Modifier.width(40.dp),
                        text = String.format("%.1f", centeredValue),
                        style = PersianTheme.typography.bodyLarge,
                        color = PersianTheme.colorScheme.onSurface,
                        textAlign = TextAlign.End
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size24),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    DiscreteCenteredSlider(
                        modifier = Modifier.weight(1f),
                        value = discreteCenteredValue,
                        steps = 3,
                        onValueChange = onDiscreteCenteredValueChange,
                        valueRange = -20f..20.0f,
                        isValueEnabled = isValueEnabled,
                        enabled = enabled
                    )
                    Text(
                        modifier = Modifier.width(40.dp),
                        text = String.format("%.1f", discreteCenteredValue),
                        style = PersianTheme.typography.bodyLarge,
                        color = PersianTheme.colorScheme.onSurface,
                        textAlign = TextAlign.End
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size24),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier.width(35.dp),
                        text = String.format("%.1f", rangeValue.start),
                        style = PersianTheme.typography.bodyLarge,
                        color = PersianTheme.colorScheme.onSurface,
                        textAlign = TextAlign.Start
                    )
                    RangeSlider(
                        modifier = Modifier.weight(1f),
                        value = rangeValue,
                        onValueChange = onRangeValueChange,
                        valueRange = 0f..40f,
                        isValueEnabled = isValueEnabled,
                        enabled = enabled
                    )
                    Text(
                        modifier = Modifier.width(40.dp),
                        text = String.format("%.1f", rangeValue.endInclusive),
                        style = PersianTheme.typography.bodyLarge,
                        color = PersianTheme.colorScheme.onSurface,
                        textAlign = TextAlign.End
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size24),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier.width(35.dp),
                        text = String.format("%.1f", discreteRangeValue.start),
                        style = PersianTheme.typography.bodyLarge,
                        color = PersianTheme.colorScheme.onSurface,
                        textAlign = TextAlign.Start
                    )
                    DiscreteRangeSlider(
                        modifier = Modifier.weight(1f),
                        value = discreteRangeValue,
                        onValueChange = onDiscreteRangeValueChange,
                        steps = 3,
                        valueRange = 0f..40f,
                        isValueEnabled = isValueEnabled,
                        enabled = enabled
                    )
                    Text(
                        modifier = Modifier.width(40.dp),
                        text = String.format("%.1f", discreteRangeValue.endInclusive),
                        style = PersianTheme.typography.bodyLarge,
                        color = PersianTheme.colorScheme.onSurface,
                        textAlign = TextAlign.End
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = PersianTheme.spacing.size8,
                            bottom = PersianTheme.spacing.size8,
                            start = PersianTheme.spacing.size12,
                            end = PersianTheme.spacing.size12
                        ),
                ) {
                    Text(
                        text = "Additional settings",
                        style = PersianTheme.typography.titleMedium,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Label",
                            checked = isValueEnabled,
                            onCheckedChange = onValueEnabledChange
                        )
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Enabled",
                            checked = enabled,
                            onCheckedChange = onEnabledChange
                        )
                    }
                }
            }
        }
    }
}