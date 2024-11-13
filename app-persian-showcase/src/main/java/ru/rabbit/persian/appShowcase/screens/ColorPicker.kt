package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.colorPicker.ColorPicker
import io.github.madmaximuus.persian.colorPicker.view.util.rememberColorPickerState
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.arrow.down.ArrowDown
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ColorPicker : Screen {
    override val name: String = "Color picker"

    override val navigation: String = "colorPicker"

    @Composable
    override fun Content(navController: NavController?) {
        var showDialog by remember { mutableStateOf(false) }

        val state = rememberColorPickerState(
            initialColor = PersianTheme.colorScheme.primary,
            isSupportOpacity = true
        )
        val initialColor = PersianTheme.colorScheme.primary
        var color by remember {
            mutableStateOf(initialColor)
        }
        SampleScaffold(title = name, onBackClick = { navController?.navigateUp() }) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color)
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
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
                Icon(
                    painter = rememberVectorPainter(PersianSymbols.Default.ArrowDown),
                    sizes = IconDefaults.size28()
                )
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .background(color, RoundedCornerShape(1000.dp))
                        .border(
                            width = 4.dp,
                            color = PersianTheme.colorScheme.onSurface,
                            shape = RoundedCornerShape(1000.dp)
                        )
                        .clip(RoundedCornerShape(1000.dp))
                        .clickable {
                            showDialog = true
                        }
                )
            }
        }

        if (showDialog) {
            ColorPicker(
                state = state,
                onConfirm = {
                    color = it
                    showDialog = false
                },
                onDismissRequest = {
                    showDialog = false
                }
            )
        }
    }
}