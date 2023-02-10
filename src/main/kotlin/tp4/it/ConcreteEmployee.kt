package tp4.it

class ConcreteEmployee(name: String, project: Project, override var description: String) : AbstractEmployee(name, project)