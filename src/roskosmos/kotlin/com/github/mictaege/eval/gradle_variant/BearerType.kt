package com.github.mictaege.eval.gradle_variant

sealed class BearerType(val name: String, val spaceShip: SpaceShip) {
    object Wostok: BearerType("Wostok", SpaceShip(SpaceShipType.Wostok))
    object Sojus: BearerType("Sojus", SpaceShip(SpaceShipType.Sojus))
}