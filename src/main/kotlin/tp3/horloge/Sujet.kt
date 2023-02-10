package tp3.horloge

interface Sujet {
    fun addObserver(o: DateObserver)
    fun removeObserver(o: DateObserver)
    fun notifyObservers()
}