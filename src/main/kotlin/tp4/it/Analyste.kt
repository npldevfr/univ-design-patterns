package tp4.it

class Analyste(name: String, project: Project, override var description: String) : AbstractEmployee(name, project),
    Employee {
    override var salary: Double = 1000.0

    override fun defineFunctions() {
        description += " with functions defined by $name"
    }
}