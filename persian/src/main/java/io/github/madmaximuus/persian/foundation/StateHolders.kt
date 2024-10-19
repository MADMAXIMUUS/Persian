package io.github.madmaximuus.persian.foundation

import androidx.compose.ui.graphics.Color

/**
 * A constant representing a view state value of 0.08f.
 */
internal const val PersianState08 = 0.08f

/**
 * A constant representing a view state value of 0.12f.
 */
internal const val PersianState12 = 0.12f

/**
 * A constant representing a view state value of 0.16f.
 */
internal const val PersianState16 = 0.16f

/**
 * A constant representing a view state value of 0.38f.
 */
internal const val PersianState38 = 0.38f

/**
 * An extension property for [Color] that returns a new [Color] with the alpha value set to [PersianState08].
 */
val Color.state08
    get() = this.copy(PersianState08)

/**
 * An extension property for [Color] that returns a new [Color] with the alpha value set to [PersianState12].
 */
val Color.state12
    get() = this.copy(PersianState12)

/**
 * An extension property for [Color] that returns a new [Color] with the alpha value set to [PersianState16].
 */
val Color.state16
    get() = this.copy(PersianState16)

/**
 * An extension property for [Color] that returns a new [Color] with the alpha value set to [PersianState38].
 */
val Color.state38
    get() = this.copy(PersianState38)