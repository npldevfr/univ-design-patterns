package tp3.meteo

class MoyennesMeteo : (Int, Int, Int) -> Unit {
    private val pressions : ArrayList<Int> = ArrayList()
    private val temperatures : ArrayList<Int> = ArrayList()
    private val hygrometries : ArrayList<Int> = ArrayList()

    override fun invoke(pression: Int, temperature: Int, hygrometrie: Int) {
        pressions.add(pression)
        temperatures.add(temperature)
        hygrometries.add(hygrometrie)

        val pressionMoyenne = pressions.takeLast(5).average()
        val temperatureMoyenne = temperatures.takeLast(5).average()
        val hygroMoyenne = hygrometries.takeLast(5).average()

        println(" pression moyenne: $pressionMoyenne : temperature moyenne: $temperatureMoyenne : hygrométrie moyenne: $hygroMoyenne")
    }
}
