package action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import util.CommonNotifier.Companion.showNotifier

class TestNotifierAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        e.project?.let {
            showNotifier(it, "test", "testtest")
        }
    }
}
