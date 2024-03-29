package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.colorPicker.PersianColorPicker
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerConfig
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ColorPicker : Screen {
    override val name: String = "Color Picker"

    override val navigation: String = "colorPicker"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var showDialog by remember { mutableStateOf(false) }
        val color = MaterialTheme.extendedColorScheme.primary
        var backgroundColor by remember {
            mutableStateOf(color)
        }
        SampleScaffold(title = name, onBackClick = { navController?.navigateUp() }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
            ) {
                PersianPrimaryButton(
                    text = "Show Dialog"
                ) {
                    showDialog = true
                }
                Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraLarge))
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(backgroundColor)
                )
            }
        }

        if (showDialog) {
            PersianColorPicker(
                config = ColorPickerConfig.HEX(
                    backgroundColor
                ),
                onColorSelected = {
                    backgroundColor = it
                }
            ) {
                showDialog = false
            }
        }
    }
}