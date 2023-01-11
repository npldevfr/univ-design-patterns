package tp2.candies

class EtatBonbonVendu(distributeur: Distributeur) : Etat(distributeur) {

    override fun afficher() {
        println("Bonbon en cours de distribution")
    }

}
