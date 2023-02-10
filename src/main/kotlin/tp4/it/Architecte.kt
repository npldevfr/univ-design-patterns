package tp4.it

class Architecte(name: String, project: Project, override var description: String) : AbstractEmployee(name, project),
    Employee {
    override var salary: Double = 2000.0

    override fun defineTools() {
        description += " with tools defined by $name"
    }
}