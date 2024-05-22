package io.github.madmaximuus.persianIcons.foundation

import androidx.compose.ui.graphics.vector.ImageVector
import io.github.madmaximuus.persianIcons.arrowDown.base.ArrowDown
import io.github.madmaximuus.persianIcons.arrowDown.circle.ArrowDownCircle
import io.github.madmaximuus.persianIcons.arrowLeft.base.ArrowLeft
import io.github.madmaximuus.persianIcons.arrowLeft.circle.ArrowLeftCircle
import io.github.madmaximuus.persianIcons.arrowRight.circle.ArrowRightCircle
import io.github.madmaximuus.persianIcons.arrowRight.fromBracket.ArrowRightFromBracket
import io.github.madmaximuus.persianIcons.arrowUp.base.ArrowUp
import io.github.madmaximuus.persianIcons.arrowUp.circle.ArrowUpCircle
import io.github.madmaximuus.persianIcons.bars.Bars
import io.github.madmaximuus.persianIcons.check.base.Check
import io.github.madmaximuus.persianIcons.check.circle.CheckCircle
import io.github.madmaximuus.persianIcons.chevronDown.base.ChevronDown
import io.github.madmaximuus.persianIcons.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianIcons.ellipsisGrid.EllipsisGrid
import io.github.madmaximuus.persianIcons.gear.Gear
import io.github.madmaximuus.persianIcons.heart.Heart
import io.github.madmaximuus.persianIcons.house.House
import io.github.madmaximuus.persianIcons.magnifyingGlass.MagnifyingGlass
import io.github.madmaximuus.persianIcons.plus.base.Plus
import io.github.madmaximuus.persianIcons.plus.box.PlusBox
import io.github.madmaximuus.persianIcons.plus.circle.PlusCircle
import io.github.madmaximuus.persianIcons.star.Star
import io.github.madmaximuus.persianIcons.trash.base.Trash
import io.github.madmaximuus.persianIcons.xmark.base.XMark
import io.github.madmaximuus.persianIcons.xmark.circle.XMarkCircle

fun PersianSymbols.Default.getAllIcons(): List<ImageVector> {
    return listOf(
        PersianSymbols.Default.Plus,
        PersianSymbols.Default.PlusBox,
        PersianSymbols.Default.PlusCircle,
        PersianSymbols.Default.EllipsisGrid,
        PersianSymbols.Default.ArrowLeft,
        PersianSymbols.Default.ArrowLeftCircle,
        PersianSymbols.Default.ArrowRightCircle,
        PersianSymbols.Default.ArrowUp,
        PersianSymbols.Default.ArrowUpCircle,
        PersianSymbols.Default.ArrowDown,
        PersianSymbols.Default.ArrowDownCircle,
        PersianSymbols.Default.MagnifyingGlass,
        PersianSymbols.Default.House,
        PersianSymbols.Default.Bars,
        PersianSymbols.Default.XMark,
        PersianSymbols.Default.XMarkCircle,
        PersianSymbols.Default.Gear,
        PersianSymbols.Default.Check,
        PersianSymbols.Default.CheckCircle,
        PersianSymbols.Default.Heart,
        PersianSymbols.Default.Trash,
        PersianSymbols.Default.ChevronDown,
        PersianSymbols.Default.Star,
        PersianSymbols.Default.ChevronRight,
        PersianSymbols.Default.ArrowRightFromBracket,
    ).sortedBy { it::class.simpleName }
}

fun PersianSymbols.Filled.getAllIcons(): List<ImageVector> {
    return listOf(
        PersianSymbols.Filled.PlusBox,
        PersianSymbols.Filled.PlusCircle,
        PersianSymbols.Filled.ArrowLeftCircle,
        PersianSymbols.Filled.ArrowRightCircle,
        PersianSymbols.Filled.ArrowUpCircle,
        PersianSymbols.Filled.ArrowDownCircle,
        PersianSymbols.Filled.House,
        PersianSymbols.Filled.XMarkCircle,
        PersianSymbols.Filled.Gear,
        PersianSymbols.Filled.CheckCircle,
        PersianSymbols.Filled.Heart,
        PersianSymbols.Filled.Trash,
        PersianSymbols.Filled.Star,
    ).sortedBy { it::class.simpleName }
}

fun PersianSymbols.getAllIcons(): List<ImageVector> {
    return (PersianSymbols.Default.getAllIcons() + PersianSymbols.Filled.getAllIcons()).sortedBy { it::class.simpleName }
}