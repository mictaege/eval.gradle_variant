package com.github.mictaege.eval.gradle_variant

import tornadofx.View
import tornadofx.splitpane

class TowerControlView: View() {
    val list: TowerControlList by inject()
    val form: TowerControlForm by inject()

    init {
        primaryStage.isMaximized = true
        list.bearers.addAll(findBearers())
    }

    override val root = splitpane(list.root, form.root)
}