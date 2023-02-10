package tp3.meteo

interface Subject {
    fun addObserver(key: String, o : (Int, Int, Int) -> Unit)
    fun removeObserver(key: String)
    fun notifyObs()
}