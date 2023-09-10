package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.iconButtons.PersianIconButton

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
                        PersianIconButton.Primary(
                            icon = MaterialTheme.icons.favoriteOutlined,
                            style = PersianComponentStyle.FILL,
                            onClick = {}
                        )
                        PersianIconButton.Primary(
                            icon = MaterialTheme.icons.favoriteOutlined,
                            style = PersianComponentStyle.OUTLINED,
                            onClick = {}
                        )
                        PersianIconButton.Primary(
                            icon = MaterialTheme.icons.favoriteOutlined,
                            style = PersianComponentStyle.STANDARD,
                            onClick = {}
                        )
                        PersianIconButton.Primary(
                            icon = MaterialTheme.icons.favoriteOutlined,
                            style = PersianComponentStyle.TONAL,
                            onClick = {}
                        )
                    }
                }
                item {
                    val (checked, onCheckedChange) = remember { mutableStateOf(false) }
                    SampleRow(text = "Toggleable Icon Button", lastItem = true) {
                        ru.rabbit.persian.iconButtons.toggle.PersianIconButton.Primary(
                            icon = MaterialTheme.icons.favoriteOutlined,
                            style = PersianComponentStyle.FILL,
                            checkedIcon = MaterialTheme.icons.favoriteFilled,
                            checked = checked,
                            onCheckedChange = onCheckedChange
                        )
                        ru.rabbit.persian.iconButtons.toggle.PersianIconButton.Primary(
                            icon = MaterialTheme.icons.favoriteOutlined,
                            style = PersianComponentStyle.OUTLINED,
                            checkedIcon = MaterialTheme.icons.favoriteFilled,
                            checked = checked,
                            onCheckedChange = onCheckedChange
                        )
                        ru.rabbit.persian.iconButtons.toggle.PersianIconButton.Primary(
                            icon = MaterialTheme.icons.favoriteOutlined,
                            style = PersianComponentStyle.STANDARD,
                            checkedIcon = MaterialTheme.icons.favoriteFilled,
                            checked = checked,
                            onCheckedChange = onCheckedChange
                        )
                        ru.rabbit.persian.iconButtons.toggle.PersianIconButton.Primary(
                            icon = MaterialTheme.icons.favoriteOutlined,
                            style = PersianComponentStyle.TONAL,
                            checkedIcon = MaterialTheme.icons.favoriteFilled,
                            checked = checked,
                            onCheckedChange = onCheckedChange
                        )
                    }
                }
            }
        }
    }
}