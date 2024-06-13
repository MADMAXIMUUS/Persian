package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.select.PersianSelect
import io.github.madmaximuus.persian.select.SelectActionItem
import ru.rabbit.persian.appShowcase.R
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
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size24)
            ) {
                PersianSelect(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size16),
                    selected = selectedOption,
                    values = listOf(
                        SelectActionItem.WithoutIcon(
                            title = "Option 1"
                        ),
                        SelectActionItem.WithoutIcon(
                            title = "Option 2"
                        ),
                        SelectActionItem.PainterIcon(
                            title = "Option 3",
                            icon = painterResource(id = R.drawable.ic_home_filled)
                        ),
                        SelectActionItem.IconUrl(
                            title = "Option 4",
                            iconUrl = "https://loremflickr.com/24/24"
                        )
                    ),
                    onSelectedChange = { option, _ ->
                        selectedOption = option
                    }
                )
            }
        }
    }
}