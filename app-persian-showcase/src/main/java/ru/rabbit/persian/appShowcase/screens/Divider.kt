package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.divider.Divider
import io.github.madmaximuus.persian.divider.DividerDefaults
import io.github.madmaximuus.persian.divider.InsetSide
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.content.Text
import io.github.madmaximuus.persian.slider.continuous.Slider
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Divider : Screen {

    override val name: String = "Divider"

    override val image: Int = R.drawable.divider

    override val navigation: String = "divider"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        val (space, onSpaceChange) = remember { mutableFloatStateOf(16f) }
        val (thickness, onThicknessChange) = remember { mutableFloatStateOf(2f) }

        val insetSideState = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
            )
        }

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .verticalScroll(rememberScrollState())
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .navigationBarsPadding()

            ) {
                SampleRow(text = "Sample", firstItem = true) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(vertical = 20.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Divider(
                            insetSide = when {
                                insetSideState[0].value -> InsetSide.NONE
                                insetSideState[1].value -> InsetSide.LEADING
                                insetSideState[2].value -> InsetSide.TRAILING
                                insetSideState[3].value -> InsetSide.BOTH
                                else -> InsetSide.NONE
                            },
                            sizes = DividerDefaults.sizes(
                                inset = space.dp,
                                strokeThickness = thickness.dp
                            )
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .padding(vertical = PersianTheme.spacing.size6)
                        .padding(horizontal = PersianTheme.spacing.size16),
                    verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
                ) {
                    Text(
                        text = "Thickness",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurfaceVariant
                    )
                    Slider(
                        value = thickness,
                        onValueChange = onThicknessChange,
                        showLabel = true,
                        valueRange = 0f..24f,
                        leading = { Text(text = "0dp") },
                        trailing = { Text(text = "24dp") }
                    )
                }
                if (!insetSideState[0].value) {
                    Column(
                        modifier = Modifier
                            .padding(vertical = PersianTheme.spacing.size6)
                            .padding(horizontal = PersianTheme.spacing.size16),
                        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
                    ) {
                        Text(
                            text = "Inset size",
                            style = PersianTheme.typography.labelLarge,
                            color = PersianTheme.colorScheme.onSurfaceVariant
                        )
                        Slider(
                            value = space,
                            onValueChange = onSpaceChange,
                            showLabel = true,
                            valueRange = 0f..24f,
                            leading = { Text(text = "0dp") },
                            trailing = { Text(text = "24dp") }
                        )
                    }
                }
                FormItem(
                    subhead = { Subhead(text = "Inset side") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "None",
                                selected = insetSideState[0].value,
                                onSelectedChange = {
                                    insetSideState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Leading",
                                selected = insetSideState[1].value,
                                onSelectedChange = {
                                    insetSideState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                            RadioButton(
                                text = "Trailing",
                                selected = insetSideState[2].value,
                                onSelectedChange = {
                                    insetSideState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                }
                            )
                            RadioButton(
                                text = "Both",
                                selected = insetSideState[3].value,
                                onSelectedChange = {
                                    insetSideState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 3
                                    }
                                }
                            )
                        }
                    }
                )
            }
        }
    }
}