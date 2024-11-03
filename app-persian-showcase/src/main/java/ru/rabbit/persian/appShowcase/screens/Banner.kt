package ru.rabbit.persian.appShowcase.screens

import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.banner.Avatar
import io.github.madmaximuus.persian.banner.Banner
import io.github.madmaximuus.persian.banner.Close
import io.github.madmaximuus.persian.banner.Icon
import io.github.madmaximuus.persian.banner.Image
import io.github.madmaximuus.persian.banner.Open
import io.github.madmaximuus.persian.banner.Primary
import io.github.madmaximuus.persian.banner.Secondary
import io.github.madmaximuus.persian.banner.Tertiary
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.textAreas.OutlineTextArea
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.globe.Globe
import ru.rabbit.persian.appShowcase.componets.SampleRow
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
            var title by remember { mutableStateOf(true) }
            val (titleValue, onTitleValueChange) = remember { mutableStateOf("Title") }

            var description by remember { mutableStateOf(true) }
            val (descriptionValue, onDescriptionValueChange) = remember { mutableStateOf("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet imperdiet consectetur. Nam vitae massa a metus dignissim malesuada. Duis.") }

            val (left, onLeftChange) = remember { mutableStateOf(false) }
            var selectedLeft by remember { mutableStateOf("Icon") }
            val leftStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }

            val (right, onRightChange) = remember { mutableStateOf(false) }
            var selectedRight by remember { mutableStateOf("Close") }
            val rightStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                )
            }

            val (button, onButtonChange) = remember { mutableStateOf(false) }
            var buttonStyle by remember { mutableStateOf("Primary") }
            val buttonStyleStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }

            val (clickable, onClickableChange) = remember { mutableStateOf(false) }
            val onClick = {}
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                SampleRow(
                    text = "Sample",
                    firstItem = true
                ) {
                    Banner(
                        title = if (title) titleValue else null,
                        message = if (description) descriptionValue else null,
                        onClick = if (clickable) onClick else null,
                        left = if (left) when (selectedLeft) {
                            "Image" -> {
                                {
                                    Image(
                                        image = Uri.parse("https://loremflickr.com/320/240")
                                    )
                                }
                            }

                            "Avatar" -> {
                                {
                                    Avatar(
                                        image = Uri.parse("https://loremflickr.com/320/240")
                                    )
                                }
                            }

                            "Icon" -> {
                                {
                                    Icon(
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.Globe),
                                    )
                                }
                            }

                            else -> null
                        } else null,
                        right = if (right) when (selectedRight) {
                            "Open" -> {
                                {
                                    Open()
                                }
                            }

                            "Close" -> {
                                {
                                    Close {}
                                }
                            }

                            else -> null
                        } else null,
                        button = if (button) {
                            {
                                when (buttonStyle) {
                                    "Primary" -> Primary(
                                        text = "Button",
                                        onClick = {}
                                    )

                                    "Secondary" -> Secondary(
                                        text = "Button",
                                        onClick = {}
                                    )

                                    "Tertiary" -> Tertiary(
                                        text = "Button",
                                        onClick = {}
                                    )

                                    else -> Tertiary(
                                        text = "Button",
                                        onClick = {}
                                    )
                                }
                            }
                        } else null,
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                        .navigationBarsPadding()
                ) {
                    if (title) {
                        OutlineInput(
                            modifier = Modifier
                                .padding(horizontal = PersianTheme.spacing.size16)
                                .padding(top = PersianTheme.spacing.size12),
                            value = titleValue,
                            onValueChange = onTitleValueChange
                        )
                    }
                    if (description) {
                        OutlineTextArea(
                            modifier = Modifier
                                .padding(horizontal = PersianTheme.spacing.size16)
                                .padding(top = PersianTheme.spacing.size12),
                            value = descriptionValue,
                            onValueChange = onDescriptionValueChange
                        )
                        Spacer(modifier = Modifier.height(PersianTheme.spacing.size8))
                    }
                    Form(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = PersianTheme.spacing.size20),
                        subhead = {
                            Subhead(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Settings"
                            )
                        },
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
                                    text = "Description",
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
                                    text = "Button",
                                    checked = button,
                                    onCheckedChange = onButtonChange
                                )
                                Checkbox(
                                    text = "Clickable",
                                    checked = clickable,
                                    onCheckedChange = onClickableChange
                                )
                            }
                        }
                    )
                    if (button) {
                        Form(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = PersianTheme.spacing.size12),
                            subhead = {
                                Subhead(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = "Button"
                                )
                            },
                            content = {
                                RadioButtons {
                                    RadioButton(
                                        text = "Primary",
                                        selected = buttonStyleStates[0].value,
                                        onSelectedChange = {
                                            buttonStyleStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 0
                                            }
                                            buttonStyle = "Primary"
                                        }
                                    )
                                    RadioButton(
                                        text = "Secondary",
                                        selected = buttonStyleStates[1].value,
                                        onSelectedChange = {
                                            buttonStyleStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                            buttonStyle = "Secondary"
                                        }
                                    )
                                    RadioButton(
                                        text = "Tertiary",
                                        selected = buttonStyleStates[2].value,
                                        onSelectedChange = {
                                            buttonStyleStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 2
                                            }
                                            buttonStyle = "Tertiary"
                                        }
                                    )
                                }
                            }
                        )
                    }
                    if (left) {
                        Form(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = PersianTheme.spacing.size12),
                            subhead = {
                                Subhead(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = "Left content"
                                )
                            },
                            content = {
                                RadioButtons {
                                    RadioButton(
                                        text = "Icon",
                                        selected = leftStates[0].value,
                                        onSelectedChange = {
                                            leftStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 0
                                            }
                                            selectedLeft = "Icon"
                                        }
                                    )
                                    RadioButton(
                                        text = "Avatar",
                                        selected = leftStates[1].value,
                                        onSelectedChange = {
                                            leftStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                            selectedLeft = "Avatar"
                                        }
                                    )
                                    RadioButton(
                                        text = "Image",
                                        selected = leftStates[2].value,
                                        onSelectedChange = {
                                            leftStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 2
                                            }
                                            selectedLeft = "Image"
                                        }
                                    )
                                }
                            }
                        )
                    }
                    if (right) {
                        Form(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = PersianTheme.spacing.size12),
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
                                            selectedRight = "Close"
                                        }
                                    )
                                    RadioButton(
                                        text = "Open",
                                        selected = rightStates[1].value,
                                        onSelectedChange = {
                                            rightStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                            selectedRight = "Open"
                                        }
                                    )
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}