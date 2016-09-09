/**
 * Created by US291100 on 8/3/2016.
 */

import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.paint.Color
import javafx.scene.text.Text
import javafx.stage.Stage
import java.util.*

/**
 * Created by US291100 on 8/3/2016.
 */

class Example13 : Application() {

    companion object {
        @JvmStatic fun main(args: Array<String>) =
                Application.launch(Example13::class.java, *args)
    }

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Example 1.3 -- Drawing Text"
        val root = Group()
        val scene = Scene(root, 300.0, 250.0, Color.WHITE)
        val rand = Random()
        var i = 0
        do {
            i++
            val text = Text(rand.nextDouble() * scene.width, 
                    rand.nextDouble() * scene.height,
                    "JavaFX 2.0")
            with(rand) { text.fill = Color.rgb(nextInt(255), nextInt(255), nextInt(255) , 0.99) }
            text.rotate = rand.nextDouble() * 360
            root.children.add(text)
        } while (i < 100)

        primaryStage.scene = scene
        primaryStage.show()
    }
}