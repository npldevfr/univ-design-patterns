package tp3.meteo

fun main() {
    val stationMeteo = StationMeteo()
    stationMeteo.hygrometrie = 45
    stationMeteo.temperature = 22
    stationMeteo.pression = 1023

    stationMeteo.addObserver("Moyenne", MoyennesMeteo())
    stationMeteo.hygrometrie = 49
    stationMeteo.temperature = 21
    stationMeteo.pression = 1012

    Thread.sleep(1000)
    stationMeteo.hygrometrie = 51
    stationMeteo.temperature = 18
    stationMeteo.pression = 1002

    stationMeteo.addObserver("Affichage", Affichage())

    Thread.sleep(1000)
    stationMeteo.hygrometrie = 89
    stationMeteo.temperature = 12
    stationMeteo.pression = 993
}
