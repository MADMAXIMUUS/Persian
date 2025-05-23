package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.maxLength
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.input.setTextAndPlaceCursorAtEnd
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.counter.Badge
import io.github.madmaximuus.persian.counter.Counter
import io.github.madmaximuus.persian.counter.CounterDefaults
import io.github.madmaximuus.persian.counter.utils.BadgeStyle
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.Input
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.iconButton.IconButton
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.User
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Counter : Screen {

    override val name: String = "Counter"

    override val image: Int = R.drawable.counter

    override val navigation: String = "counter"

    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            val count = rememberTextFieldState("1")
            val newValue = count.text.toString().filter { it.isDigit() }
            count.setTextAndPlaceCursorAtEnd(newValue)
            val typeStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false)
                )
            }
            val badgeStyleStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false)
                )
            }
            val styleStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                SampleRow(
                    text = "Sample"
                ) {
                    if (count.text.isNotEmpty()) {
                        when {
                            typeStates[0].value -> {
                                Counter(
                                    count = count.text.toString().toInt(),
                                    colors = when {
                                        styleStates[0].value -> CounterDefaults.errorColors()
                                        styleStates[1].value -> CounterDefaults.primaryColors()
                                        styleStates[2].value -> CounterDefaults.secondaryColors()
                                        styleStates[3].value -> CounterDefaults.tertiaryColors()
                                        else -> CounterDefaults.errorColors()
                                    }
                                )
                            }

                            typeStates[1].value -> {
                                Badge(
                                    count = count.text.toString().toInt(),
                                    colors = when {
                                        styleStates[0].value -> CounterDefaults.errorColors()
                                        styleStates[1].value -> CounterDefaults.primaryColors()
                                        styleStates[2].value -> CounterDefaults.secondaryColors()
                                        else -> CounterDefaults.errorColors()
                                    },
                                    style = when {
                                        badgeStyleStates[0].value -> BadgeStyle.DOT
                                        badgeStyleStates[1].value -> BadgeStyle.NUMBER
                                        else -> BadgeStyle.NUMBER
                                    },
                                    sizes = when {
                                        badgeStyleStates[0].value -> CounterDefaults.sizes(
                                            badgeTopOffset = 16.dp,
                                            badgeRightOffset = 20.dp
                                        )

                                        badgeStyleStates[1].value -> CounterDefaults.sizes(
                                            badgeTopOffset = 19.dp,
                                            badgeRightOffset = 23.dp
                                        )

                                        else -> CounterDefaults.sizes(
                                            badgeTopOffset = 19.dp,
                                            badgeRightOffset = 23.dp
                                        )
                                    },
                                ) {
                                    IconButton(
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                        colors = IconButtonDefaults.tertiaryIconButtonColors(),
                                        onClick = {}
                                    )
                                }
                            }
                        }
                    }
                }
                FormItem(
                    subhead = { Subhead(text = "Count") },
                    content = {
                        Input(
                            state = count,
                            transformation = InputTransformation.maxLength(5),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number
                            )
                        )
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Type") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Counter",
                                selected = typeStates[0].value,
                                onSelectedChange = {
                                    typeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Badge",
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
                if (typeStates[1].value) {
                    FormItem(
                        subhead = { Subhead(text = "Badge style") },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Dot",
                                    selected = badgeStyleStates[0].value,
                                    onSelectedChange = {
                                        badgeStyleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Number",
                                    selected = badgeStyleStates[1].value,
                                    onSelectedChange = {
                                        badgeStyleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                    }
                                )
                            }
                        }
                    )
                }
                FormItem(
                    subhead = { Subhead(text = "Style") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Error",
                                selected = styleStates[0].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Primary",
                                selected = styleStates[1].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                            RadioButton(
                                text = "Secondary",
                                selected = styleStates[2].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                }
                            )
                            if (!typeStates[1].value)
                                RadioButton(
                                    text = "Tertiary",
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
            }
        }
    }
}