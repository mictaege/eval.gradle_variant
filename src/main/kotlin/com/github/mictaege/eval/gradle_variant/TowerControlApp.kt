package com.github.mictaege.eval.gradle_variant

import javafx.application.Application
import tornadofx.App

class TowerControlApp: App(TowerControlView::class)

fun main(args: Array<String>) {
    Application.launch(TowerControlApp::class.java, *args)
}