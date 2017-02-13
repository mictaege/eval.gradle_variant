package com.github.mictaege.eval.gradle_variant

sealed class BearerType(val name: String, val constructionYear:Int, val spaceShip: SpaceShip) {
    abstract val img: String
    object Ariane5: BearerType("Ariane5", 1996, SpaceShip(SpaceShipType.Hermes)) {
        override val img: String
            get() = "com/github/mictaege/eval/gradle_variant/Ariane5.jpg"
    }
}