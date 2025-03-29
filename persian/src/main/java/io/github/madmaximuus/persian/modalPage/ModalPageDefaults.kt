package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import io.github.madmaximuus.persian.topAppBar.TopAppBarColors
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.TopAppBarSizes

/**
 * Contains all default values used by [ModalPage] and [FullScreenModalPage]
 */
object ModalPageDefaults {

    /**
     * Creates a [ModalPageColors] instance with the specified colors.
     *
     * This function allows customization of the colors for various components of a modal page, including
     * the container, top app bar, drag handle, and action buttons. Default values are provided for each
     * color, which can be overridden as needed.
     *
     * @param containerColor The color of the modal page container.
     * @param topAppBarColors The colors of the top app bar.
     * @param dragHandleColor The color of the drag handle.
     * @param actionColors The colors of the action buttons.
     */
    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surface,
        topAppBarColors: TopAppBarColors = TopAppBarDefaults.colors(),
        dragHandleColor: Color = PersianTheme.colorScheme.outlineVariant,
        actionColors: ButtonColors = ButtonDefaults.primaryColors()
    ) = ModalPageColors(
        containerColor = containerColor,
        topAppBarColors = topAppBarColors,
        dragHandleColor = dragHandleColor,
        actionColors = actionColors
    )

    /**
     * Creates a [ModalPageSizes] instance with the specified sizes.
     *
     * This function allows customization of the sizes for various components of a modal page, including
     * the container shape, top app bar, drag handle, and action buttons. Default values are provided for each
     * size, which can be overridden as needed.
     *
     * @param containerShape The shape of the modal page container.
     * @param topAppBarSizes The sizes of the top app bar.
     * @param dragHandleSizes The size of the drag handle.
     */
    @Composable
    fun sizes(
        containerShape: CornerBasedShape = PersianTheme.shapes.shape20,
        topAppBarSizes: TopAppBarSizes = TopAppBarDefaults.sizes(),
        dragHandleSizes: DpSize = DpSize(40.dp, 6.dp)
    ) = ModalPageSizes(
        containerShape = containerShape,
        topAppBarSizes = topAppBarSizes,
        dragHandleSizes = dragHandleSizes
    )

    val defaultDraggableAnchors = setOf<DragAnchor>(DragAnchor.Full)
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
    ) = ModalPageColors(
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

/**
 * An immutable class that defines the sizes for various components of a modal page.
 *
 * This class encapsulates the sizes for the container shape, top app bar, drag handle, and action buttons.
 * It provides a `copy` method to create a new instance with modified properties and overrides the `equals`
 * and `hashCode` methods for proper comparison.
 *
 * @property containerShape The shape of the modal page container.
 * @property topAppBarSizes The size of the top app bar.
 * @property dragHandleSizes The size of the drag handle.
 */
@Immutable
class ModalPageSizes(
    internal val containerShape: CornerBasedShape,
    internal val topAppBarSizes: TopAppBarSizes,
    internal val dragHandleSizes: DpSize
) {

    /**
     * Creates a copy of this [ModalPageSizes] instance with the specified properties.
     */
    fun copy(
        containerShape: CornerBasedShape = this.containerShape,
        topAppBarSizes: TopAppBarSizes = this.topAppBarSizes,
        dragHandleSizes: DpSize = this.dragHandleSizes
    ) = ModalPageSizes(
        containerShape = containerShape,
        topAppBarSizes = topAppBarSizes,
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