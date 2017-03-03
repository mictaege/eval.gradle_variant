package com.github.mictaege.eval.gradle_variant

sealed class BearerType(val name: String, val spaceShip: SpaceShip) {
    abstract val img: String
}