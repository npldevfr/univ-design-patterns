package tp4.it

class ChefDeProjet(name: String, project: Project, override var description: String) : AbstractEmployee(name, project),
    Employee {
    private val teamMembers = mutableListOf<Employee>()

    override var salary: Double = 3000.0

    override fun superviser() {
        description += "supervised by $name"
    }

    fun addTeamMember(employee: Employee) {
        teamMembers.add(employee)
    }

    fun removeTeamMember(employee: Employee) {
        teamMembers.remove(employee)
    }
}