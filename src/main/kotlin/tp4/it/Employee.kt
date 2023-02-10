package tp4.it

interface Employee {
    public val name: String
    var project: Project
    var salary: Double

    fun superviser()
    fun defineTools()
    fun defineFunctions()
    fun code()
    fun displaySalary()
}