package io.github.madmaximuus.persian.fab

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.navigationBar.NavigationBarItem
import io.github.madmaximuus.persian.navigationBar.PersianNavigationBar

@Composable
fun PersianSmallFab(
    modifier: Modifier = Modifier,
    icon: Painter,
    sizes: FabSizes = PersianFabDefaults.smallSizes(),
    colors: FabColors = PersianFabDefaults.neutralColors(),
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
        PersianIconBox(
            icon = icon,
            size = sizes.iconSize
        )
    }
}

@Composable
fun PersianMediumFab(
    modifier: Modifier = Modifier,
    icon: Painter,
    title: String? = null,
    sizes: FabSizes = PersianFabDefaults.mediumSizes(),
    expanded: Boolean = true,
    colors: FabColors = PersianFabDefaults.neutralColors(),
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
                PersianIconBox(
                    icon = icon,
                    size = sizes.iconSize
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
                PersianIconBox(
                    icon = icon,
                    size = sizes.iconSize
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

@Preview
@Composable
fun FabPreview() {
    PersianTheme {
        Scaffold(
            floatingActionButton = {
                PersianMediumFab(
                    icon = MaterialTheme.icons.edit,
                    colors = PersianFabDefaults.primaryColors(),
                    title = "New Tweet",
                    expanded = true,
                    onClick = {}
                )
            },
            floatingActionButtonPosition = FabPosition.End,
            bottomBar = {
                PersianNavigationBar(actions = listOf(
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
                        selectedIcon = MaterialTheme.icons.chatFilled,
                        icon = MaterialTheme.icons.chatOutlined,
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