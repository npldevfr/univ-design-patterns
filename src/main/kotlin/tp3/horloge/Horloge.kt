package tp3.horloge


import java.util.*
import kotlin.collections.ArrayList
import kotlin.properties.Delegates

class Horloge() : Sujet {
    var date: Date by Delegates.observable(Date()) { _,_,_ -> notifyObservers() }
    private val observers: ArrayList<DateObserver> = ArrayList()

    init {
        Thread {
            for (i in 0..10) {
                Thread.sleep(1000)
                date = Date()
            }
        }.start()
    }
    override fun addObserver(o: DateObserver) {
        observers.add(o)
    }

    override fun removeObserver(o: DateObserver) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        observers.parallelStream().forEach { it.notifyDate(this.date) }
    }
}