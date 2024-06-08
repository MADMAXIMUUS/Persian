package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.switch.PersianSwitch
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Switch : Screen {
    override val name: String = "Switch"
    override val navigation: String = "switch"

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
                    val (checked, onCheckedChange) = remember { mutableStateOf(false) }
                    SampleRow(text = "Default", firstItem = true) {
                        PersianSwitch(
                            checked = checked,
                            onCheckedChange = onCheckedChange
                        )
                    }
                }
                item {
                    val (checked, onCheckedChange) = remember { mutableStateOf(false) }
                    SampleRow(text = "With Checked Icon") {
                        PersianSwitch(
                            checked = checked,
                            onCheckedChange = onCheckedChange,
                            checkedIcon = rememberVectorPainter(image = PersianSymbols.Default.Check),
                        )
                    }
                }
                item {
                    val (checked, onCheckedChange) = remember { mutableStateOf(false) }
                    SampleRow(text = "With Icons") {
                        PersianSwitch(
                            checked = checked,
                            onCheckedChange = onCheckedChange,
                            checkedIcon = rememberVectorPainter(image = PersianSymbols.Default.Check),
                            uncheckedIcon = rememberVectorPainter(image = PersianSymbols.Default.XMark),
                        )
                    }
                }
                item {
                    val (checked, onCheckedChange) = remember { mutableStateOf(false) }
                    SampleRow(text = "Disabled") {
                        PersianSwitch(
                            checked = checked,
                            onCheckedChange = onCheckedChange,
                            enabled = false,
                            checkedIcon = rememberVectorPainter(image = PersianSymbols.Default.Check),
                            uncheckedIcon = rememberVectorPainter(image = PersianSymbols.Default.XMark),
                        )
                    }
                }
            }
        }
    }
}