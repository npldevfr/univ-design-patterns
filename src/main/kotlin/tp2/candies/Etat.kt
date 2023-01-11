package tp2.candies

abstract class Etat(protected val distributeur: Distributeur) {
    open fun tournerPoignee() {}
    open fun insererPiece() {}
    open fun annuler() {}
    abstract fun afficher()
}
