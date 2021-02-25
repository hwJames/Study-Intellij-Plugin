package action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import service.LocalDataService
import util.CommonNotifier.Companion.showNotifier

class TestNotifierAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        e.project?.let {
            var content = "testContent"
            LocalDataService.getInstance().state?.let {
                content = it.test
            }
            showNotifier(it, "test", content)
        }
    }
}
