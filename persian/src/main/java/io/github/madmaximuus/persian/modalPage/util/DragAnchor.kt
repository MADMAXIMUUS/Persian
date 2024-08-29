package io.github.madmaximuus.persian.modalPage.util

import java.io.Serializable


sealed class DragAnchor : Comparable<DragAnchor> {
    data object Half : DragAnchor(), Serializable {
        private fun readResolve(): Any = Half
        override fun compareTo(other: DragAnchor): Int {
            val value = when (other) {
                is Half -> 0
                is Expanded -> -1
                is Fraction -> 0.5f.compareTo(other.value)
                is Hidden -> 1
            }
            return value
        }
    }

    data object Expanded : DragAnchor(), Serializable {
        private fun readResolve(): Any = Expanded
        override fun compareTo(other: DragAnchor): Int {
            val value = when (other) {
                is Half -> 1
                is Expanded -> 0
                is Fraction -> 1
                is Hidden -> 1
            }
            return value
        }
    }

    data class Fraction(val value: Float) : DragAnchor(), Serializable {
        override fun compareTo(other: DragAnchor): Int {
            val value = when (other) {
                is Half -> 0.5f.compareTo(value)
                is Expanded -> 1f.compareTo(value)
                is Fraction -> value.compareTo(other.value)
                is Hidden -> 1
            }
            return value
        }
    }

    internal data object Hidden : DragAnchor(), Serializable {
        private fun readResolve(): Any = Hidden
        override fun compareTo(other: DragAnchor): Int {
            return 1
        }
    }
}
