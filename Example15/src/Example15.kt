import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.paint.Color
import javafx.scene.shape.*
import javafx.stage.Stage

/*
**  Created by: US291100 on 8/3/2016
**
**  In the book, the author uses CubicCurveBuilder, which is deprecated in JavaFX2.  I've used a with
**  statement to save some pain.
**
*/

class Main : javafx.application.Application() {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            javafx.application.Application.launch(Main::class.java, *args)
        }
    }

    override fun start(ps: Stage) {
        ps.title = "Java FX 2.0 -- Drawing Shapes"
        val root = Group()
        root.children.add( CubicCurve().apply {
            startX = 50.0
            startY = 75.0
            controlX1 = 80.0
            controlY1 = -25.0
            controlX2 = 110.0
            controlY2 = 175.0
            endX = 140.0
            endY = 75.0
            strokeWidth = 3.0
            stroke = Color.BLACK
            fill = Color.WHITE
        })
        root.children.add(
                Path().apply {
                    elements.add( MoveTo().apply {
                        x = 50.0; y = 150.0;
                    })
                    elements.add( QuadCurveTo().apply {
                        x = 150.0; y = 150.0; controlX = 100.0; controlY = 50.0;
                    })
                    elements.add( LineTo().apply {
                        x = 50.0; y = 150.0;
                    })
                    elements.add( LineTo().apply {
                        x = 100.0; y = 275.0;
                    })
                    elements.add( LineTo().apply {
                        x = 150.0; y = 150.0;
                    })
                    translateY = 30.0
                    strokeWidth = 3.0
                    stroke = Color.BLACK
                }
        )
        ps.scene = Scene(root, 200.0, 400.0, Color.FIREBRICK)
        ps.show()
    }
}

