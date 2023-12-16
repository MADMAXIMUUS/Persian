package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.iconButtons.PersianOutlinedIconButton
import io.github.madmaximuus.persian.iconButtons.PersianOutlinedToggleIconButton
import io.github.madmaximuus.persian.iconButtons.PersianPrimaryIconButton
import io.github.madmaximuus.persian.iconButtons.PersianPrimaryToggleIconButton
import io.github.madmaximuus.persian.iconButtons.PersianSecondaryIconButton
import io.github.madmaximuus.persian.iconButtons.PersianSecondaryToggleIconButton
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryIconButton
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryToggleIconButton
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object IconButton : Screen {

    override val name: String = "Icon Buttons"

    override val navigation: String = "iconButton"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Icon Button", firstItem = true) {
                        PersianPrimaryIconButton(
                            icon = MaterialTheme.icons.person,
                            onClick = {}
                        )
                        PersianSecondaryIconButton(
                            icon = MaterialTheme.icons.person,
                            onClick = {}
                        )
                        PersianTertiaryIconButton(
                            icon = MaterialTheme.icons.person,
                            onClick = {}
                        )
                        PersianOutlinedIconButton(
                            icon = MaterialTheme.icons.person,
                            onClick = {}
                        )
                    }
                }
                item {
                    val (checked, onCheckedChange) = remember { mutableStateOf(false) }
                    SampleRow(text = "Toggleable Icon Button", lastItem = true) {
                        PersianPrimaryToggleIconButton(
                            icon = MaterialTheme.icons.person,
                            checkedIcon = painterResource(id = R.drawable.ic_person_filled),
                            checked = checked,
                            onCheckedChange = onCheckedChange
                        )
                        PersianSecondaryToggleIconButton(
                            icon = MaterialTheme.icons.person,
                            checkedIcon = painterResource(id = R.drawable.ic_person_filled),
                            checked = checked,
                            onCheckedChange = onCheckedChange
                        )
                        PersianTertiaryToggleIconButton(
                            icon = MaterialTheme.icons.person,
                            checkedIcon = painterResource(id = R.drawable.ic_person_filled),
                            checked = checked,
                            onCheckedChange = onCheckedChange
                        )
                        PersianOutlinedToggleIconButton(
                            icon = MaterialTheme.icons.person,
                            checkedIcon = painterResource(id = R.drawable.ic_person_filled),
                            checked = checked,
                            onCheckedChange = onCheckedChange
                        )
                    }
                }
            }
        }
    }
}