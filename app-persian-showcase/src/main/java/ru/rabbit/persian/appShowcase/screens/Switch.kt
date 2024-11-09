package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.FormItem
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.switch.Switch
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Switch : Screen {
    override val name: String = "Switch"

    override val navigation: String = "switch"

    @Composable
    override fun Content(navController: NavController?) {
        val (checked, onCheckedChange) = remember { mutableStateOf(false) }
        val (leading, onLeadingChange) = remember { mutableStateOf(false) }
        val (trailing, onTrailingChange) = remember { mutableStateOf(false) }
        val (enabled, onEnabledChange) = remember { mutableStateOf(true) }

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                SampleRow(text = "Sample") {
                    Switch(
                        enabled = enabled,
                        checked = checked,
                        onCheckedChange = onCheckedChange,
                        checkedIcon = if (trailing) rememberVectorPainter(image = PersianSymbols.Default.Check) else null,
                        uncheckedIcon = if (leading) rememberVectorPainter(image = PersianSymbols.Default.XMark) else null,
                    )
                }
                FormItem(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Unchecked icon",
                                checked = leading,
                                onCheckedChange = onLeadingChange
                            )
                            Checkbox(
                                text = "Checked icon",
                                checked = trailing,
                                onCheckedChange = onTrailingChange
                            )
                            Checkbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = onEnabledChange
                            )
                        }
                    }
                )
            }
        }
    }
}