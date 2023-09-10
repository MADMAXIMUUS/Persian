package ru.rabbit.persian.tabs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabPosition
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.foundation.spacing

data class TabItem(
    val label: String,
    val icon: Painter? = null,
    val topIcon: Boolean = false,
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
    textOverflow: TextOverflow,
    onTabClicked: (tabItem: TabItem) -> Unit
) {
    val color =
        if (selectedTabIndex == index) activeColor else disabledColor

    Tab(
        modifier = Modifier.fillMaxHeight().semantics(mergeDescendants = true) {},
        selected = selectedTabIndex == index,
        onClick = {
            onTabClicked(tabItem)
        },
        text = {
            when {
                tabItem.topIcon && tabItem.icon != null -> PersianTopIconTab(
                    tabItem = tabItem,
                    color = color,
                    textStyle = textStyle,
                    textOverflow = textOverflow
                )
                tabItem.topIcon.not() && tabItem.icon != null -> PersianLeftIconTab(
                    tabItem = tabItem,
                    color = color,
                    textStyle = textStyle,
                    textOverflow = textOverflow
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
    textOverflow: TextOverflow
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        tabItem.icon?.let {
            Icon(
                painter = it,
                contentDescription = null,
                tint = color
            )
        }

        PersianLabelTab(
            tabItem = tabItem,
            color = color,
            textStyle = textStyle,
            textOverflow = textOverflow
        )
    }
}

@Composable
private fun PersianLeftIconTab(
    tabItem: TabItem,
    color: Color,
    textStyle: TextStyle,
    textOverflow: TextOverflow
) {
    Row {
        tabItem.icon?.let {
            Icon(
                painter = it,
                contentDescription = null,
                tint = color,
            )
        }

        Spacer(modifier = Modifier.width(MaterialTheme.spacing.small))

        PersianLabelTab(
            tabItem = tabItem,
            color = color,
            textStyle = textStyle,
            textOverflow = textOverflow
        )
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
            .fillMaxWidth()
            .height(3.dp)
            .background(color = tabIndicatorColor, shape = MaterialTheme.shapes.extraSmall)
    )
}