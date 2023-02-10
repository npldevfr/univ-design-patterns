package tp4.it

fun main() {
    val project = Project("Appli bancaire")
    project.displayDescription()

    val john = ConcreteEmployee("John", project, "Employé de base")
    john.salary = 4000.0
    john.displaySalary()

    val jane = ChefDeProjet("Jane", project, "Chef de projet")
    jane.salary = 6000.0
    jane.superviser()
    jane.addTeamMember(john)    
    jane.displaySalary()

    var bob = Architecte("Bob", project, "Architecte")
    bob.salary = 5000.0
    bob.defineTools()
    jane.addTeamMember(bob)
    bob.displaySalary()

    val alice = Analyste("Alice", project, "Analyste")
    alice.salary = 3000.0
    alice.defineFunctions()
    jane.addTeamMember(alice)
    alice.displaySalary()

    val bob2 = Architecte("Bob", project, "Architecte")
    bob2.salary = 5000.0
    bob2.defineTools()
    jane.addTeamMember(bob2)
    bob2.displaySalary()

    bob2.code()
    bob2.displaySalary()



}


