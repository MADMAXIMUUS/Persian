package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.modalPage.Action
import io.github.madmaximuus.persian.modalPage.FullScreenModalPage
import io.github.madmaximuus.persian.modalPage.Handle
import io.github.madmaximuus.persian.modalPage.ModalPage
import io.github.madmaximuus.persian.modalPage.TopBar
import io.github.madmaximuus.persian.modalPage.rememberPageState
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ModalPage : Screen {

    override val name: String = "Modal pages"

    override val navigation: String = "modalPage"

    @Composable
    override fun Content(navController: NavController?) {
        var showModal by remember { mutableStateOf(false) }

        val (top, onTopChange) = remember { mutableStateOf(false) }
        val (action, onActionChange) = remember { mutableStateOf(false) }

        val topStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false)
            )
        }

        val modeStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false)
            )
        }

        val (tenPercent, onTenPercentChange) = remember { mutableStateOf(false) }
        val (twelvePercent, onTwelvePercentChange) = remember { mutableStateOf(false) }
        val (thirtyPercent, onThirtyPercentChange) = remember { mutableStateOf(false) }
        val (fortyPercent, onFortyPercentChange) = remember { mutableStateOf(false) }
        val (fiftyPercent, onFiftyPercentChange) = remember { mutableStateOf(false) }
        val (sixtyPercent, onSixtyPercentChange) = remember { mutableStateOf(false) }
        val (seventyPercent, onSeventyPercentChange) = remember { mutableStateOf(false) }
        val (eightyPercent, onEightyPercentChange) = remember { mutableStateOf(false) }
        val (ninetyPercent, onNinetyPercentChange) = remember { mutableStateOf(false) }
        val (extended, onExtendedPercentChange) = remember { mutableStateOf(true) }

        val dragAnchors = mutableSetOf<DragAnchor>().apply {
            if (tenPercent) add(DragAnchor.Fraction(0.1f))
            if (twelvePercent) add(DragAnchor.Fraction(0.2f))
            if (thirtyPercent) add(DragAnchor.Fraction(0.3f))
            if (fortyPercent) add(DragAnchor.Fraction(0.4f))
            if (fiftyPercent) add(DragAnchor.Half)
            if (sixtyPercent) add(DragAnchor.Fraction(0.6f))
            if (seventyPercent) add(DragAnchor.Fraction(0.7f))
            if (eightyPercent) add(DragAnchor.Fraction(0.8f))
            if (ninetyPercent) add(DragAnchor.Fraction(0.9f))
            if (extended) add(DragAnchor.Full)
        }
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .navigationBarsPadding()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
            ) {
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(text = "Mode")
                    },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Modal",
                                selected = modeStates[0].value,
                                onSelectedChange = {
                                    modeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Full screen",
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
                Form(
                    subhead = {
                        Subhead(text = "Settings")
                    },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Top",
                                checked = top,
                                onCheckedChange = onTopChange
                            )
                            Checkbox(
                                text = "Action",
                                checked = action,
                                onCheckedChange = onActionChange
                            )
                        }
                    }
                )
                if (top) {
                    Form(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = {
                            Subhead(text = "Top")
                        },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Top app bar",
                                    selected = topStates[0].value,
                                    onSelectedChange = {
                                        topStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Handle",
                                    selected = topStates[1].value,
                                    onSelectedChange = {
                                        topStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                    }
                                )
                            }
                        }
                    )
                }
                if (modeStates[0].value) {
                    Form(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = {
                            Subhead(text = "States")
                        },
                        content = {
                            Checkboxes {
                                Checkbox(
                                    text = "10%",
                                    checked = tenPercent,
                                    onCheckedChange = onTenPercentChange
                                )
                                Checkbox(
                                    text = "20%",
                                    checked = twelvePercent,
                                    onCheckedChange = onTwelvePercentChange
                                )
                                Checkbox(
                                    text = "30%",
                                    checked = thirtyPercent,
                                    onCheckedChange = onThirtyPercentChange
                                )
                                Checkbox(
                                    text = "40%",
                                    checked = fortyPercent,
                                    onCheckedChange = onFortyPercentChange
                                )
                                Checkbox(
                                    text = "50%",
                                    checked = fiftyPercent,
                                    onCheckedChange = onFiftyPercentChange
                                )
                                Checkbox(
                                    text = "60%",
                                    checked = sixtyPercent,
                                    onCheckedChange = onSixtyPercentChange
                                )
                                Checkbox(
                                    text = "70%",
                                    checked = seventyPercent,
                                    onCheckedChange = onSeventyPercentChange
                                )
                                Checkbox(
                                    text = "80%",
                                    checked = eightyPercent,
                                    onCheckedChange = onEightyPercentChange
                                )
                                Checkbox(
                                    text = "90%",
                                    checked = ninetyPercent,
                                    onCheckedChange = onNinetyPercentChange
                                )
                                Checkbox(
                                    text = "Full",
                                    checked = extended,
                                    onCheckedChange = onExtendedPercentChange
                                )
                            }
                        }
                    )
                }
                PrimaryButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size12),
                    text = "Show page",
                    sizes = ButtonDefaults.largeSizes()
                ) {
                    showModal = true
                }
            }
        }
        if (showModal) {
            when {
                modeStates[0].value -> {
                    ModalPage(
                        onDismissRequest = { showModal = false },
                        pageState = rememberPageState(
                            dragAnchors = dragAnchors
                        ),
                        top = {
                            if (top) {
                                when {
                                    topStates[0].value -> {
                                        TopBar(
                                            title = "Dynamic height",
                                            actionTitle = "Action",
                                            onActionClick = {
                                                showModal = false
                                            }
                                        )
                                    }

                                    topStates[1].value -> {
                                        Handle()
                                    }
                                }
                            }
                        },
                        bottom = {
                            if (action) {
                                Action(text = "Amazing action") {
                                    showModal = false
                                }
                            }
                        },
                        content = {

                        }
                    )
                }

                modeStates[1].value -> {
                    FullScreenModalPage(
                        onDismissRequest = { showModal = false },
                        top = {
                            if (top) {
                                TopBar(
                                    title = "Full screen",
                                    actionTitle = "Action",
                                    onActionClick = {
                                        showModal = false
                                    }
                                )
                            }
                        },
                        bottom = {
                            if (action) {
                                Action(text = "Amazing action") {
                                    showModal = false
                                }
                                Action(text = "Amazing action") {
                                    showModal = false
                                }
                            }
                        },
                        content = {}
                    )
                }
            }
        }
    }
}