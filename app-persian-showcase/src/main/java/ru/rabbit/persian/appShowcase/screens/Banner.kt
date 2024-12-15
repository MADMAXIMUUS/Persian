package ru.rabbit.persian.appShowcase.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.banner.Action
import io.github.madmaximuus.persian.banner.Banner
import io.github.madmaximuus.persian.banner.BannerDefaults
import io.github.madmaximuus.persian.banner.Button
import io.github.madmaximuus.persian.banner.Icon
import io.github.madmaximuus.persian.banner.IconButton
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.Input
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.formItem.TextArea
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.globe.Globe
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Banner : Screen {

    override val name: String = "Banner"

    override val navigation: String = "banner"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            val styleStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false),
                )
            }

            var title by remember { mutableStateOf(true) }
            val titleState = rememberTextFieldState("Title")

            var description by remember { mutableStateOf(true) }
            val descriptionState =
                rememberTextFieldState("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet imperdiet consectetur. Nam vitae massa a metus dignissim malesuada. Duis.")

            val (left, onLeftChange) = remember { mutableStateOf(false) }

            val (right, onRightChange) = remember { mutableStateOf(false) }
            val rightStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false),
                )
            }

            val (actions, onActionsChange) = remember { mutableStateOf(false) }

            val (clickable, onClickableChange) = remember { mutableStateOf(false) }
            val onClick = {}
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(
                    modifier = Modifier
                        .animateContentSize()
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = PersianTheme.spacing.size16)
                            .padding(top = PersianTheme.spacing.size8),
                        text = "Sample",
                        style = PersianTheme.typography.labelMedium,
                        color = PersianTheme.colorScheme.onSurfaceVariant
                    )
                    Banner(
                        title = if (title) titleState.text.toString() else null,
                        message = if (description) descriptionState.text.toString() else null,
                        onClick = if (clickable) onClick else null,
                        leadingIcon = if (left) rememberVectorPainter(PersianSymbols.Default.Globe) else null,
                        trailing = if (right) when {
                            rightStates[0].value -> {
                                {
                                    Icon()
                                }
                            }

                            rightStates[1].value -> {
                                {
                                    IconButton {}
                                }
                            }

                            rightStates[2].value -> {
                                {
                                    Button(
                                        action = "Button"
                                    ) { }
                                }
                            }

                            else -> null
                        } else null,
                        actions = if (actions) {
                            {
                                Action(
                                    text = "Action 1"
                                ) { }
                                Action(
                                    text = "Action 1"
                                ) { }
                            }
                        } else null,
                        colors = when {
                            styleStates[0].value -> BannerDefaults.infoColors()
                            styleStates[1].value -> BannerDefaults.validColors()
                            styleStates[2].value -> BannerDefaults.warningColors()
                            styleStates[3].value -> BannerDefaults.errorColors()
                            else -> BannerDefaults.infoColors()
                        }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                        .navigationBarsPadding()
                ) {
                    FormItem(
                        modifier = Modifier.fillMaxWidth(),
                        subhead = { Subhead(text = "Style") },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Info",
                                    selected = styleStates[0].value,
                                    onSelectedChange = {
                                        styleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Valid",
                                    selected = styleStates[1].value,
                                    onSelectedChange = {
                                        styleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Warning",
                                    selected = styleStates[2].value,
                                    onSelectedChange = {
                                        styleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 2
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Error",
                                    selected = styleStates[3].value,
                                    onSelectedChange = {
                                        styleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 3
                                        }
                                    }
                                )
                            }
                        }
                    )
                    if (title) {
                        FormItem(
                            subhead = { Subhead(text = "Title") },
                            content = { Input(state = titleState) }
                        )
                    }
                    if (description) {
                        FormItem(
                            subhead = { Subhead(text = "Message") },
                            content = { TextArea(state = descriptionState) }
                        )
                    }
                    if (right) {
                        FormItem(
                            modifier = Modifier.fillMaxWidth(),
                            subhead = {
                                Subhead(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = "Right content"
                                )
                            },
                            content = {
                                RadioButtons {
                                    RadioButton(
                                        text = "Close",
                                        selected = rightStates[0].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 0
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Open",
                                        selected = rightStates[1].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Button",
                                        selected = rightStates[2].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 2
                                            }
                                        }
                                    )
                                }
                            }
                        )
                    }
                    FormItem(
                        modifier = Modifier
                            .fillMaxWidth(),
                        subhead = { Subhead(text = "Settings") },
                        content = {
                            Checkboxes {
                                Checkbox(
                                    text = "Title",
                                    checked = title,
                                    onCheckedChange = { isChecked ->
                                        title = isChecked
                                        if (!description && !isChecked) description = true
                                    }
                                )
                                Checkbox(
                                    text = "Message",
                                    checked = description,
                                    onCheckedChange = { isChecked ->
                                        description = isChecked
                                        if (!title && !isChecked) title = true
                                    }
                                )
                                Checkbox(
                                    text = "Left",
                                    checked = left,
                                    onCheckedChange = onLeftChange
                                )
                                Checkbox(
                                    text = "Right",
                                    checked = right,
                                    onCheckedChange = onRightChange
                                )
                                Checkbox(
                                    text = "Actions",
                                    checked = actions,
                                    onCheckedChange = onActionsChange
                                )
                                Checkbox(
                                    text = "Clickable",
                                    checked = clickable,
                                    onCheckedChange = onClickableChange
                                )
                            }
                        }
                    )
                }
            }
        }
    }
}