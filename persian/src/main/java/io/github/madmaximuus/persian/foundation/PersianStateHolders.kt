package io.github.madmaximuus.persian.foundation

import androidx.compose.ui.graphics.Color

const val PersianState08 = .08f
const val PersianState12 = .12f
const val PersianState16 = .16f
const val PersianState38 = .38f

val Color.state08
    get() = this.copy(PersianState08)

val Color.state12
    get() = this.copy(PersianState12)

val Color.state16
    get() = this.copy(PersianState16)

val Color.state38
    get() = this.copy(PersianState38)