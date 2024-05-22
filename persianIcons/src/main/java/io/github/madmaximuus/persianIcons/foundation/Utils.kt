package io.github.madmaximuus.persianIcons.foundation

import androidx.compose.ui.graphics.vector.ImageVector
import io.github.madmaximuus.persianIcons.add.base.Add
import io.github.madmaximuus.persianIcons.add.box.AddBox
import io.github.madmaximuus.persianIcons.add.circle.AddCircle
import io.github.madmaximuus.persianIcons.apps.Apps
import io.github.madmaximuus.persianIcons.arrowDown.base.ArrowDown
import io.github.madmaximuus.persianIcons.arrowDown.circle.ArrowDownCircle
import io.github.madmaximuus.persianIcons.arrowLeft.base.ArrowLeft
import io.github.madmaximuus.persianIcons.arrowLeft.circle.ArrowLeftCircle
import io.github.madmaximuus.persianIcons.arrowRight.circle.ArrowRightCircle
import io.github.madmaximuus.persianIcons.arrowUp.base.ArrowUp
import io.github.madmaximuus.persianIcons.arrowUp.circle.ArrowUpCircle
import io.github.madmaximuus.persianIcons.search.Search

fun PersianSymbols.Default.getAllIcons(): List<ImageVector> {
    return listOf(
        Add,
        AddBox,
        AddCircle,
        Apps,
        ArrowLeft,
        ArrowLeftCircle,
        ArrowRightCircle,
        ArrowUp,
        ArrowUpCircle,
        ArrowDown,
        ArrowDownCircle,
        Search
    ).sortedBy { it::class.simpleName }
}

fun PersianSymbols.Filled.getAllIcons(): List<ImageVector> {
    return listOf(
        AddBox, AddCircle, ArrowLeftCircle, ArrowRightCircle, ArrowUpCircle, ArrowDownCircle
    ).sortedBy { it::class.simpleName }
}

fun PersianSymbols.getAllIcons(): List<ImageVector> {
    return (PersianSymbols.Default.getAllIcons() + PersianSymbols.Filled.getAllIcons()).sortedBy { it::class.simpleName }
}