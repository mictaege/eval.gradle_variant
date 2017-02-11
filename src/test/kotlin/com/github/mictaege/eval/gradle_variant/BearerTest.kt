package com.github.mictaege.eval.gradle_variant

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class BearerTest {

    @Test fun shouldProvideBearerType() {
        Bearer(BearerType.Titan).type.name shouldMatch equalTo("Titan")
    }

}