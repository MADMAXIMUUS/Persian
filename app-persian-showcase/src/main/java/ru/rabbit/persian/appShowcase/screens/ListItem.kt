package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.listItem.ListCellMiddle
import io.github.madmaximuus.persian.listItem.ListItemStyle
import io.github.madmaximuus.persian.listItem.PersianListCell
import io.github.madmaximuus.persian.listItem.PersianListCellLeft
import io.github.madmaximuus.persian.listItem.PersianListCellRight
import io.github.madmaximuus.persian.listItem.PersianListItemEdit
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.image.base.Image
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ListItem : Screen {
    override val name: String = "List Item"

    override val navigation: String = "listItem"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            Column(modifier = Modifier.padding(it)) {
                PersianListCell(
                    edit = PersianListItemEdit.Drag(
                        onClick = {}
                    ),
                    left = PersianListCellLeft.Icon(
                        icon = rememberVectorPainter(image = PersianSymbols.Default.Image),
                        color = PersianTheme.colorScheme.primary
                    ),
                    middle = ListCellMiddle(
                        title = "Title"
                    ),
                    style = ListItemStyle.ROUND,
                    enabled = true,
                    right = PersianListCellRight.Button(
                        text = "Button",
                        showOpen = true,
                        onClick = {}
                    ),
                    onClick = {

                    }
                )
            }
        }
    }
}