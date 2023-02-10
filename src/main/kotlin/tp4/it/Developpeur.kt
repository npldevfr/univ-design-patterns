package tp4.it

class Developpeur(name: String, project: Project, override var description: String) : AbstractEmployee(name, project),
    Employee {
    override var salary: Double = 500.0

    override fun code() {
        description += " with code written by $name"
    }
}