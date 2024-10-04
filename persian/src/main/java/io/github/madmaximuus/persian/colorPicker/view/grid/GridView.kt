package io.github.madmaximuus.persian.colorPicker.view.grid

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.resolveColor
import io.github.madmaximuus.persian.foundation.PersianTheme

@Composable
internal fun GridView(
    state: ColorPickerState,
    viewColors: ColorPickerViewColors,
) {
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxWidth()
            .clip(PersianTheme.shapes.shape12),
        columns = GridCells.Fixed(12),
        userScrollEnabled = false,
        horizontalArrangement = Arrangement.spacedBy(0.dp),
        verticalArrangement = Arrangement.spacedBy(0.dp)
    ) {
        items(items = colors) { item ->
            val baseModifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .background(item)
                .clickable {
                    val newColor = resolveColor(item)
                    state.colorHueState = newColor.first
                    state.colorSaturationState = newColor.second
                    state.colorValueState = newColor.third
                }
            val borderModifier = if (item == state.selectedColor.copy(1f)) baseModifier
                .border(
                    2.dp,
                    color = viewColors.selectorThumbBorderColor
                )
            else baseModifier
            Box(
                modifier = borderModifier,
            )
        }
    }
}

private val colors = arrayOf(
    //Row 1
    Color.White,
    Color.hsl(0f, 0f, 92 / 100f, 1f),
    Color.hsl(0f, 0f, 84 / 100f, 1f),
    Color.hsl(0f, 0f, 76 / 100f, 1f),
    Color.hsl(0f, 0f, 68 / 100f, 1f),
    Color.hsl(0f, 0f, 60f / 100, 1f),
    Color.hsl(0f, 0f, 52f / 100, 1f),
    Color.hsl(0f, 0f, 44f / 100, 1f),
    Color.hsl(0f, 0f, 36f / 100, 1f),
    Color.hsl(0f, 0f, 28f / 100, 1f),
    Color.hsl(0f, 0f, 20f / 100, 1f),
    Color.Black,

    //Row 2
    Color.hsl(195f, 100f / 100, 15f / 100, 1f),
    Color.hsl(220f, 98f / 100, 17f / 100, 1f),
    Color.hsl(253f, 84f / 100, 13f / 100, 1f),
    Color.hsl(284f, 82f / 100, 13f / 100, 1f),
    Color.hsl(337f, 79f / 100, 13f / 100, 1f),
    Color.hsl(4f, 98f / 100, 18f / 100, 1f),
    Color.hsl(19f, 100f / 100, 18f / 100, 1f),
    Color.hsl(35f, 100f / 100, 17f / 100, 1f),
    Color.hsl(43f, 100f / 100, 17f / 100, 1f),
    Color.hsl(57f, 100f / 100, 20f / 100, 1f),
    Color.hsl(64f, 91f / 100, 17f / 100, 1f),
    Color.hsl(91f, 61f / 100, 15f / 100, 1f),

    //Row 3
    Color.hsl(194f, 100f / 100, 20f / 100, 1f),
    Color.hsl(217f, 98f / 100, 24f / 100, 1f),
    Color.hsl(253f, 78f / 100, 18f / 100, 1f),
    Color.hsl(284f, 75f / 100, 20f / 100, 1f),
    Color.hsl(338f, 68f / 100, 20f / 100, 1f),
    Color.hsl(8f, 100f / 100, 26f / 100, 1f),
    Color.hsl(20f, 100f / 100, 24f / 100, 1f),
    Color.hsl(36f, 100f / 100, 24f / 100, 1f),
    Color.hsl(44f, 100f / 100, 24f / 100, 1f),
    Color.hsl(57f, 97f / 100, 28f / 100, 1f),
    Color.hsl(64f, 84f / 100, 25f / 100, 1f),
    Color.hsl(90f, 54f / 100, 22f / 100, 1f),

    //Row 4
    Color.hsl(194f, 99f / 100, 28f / 100, 1f),
    Color.hsl(217f, 100f / 100, 33f / 100, 1f),
    Color.hsl(259f, 86f / 100, 25f / 100, 1f),
    Color.hsl(284f, 68f / 100, 29f / 100, 1f),
    Color.hsl(338f, 65f / 100, 29f / 100, 1f),
    Color.hsl(9f, 100f / 100, 35f / 100, 1f),
    Color.hsl(22f, 100f / 100, 34f / 100, 1f),
    Color.hsl(37f, 100f / 100, 33f / 100, 1f),
    Color.hsl(44f, 99f / 100, 33f / 100, 1f),
    Color.hsl(58f, 100f / 100, 38f / 100, 1f),
    Color.hsl(64f, 84f / 100, 35f / 100, 1f),
    Color.hsl(92f, 52f / 100, 32f / 100, 1f),

    //Row 5
    Color.hsl(193f, 100f / 100, 35f / 100, 1f),
    Color.hsl(216f, 100f / 100, 42f / 100, 1f),
    Color.hsl(254f, 70f / 100, 34f / 100, 1f),
    Color.hsl(283f, 65f / 100, 37f / 100, 1f),
    Color.hsl(338f, 62f / 100, 37f / 100, 1f),
    Color.hsl(10f, 100f / 100, 44f / 100, 1f),
    Color.hsl(22f, 100f / 100, 43f / 100, 1f),
    Color.hsl(37f, 99f / 100, 42f / 100, 1f),
    Color.hsl(45f, 99f / 100, 41f / 100, 1f),
    Color.hsl(58f, 100f / 100, 48f / 100, 1f),
    Color.hsl(65f, 80f / 100, 45f / 100, 1f),
    Color.hsl(91f, 50f / 100, 41f / 100, 1f),

    //Row 6
    Color.hsl(195f, 100f / 100, 42f / 100, 1f),
    Color.hsl(217f, 100f / 100, 50f / 100, 1f),
    Color.hsl(258f, 68f / 100, 42f / 100, 1f),
    Color.hsl(285f, 63f / 100, 45f / 100, 1f),
    Color.hsl(339f, 61f / 100, 45f / 100, 1f),
    Color.hsl(11f, 100f / 100, 54f / 100, 1f),
    Color.hsl(25f, 100f / 100, 50f / 100, 1f),
    Color.hsl(40f, 100f / 100, 50f / 100, 1f),
    Color.hsl(47f, 100f / 100, 49f / 100, 1f),
    Color.hsl(59f, 99f / 100, 63f / 100, 1f),
    Color.hsl(66f, 83f / 100, 57f / 100, 1f),
    Color.hsl(94f, 49f / 100, 49f / 100, 1f),

    //Row 7
    Color.hsl(193f, 99f / 100, 50f / 100, 1f),
    Color.hsl(216f, 98f / 100, 61f / 100, 1f),
    Color.hsl(255f, 82f / 100, 55f / 100, 1f),
    Color.hsl(283f, 89f / 100, 59f / 100, 1f),
    Color.hsl(338f, 77f / 100, 57f / 100, 1f),
    Color.hsl(6f, 99f / 100, 65f / 100, 1f),
    Color.hsl(20f, 99f / 100, 64f / 100, 1f),
    Color.hsl(37f, 99f / 100, 62f / 100, 1f),
    Color.hsl(44f, 99f / 100, 62f / 100, 1f),
    Color.hsl(57f, 100f / 100, 71f / 100, 1f),
    Color.hsl(65f, 81f / 100, 67f / 100, 1f),
    Color.hsl(92f, 57f / 100, 60f / 100, 1f),

    //Row 8
    Color.hsl(193f, 97f / 100, 65f / 100, 1f),
    Color.hsl(218f, 100f / 100, 73f / 100, 1f),
    Color.hsl(259f, 98f / 100, 65f / 100, 1f),
    Color.hsl(285f, 99f / 100, 67f / 100, 1f),
    Color.hsl(338f, 79f / 100, 69f / 100, 1f),
    Color.hsl(5f, 100f / 100, 75f / 100, 1f),
    Color.hsl(19f, 98f / 100, 74f / 100, 1f),
    Color.hsl(36f, 99f / 100, 73f / 100, 1f),
    Color.hsl(44f, 99f / 100, 74f / 100, 1f),
    Color.hsl(57f, 100f / 100, 79f / 100, 1f),
    Color.hsl(65f, 79f / 100, 75f / 100, 1f),
    Color.hsl(92f, 55f / 100, 71f / 100, 1f),

    //Row 9
    Color.hsl(194f, 95f / 100, 78f / 100, 1f),
    Color.hsl(219f, 100f / 100, 83f / 100, 1f),
    Color.hsl(259f, 98f / 100, 77f / 100, 1f),
    Color.hsl(284f, 98f / 100, 78f / 100, 1f),
    Color.hsl(339f, 78f / 100, 80f / 100, 1f),
    Color.hsl(5f, 100f / 100, 84f / 100, 1f),
    Color.hsl(19f, 100f / 100, 84f / 100, 1f),
    Color.hsl(34f, 98f / 100, 83f / 100, 1f),
    Color.hsl(42f, 96f / 100, 83f / 100, 1f),
    Color.hsl(57f, 100f / 100, 86f / 100, 1f),
    Color.hsl(66f, 80f / 100, 84f / 100, 1f),
    Color.hsl(92f, 53f / 100, 81f / 100, 1f),

    //Row 10
    Color.hsl(197f, 100f / 100, 90f / 100, 1f),
    Color.hsl(218f, 96f / 100, 91f / 100, 1f),
    Color.hsl(257f, 96f / 100, 89f / 100, 1f),
    Color.hsl(283f, 96f / 100, 89f / 100, 1f),
    Color.hsl(339f, 76f / 100, 90f / 100, 1f),
    Color.hsl(3f, 100f / 100, 92f / 100, 1f),
    Color.hsl(18f, 100f / 100, 92f / 100, 1f),
    Color.hsl(34f, 95f / 100, 91f / 100, 1f),
    Color.hsl(41f, 95f / 100, 92f / 100, 1f),
    Color.hsl(56f, 89f / 100, 93f / 100, 1f),
    Color.hsl(68f, 76f / 100, 92f / 100, 1f),
    Color.hsl(97f, 43f / 100, 88f / 100, 1f),
)