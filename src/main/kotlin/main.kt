fun main(args: Array<String>) {
    // sample for factory pattern
    lateinit var dialog: Dialog

    val config = Config()
    config.setOperatingSyytem(OperatingSystem.WEB) // here we set our requested operating system

    if (config.getOperatingSystem() == OperatingSystem.WINDOWS) {
        dialog = WindowsDialog()
    } else if (config.getOperatingSystem() == OperatingSystem.WEB) {
        dialog = WebDialog()
    }

    val button = dialog.createButton()
    println("Button is of type ${button.javaClass}")
}