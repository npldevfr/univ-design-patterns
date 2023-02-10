package tp3.meteo

class Affichage : (Int, Int, Int) -> Unit {
    override fun invoke(p1: Int, p2: Int, p3: Int) {
        println("$p1 : $p2 : $p3")
    }
}