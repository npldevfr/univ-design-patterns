package tp2.candies

import tp2.candies.*

class Distributeur() {
    private val etatAttente: Etat = EtatAttente(this)
    private val etatUnePiece: Etat = EtatUnePiece(this)
    private val etatVide: Etat = EtatVide(this)
    private val etatBonbonVendu: Etat = EtatBonbonVendu(this)

    private var etat = etatAttente
    var bonbons: Int = 2

    fun insererPiece() {
        etat.insererPiece()
    }

    fun tournerPoignee() {
        etat.tournerPoignee()
    }

    fun annuler() {
        etat.annuler()
    }

    fun afficher() {
        etat.afficher()
    }

    fun changeEtatVide() {
        etat = etatVide
    }

    fun changeEtatAttente() {
        etat = etatAttente
    }

    fun changeEtatUnePiece() {
        etat = etatUnePiece
    }

    fun changeEtatVendu() {
        etat = etatBonbonVendu
    }
}