package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import io.github.madmaximuus.persian.dividers.DividerDefaults
import io.github.madmaximuus.persian.dividers.HorizontalDivider
import io.github.madmaximuus.persian.dividers.HorizontalInsetSide
import io.github.madmaximuus.persian.dividers.VerticalDivider
import io.github.madmaximuus.persian.dividers.VerticalInsetSide
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.continuous.Slider
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Divider : Screen {

    override val name: String = "Dividers"

    override val navigation: String = "divider"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        val (space, onSpaceChange) = remember { mutableFloatStateOf(16f) }

        val orientationState = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false)
            )
        }

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
                    when {
                        orientationState[0].value -> {
                            Box(
                                Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 20.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                HorizontalDivider(
                                    insetSide = when {
                                        insetSideState[0].value -> HorizontalInsetSide.NONE
                                        insetSideState[1].value -> HorizontalInsetSide.LEFT
                                        insetSideState[2].value -> HorizontalInsetSide.RIGHT
                                        insetSideState[3].value -> HorizontalInsetSide.BOTH
                                        else -> HorizontalInsetSide.NONE
                                    },
                                    sizes = DividerDefaults.sizes(
                                        inset = space.dp
                                    )
                                )
                            }
                        }

                        orientationState[1].value -> {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                VerticalDivider(
                                    insetSide = when {
                                        insetSideState[0].value -> VerticalInsetSide.NONE
                                        insetSideState[1].value -> VerticalInsetSide.TOP
                                        insetSideState[2].value -> VerticalInsetSide.BOTTOM
                                        insetSideState[3].value -> VerticalInsetSide.BOTH
                                        else -> VerticalInsetSide.NONE
                                    },
                                    sizes = DividerDefaults.sizes(
                                        inset = space.dp
                                    )
                                )
                            }
                        }
                    }
                }
                if (!insetSideState[0].value) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = PersianTheme.spacing.size12)
                            .padding(horizontal = PersianTheme.spacing.size16),
                        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
                    ) {
                        Text(
                            text = "Inset size",
                            style = PersianTheme.typography.labelLarge,
                            color = PersianTheme.colorScheme.onSurfaceVariant
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "0dp",
                                style = PersianTheme.typography.bodyLarge,
                                color = PersianTheme.colorScheme.onSurface
                            )
                            Slider(
                                modifier = Modifier
                                    .padding(horizontal = PersianTheme.spacing.size8)
                                    .weight(1f),
                                value = space,
                                onValueChange = onSpaceChange,
                                showLabel = true,
                                valueRange = 0f..24f
                            )
                            Text(
                                text = "24dp",
                                style = PersianTheme.typography.bodyLarge,
                                color = PersianTheme.colorScheme.onSurface
                            )
                        }
                    }
                }
                when {
                    orientationState[0].value -> {
                        Form(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = PersianTheme.spacing.size12),
                            subhead = {
                                Subhead(
                                    text = "Inset side"
                                )
                            },
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
                                        text = "Left",
                                        selected = insetSideState[1].value,
                                        onSelectedChange = {
                                            insetSideState.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Right",
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

                    orientationState[1].value -> {
                        Form(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = PersianTheme.spacing.size12),
                            subhead = {
                                Subhead(
                                    text = "Inset side"
                                )
                            },
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
                                        text = "Top",
                                        selected = insetSideState[1].value,
                                        onSelectedChange = {
                                            insetSideState.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Bottom",
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
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            text = "Orientation"
                        )
                    },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Horizontal",
                                selected = orientationState[0].value,
                                onSelectedChange = {
                                    orientationState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Vertical",
                                selected = orientationState[1].value,
                                onSelectedChange = {
                                    orientationState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                        }
                    }
                )
            }
            /*LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Horizontal divider", firstItem = true) {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(100.dp, 4.dp)
                                    .background(PersianTheme.colorScheme.onSurface)
                            )
                            Box(
                                modifier = Modifier
                                    .size(150.dp, 4.dp)
                                    .background(PersianTheme.colorScheme.onSurface)
                            )
                            HorizontalDivider()
                        }
                    }
                }
                item {
                    SampleRow(text = "Horizontal divider with left inset") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(100.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(150.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            HorizontalDivider(
                                insetSide = HorizontalInsetSide.LEFT,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "horizontal divider with right inset") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(100.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(150.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            HorizontalDivider(
                                insetSide = HorizontalInsetSide.RIGHT,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Horizontal divider with both insets") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(100.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(150.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            HorizontalDivider(
                                insetSide = HorizontalInsetSide.BOTH,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Vertical divider") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(4.dp, 100.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(4.dp, 150.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            VerticalDivider()
                        }
                    }
                }
                item {
                    SampleRow(text = "Vertical divider with top inset") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(4.dp, 100.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(4.dp, 150.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            VerticalDivider(
                                insetSide = VerticalInsetSide.TOP,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Vertical divider with bottom divider") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(4.dp, 100.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(4.dp, 150.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            VerticalDivider(
                                insetSide = VerticalInsetSide.BOTTOM,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Vertical divider with both insets", lastItem = true) {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(4.dp, 100.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(4.dp, 150.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            VerticalDivider(
                                insetSide = VerticalInsetSide.BOTH,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
            }*/
        }
    }
}