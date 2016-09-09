import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.paint.*
import javafx.scene.shape.Ellipse
import javafx.scene.shape.Line
import javafx.scene.shape.Rectangle
import javafx.stage.Stage

/*
**  Created by: US291100 on 8/3/2016
**
**
**
*/

class Main : Application() {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            Application.launch(Example16.Main::class.java, *args)
        }
    }

    override fun start(ps: Stage) {
        ps.title = "Chapter 1-6: Assigning colors to objects"
        val root = Group()
        ps.scene = Scene(root, 200.0, 400.0, Color.ALICEBLUE)
        root.children.add( Ellipse(100.0, 50.0 + 70.0/2, 50.0, 70.0/2).apply {
            fill = RadialGradient(0.0, 0.1, 80.0, 45.0, 120.0, false,
                    CycleMethod.NO_CYCLE,
                    Stop(0.0, Color.RED),
                    Stop(1.0, Color.BLACK))
        })
        root.children.add( Line(170.0, 30.0, 20.0, 140.0).apply {fill = Color.BLACK; strokeWidth = 10.0; translateY = 150.0; this})
        root.children.add(Rectangle(50.0, 50.0, 100.0, 70.0).apply {
            fill = LinearGradient(50.0, 50.0, 50.0, 150.0, false,
                    CycleMethod.NO_CYCLE,
                    Stop(0.1, Color.rgb(255, 200, 0, 0.784)),
                    Stop(1.0, Color.rgb(0, 0, 0, 0.784)))
        })
        ps.show()
    }
}