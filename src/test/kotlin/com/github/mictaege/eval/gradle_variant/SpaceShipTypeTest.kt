package com.github.mictaege.eval.gradle_variant

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class SpaceShipTypeTest {

    @Test fun mercuryBrandShouldProvideName() {
        SpaceShipType.Mercury.name shouldMatch equalTo("Mercury")
    }

    @Test fun geminiBrandShouldProvideName() {
        SpaceShipType.Gemini.name shouldMatch equalTo("Gemini")
    }

}
