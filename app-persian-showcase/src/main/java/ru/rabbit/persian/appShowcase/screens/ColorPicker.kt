package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import io.github.madmaximuus.persian.colorPicker.ColorPicker
import io.github.madmaximuus.persian.colorPicker.view.util.rememberColorPickerState
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ColorPicker : Screen {
    override val name: String = "Color picker"

    override val image: Int = R.drawable.color_picker

    override val navigation: String = "colorPicker"

    @Composable
    override fun Content(navController: NavController?) {
        var showDialog by remember { mutableStateOf(false) }

        val state = rememberColorPickerState(
            initialColor = PersianTheme.colorScheme.primary,
            isSupportOpacity = true
        )
        SampleScaffold(title = name, onBackClick = { navController?.navigateUp() }) {
            Box(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize()
                    .background(state.selectedColor)
                    .clickable {
                        showDialog = true
                    }
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size20),
                    text = "Select background color",
                    textAlign = TextAlign.Center,
                    style = PersianTheme.typography.titleLarge,
                    color = PersianTheme.colorScheme.onSurface
                )
            }
        }

        if (showDialog) {
            ColorPicker(
                state = state,
                onDismissRequest = {
                    showDialog = false
                }
            )
        }
    }
}