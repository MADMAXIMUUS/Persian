package io.github.madmaximuus.persian.colorPicker.view.util

/**
 * An enumeration representing the different display modes for a color picker.
 *
 * This enum class defines the various modes in which a color picker can be displayed,
 * allowing for different user interfaces and interaction methods for selecting colors.
 *
 * @property GRID A mode that displays colors in a grid layout.
 * @property SPECTRUM A mode that displays colors in a spectrum layout.
 * @property SLIDERS A mode that displays colors using sliders for adjusting RGB values.
 */
internal enum class ColorPickerDisplayMode {
    GRID, SPECTRUM, SLIDERS,
}