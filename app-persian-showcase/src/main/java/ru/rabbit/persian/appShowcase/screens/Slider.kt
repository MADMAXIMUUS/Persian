package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.centered.CenteredSlider
import io.github.madmaximuus.persian.slider.centered.DiscreteCenteredSlider
import io.github.madmaximuus.persian.slider.content.Icon
import io.github.madmaximuus.persian.slider.content.Text
import io.github.madmaximuus.persian.slider.continuous.DiscreteSlider
import io.github.madmaximuus.persian.slider.continuous.Slider
import io.github.madmaximuus.persian.slider.range.DiscreteRangeSlider
import io.github.madmaximuus.persian.slider.range.RangeSlider
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.speaker.Speaker
import io.github.madmaximuus.persianSymbols.speaker.minus.SpeakerMinus
import io.github.madmaximuus.persianSymbols.speaker.wave.two.SpeakerWave2
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import java.util.Locale.getDefault

object Slider : Screen {

    override val name: String = "Sliders"

    override val image: Int = R.drawable.slider

    override val navigation: String = "slider"

    @Composable
    override fun Content(navController: NavController?) {
        val (sliderValue, onSliderValueChange) = remember { mutableFloatStateOf(0.0f) }
        val (discreteValue, onDiscreteValueChange) = remember { mutableFloatStateOf(20.0f) }
        val (centeredValue, onCenteredValueChange) = remember { mutableFloatStateOf(0.0f) }
        val (discreteCenteredValue, onDiscreteCenteredValueChange) = remember {
            mutableFloatStateOf(
                0.0f
            )
        }
        val (rangeValue, onRangeValueChange) = remember { mutableStateOf(0f..40f) }
        val (discreteRangeValue, onDiscreteRangeValueChange) = remember { mutableStateOf(0f..40f) }

        val (label, onLabelChange) = remember { mutableStateOf(true) }
        val (values, onValuesChange) = remember { mutableStateOf(false) }
        val (enabled, onEnabledChange) = remember { mutableStateOf(true) }

        val typeStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
                mutableStateOf(false),
            )
        }

        val modeStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
            )
        }

        val contentStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
            )
        }

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
            ) {
                SampleRow(text = "Sample", firstItem = true) {
                    when {
                        typeStates[0].value -> {
                            when {
                                modeStates[0].value -> {
                                    Column(
                                        modifier = Modifier.padding(horizontal = PersianTheme.spacing.size24),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            modifier = Modifier.width(40.dp),
                                            text = String.format(getDefault(), "%.1f", sliderValue),
                                            style = PersianTheme.typography.bodyLarge,
                                            color = PersianTheme.colorScheme.onSurface,
                                            textAlign = TextAlign.End
                                        )
                                        Slider(
                                            value = sliderValue,
                                            onValueChange = onSliderValueChange,
                                            valueRange = 0.0f..40.0f,
                                            showLabel = label,
                                            enabled = enabled,
                                            leading = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 0.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.Speaker))
                                                        }
                                                    }
                                                }
                                            } else null,
                                            trailing = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 40.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.SpeakerWave2))
                                                        }
                                                    }
                                                }
                                            } else null
                                        )
                                    }
                                }

                                modeStates[1].value -> {
                                    Column(
                                        modifier = Modifier
                                            .padding(horizontal = PersianTheme.spacing.size24),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            modifier = Modifier.width(40.dp),
                                            text = String.format(
                                                getDefault(),
                                                "%.1f",
                                                discreteValue
                                            ),
                                            style = PersianTheme.typography.bodyLarge,
                                            color = PersianTheme.colorScheme.onSurface,
                                            textAlign = TextAlign.End
                                        )
                                        DiscreteSlider(
                                            value = discreteValue,
                                            onValueChange = onDiscreteValueChange,
                                            steps = 3,
                                            valueRange = 0.0f..40.0f,
                                            showLabel = label,
                                            enabled = enabled,
                                            leading = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 0.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.Speaker))
                                                        }
                                                    }
                                                }
                                            } else null,
                                            trailing = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 40.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.SpeakerWave2))
                                                        }
                                                    }
                                                }
                                            } else null
                                        )
                                    }
                                }
                            }
                        }

                        typeStates[1].value -> {
                            when {
                                modeStates[0].value -> {
                                    Column(
                                        modifier = Modifier
                                            .padding(horizontal = PersianTheme.spacing.size24),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            modifier = Modifier.width(40.dp),
                                            text = String.format(
                                                getDefault(),
                                                "%.1f",
                                                centeredValue
                                            ),
                                            style = PersianTheme.typography.bodyLarge,
                                            color = PersianTheme.colorScheme.onSurface,
                                            textAlign = TextAlign.End
                                        )
                                        CenteredSlider(
                                            value = centeredValue,
                                            onValueChange = onCenteredValueChange,
                                            valueRange = -20.0f..20.0f,
                                            showLabel = label,
                                            enabled = enabled,
                                            leading = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 0.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.Speaker))
                                                        }
                                                    }
                                                }
                                            } else null,
                                            trailing = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 40.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.SpeakerWave2))
                                                        }
                                                    }
                                                }
                                            } else null
                                        )
                                    }
                                }

                                modeStates[1].value -> {
                                    Column(
                                        modifier = Modifier
                                            .padding(horizontal = PersianTheme.spacing.size24),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            modifier = Modifier.width(40.dp),
                                            text = String.format(
                                                getDefault(),
                                                "%.1f",
                                                discreteCenteredValue
                                            ),
                                            style = PersianTheme.typography.bodyLarge,
                                            color = PersianTheme.colorScheme.onSurface,
                                            textAlign = TextAlign.End
                                        )
                                        DiscreteCenteredSlider(
                                            value = discreteCenteredValue,
                                            steps = 3,
                                            onValueChange = onDiscreteCenteredValueChange,
                                            valueRange = -20f..20.0f,
                                            showLabel = label,
                                            enabled = enabled,
                                            leading = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 0.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.Speaker))
                                                        }
                                                    }
                                                }
                                            } else null,
                                            trailing = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 40.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.SpeakerWave2))
                                                        }
                                                    }
                                                }
                                            } else null
                                        )
                                    }
                                }
                            }
                        }

                        typeStates[2].value -> {
                            when {
                                modeStates[0].value -> {
                                    Column(
                                        modifier = Modifier
                                            .padding(horizontal = PersianTheme.spacing.size24),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(horizontal = PersianTheme.spacing.size24),
                                        ) {
                                            Text(
                                                modifier = Modifier.width(35.dp),
                                                text = String.format(
                                                    getDefault(),
                                                    "%.1f",
                                                    rangeValue.start
                                                ),
                                                style = PersianTheme.typography.bodyLarge,
                                                color = PersianTheme.colorScheme.onSurface,
                                                textAlign = TextAlign.Start
                                            )
                                            Spacer(Modifier.weight(1f))
                                            Text(
                                                modifier = Modifier.width(40.dp),
                                                text = String.format(
                                                    getDefault(),
                                                    "%.1f",
                                                    rangeValue.endInclusive
                                                ),
                                                style = PersianTheme.typography.bodyLarge,
                                                color = PersianTheme.colorScheme.onSurface,
                                                textAlign = TextAlign.End
                                            )
                                        }
                                        RangeSlider(
                                            value = rangeValue,
                                            onValueChange = onRangeValueChange,
                                            valueRange = 0f..40f,
                                            showLabel = label,
                                            enabled = enabled,
                                            leading = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 0.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.Speaker))
                                                        }
                                                    }
                                                }
                                            } else null,
                                            trailing = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 40.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.SpeakerMinus))
                                                        }
                                                    }
                                                }
                                            } else null
                                        )
                                    }
                                }

                                modeStates[1].value -> {
                                    Column(
                                        modifier = Modifier
                                            .padding(horizontal = PersianTheme.spacing.size24),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(horizontal = PersianTheme.spacing.size24),
                                        ) {
                                            Text(
                                                modifier = Modifier.width(35.dp),
                                                text = String.format(
                                                    getDefault(),
                                                    "%.1f",
                                                    discreteRangeValue.start
                                                ),
                                                style = PersianTheme.typography.bodyLarge,
                                                color = PersianTheme.colorScheme.onSurface,
                                                textAlign = TextAlign.Start
                                            )
                                            Spacer(Modifier.weight(1f))
                                            Text(
                                                modifier = Modifier.width(40.dp),
                                                text = String.format(
                                                    getDefault(),
                                                    "%.1f",
                                                    discreteRangeValue.endInclusive
                                                ),
                                                style = PersianTheme.typography.bodyLarge,
                                                color = PersianTheme.colorScheme.onSurface,
                                                textAlign = TextAlign.End
                                            )
                                        }
                                        DiscreteRangeSlider(
                                            value = discreteRangeValue,
                                            onValueChange = onDiscreteRangeValueChange,
                                            steps = 3,
                                            valueRange = 0f..40f,
                                            showLabel = label,
                                            enabled = enabled,
                                            leading = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 0.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.Speaker))
                                                        }
                                                    }
                                                }
                                            } else null,
                                            trailing = if (values) {
                                                {
                                                    when {
                                                        contentStates[0].value -> {
                                                            Text(text = 40.toString())
                                                        }

                                                        contentStates[1].value -> {
                                                            Icon(icon = rememberVectorPainter(image = PersianSymbols.Filled.SpeakerWave2))
                                                        }
                                                    }
                                                }
                                            } else null
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
                FormItem(
                    subhead = { Subhead(text = "Type") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Default",
                                selected = typeStates[0].value,
                                onSelectedChange = {
                                    typeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Centered",
                                selected = typeStates[1].value,
                                onSelectedChange = {
                                    typeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                            RadioButton(
                                text = "Range",
                                selected = typeStates[2].value,
                                onSelectedChange = {
                                    typeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                }
                            )
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Mode") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Default",
                                selected = modeStates[0].value,
                                onSelectedChange = {
                                    modeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Discrete",
                                selected = modeStates[1].value,
                                onSelectedChange = {
                                    modeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                        }
                    }
                )
                if (values) {
                    FormItem(
                        subhead = { Subhead(text = "Content") },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Text",
                                    selected = contentStates[0].value,
                                    onSelectedChange = {
                                        contentStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Icon",
                                    selected = contentStates[1].value,
                                    onSelectedChange = {
                                        contentStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                    }
                                )
                            }
                        }
                    )
                }
                FormItem(
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Label",
                                checked = label,
                                onCheckedChange = onLabelChange
                            )
                            Checkbox(
                                text = "Content",
                                checked = values,
                                onCheckedChange = onValuesChange
                            )
                            Checkbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = onEnabledChange
                            )
                        }
                    }
                )
            }
        }
    }
}