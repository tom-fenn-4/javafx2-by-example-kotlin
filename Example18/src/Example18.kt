import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.geometry.HPos
import javafx.geometry.Insets
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import javafx.scene.paint.Color
import javafx.stage.Stage

/*
**  Created by: US291100 on 8/3/2016
**
**
**
*/

class Main : javafx.application.Application() {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            javafx.application.Application.launch(Example18.Main::class.java, *args)
        }
    }

    override fun start(ps: Stage) {
        ps.title = "Window Title"
        val root = Group()
        root.children.add( GridPane().apply {
            padding = Insets(5.0)
            hgap = 5.0
            vgap = 5.0
            add(Label("First Name").apply {GridPane.setHalignment(this, HPos.RIGHT)}, 0, 0)
            add(TextField().apply {GridPane.setHalignment(this, HPos.LEFT)}, 1, 0)
            add(Label("Last Name").apply {GridPane.setHalignment(this, HPos.RIGHT)}, 0, 1)
            add(TextField().apply {GridPane.setHalignment(this, HPos.LEFT)}, 1, 1)
            add( Button("Save Me!").apply {
                GridPane.setHalignment(this, HPos.RIGHT)
                onAction = EventHandler<ActionEvent> { println("You can't be saved.") }}, 1,2)})
        ps.scene = Scene(root, 270.0, 100.0, Color.ANTIQUEWHITE)
        ps.show()
    }
}