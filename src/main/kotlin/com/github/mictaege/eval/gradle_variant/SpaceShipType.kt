package com.github.mictaege.eval.gradle_variant

sealed class SpaceShipType(val name: String) {
    object Mercury: SpaceShipType("Mercury")
    object Gemini: SpaceShipType("Gemini")
}