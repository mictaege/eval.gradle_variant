package com.github.mictaege.eval.gradle_variant

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class LaunchPadTest {

    @Test fun shouldLaunchBearer() {
        LaunchPad().launch().type.name shouldMatch equalTo("Atlas")
    }

}