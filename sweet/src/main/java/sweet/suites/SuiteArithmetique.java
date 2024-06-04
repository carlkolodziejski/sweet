package sweet.suites;

/**
 * Cette classe correspond aux suites arithmétiques.
 *
 * @author Jean-François Condotta - 25/04/23
 */
public final class SuiteArithmetique extends SuiteArithmeticoGeometrique {

    /**
     * Constructeur permettant de créer une nouvelle suite arithmétique.
     *
     * @param chaineSuite        La chaîne de caractères représentant la suite.
     * @param valPremierTerme    La valeur du premier terme de la suite.
     * @param raisonArithmetique La raison artihmétique de la suite.
     */
    public SuiteArithmetique(String chaineSuite, double valPremierTerme, double raisonArithmetique) {
        super(chaineSuite, valPremierTerme, 1.0, raisonArithmetique);
    }

    /**
     * Méthode retournant la raison de la suite arithmétique.
     *
     * @return La raison de la suite arithmétique.
     */
    public double getRaison() {
        return getRaisonArithmetique();
    }

    @Override
    public void calculeEtAffiche(int rangMaxTermes) {
        super.calculeEtAffiche(rangMaxTermes);
        System.out.println("Valeur de la raison : " + getRaison());
    }

    /**
     * Redéfinition de la méthode getValeurTerme sans utiliser la méthode getValeursTermes.
     */
    @Override
    public Double getValeurTerme(int rangTerme) {
        if (rangTerme == 0)
            return getValPremierTerme(0);
        double valeurTerme = 0;
        try {
            if (rangTerme < 0)
                throw new IllegalArgumentException("Le rang est négatif");

            valeurTerme = getValeurPremierTerme();

            for (int i = 0; i < rangTerme; i++) {
                valeurTerme += getRaisonArithmetique();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return valeurTerme;
    }
}
