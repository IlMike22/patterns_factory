class WindowsDialog: Dialog() {
    override fun createButton(): IButton {
        println("creating windows button via factory.")
        return WindowsButton()
    }
}