package com.github.mictaege.eval.gradle_variant

sealed class BearerType(val name: String, val spaceShip: SpaceShip) {
    object Atlas: BearerType("Atlas", SpaceShip(SpaceShipType.Mercury))
    object Titan: BearerType("Titan", SpaceShip(SpaceShipType.Gemini))
}