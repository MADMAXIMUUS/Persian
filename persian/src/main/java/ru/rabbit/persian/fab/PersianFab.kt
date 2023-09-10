package ru.rabbit.persian.fab

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import ru.rabbit.persian.foundation.PersianTheme
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.navigationBar.NavigationBarItem
import ru.rabbit.persian.navigationBar.PersianNavigationBar

object PersianFab {

    @Composable
    fun Small(
        modifier: Modifier = Modifier,
        icon: Painter,
        sizes: FabSizes = PersianFabSizes.small(),
        colors: FabColors = PersianFabColors.neutral(),
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        onClick: () -> Unit
    ) {
        SmallFloatingActionButton(
            modifier = modifier
                .size(sizes.boxSize),
            contentColor = colors.content,
            containerColor = colors.backgroundColor,
            shape = sizes.cornerShape,
            interactionSource = interactionSource,
            onClick = onClick
        ) {
            Icon(
                modifier = Modifier
                    .size(sizes.iconSize),
                painter = icon,
                contentDescription = ""
            )
        }
    }

    @Composable
    fun Medium(
        modifier: Modifier = Modifier,
        icon: Painter,
        title: String? = null,
        sizes: FabSizes = PersianFabSizes.medium(),
        expanded: Boolean = true,
        colors: FabColors = PersianFabColors.neutral(),
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        onClick: () -> Unit
    ) {
        if (title == null) {
            FloatingActionButton(
                modifier = modifier
                    .size(sizes.boxSize),
                contentColor = colors.content,
                containerColor = colors.backgroundColor,
                shape = sizes.cornerShape,
                interactionSource = interactionSource,
                onClick = onClick,
                content = {
                    Icon(
                        modifier = Modifier
                            .size(sizes.iconSize),
                        painter = icon,
                        contentDescription = ""
                    )
                }
            )
        } else {
            ExtendedFloatingActionButton(
                modifier = modifier
                    .height(sizes.boxSize),
                contentColor = colors.content,
                containerColor = colors.backgroundColor,
                shape = sizes.cornerShape,
                expanded = expanded,
                interactionSource = interactionSource,
                onClick = onClick,
                icon = {
                    Icon(
                        modifier = Modifier
                            .size(sizes.iconSize),
                        painter = icon,
                        contentDescription = ""
                    )
                },
                text = {
                    Text(
                        text = title,
                        style = sizes.textStyle
                    )
                }
            )
        }
    }
}

@Preview
@Composable
fun FabPreview() {
    PersianTheme {
        Scaffold(
            floatingActionButton = {
                PersianFab.Medium(
                    icon = MaterialTheme.icons.edit,
                    colors = PersianFabColors.primary(),
                    title = "New Tweet",
                    expanded = true,
                    onClick = {}
                )
            },
            floatingActionButtonPosition = FabPosition.End,
            bottomBar = {
                PersianNavigationBar.Primary(actions = listOf(
                    NavigationBarItem(
                        selected = true,
                        selectedIcon = MaterialTheme.icons.homeFilled,
                        icon = MaterialTheme.icons.homeOutlined,
                        text = "Feed",
                        onClick = {}
                    ),
                    NavigationBarItem(
                        selected = false,
                        selectedIcon = MaterialTheme.icons.searchFilled,
                        icon = MaterialTheme.icons.searchOutlined,
                        text = "Search",
                        onClick = {}
                    ),
                    NavigationBarItem(
                        selected = false,
                        selectedIcon = MaterialTheme.icons.mailFilled,
                        icon = MaterialTheme.icons.mailOutlined,
                        text = "Messages",
                        onClick = {}
                    ),
                    NavigationBarItem(
                        selected = false,
                        selectedIcon = MaterialTheme.icons.personFilled,
                        icon = MaterialTheme.icons.personOutlined,
                        text = "Profile",
                        onClick = {}
                    ),
                ))
            }
        ) {
            Text(
                modifier = Modifier.padding(it),
                text = "Some text"
            )
        }
    }
}