package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.progressIndicator.CircularProgressIndicator
import io.github.madmaximuus.persian.progressIndicator.LinearProgressIndicator
import io.github.madmaximuus.persian.progressIndicator.ProgressIndicatorDefaults
import io.github.madmaximuus.persian.radioButton.RadioButton
import io.github.madmaximuus.persian.slider.continuous.Slider
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ProgressIndicator : Screen {

    override val name: String = "Progress indicator"

    override val navigation: String = "progress"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            topAppBarScrollBehavior = topAppBarScrollBehavior,
            onBackClick = {
                navController?.navigateUp()
            }
        ) {
            val (indeterminate, onIndeterminateChange) = remember { mutableStateOf(false) }
            val (content, onContentChange) = remember { mutableStateOf(false) }
            val (progress, onProgressChange) = remember { mutableFloatStateOf(5f) }
            val linearSize = ProgressIndicatorDefaults.linearLarge()
            var linearSizeState by remember { mutableStateOf(linearSize) }
            val circularSize = ProgressIndicatorDefaults.circularLarge()
            var circularSizeState by remember { mutableStateOf(circularSize) }

            val sizeStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }
            val largeLinear = ProgressIndicatorDefaults.linearLarge()
            val mediumLinear = ProgressIndicatorDefaults.linearMedium()
            val smallLinear = ProgressIndicatorDefaults.linearSmall()
            val largeCircular = ProgressIndicatorDefaults.circularLarge()
            val mediumCircular = ProgressIndicatorDefaults.circularMedium()
            val smallCircular = ProgressIndicatorDefaults.circularSmall()

            val typeStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false)
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .padding(it),
            ) {
                SampleRow(text = "Sample", firstItem = true) {
                    Column(
                        modifier = Modifier
                            .padding(vertical = PersianTheme.spacing.size12)
                    ) {
                        when {
                            typeStates[0].value -> {
                                if (indeterminate) {
                                    CircularProgressIndicator(
                                        sizes = circularSizeState
                                    )
                                } else {
                                    CircularProgressIndicator(
                                        progress = { progress },
                                        maxValue = { 10f },
                                        sizes = circularSizeState,
                                        content = content
                                    )
                                }
                            }

                            typeStates[1].value -> {
                                if (indeterminate) {
                                    LinearProgressIndicator(
                                        modifier = Modifier.fillMaxWidth(),
                                        sizes = linearSizeState
                                    )
                                } else {
                                    LinearProgressIndicator(
                                        progress = { progress },
                                        maxValue = { 10f },
                                        modifier = Modifier.fillMaxWidth(),
                                        sizes = linearSizeState,
                                        content = content
                                    )
                                }
                            }
                        }
                    }
                }
                if (!indeterminate) {
                    Text(
                        modifier = Modifier
                            .padding(top = PersianTheme.spacing.size12)
                            .padding(horizontal = PersianTheme.spacing.size16),
                        text = "Progress value",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(PersianTheme.spacing.size2))
                    Slider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = PersianTheme.spacing.size16),
                        value = progress,
                        onValueChange = onProgressChange,
                        valueRange = 0f..10f
                    )
                }
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            text = "Type"
                        )
                    },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Circular",
                                selected = typeStates[0].value,
                                onSelectedChange = {
                                    typeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Linear",
                                selected = typeStates[1].value,
                                onSelectedChange = {
                                    typeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                        }
                    }
                )
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            text = "Size"
                        )
                    },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Large",
                                selected = sizeStates[0].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                    linearSizeState = largeLinear
                                    circularSizeState = largeCircular
                                }
                            )
                            RadioButton(
                                text = "Medium",
                                selected = sizeStates[1].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                    linearSizeState = mediumLinear
                                    circularSizeState = mediumCircular
                                }
                            )
                            RadioButton(
                                text = "Small",
                                selected = sizeStates[2].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                    linearSizeState = smallLinear
                                    circularSizeState = smallCircular
                                }
                            )
                        }
                    }
                )
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            text = "Settings"
                        )
                    },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Indeterminate",
                                checked = indeterminate,
                                onCheckedChange = onIndeterminateChange
                            )
                            if (!indeterminate) {
                                Checkbox(
                                    text = "Content",
                                    checked = content,
                                    onCheckedChange = onContentChange
                                )
                            }
                        }
                    }
                )
            }
        }
    }
}