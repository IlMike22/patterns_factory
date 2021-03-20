class Config {
    private var operatingSystem: OperatingSystem = OperatingSystem.UNDEFINED

    fun getOperatingSystem(): OperatingSystem {
        return operatingSystem
    }

    fun setOperatingSyytem(os: OperatingSystem) {
        operatingSystem = os
    }
}