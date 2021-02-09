package com.github.hwjames.study_intellij_plugin.action

import com.github.hwjames.study_intellij_plugin.dialog.TestDialogWrapper
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class TestAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        TestDialogWrapper().show()
    }
}
