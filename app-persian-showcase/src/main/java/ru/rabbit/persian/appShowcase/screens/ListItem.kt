package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.core.net.toUri
import androidx.navigation.NavController
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.Input
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.formItem.TextArea
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.listItem.Avatar
import io.github.madmaximuus.persian.listItem.Button
import io.github.madmaximuus.persian.listItem.Checkbox
import io.github.madmaximuus.persian.listItem.Counter
import io.github.madmaximuus.persian.listItem.Icon
import io.github.madmaximuus.persian.listItem.IconButton
import io.github.madmaximuus.persian.listItem.Image
import io.github.madmaximuus.persian.listItem.ListItem
import io.github.madmaximuus.persian.listItem.Radio
import io.github.madmaximuus.persian.listItem.Suffix
import io.github.madmaximuus.persian.listItem.Switch
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.chevron.right.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.image.Image
import io.github.madmaximuus.persianSymbols.plus.Plus
import io.github.madmaximuus.persianSymbols.user.User
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ListItem : Screen {
    override val name: String = "List item"

    override val image: Int = R.drawable.list_item

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

            val (left, onLeftChange) = remember { mutableStateOf(false) }
            val leftStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false),
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
                    mutableStateOf(false),
                    mutableStateOf(false),
                )
            }

            Column(
                Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = PersianTheme.spacing.size12,
                            bottom = PersianTheme.spacing.size8,
                        )
                ) {
                    Text(
                        modifier = Modifier
                            .padding(start = PersianTheme.spacing.size12)
                            .fillMaxWidth(),
                        text = "Sample",
                        style = PersianTheme.typography.labelMedium,
                        color = PersianTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
                    ListItem(
                        checked = checked,
                        enabled = enabled,
                        onClick = {
                            checked = !checked
                        },
                        leading = if (left) {
                            {
                                when {
                                    leftStates[0].value -> {
                                        Icon(icon = rememberVectorPainter(image = PersianSymbols.Default.User))
                                    }

                                    leftStates[1].value -> {
                                        Avatar(avatarUrl = "https://loremflickr.com/320/240".toUri())
                                    }

                                    leftStates[2].value -> {
                                        Image(imageUrl = "https://loremflickr.com/320/240".toUri())
                                    }

                                    leftStates[3].value -> {
                                        Switch()
                                    }

                                    leftStates[4].value -> {
                                        Checkbox()
                                    }

                                    leftStates[5].value -> {
                                        Radio()
                                    }

                                    leftStates[6].value -> {
                                        IconButton(icon = rememberVectorPainter(PersianSymbols.Default.Plus)) { }
                                    }
                                }
                            }
                        } else null,
                        title = titleState.text.toString(),
                        subhead = if (subhead) subheadState.text.toString() else null,
                        body = if (body) bodyState.text.toString() else null,
                        isNew = newLabel,
                        trailing = if (right) {
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
                                        Suffix(title = "Suffix")
                                    }

                                    rightStates[4].value -> {
                                        Suffix(
                                            title = "Suffix",
                                            body = "body"
                                        )
                                    }

                                    rightStates[5].value -> {
                                        Suffix(
                                            title = "Suffix",
                                            icon = rememberVectorPainter(PersianSymbols.Default.ChevronRight)
                                        )
                                    }

                                    rightStates[6].value -> {
                                        Button(value = "Button") {
                                        }
                                    }

                                    rightStates[7].value -> {
                                        IconButton(
                                            icon = rememberVectorPainter(
                                                image = PersianSymbols.Default.Image
                                            )
                                        ) {}
                                    }

                                    rightStates[8].value -> {
                                        Checkbox()
                                    }

                                    rightStates[9].value -> {
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
                            subhead = { Subhead(text = "Subhead") },
                            content = { Input(state = subheadState) }
                        )
                    }
                    FormItem(
                        subhead = { Subhead(text = "Title") },
                        content = { Input(state = titleState) }
                    )
                    if (body) {
                        FormItem(
                            subhead = { Subhead(text = "Body") },
                            content = { TextArea(state = bodyState) }
                        )
                    }
                    if (left) {
                        FormItem(
                            subhead = { Subhead(text = "Leading") },
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
                                    RadioButton(
                                        text = "Switch",
                                        selected = leftStates[3].value,
                                        onSelectedChange = {
                                            leftStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 3
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Checkbox",
                                        selected = leftStates[4].value,
                                        onSelectedChange = {
                                            leftStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 4
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Radio",
                                        selected = leftStates[5].value,
                                        onSelectedChange = {
                                            leftStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 5
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Icon button",
                                        selected = leftStates[6].value,
                                        onSelectedChange = {
                                            leftStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 6
                                            }
                                        }
                                    )
                                }
                            }
                        )
                    }
                    if (right) {
                        FormItem(
                            subhead = { Subhead(text = "Trailing") },
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
                                        text = "Suffix + Body",
                                        selected = rightStates[4].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 4
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Suffix + Icon",
                                        selected = rightStates[5].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 5
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Button",
                                        selected = rightStates[6].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 6
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Icon button",
                                        selected = rightStates[7].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 7
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Checkbox",
                                        selected = rightStates[8].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 8
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Radio",
                                        selected = rightStates[9].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 9
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
                                    text = "Leading",
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
                                    text = "Trailing",
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