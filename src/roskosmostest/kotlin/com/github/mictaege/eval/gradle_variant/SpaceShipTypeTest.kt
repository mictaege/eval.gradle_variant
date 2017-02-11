package com.github.mictaege.eval.gradle_variant

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class SpaceShipTypeTest {

    @Test fun wostokBrandShouldProvideName() {
        SpaceShipType.Wostok.name shouldMatch equalTo("Wostok")
    }

    @Test fun sojusBrandShouldProvideName() {
        SpaceShipType.Sojus.name shouldMatch equalTo("Sojus")
    }

}
