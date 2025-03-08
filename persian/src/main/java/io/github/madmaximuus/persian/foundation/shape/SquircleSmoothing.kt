package io.github.madmaximuus.persian.foundation.shape

enum class SquircleSmoothing(val factor: Float) {
    NONE(0f),
    LOW(0.25f),
    MEDIUM(0.5f),
    IOS(0.6f),
    HIGH(0.75f),
    FULL(1f)
}