package tp2.candies

fun main() {
    val distributeur = Distributeur()

    distributeur.afficher() // attente

    Thread {
        Thread.sleep(500)
        distributeur.afficher()
    }.start()

    distributeur.insererPiece()
    distributeur.afficher()
    distributeur.tournerPoignee() // etat en cours de distribution
    distributeur.afficher() // etat attente

    Thread.sleep(2000)
    distributeur.insererPiece()
    distributeur.tournerPoignee()
    distributeur.afficher()
}