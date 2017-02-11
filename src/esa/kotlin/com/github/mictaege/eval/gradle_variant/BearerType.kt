package com.github.mictaege.eval.gradle_variant

sealed class BearerType(val name: String, val spaceShip: SpaceShip) {
    object Ariane5: BearerType("Ariane5", SpaceShip(SpaceShipType.Hermes))
}