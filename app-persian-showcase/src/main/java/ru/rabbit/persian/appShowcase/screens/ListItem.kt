package ru.rabbit.persian.appShowcase.screens

import android.net.Uri
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
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.FormItem
import io.github.madmaximuus.persian.forms.Input
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.forms.TextArea
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.listItem.Add
import io.github.madmaximuus.persian.listItem.Avatar
import io.github.madmaximuus.persian.listItem.Button
import io.github.madmaximuus.persian.listItem.Check
import io.github.madmaximuus.persian.listItem.Checkbox
import io.github.madmaximuus.persian.listItem.Counter
import io.github.madmaximuus.persian.listItem.Drag
import io.github.madmaximuus.persian.listItem.Icon
import io.github.madmaximuus.persian.listItem.IconButton
import io.github.madmaximuus.persian.listItem.Image
import io.github.madmaximuus.persian.listItem.ListItem
import io.github.madmaximuus.persian.listItem.Middle
import io.github.madmaximuus.persian.listItem.Radio
import io.github.madmaximuus.persian.listItem.Remove
import io.github.madmaximuus.persian.listItem.Suffix
import io.github.madmaximuus.persian.listItem.Switch
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.globe.Globe
import io.github.madmaximuus.persianSymbols.image.base.Image
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ListItem : Screen {
    override val name: String = "List item"

    override val navigation: String = "listItem"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior,
        ) {
            val titleState = rememberTextFieldState("Title")
            val bodyState =
                rememberTextFieldState("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet imperdiet consectetur. Nam vitae massa a metus dignissim malesuada. Duis.")
            val subheadState = rememberTextFieldState("Subhead")
            val (body, onBodyChange) = remember { mutableStateOf(false) }
            val (subhead, onSubheadChange) = remember { mutableStateOf(false) }
            val (newLabel, onNewLabelChange) = remember { mutableStateOf(false) }
            val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
            var checked by remember { mutableStateOf(false) }

            val (edit, onEditChange) = remember { mutableStateOf(false) }
            val editStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }

            val (left, onLeftChange) = remember { mutableStateOf(false) }
            val leftStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }

            val (right, onRightChange) = remember { mutableStateOf(false) }
            val rightStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false),
                )
            }

            Column(
                Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                SampleRow(
                    text = "Sample",
                    firstItem = true
                ) {
                    ListItem(
                        checked = checked,
                        enabled = enabled,
                        onClick = {
                            checked = !checked
                        },
                        edit = if (edit) {
                            {
                                when {
                                    editStates[0].value -> {
                                        Radio()
                                    }

                                    editStates[1].value -> {
                                        Check()
                                    }

                                    editStates[2].value -> {
                                        Drag()
                                    }

                                    editStates[3].value -> {
                                        Add {

                                        }
                                    }

                                    editStates[4].value -> {
                                        Remove {

                                        }
                                    }

                                    else -> {}
                                }
                            }
                        } else null,
                        left = if (left) {
                            {
                                when {
                                    leftStates[0].value -> {
                                        Icon(icon = rememberVectorPainter(image = PersianSymbols.Default.Globe))
                                    }

                                    leftStates[1].value -> {
                                        Avatar(avatarUrl = Uri.parse("https://loremflickr.com/320/240"))
                                    }

                                    leftStates[2].value -> {
                                        Image(imageUrl = Uri.parse("https://loremflickr.com/320/240"))
                                    }
                                }
                            }
                        } else null,
                        middle = {
                            Middle(
                                title = titleState.text.toString(),
                                subhead = if (subhead) subheadState.text.toString() else null,
                                body = if (body) bodyState.text.toString() else null,
                                multiline = false,
                                newLabel = newLabel
                            )
                        },
                        right = if (right) {
                            {
                                when {
                                    rightStates[0].value -> {
                                        Switch()
                                    }

                                    rightStates[1].value -> {
                                        Icon(icon = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight))
                                    }

                                    rightStates[2].value -> {
                                        Counter(count = 10)
                                    }

                                    rightStates[3].value -> {
                                        Suffix(value = "Suffix")
                                    }

                                    rightStates[4].value -> {
                                        Button(value = "Button") {
                                        }
                                    }

                                    rightStates[5].value -> {
                                        IconButton(icon = rememberVectorPainter(image = PersianSymbols.Default.Image)) {

                                        }
                                    }

                                    rightStates[6].value -> {
                                        Checkbox()
                                    }

                                    rightStates[7].value -> {
                                        Radio()
                                    }
                                }
                            }
                        } else null
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                        .verticalScroll(rememberScrollState())
                        .navigationBarsPadding(),
                ) {
                    if (subhead) {
                        FormItem(
                            modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                            subhead = { Subhead(text = "Subhead") },
                            content = { Input(state = subheadState) }
                        )
                    }
                    FormItem(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = { Subhead(text = "Title") },
                        content = { Input(state = titleState) }
                    )
                    if (body) {
                        FormItem(
                            modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                            subhead = { Subhead(text = "Body") },
                            content = { TextArea(state = bodyState) }
                        )
                    }
                    if (edit) {
                        FormItem(
                            modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                            subhead = { Subhead(text = "Edit") },
                            content = {
                                RadioButtons {
                                    RadioButton(
                                        text = "Radio toggle",
                                        selected = editStates[0].value,
                                        onSelectedChange = {
                                            editStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 0
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Checkbox toggle",
                                        selected = editStates[1].value,
                                        onSelectedChange = {
                                            editStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Drag indicator",
                                        selected = editStates[2].value,
                                        onSelectedChange = {
                                            editStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 2
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Add",
                                        selected = editStates[3].value,
                                        onSelectedChange = {
                                            editStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 3
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Remove",
                                        selected = editStates[4].value,
                                        onSelectedChange = {
                                            editStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 4
                                            }
                                        }
                                    )
                                }
                            }
                        )
                    }
                    if (left) {
                        FormItem(
                            modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                            subhead = { Subhead(text = "Left") },
                            content = {
                                RadioButtons {
                                    RadioButton(
                                        text = "Icon",
                                        selected = leftStates[0].value,
                                        onSelectedChange = {
                                            leftStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 0
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Avatar",
                                        selected = leftStates[1].value,
                                        onSelectedChange = {
                                            leftStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Image",
                                        selected = leftStates[2].value,
                                        onSelectedChange = {
                                            leftStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 2
                                            }
                                        }
                                    )
                                }
                            }
                        )
                    }
                    if (right) {
                        FormItem(
                            modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                            subhead = { Subhead(text = "Right") },
                            content = {
                                RadioButtons {
                                    RadioButton(
                                        text = "Switch",
                                        selected = rightStates[0].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 0
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Icon",
                                        selected = rightStates[1].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Counter",
                                        selected = rightStates[2].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 2
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Suffix",
                                        selected = rightStates[3].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 3
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Button",
                                        selected = rightStates[4].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 4
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Icon button",
                                        selected = rightStates[5].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 5
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Checkbox toggle",
                                        selected = rightStates[6].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 6
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Radio toggle",
                                        selected = rightStates[7].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 7
                                            }
                                        }
                                    )
                                }
                            }
                        )
                    }
                    FormItem(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = { Subhead(text = "Settings") },
                        content = {
                            Checkboxes {
                                Checkbox(
                                    text = "Edit",
                                    checked = edit,
                                    onCheckedChange = onEditChange
                                )
                                Checkbox(
                                    text = "Left",
                                    checked = left,
                                    onCheckedChange = onLeftChange
                                )
                                Checkbox(
                                    text = "Subhead",
                                    checked = subhead,
                                    onCheckedChange = onSubheadChange
                                )
                                Checkbox(
                                    text = "\"New\" label",
                                    checked = newLabel,
                                    onCheckedChange = onNewLabelChange
                                )
                                Checkbox(
                                    text = "Body",
                                    checked = body,
                                    onCheckedChange = onBodyChange
                                )
                                Checkbox(
                                    text = "Right",
                                    checked = right,
                                    onCheckedChange = onRightChange
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
}