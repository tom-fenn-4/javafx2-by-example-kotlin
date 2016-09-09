import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.effect.DropShadow
import javafx.scene.effect.Reflection
import javafx.scene.paint.Color
import javafx.scene.text.Font
import javafx.scene.text.Text
import javafx.stage.Stage

/**
 * Created by US291100 on 8/3/2016.
 */

class Main : javafx.application.Application() {

    companion object {
        @JvmStatic fun main(args: Array<String>) =
                javafx.application.Application.launch(Example14.Main::class.java, *args)
    }

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Example 1.4 -- Changing Text Fonts"
        val root = Group()

        // Add text in Serif font with drop shadow
        val txt2 = Text(50.0, 50.0, "JavaFX 2.0: Intro by Example")
        txt2.font = Font("Serif", 30.0)
        txt2.fill = Color.RED
        val dropShadow = DropShadow()
        dropShadow.offsetX = 2.0
        dropShadow.offsetY = 2.0
        dropShadow.color = Color.rgb(50, 50, 50, 0.588)
        txt2.effect = dropShadow
        root.children.add(txt2)
        // add text in sanserif
        val txt3 = Text(50.0, 100.0, "JavaFX 2.0: Intro by Example")
        txt3.font = Font("SanSerif", 30.0)
        txt3.fill = Color.BLUE
        root.children.add(txt3)
        // Dialog font
        val txt4 = Text(50.0, 150.0, "JavaFX 2.0: Intro by Example")
        txt4.font = Font("Dialog", 30.0)
        txt4.fill = Color.rgb(0, 255, 0)
        root.children.add(txt4)
        //Monospaced
        val txt5 = Text(50.0, 200.0, "JavaFX 2.0: Intro by Example")
        txt5.font = Font("Monospaced", 30.0)
        txt5.fill = Color.BLACK
        root.children.add(txt5)
        val refl = Reflection()
        refl.fraction = 0.8
        txt5.effect = refl

        primaryStage.scene = Scene(root, 550.0, 250.0, Color.WHITE)
        primaryStage.show()
    }
}