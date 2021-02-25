package action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import dialog.TestFieldDialogWrapper

class TestFieldDialogAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        TestFieldDialogWrapper().show()
    }
}
