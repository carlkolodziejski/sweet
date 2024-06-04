package sweet.suites;

/**
 * Cette classe correspond aux suites géométriques.
 *
 * @author Jean-François Condotta - 25/04/23
 */
final public class SuiteGeometrique extends SuiteLineaire {

    /**
     * Constructeur permettant de créer une nouvelle suite geometrique.
     *
     * @param chaineSuite     La chaîne de caractères représentant la suite.
     * @param valPremierTerme La valeur du premier terme de la suite.
     * @param raison          La raison de la suite géométrique.
     */
    public SuiteGeometrique(String chaineSuite, double valPremierTerme, double raison) {
        super(chaineSuite, doubleVersTableau(valPremierTerme), doubleVersTableau(raison));
    }


    /**
     * Méthode retournant la raison de la suite géométrique.
     *
     * @return La raison de la suite géométrique.
     */
    public double getRaison() {
        //A compléter et/ou à modifier
        return 0.0;
    }

    /**
     * Méthode retournant la valeur du premier terme de la suite géométrique.
     *
     * @return La valeur du premier terme de la suite géométrique.
     */
    public double getValeurPremierTerme() {
        //A compléter et/ou à modifier
        return 0.0;
    }

    /**
     * Redéfinition de la méthode getValeurTerme sans utiliser la méthode getValeursTermes.
     */
    @Override
    public Double getValeurTerme(int rangTerme) {
        //A compléter et/ou à modifier
        return null;
    }


    @Override
    public void calculeEtAffiche(int rangMaxTermes) {
        //A compléter et/ou à modifier
    }
}
