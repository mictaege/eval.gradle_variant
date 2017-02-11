package com.github.mictaege.eval.gradle_variant

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class SpaceShipTest {

    @Test fun shouldProvideType() {
        SpaceShip(SpaceShipType.Gemini).type.name shouldMatch equalTo("Gemini")
    }

}