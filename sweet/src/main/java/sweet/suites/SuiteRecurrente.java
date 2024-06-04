package sweet.suites;

import java.util.ArrayList;

public abstract class SuiteRecurrente {

  private String chaineSuite;
  private double[] valeurs;

  public SuiteRecurrente(String chaineSuite, double[] valeurs) {
    this.chaineSuite = chaineSuite;
    this.valeurs = valeurs;
  }

  public abstract ArrayList<Double> getValeursTermes(int rangMaxTermes);

  public void calculeEtAffiche(int rangMaxTermes) {
    ArrayList<Double> termes = getValeursTermes(rangMaxTermes);
    for (int i = 0; i < termes.size(); i++) {
      System.out.println("u[" + i + "] = " + termes.get(i));
    }
  }

  public double[] getValeurs() {
    return valeurs;
  }

  public double getValPremierTerme(int position) {
    if (position >= 0 && position < valeurs.length) {
      return valeurs[position];
    } else {
      throw new IndexOutOfBoundsException("Position du terme premier hors des limites.");
    }
  }
}
