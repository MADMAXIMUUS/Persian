package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.counter.utils.BadgeStyle
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.navigationBar.NavigationBar
import io.github.madmaximuus.persian.navigationBar.NavigationBarItem
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.gear.Gear
import io.github.madmaximuus.persianSymbols.house.House
import io.github.madmaximuus.persianSymbols.magnifyingGlass.MagnifyingGlass
import io.github.madmaximuus.persianSymbols.message.Message
import io.github.madmaximuus.persianSymbols.user.User
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object NavigationBar : Screen {

    override val name: String = "Navigation bar"

    override val image: Int = R.drawable.navigation_bar

    override val navigation: String = "navBar"

    @Composable
    override fun Content(navController: NavController?) {
        val elementStates = remember {
            listOf(
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(true)
            )
        }
        val badgeStyleStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
            )
        }
        var selectedBadgeStyle by remember { mutableStateOf(BadgeStyle.DOT) }
        var size by remember {
            mutableIntStateOf(5)
        }
        val (badge, onBadgeChange) = remember {
            mutableStateOf(false)
        }
        val (label, onLabelChange) = remember {
            mutableStateOf(true)
        }
        val (alwaysShowLabel, onAlwaysShowLabelChange) = remember {
            mutableStateOf(true)
        }
        val list = mutableListOf<MutableState<Boolean>>().apply {
            repeat(size) {
                this.add(
                    if (it == 0)
                        mutableStateOf(true)
                    else
                        mutableStateOf(false)
                )
            }
        }
        val singleChoiceSelectedState = remember { list }
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            },
            navigationBar = {
                NavigationBar(
                    content = {
                        NavigationBarItem(
                            selected = singleChoiceSelectedState[0].value,
                            icon = rememberVectorPainter(image = PersianSymbols.Default.House),
                            selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.House),
                            label = if (label) "Home" else null,
                            badge = if (badge) 1 else 0,
                            alwaysShowLabel = alwaysShowLabel,
                            badgeStyle = selectedBadgeStyle,
                            onClick = {
                                singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 0
                                }
                            }
                        )
                        NavigationBarItem(
                            selected = singleChoiceSelectedState[1].value,
                            icon = rememberVectorPainter(image = PersianSymbols.Default.MagnifyingGlass),
                            selectedIcon = rememberVectorPainter(image = PersianSymbols.Default.MagnifyingGlass),
                            label = if (label) "Search" else null,
                            badge = if (badge) 10 else 0,
                            alwaysShowLabel = alwaysShowLabel,
                            badgeStyle = selectedBadgeStyle,
                            onClick = {
                                singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 1
                                }
                            }
                        )
                        if (size >= 3) {
                            NavigationBarItem(
                                selected = singleChoiceSelectedState[2].value,
                                icon = rememberVectorPainter(image = PersianSymbols.Default.Message),
                                selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.Message),
                                label = if (label) "Chat" else null,
                                badge = if (badge) 100 else 0,
                                alwaysShowLabel = alwaysShowLabel,
                                badgeStyle = selectedBadgeStyle,
                                onClick = {
                                    singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                }
                            )
                        }
                        if (size >= 4) {
                            NavigationBarItem(
                                selected = singleChoiceSelectedState[3].value,
                                icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.User),
                                label = if (label) "Profile" else null,
                                badge = if (badge) 10 else 0,
                                alwaysShowLabel = alwaysShowLabel,
                                badgeStyle = selectedBadgeStyle,
                                onClick = {
                                    singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 3
                                    }
                                }
                            )
                        }
                        if (size >= 5) {
                            NavigationBarItem(
                                selected = singleChoiceSelectedState[4].value,
                                icon = rememberVectorPainter(image = PersianSymbols.Default.Gear),
                                selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.Gear),
                                label = if (label) "Settings" else null,
                                badge = if (badge) 10 else 0,
                                alwaysShowLabel = alwaysShowLabel,
                                badgeStyle = selectedBadgeStyle,
                                onClick = {
                                    singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 4
                                    }
                                }
                            )
                        }
                    }
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(it)
            ) {
                FormItem(
                    subhead = { Subhead(text = "Elements") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "3 elements",
                                selected = elementStates[0].value,
                                onSelectedChange = {
                                    elementStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                    size = 3
                                }
                            )
                            RadioButton(
                                text = "4 elements",
                                selected = elementStates[1].value,
                                onSelectedChange = {
                                    elementStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                    size = 4
                                }
                            )
                            RadioButton(
                                text = "5 elements",
                                selected = elementStates[2].value,
                                onSelectedChange = {
                                    elementStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                    size = 5
                                }
                            )
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Badge",
                                checked = badge,
                                onCheckedChange = onBadgeChange
                            )
                            Checkbox(
                                text = "Label",
                                checked = label,
                                onCheckedChange = onLabelChange
                            )
                            Checkbox(
                                text = "Always show label",
                                checked = alwaysShowLabel,
                                onCheckedChange = onAlwaysShowLabelChange
                            )
                        }
                    }
                )
                if (badge) {
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
                                        selectedBadgeStyle = BadgeStyle.DOT
                                    }
                                )
                                RadioButton(
                                    text = "Number",
                                    selected = badgeStyleStates[1].value,
                                    onSelectedChange = {
                                        badgeStyleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                        selectedBadgeStyle = BadgeStyle.NUMBER
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