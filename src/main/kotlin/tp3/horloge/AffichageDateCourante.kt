package tp3.horloge

import tp3.horloge.Affichage
import tp3.horloge.DateObserver
import java.util.*

class AffichageDateCourante : DateObserver, Affichage {
    var date: Date = Date()

    override fun afficher() {
        println("Date courante: $date")
    }

    override fun notifyDate(date: Date) {
        this.date = date
        afficher()
    }
}