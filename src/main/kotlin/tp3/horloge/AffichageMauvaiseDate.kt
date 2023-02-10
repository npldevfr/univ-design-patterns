package tp3.horloge

import tp3.horloge.Affichage
import tp3.horloge.DateObserver
import java.util.*

class AffichageMauvaiseDate : Affichage, DateObserver {
    private var date: Date = Date()

    override fun afficher() {
        println("${date.day - 1} : ${date.hours - 1} : ${date.minutes - 1} : ${date.seconds -1}")
    }

    override fun notifyDate(date: Date) {
        this.date = date
        afficher()
    }

}