package dialog

import com.intellij.openapi.ui.DialogWrapper
import service.LocalDataService
import java.awt.BorderLayout
import javax.swing.*

class TestFieldDialogWrapper : DialogWrapper(true) {

    private val dialogPanel = JPanel(BorderLayout())
    private val textField = JTextField()

    init {
        init()
        title = "TestFieldDialogWrapper"
    }

    override fun createCenterPanel(): JComponent {
        dialogPanel.add(JLabel("TestField"), BorderLayout.NORTH)
        dialogPanel.add(textField, BorderLayout.CENTER)

        return dialogPanel
    }

    override fun doOKAction() {
        if(textField.text.isNullOrEmpty()) {
            JOptionPane.showMessageDialog(dialogPanel, "Field 를 채워주세요.")
            return
        }
        val localData = LocalDataService.getInstance()
        localData.state?.test = textField.text
        super.doOKAction()
    }

    override fun createDefaultActions() {
        super.createDefaultActions()
//        확인 버튼
//        myOKAction = null
//        취소 버튼
        myCancelAction = null
    }
}