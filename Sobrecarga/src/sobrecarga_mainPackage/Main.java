package sobrecarga_mainPackage;

public class Main {

	public static void main(String[] args) {

		Calcula calc = new Calcula();

		System.out.println(calc.calcular(2, 4));
		System.out.println(calc.calcular(2.4, 4.1));
		System.out.println(calc.calcular("Poke", "mon"));

	}

}
