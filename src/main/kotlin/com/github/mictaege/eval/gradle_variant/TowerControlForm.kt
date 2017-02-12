package com.github.mictaege.eval.gradle_variant

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon.ROCKET
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
            button(messages["launch"], icon(ROCKET))
        }
    }
}