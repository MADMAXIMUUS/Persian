package io.github.madmaximuus.persianIcons.foundation

import androidx.compose.ui.graphics.vector.ImageVector
import io.github.madmaximuus.persianIcons.add.base.Add
import io.github.madmaximuus.persianIcons.add.box.AddBox
import io.github.madmaximuus.persianIcons.add.circle.AddCircle
import io.github.madmaximuus.persianIcons.apps.Apps

fun PersianSymbols.Default.getAllIcons(): List<ImageVector> {
    return listOf(
        Add, AddBox, AddCircle, Apps
    )
}

fun PersianSymbols.Filled.getAllIcons(): List<ImageVector> {
    return listOf(
        AddBox, AddCircle
    )
}

fun PersianSymbols.getAllIcons(): List<ImageVector> {
    return PersianSymbols.Default.getAllIcons() + PersianSymbols.Filled.getAllIcons()
}