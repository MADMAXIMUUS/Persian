package io.github.madmaximuus.persianIcons.foundation

import androidx.compose.ui.graphics.vector.ImageVector
import io.github.madmaximuus.persianIcons.add.base.Add
import io.github.madmaximuus.persianIcons.add.box.AddBox
import io.github.madmaximuus.persianIcons.add.circle.AddCircle
import io.github.madmaximuus.persianIcons.apps.Apps
import io.github.madmaximuus.persianIcons.arrowLeft.base.ArrowLeft
import io.github.madmaximuus.persianIcons.arrowLeft.circle.ArrowLeftCircle

fun PersianSymbols.Default.getAllIcons(): List<ImageVector> {
    return listOf(
        Add, AddBox, AddCircle, Apps, ArrowLeft, ArrowLeftCircle
    )
}

fun PersianSymbols.Filled.getAllIcons(): List<ImageVector> {
    return listOf(
        AddBox, AddCircle, ArrowLeftCircle
    )
}

fun PersianSymbols.getAllIcons(): List<ImageVector> {
    return PersianSymbols.Default.getAllIcons() + PersianSymbols.Filled.getAllIcons()
}