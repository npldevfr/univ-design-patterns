package tp3.horloge

fun main() {
    val horloge = Horloge()
    horloge.addObserver(AffichageDateCourante())

    Thread.sleep(1000)
    horloge.addObserver(AffichageMauvaiseDate())

    Thread.sleep(10000)
}