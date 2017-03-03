package com.github.mictaege.eval.gradle_variant

sealed class BearerType(val name: String, val spaceShip: SpaceShip) {
    abstract val img: String
    object Wostok: BearerType("Wostok", SpaceShip(SpaceShipType.Wostok))  {
        override val img: String
            get() = "com/github/mictaege/eval/gradle_variant/Wostok.jpg"
    }
    object Sojus: BearerType("Sojus", SpaceShip(SpaceShipType.Sojus))  {
        override val img: String
            get() = "com/github/mictaege/eval/gradle_variant/Sojus.jpg"
    }
}