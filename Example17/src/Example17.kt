import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.control.*
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
            javafx.application.Application.launch(Example17.Main::class.java, *args)
        }
    }

    override fun start(ps: Stage) {
        ps.title = "Example 1-7 -- Creating Menus"
        val root = Group()
        root.children.add(
                MenuBar().apply {
                    menus.add( Menu("File").apply {
                        items.add(MenuItem("New"))
                        items.add(MenuItem("Save"))
                        items.add(SeparatorMenuItem())
                        items.add(MenuItem("Exit")) })
                    menus.add( Menu("Camera").apply {
                        items.add( with (CheckMenuItem("Show Camera 1")) {setSelected(true); this})
                        items.add( with (CheckMenuItem("Show Camera 2")) {setSelected(false); this})})
                    val tgroup = ToggleGroup()
                    menus.add( Menu("Alarm").apply {
                        items.add( with(RadioMenuItem("Sound Alarm")) {setSelected(false); toggleGroup = tgroup; this})
                        items.add( with(RadioMenuItem("Alarm Off")) {setSelected(true); toggleGroup = tgroup; this})
                        items.add( Menu("Contingency Plans").apply {
                            items.add( CheckMenuItem("Self Destruct") )
                            items.add( CheckMenuItem("Turn off the coffee machine") )
                            items.add( CheckMenuItem("Run Away!"))})})})
        ps.scene = Scene(root, 275.0, 200.0, Color.FIREBRICK)
        ps.show()
    }
}