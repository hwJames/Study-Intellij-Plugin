package action

import dialog.TestDialogWrapper
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class TestAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        TestDialogWrapper().show()
    }
}
