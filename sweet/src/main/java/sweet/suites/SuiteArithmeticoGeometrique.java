package sweet.suites;

import java.util.ArrayList;

/**
 * Cette classe correspond aux suites aithmético-géométriques.
 * @author Jean-François Condotta - 25/04/23
 *
 */
public class SuiteArithmeticoGeometrique extends SuiteRecurrente {

	/**
	 * La raison géométrique de la suite.
	 */
	private double raisonGeometrique;

	/**
	 * La raison artihmétique de la suite.
	 */
	private double  raisonArithmetique;

	/**
	 * Constructeur permettant de créer une nouvelle suite arithmético-geometrique.
	 * @param chaineSuite La chaîne de caractères représentant la suite.
	 * @param valPremierTerme La valeur du premier terme de la suite.
	 * @param raisonGeometrique La raison géométrique de la suite.
	 * @param raisonArithmetique La raison artihmétique de la suite.
	 */
	public SuiteArithmeticoGeometrique(String chaineSuite,double valPremierTerme,double raisonGeometrique,double raisonArithmetique) {
		super(chaineSuite,SuiteGeometrique.doubleVersTableau(valPremierTerme));
		this.raisonGeometrique=raisonGeometrique;
		this.raisonArithmetique=raisonArithmetique;
	}

	/**
	 * Méthode retournant la raison géométrique de la suite.
	 * @return La raison géométrique de la suite.
	 */
	public double getRaisonGeometrique() {
		//A compléter et/ou à modifier
		return 0.0;
	}

	/**
	 * Méthode retournant la raison arithmétique de la suite.
	 * @return La raison arithmétique de la suite.
	 */
	public double getRaisonArithmetique() {
		//A compléter et/ou à modifier
		return 0.0;
	}

	/**
	 * Méthode retournant la valeur du premier terme de la suite géométrique.
	 * @return La valeur du premier terme de la suite géométrique.
	 */
	public double getValeurPremierTerme() {
		//A compléter et/ou à modifier
		return 0.0;
	}

	@Override
	public ArrayList<Double> getValeursTermes(int rangMaxTermes) {
		ArrayList<Double> valeurs=new ArrayList<Double>();
		//A compléter et/ou à modifier
		return valeurs;
	}
	
	@Override
	public void calculeEtAffiche(int rangMaxTermes) {
		super.calculeEtAffiche(rangMaxTermes);
		System.out.println("Valeur de la raison arithmétique : "+getRaisonArithmetique());
		System.out.println("Valeur de la raison géométrique : "+getRaisonGeometrique());
	}
	
}
