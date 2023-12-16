package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.chips.filter.PersianFilterChip
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Chips : Screen {
    override val name: String = "Chips"

    override val navigation: String = "chips"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var selected by remember { mutableStateOf(false) }
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            Column(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraLarge)
            ) {
                PersianFilterChip(
                    title = "Chip",
                    selected = selected,
                    leadingIcon = MaterialTheme.icons.person,
                    trailingIcon = MaterialTheme.icons.expendMore,
                    onClick = { selected = !selected }
                )
            }
        }
    }
}