package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import io.github.madmaximuus.persian.topAppBar.TopAppBarColors
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults

object ModalPageDefaults {

    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surface,
        topAppBarColors: TopAppBarColors = TopAppBarDefaults.colors(),
        dragHandleColor: Color = PersianTheme.colorScheme.outlineVariant,
        actionColors: ButtonColors = ButtonDefaults.primaryColors()
    ): ModalPageColors = ModalPageColors(
        containerColor = containerColor,
        topAppBarColors = topAppBarColors,
        dragHandleColor = dragHandleColor,
        actionColors = actionColors
    )

    @Composable
    fun sizes(
        containerShape: RoundedCornerShape = PersianTheme.shapes.shape12,
        topAppBarSizes: Dp = 0.dp,
        dragHandleSizes: DpSize = DpSize(40.dp, 6.dp),
        actionSizes: ButtonSizes = ButtonDefaults.largeSizes()
    ): ModalPageSizes = ModalPageSizes(
        containerShape = containerShape,
        topAppBarSizes = topAppBarSizes,
        dragHandleSizes = dragHandleSizes,
        actionSizes = actionSizes
    )

    val defaultDraggableAnchors = setOf<DragAnchor>(DragAnchor.Expanded)
}

@Immutable
class ModalPageColors(
    internal val containerColor: Color,
    internal val topAppBarColors: TopAppBarColors,
    internal val dragHandleColor: Color,
    internal val actionColors: ButtonColors
) {

    fun copy(
        containerColor: Color = this.containerColor,
        topAppBarColors: TopAppBarColors = this.topAppBarColors,
        dragHandleColor: Color = this.dragHandleColor,
        actionColors: ButtonColors = this.actionColors
    ): ModalPageColors = ModalPageColors(
        containerColor = containerColor.takeOrElse { this.containerColor },
        topAppBarColors = topAppBarColors,
        dragHandleColor = dragHandleColor.takeOrElse { this.dragHandleColor },
        actionColors = actionColors
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ModalPageColors) return false

        if (containerColor != other.containerColor) return false
        if (topAppBarColors != other.topAppBarColors) return false
        if (actionColors != other.actionColors) return false
        return dragHandleColor == other.dragHandleColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + topAppBarColors.hashCode()
        result = 31 * result + dragHandleColor.hashCode()
        result = 31 * result + actionColors.hashCode()
        return result
    }
}

@Immutable
class ModalPageSizes(
    internal val containerShape: RoundedCornerShape,
    internal val topAppBarSizes: Dp,
    internal val dragHandleSizes: DpSize,
    internal val actionSizes: ButtonSizes
) {

    fun copy(
        containerShape: RoundedCornerShape = this.containerShape,
        topAppBarSizes: Dp = this.topAppBarSizes, //TODO: Refactor after TopAppBar
        dragHandleSizes: DpSize = this.dragHandleSizes,
        actionSizes: ButtonSizes = this.actionSizes
    ): ModalPageSizes = ModalPageSizes(
        containerShape = containerShape,
        topAppBarSizes = topAppBarSizes,
        dragHandleSizes = dragHandleSizes.takeOrElse { this.dragHandleSizes },
        actionSizes = actionSizes
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ModalPageSizes) return false

        if (containerShape != other.containerShape) return false
        if (topAppBarSizes != other.topAppBarSizes) return false
        if (actionSizes != other.actionSizes) return false
        return dragHandleSizes == other.dragHandleSizes
    }

    override fun hashCode(): Int {
        var result = containerShape.hashCode()
        result = 31 * result + topAppBarSizes.hashCode()
        result = 31 * result + dragHandleSizes.hashCode()
        result = 31 * result + actionSizes.hashCode()
        return result
    }
}