package ui

import com.intellij.ui.layout.panel
import javax.swing.JPanel

class CommonUI {
    companion object {
        fun  testPanel() : JPanel {
            return panel() {
                row("Hello") {
                    label("Test")
                }
            }
        }
    }
}