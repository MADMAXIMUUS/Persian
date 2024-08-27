package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.TopAppBarColors

object ModalPageDefaults {

    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surface,
        topAppBarColors: TopAppBarColors = PersianTopAppBarDefaults.colors(),
        dragHandleColor: Color = PersianTheme.colorScheme.outlineVariant
    ): ModalPageColors = ModalPageColors(
        containerColor = containerColor,
        topAppBarColors = topAppBarColors,
        dragHandleColor = dragHandleColor
    )

    @Composable
    fun sizes(
        containerShape: Shape = PersianTheme.shapes.shape12.copy(
            bottomEnd = CornerSize(0.dp),
            bottomStart = CornerSize(0.dp)
        ),
        topAppBarSizes: Dp = 0.dp,
        dragHandleSizes: DpSize = DpSize(40.dp, 6.dp)
    ): ModalPageSizes = ModalPageSizes(
        containerShape = containerShape,
        topAppBarSizes = topAppBarSizes,
        dragHandleSizes = dragHandleSizes
    )

    val defaultDraggableAnchors = setOf<DragAnchor>(DragAnchor.Expanded)
}

@Immutable
class ModalPageColors(
    internal val containerColor: Color,
    internal val topAppBarColors: TopAppBarColors,
    internal val dragHandleColor: Color,
) {

    fun copy(
        containerColor: Color = this.containerColor,
        topAppBarColors: TopAppBarColors = this.topAppBarColors,
        dragHandleColor: Color = this.dragHandleColor
    ): ModalPageColors = ModalPageColors(
        containerColor = containerColor.takeOrElse { this.containerColor },
        topAppBarColors = this.topAppBarColors,
        dragHandleColor = dragHandleColor.takeOrElse { this.dragHandleColor }
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ModalPageColors) return false

        if (containerColor != other.containerColor) return false
        if (topAppBarColors != other.topAppBarColors) return false
        return dragHandleColor == other.dragHandleColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + topAppBarColors.hashCode()
        result = 31 * result + dragHandleColor.hashCode()
        return result
    }
}

@Immutable
class ModalPageSizes(
    internal val containerShape: Shape,
    internal val topAppBarSizes: Dp,
    internal val dragHandleSizes: DpSize,
) {

    fun copy(
        containerShape: Shape = this.containerShape,
        topAppBarSizes: Dp = this.topAppBarSizes, //TODO: Refactor after TopAppBar
        dragHandleSizes: DpSize = this.dragHandleSizes
    ): ModalPageSizes = ModalPageSizes(
        containerShape = this.containerShape,
        topAppBarSizes = this.topAppBarSizes,
        dragHandleSizes = dragHandleSizes.takeOrElse { this.dragHandleSizes }
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ModalPageSizes) return false

        if (containerShape != other.containerShape) return false
        if (topAppBarSizes != other.topAppBarSizes) return false
        return dragHandleSizes == other.dragHandleSizes
    }

    override fun hashCode(): Int {
        var result = containerShape.hashCode()
        result = 31 * result + topAppBarSizes.hashCode()
        result = 31 * result + dragHandleSizes.hashCode()
        return result
    }
}