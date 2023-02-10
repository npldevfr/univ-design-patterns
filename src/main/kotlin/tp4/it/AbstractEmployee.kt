package tp4.it

abstract class AbstractEmployee(public override val name: String, override var project: Project) : Employee {
    abstract var description: String
    override var salary: Double = 0.0


    override fun superviser() {}
    override fun defineTools() {}
    override fun defineFunctions() {}
    override fun code() {}

    override fun displaySalary() {
        println("Employee $name's salary: $salary")
    }
}