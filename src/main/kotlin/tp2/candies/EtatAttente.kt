package tp2.candies


class EtatAttente(distributeur: Distributeur) : Etat(distributeur) {
    override fun insererPiece() {
        distributeur.changeEtatUnePiece()
    }

    override fun afficher() {
        println("Bonbons restants: "+distributeur.bonbons)
    }

}
