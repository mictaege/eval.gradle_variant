package com.github.mictaege.eval.gradle_variant

sealed class SpaceShipType(val name: String) {
    object Hermes: SpaceShipType("Hermes")
}