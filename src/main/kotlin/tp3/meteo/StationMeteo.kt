package tp3.meteo

import kotlin.properties.Delegates

class StationMeteo : Subject {
    var pression: Int by Delegates.observable(0) { _,_,_ -> notifyObs()}
    var temperature: Int by Delegates.observable(0) { _,_,_ -> notifyObs()}
    var hygrometrie: Int by Delegates.observable(0) { _,_,_ -> notifyObs()}

    private val obs: HashMap<String, (Int, Int, Int) -> Unit> = HashMap()

    override fun addObserver(key: String, o: (Int, Int, Int) -> Unit) {
        obs[key] = o
    }

    override fun removeObserver(key: String) {
        obs.remove(key)
    }

    override fun notifyObs() {
        obs.values.forEach { it.invoke(pression, temperature, hygrometrie) }
    }
}