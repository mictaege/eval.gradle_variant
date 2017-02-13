package com.github.mictaege.eval.gradle_variant

import tornadofx.*
import tornadofx.FX.Companion.messages

class TowerControlForm : View(messages["title"]) {
    val model: BearerTypeModel by inject()
    override val root = form {
        fieldset(messages["title"]) {
            field(messages["bearerName"]) {
                label(model.name)
            }
            field(messages["spaceShipName"]) {
                label(model.spaceShip)
            }
        }
    }
}