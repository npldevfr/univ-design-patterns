package tp2.candies

class EtatUnePiece(distributeur: Distributeur) : Etat(distributeur) {
    override fun tournerPoignee() {
        distributeur.changeEtatVendu()
        distributeur.bonbons --

        Thread.sleep(2000)

        if (distributeur.bonbons > 0)
            distributeur.changeEtatAttente()
        else
            distributeur.changeEtatVide()
    }

    override fun annuler() {
        distributeur.changeEtatAttente()
    }
    override fun afficher() {
        println("J'ai une piece")
    }
}
