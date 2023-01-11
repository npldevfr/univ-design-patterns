package tp2.candies

class EtatVide(distributeur: Distributeur) : Etat(distributeur) {
    override fun afficher() {
        println("Je suis vide")
    }
}
