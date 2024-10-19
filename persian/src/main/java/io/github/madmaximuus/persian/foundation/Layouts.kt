package io.github.madmaximuus.persian.foundation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.DpSize

/**
 * A composable function that creates a layout with a main content and a dependent content.
 *
 * This function uses [SubcomposeLayout] to measure and place the main content and dependent content.
 * The dependent content receives the size of the main content as a parameter.
 *
 * @param modifier The modifier to be applied to the layout.
 * @param mainContent A composable lambda that provides the main content of the layout.
 * @param dependentContent A composable lambda that provides the dependent content of the layout.
 * It receives the size of the main content as a parameter.
 */
@Composable
internal fun PersianSubcomposeLayout(
    modifier: Modifier = Modifier,
    mainContent: @Composable () -> Unit,
    dependentContent: @Composable (DpSize) -> Unit
) {

    val density = LocalDensity.current
    SubcomposeLayout(
        modifier = modifier
    ) { constraints: Constraints ->

        val mainPlaceable: Placeable = subcompose(SlotsEnum.Main, mainContent)
            .map {
                it.measure(constraints.copy(minWidth = 0, minHeight = 0))
            }.first()


        val dependentPlaceable: Placeable =
            subcompose(SlotsEnum.Dependent) {
                dependentContent(
                    DpSize(
                        density.run { mainPlaceable.width.toDp() },
                        density.run { mainPlaceable.height.toDp() }
                    )
                )
            }
                .map { measurable: Measurable ->
                    measurable.measure(constraints)
                }.first()


        layout(mainPlaceable.width, mainPlaceable.height) {
            dependentPlaceable.placeRelative(0, 0)
        }
    }
}

/**
 * Enum class for SubcomposeLayouts with main and dependent Composables
 */
internal enum class SlotsEnum { Main, Dependent }