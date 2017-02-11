package com.github.mictaege.eval.gradle_variant

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class TowerTest {

    @Test fun shouldLaunchWostok() {
        val started = Tower().start()
        started.type.name shouldMatch equalTo(BearerType.Ariane5.name)
        started.type.spaceShip.type.name shouldMatch equalTo(SpaceShipType.Hermes.name)
    }

}