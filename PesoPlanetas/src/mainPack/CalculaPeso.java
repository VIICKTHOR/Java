package mainPack;

public class CalculaPeso {

	double peso;
	int planeta;
	String pNome;

	public double calcPlaneta() {
		double npeso = 0.00;

		switch (planeta) {

		case 1:
			pNome="Mercúrio";
			npeso = peso * 0.37;
			return npeso;

		case 2:
			pNome="Venus";
			npeso = peso * 0.88;
			return npeso;

		case 3:
			pNome="Marte";
			npeso = peso * 0.38;
			return npeso;

		case 4:
			pNome="Jupiter";
			npeso = peso * 2.64;
			return npeso;

		case 5:
			pNome="Saturno";
			npeso = peso * 1.15;
			return npeso;

		case 6:
			pNome="Urano";
			npeso = peso * 1.17;
			return npeso;

		default:
			return npeso;

		}
	}
}
