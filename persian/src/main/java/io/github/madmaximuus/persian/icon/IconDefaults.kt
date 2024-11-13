package io.github.madmaximuus.persian.icon

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Contains all default values used by [Icon].
 */
object IconDefaults {

    /**
     * Creates an [IconSizes].
     *
     * @param width The width of the icon in [Dp].
     * @param padding The padding around the icon in [Dp].
     */
    @Composable
    fun size48(
        width: Dp = 48.dp,
        padding: Dp = 0.dp
    ): IconSizes =
        IconSizes(
            width = width,
            padding = padding
        )

    /**
     * Creates an [IconSizes].
     *
     * @param width The width of the icon in [Dp].
     * @param padding The padding around the icon in [Dp].
     */
    @Composable
    fun size40(
        width: Dp = 40.dp,
        padding: Dp = 0.dp
    ): IconSizes =
        IconSizes(
            width = width,
            padding = padding
        )

    /**
     * Creates an [IconSizes].
     *
     * @param width The width of the icon in [Dp].
     * @param padding The padding around the icon in [Dp].
     */
    @Composable
    fun size32(
        width: Dp = 32.dp,
        padding: Dp = 0.dp
    ): IconSizes =
        IconSizes(
            width = width,
            padding = padding
        )

    /**
     * Creates an [IconSizes].
     *
     * @param width The width of the icon in [Dp].
     * @param padding The padding around the icon in [Dp].
     */
    @Composable
    fun size28(
        width: Dp = 28.dp,
        padding: Dp = 0.dp
    ): IconSizes =
        IconSizes(
            width = width,
            padding = padding
        )

    /**
     * Creates an [IconSizes].
     *
     * @param width The width of the icon in [Dp].
     * @param padding The padding around the icon in [Dp].
     */
    @Composable
    fun size24(
        width: Dp = 24.dp,
        padding: Dp = 0.dp
    ): IconSizes =
        IconSizes(
            width = width,
            padding = padding
        )

    /**
     * Creates an [IconSizes].
     *
     * @param width The width of the icon in [Dp].
     * @param padding The padding around the icon in [Dp].
     */
    @Composable
    fun size20(
        width: Dp = 20.dp,
        padding: Dp = 0.dp
    ): IconSizes =
        IconSizes(
            width = width,
            padding = padding
        )

    /**
     * Creates an [IconSizes].
     *
     * @param width The width of the icon in [Dp].
     * @param padding The padding around the icon in [Dp].
     */
    @Composable
    fun size18(
        width: Dp = 18.dp,
        padding: Dp = 0.dp
    ): IconSizes =
        IconSizes(
            width = width,
            padding = padding
        )

    /**
     * Creates an [IconSizes].
     *
     * @param width The width of the icon in [Dp].
     * @param padding The padding around the icon in [Dp].
     */
    @Composable
    fun size16(
        width: Dp = 16.dp,
        padding: Dp = 0.dp
    ): IconSizes =
        IconSizes(
            width = width,
            padding = padding
        )

    /**
     * Creates an [IconSizes].
     *
     * @param width The width of the icon in [Dp].
     * @param padding The padding around the icon in [Dp].
     */
    @Composable
    fun size12(
        width: Dp = 12.dp,
        padding: Dp = 0.dp
    ): IconSizes =
        IconSizes(
            width = width,
            padding = padding
        )
}

/**
 * A class representing the sizes for an icon, including its width and padding.
 *
 * @property width The width of the icon in [Dp].
 * @property padding The padding around the icon in [Dp].
 */
@Immutable
class IconSizes internal constructor(
    internal val width: Dp,
    internal val padding: Dp
)