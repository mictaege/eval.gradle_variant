package com.github.mictaege.eval.gradle_variant

import com.github.mictaege.eval.gradle_variant.BearerType.Atlas
import com.github.mictaege.eval.gradle_variant.BearerType.Titan
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class DaoTest {

    @Test fun shouldProvideBearer() {
        Dao().findBearers() shouldMatch equalTo(listOf(Atlas, Titan))
    }

}