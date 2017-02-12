package com.github.mictaege.eval.gradle_variant

import javafx.beans.property.SimpleStringProperty
import tornadofx.ItemViewModel

class BearerTypeModel : ItemViewModel<BearerType>() {
    val name = bind { SimpleStringProperty(item?.name ?: "") }
    val spaceShip = bind { SimpleStringProperty(item?.spaceShip?.type?.name ?: "") }
}