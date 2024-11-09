package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.counter.utils.BadgeStyle
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.FormItem
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.tabBar.default.TabBar
import io.github.madmaximuus.persian.tabBar.scrollable.ScrollableTabBar
import io.github.madmaximuus.persian.tabBar.tab.IconSide
import io.github.madmaximuus.persian.tabBar.tab.Tab
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.base.User
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Tabs : Screen {

    override val name: String = "Tabs"

    override val navigation: String = "tab"

    @Composable
    override fun Content(navController: NavController?) {

        var scrollableState by remember { mutableIntStateOf(0) }
        val scrollableTabs = listOf("Tab 1", "Tab 2", "Tab 3", "Tab 4", "Tab 5", "Tab 6", "Tab 7")

        var state by remember { mutableIntStateOf(0) }
        val tabs = listOf("Tab 1", "Tab 2", "Tab 3")

        val typeStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false)
            )
        }

        val iconSideStates = remember {
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

        var icon by remember { mutableStateOf(false) }
        var title by remember { mutableStateOf(true) }
        val (badge, onBadgeChange) = remember { mutableStateOf(false) }

        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                SampleRow(text = "Sample", firstItem = true) {
                    when {
                        typeStates[0].value -> {
                            TabBar(
                                selectedTabIndex = state,
                                iconSide = when {
                                    iconSideStates[0].value -> IconSide.LEFT
                                    iconSideStates[1].value -> IconSide.TOP
                                    else -> IconSide.TOP
                                },
                                badgeStyle = when {
                                    badgeStyleStates[0].value -> BadgeStyle.DOT
                                    badgeStyleStates[1].value -> BadgeStyle.NUMBER
                                    else -> BadgeStyle.NUMBER
                                },
                                tabs = {
                                    tabs.forEachIndexed { index, s ->
                                        Tab(
                                            text = if (title) s else null,
                                            onClick = {
                                                state = index
                                            },
                                            count = if (badge) 10 else 0,
                                            icon = if (icon) rememberVectorPainter(image = PersianSymbols.Default.User) else null,
                                            selected = state == index
                                        )
                                    }
                                },
                            )
                        }

                        typeStates[1].value -> {
                            ScrollableTabBar(
                                selectedTabIndex = scrollableState,
                                iconSide = when {
                                    iconSideStates[0].value -> IconSide.LEFT
                                    iconSideStates[1].value -> IconSide.TOP
                                    else -> IconSide.TOP
                                },
                                badgeStyle = when {
                                    badgeStyleStates[0].value -> BadgeStyle.DOT
                                    badgeStyleStates[1].value -> BadgeStyle.NUMBER
                                    else -> BadgeStyle.NUMBER
                                },
                                tabs = {
                                    scrollableTabs.forEachIndexed { index, s ->
                                        Tab(
                                            text = if (title) s else null,
                                            onClick = {
                                                scrollableState = index
                                            },
                                            count = if (badge) 10 else 0,
                                            icon = if (icon) rememberVectorPainter(image = PersianSymbols.Default.User) else null,
                                            selected = scrollableState == index
                                        )
                                    }
                                },
                            )
                        }
                    }
                }
                if (icon) {
                    FormItem(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = { Subhead(text = "Icon side") },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Left",
                                    selected = iconSideStates[0].value,
                                    onSelectedChange = {
                                        iconSideStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Top",
                                    selected = iconSideStates[1].value,
                                    onSelectedChange = {
                                        iconSideStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                    }
                                )
                            }
                        }
                    )
                }
                if (badge) {
                    FormItem(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
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
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
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
                                text = "Scrollable",
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
                FormItem(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Title",
                                checked = title,
                                onCheckedChange = { isChecked ->
                                    title = isChecked
                                    if (!isChecked && !icon) icon = true
                                }
                            )
                            Checkbox(
                                text = "Icon",
                                checked = icon,
                                onCheckedChange = { isChecked ->
                                    icon = isChecked
                                    if (!isChecked && !title) title = true
                                }
                            )
                            Checkbox(
                                text = "Counter",
                                checked = badge,
                                onCheckedChange = onBadgeChange
                            )
                        }
                    }
                )
            }
        }
    }
}