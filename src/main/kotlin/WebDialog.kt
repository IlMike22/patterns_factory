class WebDialog: Dialog() {
    override fun createButton(): IButton {
        println("creating web button via factory.")
        return WebButton()
    }
}