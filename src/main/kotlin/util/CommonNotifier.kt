package util

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project

class CommonNotifier {
    companion object {
        fun showNotifier(project: Project, title: String = "test", content: String = "test", type: NotificationType = NotificationType.INFORMATION) {
            val notification = Notification("Study-Intellij-Plugin", title, content, type)
            notification.notify(project)
        }
    }
}