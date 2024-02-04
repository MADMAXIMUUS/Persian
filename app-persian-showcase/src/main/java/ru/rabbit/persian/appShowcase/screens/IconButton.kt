package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconButtons.PersianIconButtonDefaults
import io.github.madmaximuus.persian.iconButtons.PersianOutlinedIconButton
import io.github.madmaximuus.persian.iconButtons.PersianOutlinedToggleIconButton
import io.github.madmaximuus.persian.iconButtons.PersianPrimaryIconButton
import io.github.madmaximuus.persian.iconButtons.PersianPrimaryToggleIconButton
import io.github.madmaximuus.persian.iconButtons.PersianSecondaryIconButton
import io.github.madmaximuus.persian.iconButtons.PersianSecondaryToggleIconButton
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryIconButton
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryToggleIconButton
import io.github.madmaximuus.persian.radioButtons.PersianRadioButton
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object IconButton : Screen {

    override val name: String = "Icon Buttons"

    override val navigation: String = "iconButton"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior,
        ) {
            val size = PersianIconButtonDefaults.largeSizes()
            var sizeState by remember { mutableStateOf(size) }
            var enabled by remember { mutableStateOf(true) }
            val (checked, onCheckedChange) = remember { mutableStateOf(false) }
            Column(
                Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .padding(it)
            ) {
                SampleRow(
                    text = "Sample Icon Buttons",
                    firstItem = true
                ) {
                    Column(modifier = Modifier.padding(top = MaterialTheme.spacing.extraSmall)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            PersianPrimaryIconButton(
                                sizes = sizeState,
                                enabled = enabled,
                                icon = MaterialTheme.icons.person,
                                onClick = {}
                            )
                            PersianSecondaryIconButton(
                                sizes = sizeState,
                                enabled = enabled,
                                icon = MaterialTheme.icons.person,
                                onClick = {}
                            )
                            PersianTertiaryIconButton(
                                sizes = sizeState,
                                enabled = enabled,
                                icon = MaterialTheme.icons.person,
                                onClick = {}
                            )
                            PersianOutlinedIconButton(
                                sizes = sizeState,
                                enabled = enabled,
                                icon = MaterialTheme.icons.person,
                                onClick = {}
                            )
                        }
                        Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraExtraLarge))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            PersianPrimaryToggleIconButton(
                                icon = MaterialTheme.icons.person,
                                checkedIcon = painterResource(id = R.drawable.ic_person_filled),
                                checked = checked,
                                sizes = sizeState,
                                enabled = enabled,
                                onCheckedChange = onCheckedChange
                            )
                            PersianSecondaryToggleIconButton(
                                icon = MaterialTheme.icons.person,
                                checkedIcon = painterResource(id = R.drawable.ic_person_filled),
                                checked = checked,
                                sizes = sizeState,
                                enabled = enabled,
                                onCheckedChange = onCheckedChange
                            )
                            PersianTertiaryToggleIconButton(
                                icon = MaterialTheme.icons.person,
                                checkedIcon = painterResource(id = R.drawable.ic_person_filled),
                                checked = checked,
                                sizes = sizeState,
                                enabled = enabled,
                                onCheckedChange = onCheckedChange
                            )
                            PersianOutlinedToggleIconButton(
                                icon = MaterialTheme.icons.person,
                                checkedIcon = painterResource(id = R.drawable.ic_person_filled),
                                checked = checked,
                                sizes = sizeState,
                                enabled = enabled,
                                onCheckedChange = onCheckedChange
                            )
                        }
                    }
                }
                val sizeStates = remember {
                    listOf(
                        mutableStateOf(true),
                        mutableStateOf(false),
                        mutableStateOf(false)
                    )
                }
                val large = PersianIconButtonDefaults.largeSizes()
                val medium = PersianIconButtonDefaults.mediumSizes()
                val small = PersianIconButtonDefaults.smallSizes()
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = MaterialTheme.spacing.small,
                            bottom = MaterialTheme.spacing.small,
                            start = MaterialTheme.spacing.medium,
                            end = MaterialTheme.spacing.medium
                        ),
                ) {
                    Text(
                        text = "Size",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectableGroup()
                    ) {
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Large",
                            checked = sizeStates[0].value,
                            onCheckedChange = {
                                sizeStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 0
                                }
                                sizeState = large
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Medium",
                            checked = sizeStates[1].value,
                            onCheckedChange = {
                                sizeStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 1
                                }
                                sizeState = medium
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Small",
                            checked = sizeStates[2].value,
                            onCheckedChange = {
                                sizeStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 2
                                }
                                sizeState = small
                            }
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = MaterialTheme.spacing.small,
                            bottom = MaterialTheme.spacing.small,
                            start = MaterialTheme.spacing.medium,
                            end = MaterialTheme.spacing.medium
                        ),
                ) {
                    Text(
                        text = "Additional settings",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Enabled",
                            checked = enabled,
                            onCheckedChange = {
                                enabled = !enabled
                            }
                        )
                    }
                }
            }
        }
    }
}