package sweet.suites;

import java.util.ArrayList;

abstract public class Suite {
	private String chaineSuite;

	public String getChaineSuite() {
		return chaineSuite;
	}
	public void setChaineSuite(String chaineSuite) {
		this.chaineSuite = chaineSuite;
	}

	protected Suite(String chaineSuite) {
		this.chaineSuite=chaineSuite;
	}

	abstract public ArrayList<Double> getValeursTermes(int rangMaxTermes);

	public Double getValeurTerme(int rangTerme) {
		ArrayList<Double> valeursTermes=getValeursTermes(rangTerme);
		if (valeursTermes.size()==rangTerme+1)
			return valeursTermes.get(rangTerme);
		return null;
	}

	public String toString() {
		return chaineSuite;
	}

	public static double getValeurMax(ArrayList<Double> valeurs) {
		double valMax=-Double.MAX_VALUE;
		for (Double val:valeurs)
			if (val>valMax)
				valMax=val;
		return valMax;
	}

	public static double getValeurMin(ArrayList<Double> valeurs) {
		double valMin=Double.MAX_VALUE;
		for (Double val:valeurs)
			if (val<valMin)
				valMin=val;
		return valMin;
	}

	static public double[] doubleVersTableau(double valeur) {
			double tab[]=new double[1];
			tab[0]=valeur;
			return tab;
		}

	public void calculeEtAffiche(int rangMaxTermes) {
		System.out.println("===============================================================");
		System.out.println("Suite : "+this+"(classe "+this.getClass().getName()+")");
		System.out.println("Valeurs des "+(rangMaxTermes+1)+" termes :");
		ArrayList<Double> valeursTermes=getValeursTermes(rangMaxTermes);
		for (int i=0; i<valeursTermes.size();i++)
			System.out.print(i+":"+valeursTermes.get(i)+" ");
		System.out.println("");
		System.out.println("Valeur Minimale / Valeur Maximale : "+getValeurMin(valeursTermes)+" / "+getValeurMax(valeursTermes));
		if (valeursTermes.size()>=0) {
			Double valPremier=getValeurTerme(0);
			Double valDernier=getValeurTerme(valeursTermes.size()-1);
			System.out.println("Valeur Premier / Valeur Dernier : "+valPremier+" / "+valDernier);
			
		}
	}
}
