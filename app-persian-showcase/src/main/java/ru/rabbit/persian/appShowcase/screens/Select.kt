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
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.select.ActionItem
import io.github.madmaximuus.persian.select.PersianSelect
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Select : Screen {
    override val name: String = "Select"

    override val navigation: String = "select"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var selectedOption by remember { mutableStateOf("") }
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
                PersianSelect(
                    modifier = Modifier
                        .padding(horizontal = MaterialTheme.spacing.large),
                    selected = selectedOption,
                    values = listOf(
                        ActionItem(
                            title = "Option 1"
                        ),
                        ActionItem(
                            title = "Option 2"
                        ),
                        ActionItem(
                            title = "Option 3"
                        ),
                        ActionItem(
                            title = "Option 4"
                        )
                    ),
                    onSelectedChange = { option ->
                        selectedOption = option
                    }
                )
            }
        }
    }
}