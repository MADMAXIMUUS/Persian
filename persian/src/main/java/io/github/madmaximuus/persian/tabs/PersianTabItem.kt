package io.github.madmaximuus.persian.tabs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Tab
import androidx.compose.material3.TabPosition
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.text.Text

data class TabItem(
    val label: String,
    val icon: Painter? = null,
    val iconSide: IconSide = IconSide.TOP,
    var selected: Boolean = false
)

@Composable
internal fun PersianTab(
    selectedTabIndex: Int,
    index: Int,
    tabItem: TabItem,
    activeColor: Color,
    disabledColor: Color,
    textStyle: TextStyle,
    iconSide: IconSide,
    textOverflow: TextOverflow,
    onTabClicked: (tabItem: TabItem) -> Unit
) {
    val color =
        if (selectedTabIndex == index) activeColor else disabledColor

    Tab(
        modifier = Modifier
            .fillMaxHeight()
            .semantics(mergeDescendants = true) {},
        selected = selectedTabIndex == index,
        onClick = {
            onTabClicked(tabItem)
        },
        text = {
            when {
                tabItem.icon != null -> PersianTopIconTab(
                    tabItem = tabItem,
                    color = color,
                    textStyle = textStyle,
                    textOverflow = textOverflow,
                    iconSide = iconSide
                )

                else -> PersianLabelTab(
                    tabItem = tabItem,
                    color = color,
                    textStyle = textStyle,
                    textOverflow = textOverflow
                )
            }
        }
    )
}

@Composable
private fun PersianLabelTab(
    tabItem: TabItem,
    color: Color,
    textStyle: TextStyle,
    textOverflow: TextOverflow
) {
    Text(
        text = tabItem.label,
        style = textStyle,
        color = color,
        overflow = textOverflow,
        maxLines = 1,
    )
}

@Composable
private fun PersianTopIconTab(
    tabItem: TabItem,
    color: Color,
    textStyle: TextStyle,
    iconSide: IconSide,
    textOverflow: TextOverflow
) {
    when (iconSide) {
        IconSide.LEFT -> {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                tabItem.icon?.let {
                    CompositionLocalProvider(LocalContentColor provides color) {
                        PersianIconBox(
                            icon = it,
                        )
                    }
                    Spacer(modifier = Modifier.width(PersianTheme.spacing.size4))
                }

                PersianLabelTab(
                    tabItem = tabItem,
                    color = color,
                    textStyle = textStyle,
                    textOverflow = textOverflow
                )
            }
        }

        IconSide.TOP -> {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                tabItem.icon?.let {
                    CompositionLocalProvider(LocalContentColor provides color) {
                        PersianIconBox(
                            icon = it,
                        )
                    }
                }

                PersianLabelTab(
                    tabItem = tabItem,
                    color = color,
                    textStyle = textStyle,
                    textOverflow = textOverflow
                )
            }
        }
    }
}

@Composable
internal fun PersianTabItemIndicator(
    tabPositions: List<TabPosition>,
    selectedTabIndex: Int,
    tabIndicatorColor: Color
) {
    Box(
        modifier = Modifier
            .tabIndicatorOffset(tabPositions[selectedTabIndex])
            .padding(horizontal = PersianTheme.spacing.size24)
            .fillMaxWidth()
            .height(3.dp)
            .background(color = tabIndicatorColor, shape = PersianTheme.shapes.shape20)
    )
}

enum class IconSide {
    LEFT, TOP
}