package sweet.suites;

import java.util.ArrayList;

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
        System.out.println("===============================================================");
        System.out.println("Suite : " + this + "(classe " + this.getClass().getName() + ")");
        System.out.println("Valeurs des " + (rangMaxTermes + 1) + " termes :");
        ArrayList<Double> valeursTermes = getValeursTermes(rangMaxTermes);
        for (int i = 0; i < valeursTermes.size(); i++)
            System.out.print(i + ":" + valeursTermes.get(i) + " ");
        System.out.println("");
        System.out.println("Valeur Minimale / Valeur Maximale : " + getValeurMin(valeursTermes) + " / " + getValeurMax(valeursTermes));
        if (valeursTermes.size() >= 0) {
            Double valPremier = getValeurTerme(0);
            Double valDernier = getValeurTerme(valeursTermes.size() - 1);
            System.out.println("Valeur Premier / Valeur Dernier : " + valPremier + " / " + valDernier);
        }
        System.out.println("Ordre de la suite : " + getOrdre());
        System.out.println("Valeur des premiers termes : " + valeursTermes);
        System.out.println("Valeur de la raison arithmétique : " + getRaisonArithmetique());
        System.out.println("Valeur de la raison géomètrique : " + getRaisonGeometrique());
        System.out.println("Valeur de la raison : " + getRaison());
    }

    /**
     * Redéfinition de la méthode getValeurTerme sans utiliser la méthode getValeursTermes.
     */
    @Override
    public Double getValeurTerme(int rangTerme) {
        if (rangTerme == 0)
            return 0.0;
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
