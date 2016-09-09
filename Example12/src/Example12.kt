import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.stage.Stage

/**
 * Created by US291100 on 8/3/2016.
 */

class HelloWorldMain : javafx.application.Application() {

    companion object {
        @JvmStatic fun main(args: Array<String>) =
                javafx.application.Application.launch(HelloWorldMain::class.java, *args)
    }

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Hello World from Kotlin"
        val root = Group()
        val scene = Scene(root, 300.0, 250.0)
        val btn = Button()
        btn.layoutX = 100.0
        btn.layoutY = 80.0
        btn.text = "Hello World"
        btn.onAction =  EventHandler<ActionEvent> { println("Hello Kotlin") }
        root.children.add(btn)
        primaryStage.scene = scene
        primaryStage.show()
    }
}


