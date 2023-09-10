package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.checkboxes.PersianCheckbox

object CheckBox : Screen {

    override val name: String = "Checkboxes"

    override val navigation: String = "checkbox"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val (checked, onCheckedChange) = remember { mutableStateOf(true) }
        val (checked1, onCheckedChange1) = remember { mutableStateOf(false) }
        SampleScaffold(
            title = "Checkboxes",
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = it,
            ) {
                item {
                    PersianCheckbox.Primary(
                        text = "Checked by default",
                        checked = checked,
                        onCheckedChange = onCheckedChange
                    )
                }
                item {
                    PersianCheckbox.Primary(
                        text = "Unchecked by default",
                        checked = checked1,
                        onCheckedChange = onCheckedChange1
                    )
                }
                item {
                    PersianCheckbox.Primary(
                        text = "Checked disabled",
                        checked = true,
                        enabled = false,
                        onCheckedChange = {}
                    )
                }
                item {
                    PersianCheckbox.Primary(
                        text = "Unchecked disabled",
                        checked = false,
                        enabled = false,
                        onCheckedChange = {}
                    )
                }
            }
        }
    }
}