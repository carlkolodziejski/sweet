package sweet.suites;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Cette classe correspond aux suites linéaires.
 *
 * @author Jean-François Condotta - 25/04/23
 */
public class SuiteLineaire extends SuiteRecurrente {

    /**
     * Les coefficients définissant la suite linéaire (la taille du tableau est égal à l'ordre de la
     * suite).
     */
    private double coefficients[];

    /**
     * Constructeur permettant de créer une nouvelle suite linéaire. Des nouveaux tableaux sont créés
     * en dupliquant les tableaux donnés en paramètres afin de stocker les valeurs des premiers termes
     * de la suite et les coefficients définissant la suite.
     *
     * @param chaineSuite       La chaîne de caractères représentant la suite.
     * @param valPremiersTermes Les valeurs des premiers termes de la suite linéaire (supposé non null
     *                          et contenant au moins un élément).
     * @param coefficients      Les coefficients définissant la suite linéaire (même taille que
     *                          valPremiersTermes).
     */
    public SuiteLineaire(String chaineSuite, double valPremiersTermes[], double coefficients[]) {
        super(chaineSuite, valPremiersTermes);
        this.coefficients = Arrays.copyOf(coefficients, coefficients.length);
    }

    /**
     * Méthode retournant la valeur d'un des coefficients définissant la suite linéaire.
     *
     * @param positionCoef La position du coefficient pour lequel nous souhaitons la valeur (un nombre
     *                     entier entre (au sens large) 0 et getOrdre()-1).
     * @return La valeur du coefficient à la position positionCoef.
     */
    public double getValCoef(int positionCoef) {
        if (positionCoef >= 0 && positionCoef < coefficients.length) {
            return coefficients[positionCoef];
        } else {
            throw new IndexOutOfBoundsException("Position du coefficient hors des limites.");
        }
    }

    /**
     * Méthode retournant l'ordre de la suite linéaire (le nombre de coefficients).
     *
     * @return L'ordre de la suite linéaire.
     */
    public int getOrdre() {
        return coefficients.length;
    }

    @Override
    public ArrayList<Double> getValeursTermes(int rangMaxTermes) {
        ArrayList<Double> valeurs = new ArrayList<>();


        for (int i = 0; i < getOrdre(); i++) {
            valeurs.add(getValPremierTerme(i));
        }

        if (rangMaxTermes <= valeurs.size()) {
            ArrayList<Double> valeurTerme = new ArrayList<>();
            valeurTerme.add(getValPremierTerme(rangMaxTermes));
            return valeurTerme;
        }

        try {
            for (int i = getOrdre(); i <= rangMaxTermes; i++) {
                double val = 0.0;

                for (int j = 0; j < coefficients.length; j++) {
                    val += coefficients[j] * valeurs.get(i - j - 1);
                }

                if (Double.isNaN(val) || Double.isInfinite(val)) {
                    throw new ExceptionSuite("La valeur au rang " + i + " n'est pas valide !");
                }

                valeurs.add(val);
            }
        } catch (ExceptionSuite e) {
            System.out.println(e.getMessage());
        }

        return valeurs;
    }

    @Override
    public void calculeEtAffiche(int rangMaxTermes) {
        super.calculeEtAffiche(rangMaxTermes);
    }
}
